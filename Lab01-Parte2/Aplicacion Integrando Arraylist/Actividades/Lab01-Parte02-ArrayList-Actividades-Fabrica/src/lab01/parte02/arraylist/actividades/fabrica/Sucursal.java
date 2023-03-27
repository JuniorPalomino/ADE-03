/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01.parte02.arraylist.actividades.fabrica;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Sucursal {
    
    private ArrayList<Instrumento> instrumentos;
    private String nombre;
   
    public Sucursal(String nombre) {                                                //Constructor con un solo atributo
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>();
    }

    public Instrumento borrarInstrumento(String ID) {                               //Borra instrumento del arrayList instrumentos
        Instrumento insABorrar = buscarInstrumento(ID);                             //Llama a metodo Buscar Instrumentopara borrarlo
        this.instrumentos.remove(insABorrar);                                       //metodo remove de arrayList
        return insABorrar;
    }

    private Instrumento buscarInstrumento(String ID) {
        int i = 0;
        Instrumento insEncontrado = null;
        while (i < instrumentos.size() && !this.instrumentos.get(i).getID().equals(ID)) { //Menor a la cantidad de instrumentos, y que sea diferente la comparacion el de esa posicion con el parametro del metodo "equals"
            i++;
        }
        if (i < instrumentos.size()) {
            insEncontrado = this.instrumentos.get(i);      //Se le asigna a la variable el instrumento encontrado
        }
        return insEncontrado;
    }

    public double[] porcInstrumentosPorTipo() {
        final int CANT_INSTRUMENTOS = TipoInstrumento.values().length;              //Constante que guarda el numero de tipos de instrumento
        double[] porcentajes = new double[CANT_INSTRUMENTOS];                       //Nuevo Array double, se le asigna la cantidad
        for (Instrumento instrumento : instrumentos) {                              //Recorre Instrumentos
            porcentajes[instrumento.getTipo().ordinal()]++;                         //Metodo ordinal devuelve la posicion en la que esta el tipo de instrumento
        }
        absolutoAPorcentaje(porcentajes);                                           //Llama al metodo absolutoAPorcentaje()
        return porcentajes;
    }

    private void absolutoAPorcentaje(double[] porcentajes) {                        //Devuelve porcentaje
        for (int i = 0; i < porcentajes.length; i++) {
            porcentajes[i] = (porcentajes[i] * 100) / instrumentos.size();          //Lo multiplica por cien, y lo divide por la cantidad de instrumentos de la lista
        }
    }

    public void agregarInstrumento(Instrumento ins) {                               //Agregaer objetos de tipo Instrumetno
        this.instrumentos.add(ins);                                                 //Metodo add del arrayLisy
    }

    public String getNombre() {
        return nombre;
    }

    public void listarInstrumentos() {                                              //Recorre e Imprime cada elemento del arrayList de instrumentos
        for (Instrumento instrumento : instrumentos) {
            System.out.println(instrumento);
        }
    }

    public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo) {       //Metodo devuelde lista de instrumentos por tipo
        ArrayList<Instrumento> instEncontrados = new ArrayList<>();                 //Creo nueva lista
        for (Instrumento instrumento : instrumentos) {                              //Recorro Instrumentos
            if (instrumento.getTipo() == tipo) {                                    //Comparo tipo de instrumetno
                instEncontrados.add(instrumento);                                   //Agregamos a la nueva lista el tipo de instrumento que estamos pidiendo
            }
        }
        return instEncontrados;
    }
    
}
    

