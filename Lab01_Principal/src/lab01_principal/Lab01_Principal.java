/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab01_principal;
import java.util.*;

/**
 *
 * @author H P
 */
public class Lab01_Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn =new Scanner(System.in);
    
        //Rectangulos
        
        Rectangulo A =new Rectangulo();
        Rectangulo B =new Rectangulo();
        
        //Coordenadas
        
        Coordenada C1;
        Coordenada C2;
        
        Double Cx;
        Double Cy;
        
        System.out.println("Ingrese la primera coordenada");
        
        Cx= sn.nextDouble();
        Cy= sn.nextDouble();
        
        C1=new Coordenada(Cx,Cy);
        
        
        System.out.println("Ingrese la segunda coordenada");
        
        Cx= sn.nextDouble();
        Cy= sn.nextDouble();
        
        C2=new Coordenada(Cx,Cy);
        
        
    }
    
}
