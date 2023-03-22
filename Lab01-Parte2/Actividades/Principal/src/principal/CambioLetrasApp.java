/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author ADMIN
 */
public class CambioLetrasApp {
    
      public static void main(String[] args) {
    
    String cadena = "La lluvia en Sevilla es un maravilla";

        //Aviso de esta forma no modifica el String original
        System.out.println(cadena.replace('a', 'e'));
      }
}
