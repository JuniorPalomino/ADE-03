/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author ADMIN
 */
public class ListaCaracteresApp {
    
    public static void main(String[] args) {
    
    String cadena = "La lluvia en Sevilla es una maravilla";

        for (int i = 0; i< cadena.length(); i++) {
            //Hacemos un casting para convertir el char a int
            System.out.println((int) cadena.charAt(i) + " ");
        }

    }
}
