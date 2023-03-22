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
public class Ejercicio_basico_DDR_30_v2 {
    
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null,
                "Por favor, introduce una frase",
                "Introduccion",
                JOptionPane.INFORMATION_MESSAGE);
        String cadenaResultante = "";
        
        //true = Lo pasamos todo en MAYUSCULAS
        //false = Lo pasamos todo en minisculas
        
        boolean isMayus;
        int eleccion = JOptionPane.showConfirmDialog(null,
                "¿Quieres que se pase a MAYUSCULAS?",
                "Eleccion",
                JOptionPane.YES_NO_CANCEL_OPTION);
        isMayus = (eleccion == JOptionPane.YES_OPTION);
        
        //Segun lo elegido, lo transformaremos a MAYUSCULA o minuscula
        
        if(isMayus){
            cadenaResultante = texto.toUpperCase();
        }else{
            cadenaResultante = texto.toLowerCase();
        }
        JOptionPane.showMessageDialog(null,
                cadenaResultante,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}
