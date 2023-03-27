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
public class Fabrica {
    private ArrayList<Sucursal> sucursales;

    public Fabrica() {                              //Constructor Vacio
        this.sucursales = new ArrayList<>();
    }

    public double[] porcInstrumentosPorTipo(String nombreSuc) {
        double[] porcentajes = new double[TipoInstrumento.values().length];     //Creamos un arrayDouble, que se le asigna la cantidad de tipo de Elementosque 
        Sucursal sucEncontrada = buscarSucursal(nombreSuc);                     //Busaca una sucursal en el metodo BuscarSucursal
        if (sucEncontrada != null) {                                            //Si es diferente de null
            porcentajes = sucEncontrada.porcInstrumentosPorTipo();              //Llama al metodo porcInstrumentosPorTipo() de la clase sucursal
        }
        return porcentajes;
    }

    private Sucursal buscarSucursal(String nombreSuc) {                             //Devuelve una sucursal
        int i = 0;
        Sucursal sucEncontrada = null;
        while (i < sucursales.size() && !this.sucursales.get(i).getNombre().equals(nombreSuc)) {        //Igual que el metodo buscar instrumento
            i++;
        }
        if (i < sucursales.size()) {
            sucEncontrada = this.sucursales.get(i);                                 //Se le asigna la poscion de de la sucursal
        }
        return sucEncontrada;
    }

    public Instrumento borrarInstrumento(String ID) {               //Borrar Instrumento
        Instrumento borrado = null;
        int i = 0;
        while (i < sucursales.size() && borrado == null) {          //i tiene que ser menor a la cantidad de sucursales, y borrado sea null
            borrado = sucursales.get(i).borrarInstrumento(ID);      //le asignamos a borrado, la posicion de la sucursal segun el intrumento que vamos a borrar
            i++;
        }
        return borrado;
    }

    public void listarInstrumentos() {                          //Metodo ListarInstrumentos
        for (Sucursal sucursal : sucursales) {                  //Recoorre Sucursales
            System.out.println(sucursal.getNombre());           //Nombre de la sucursal
            sucursal.listarInstrumentos();                      //Llama al metodo de la clase Sucursal
        }
    }

    public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo) {       //Devuelve las listas de cada sucursal por el tipo que pedimos
        ArrayList<Instrumento> instEncontrados = new ArrayList<>();                 //Crea una nueva lista
        for (Sucursal sucursal : sucursales) {                                      //Recorremos las sucursales
            instEncontrados.addAll(sucursal.instrumentosPorTipo(tipo));             //Agrega listas metodo ArrayList, dentro de el llamamos al metodo de a clase sucursal
        }
        return instEncontrados;
    }

    public void agregarSucursal(Sucursal suc) {   //Metodo para agregar sucursales 
        this.sucursales.add(suc); 
    }

    
}
