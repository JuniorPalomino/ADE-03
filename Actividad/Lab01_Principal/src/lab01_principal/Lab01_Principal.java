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
        
        Rectangulo A;
        Rectangulo B;
        
        //Coordenadas
        
        Coordenada C1;
        Coordenada C2;
        
        Double Cx;
        Double Cy;
        
        System.out.println("Ingrese una esquina del 1er rectangulo: ");
        
        Cx= sn.nextDouble();
        Cy= sn.nextDouble();
        
        C1=new Coordenada(Cx,Cy);
        
        
        System.out.println("Ingrese la esquina opuesta del 1er rectangulo: ");
        
        Cx= sn.nextDouble();
        Cy= sn.nextDouble();
        
        C2=new Coordenada(Cx,Cy);
       
        
        A =new Rectangulo(C1,C2);    //Asignacion de Coordenadas
              
        //////////////////////////////////////////////////////////////////////
        
        System.out.println("Ingrese una esquina del 2do rectangulo: ");
        
        Cx= sn.nextDouble();
        Cy= sn.nextDouble();
        
        C1=new Coordenada(Cx,Cy);
        
        
        System.out.println("Ingrese la esquina opuesta del 2do rectangulo: ");
        
        Cx= sn.nextDouble();
        Cy= sn.nextDouble();
        
        C2=new Coordenada(Cx,Cy);
        
        B =new Rectangulo(C1,C2);
        
       
        System.out.println(A.toString());
        System.out.println(B.toString());
       
        
        
        B=OrdenVerificar(B);
        
        if(Verificador.esSobrePos(A, B))
            System.out.println("Rectangulo A y B se sobreponen");
            
        //if(Verificador.esJunto(A, B))
            //System.out.println("Rectangulo A y B se juntan");
        
        //if(Verificador.esDisjunto(A, B))
            //System.out.println("Rectangulo A y B son disjuntos");
            
        
        
        
        
        
    }
    
    public double rectanguloSobre(Rectangulo r1, Rectangulo r2){
    
        return 0.0;
    }
    
    public static Rectangulo OrdenVerificar(Rectangulo r1){
        
        if((r1.getEsquina2().getX()<r1.getEsquina1().getX()) && (r1.getEsquina2().getY()<r1.getEsquina1().getY()) ){
            
            return r1;
        }
        
        else {
        
            Coordenada Nueva1;
            Coordenada Nueva2;
            
            Nueva1= new Coordenada(r1.getEsquina1().getX(),r1.getEsquina2().getY());
            Nueva2= new Coordenada(r1.getEsquina2().getX(),r1.getEsquina1().getY());
            
            r1.setEsquina1(Nueva1);
            r1.setEsquina2(Nueva2);
        
            
            return r1;
        }
        
        
    
    }
}
