/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01_ejercicio_rectangulo;

import java.text.DecimalFormat;

/**
 *
 * @author ADMIN
 */
public class ContainerRect {
    Rectangulo[] Rectangulos;
    double[] Distancias;
    double[] Areas;
    int Num;
    static int NumRec=0;

    public ContainerRect(int num) {
        this.Num = num;
        Rectangulos = new Rectangulo[num];
        Distancias = new double[num];
        Areas = new double[num];
    }
    
    public void addRectangulo(Rectangulo r) {
        if (NumRec <= Num-1) {                                       //Compruebo si existe un rectangulo en ese espacio
            
            Rectangulos[NumRec] = r;
            Distancias[NumRec] = Coordenada.distancia(r.getEsquina1(), r.getEsquina2());
            Areas[NumRec] = ((r.getEsquina2().getX() - r.getEsquina1().getX()) * (r.getEsquina2().getY() - r.getEsquina1().getY()));

            NumRec++;

        } else {
            System.out.println("CONTENEDOR LLENO");
        }
        
    }
        
        public String toString() {
        String s = "Rectangulo\tCoordenadas\t\t\t\tDistancia\t\tArea\n";
        DecimalFormat df = new DecimalFormat("###.##");
        for (int i = 0; i < Num; i++) {
            s += (i + 1) + "\t\t" + "(" + Rectangulos[i].getEsquina1() + "," + Rectangulos[i].getEsquina2() + ")" + "\t\t" + df.format(Distancias[i]) + "\t\t\t" + df.format(Areas[i]) + "\n";
        }
        return s;
    }

    
    
    
}
