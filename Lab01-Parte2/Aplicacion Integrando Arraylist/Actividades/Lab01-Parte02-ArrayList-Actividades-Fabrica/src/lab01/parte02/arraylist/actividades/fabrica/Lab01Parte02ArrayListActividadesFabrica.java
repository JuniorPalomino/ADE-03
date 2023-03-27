/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab01.parte02.arraylist.actividades.fabrica;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Lab01Parte02ArrayListActividadesFabrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fabrica f = new Fabrica();
        cargarFabrica(f);

        //  PUNTO A)
       // f.listarInstrumentos();
        //  PUNTO B)
       /* 
        ArrayList<Instrumento> lista = f.instrumentosPorTipo(TipoInstrumento.CUERDA);        //Creamos una nueva variable ArrayList para guardar las listas
        for (Instrumento instrumento : lista) {                                         //Recorres Lista
            System.out.println(instrumento);                                            //Muestra cada la lista del tipo de instrumento
        }
         */
        //  PUNTO C)
        /*
        Instrumento borrado = f.borrarInstrumento("DEF567");
        System.out.println("Se borró: " + borrado);
        f.listarInstrumentos();
         */
        //  PUNTO D)
        
        double[] porcs = f.porcInstrumentosPorTipo("Sucursal B");                       //Porcentaje por Sucursal
        for (int i = 0; i < porcs.length; i++) {
            System.out.println(porcs[i]);
        }
         
    }

    private static void cargarFabrica(Fabrica f) {
        Sucursal s1 = new Sucursal("Sucursal A");
        Sucursal s2 = new Sucursal("Sucursal B");

        s1.agregarInstrumento(new Instrumento("ABC123", 13214, TipoInstrumento.CUERDA));
        s1.agregarInstrumento(new Instrumento("BCD456", 13432, TipoInstrumento.VIENTO));
        s1.agregarInstrumento(new Instrumento("DEF567", 15464, TipoInstrumento.PERCUSION));

        s2.agregarInstrumento(new Instrumento("ASD353", 52432, TipoInstrumento.CUERDA));
        s2.agregarInstrumento(new Instrumento("VXCBE2", 45645, TipoInstrumento.VIENTO));

        f.agregarSucursal(s1);
        f.agregarSucursal(s2);
    }
    
    
}
    

