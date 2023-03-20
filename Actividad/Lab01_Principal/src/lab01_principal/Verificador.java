/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01_principal;

/**
 *
 * @author H P
 */
public class Verificador {
    
    static boolean esSobrePos(Rectangulo r1,Rectangulo r2){
      
        
        if((r1.getEsquina2().getX()< r2.getEsquina1().getX()) || (r1.getEsquina1().getX()>r2.getEsquina2().getX()))
           
            return false;
            
        else if((r1.getEsquina2().getY()< r2.getEsquina1().getY()) || (r1.getEsquina1().getY()>r2.getEsquina2().getY()))
            
            return false;
            
        
        else 
            return true;
        
        
    }
    static boolean esJunto(Rectangulo r1,Rectangulo r2){
        
        return esSobrePos(r1, r2);
        
       
    }
    static boolean esDisjunto(Rectangulo r1,Rectangulo r2){
            
        return esSobrePos(r1, r2);
        
    }
}
