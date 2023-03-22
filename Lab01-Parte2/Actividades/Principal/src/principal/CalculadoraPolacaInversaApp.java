/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class CalculadoraPolacaInversaApp {
    
    public static void main(String[] args) {
        double operando1, operando2, resultado = 0;

        String texto = JOptionPane.showInputDialog("Escribe el operando 1");
        operando1 = Integer.parseInt(texto);

        String operacion = JOptionPane.showInputDialog("Escribe el codigo de operacion");

        String texto2 = JOptionPane.showInputDialog("Escribe el operando 2");
        operando2 = Integer.parseInt(texto2);
        
        //segun el codigo de operacion, haremos una u otra accion
        switch(operacion){
            case "+":
                resultado = operando1+operando2;
                break;
            case "-":
                resultado = operando1-operando2;
                break;
            case "*":
                resultado = operando1*operando2;
                break;
            case "/":
                resultado = operando1/operando2;
                break;
            case "^":
                resultado = (int)Math.pow(operando1,operando2);
                break;
            case "%":
                resultado = operando1%operando2;
                break;
        }
        JOptionPane.showMessageDialog(null, operando1 +" "+operacion+" "+operando2+" = "+resultado);
    }
    
}
