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
    
    private int num1;
    private int num2;
    private String operacao;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
    
    public int calcular(String num1, String op, String num2){
        int result = 0;
        
        switch(op){
            case "+":
                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);
                result = n1+n2;
                break;
            case "-":
                int n11 = Integer.parseInt(num1);
                int n22 = Integer.parseInt(num2);
                result = n11-n22;
                break;
            case "*":
                int n111 = Integer.parseInt(num1);
                int n222 = Integer.parseInt(num2);
                result = n111+n222;
                break;
            case "/":
                int n1111 = Integer.parseInt(num1);
                int n2222 = Integer.parseInt(num2);
                result = n1111+n2222;
                break;
            default:
                break;
                
        }
        return result;
    }
    
}
