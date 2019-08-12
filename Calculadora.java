/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author Danilo
 */
public class Calculadora {

    public int calcular(String num1, String op, String num2){
        int result = 0;
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        switch(op){
            case "+":    
                result = n1+n2;
                break;
            case "-":
                
                result = n1-n2;
                break;
            case "*":
                result = n1*n2;
                break;
            case "/":
                result = n1/n2;
                break;
            default:
                break;                
        }
        return result;
    }
    
}
