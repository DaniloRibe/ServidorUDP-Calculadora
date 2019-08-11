/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpserver;

import calc.Calculadora;
import java.net.*;
import java.io.*;

/**
 *
 * @author Danilo
 */
public class UDPServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatagramSocket aSocket = null;
        try {
            aSocket = new DatagramSocket(6789);
            byte[] buffer = new byte[1000];
            Calculadora c = new Calculadora();
            while (true) {
                DatagramPacket request = new DatagramPacket(buffer, buffer.length);
                aSocket.receive(request);
                String m = new String(request.getData());
                String a[] = m.split(",");
                if (a.length == 3) {
                    int men = c.calcular(a[0], a[1], a[2].trim());
                    String data = Integer.toString(men);
                    if (data.equals("0")) {
                        String erro = "impossivel calcular";
                        buffer = erro.getBytes();
                    } else {
                        buffer = data.getBytes();
                    }

                    DatagramPacket reply = new DatagramPacket(buffer,
                            buffer.length, request.getAddress(), request.getPort());
                    aSocket.send(reply);
                }else{
                    String erro = "impossivel calcular";
                    buffer = erro.getBytes();
                    DatagramPacket reply = new DatagramPacket(buffer,
                            buffer.length, request.getAddress(), request.getPort());
                    aSocket.send(reply);
                }

            }
        } catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        } finally {
            if (aSocket != null) {
                aSocket.close();
            }
        }
    }

}
