/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01_ejercicio_rectangulo;

import java.util.*;
/**
 *
 * @author H P
 */
public class Coordenada {
    
    private double x;
    private double y;
    
    public Coordenada() {
       
    }

    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }
    

    public Coordenada(Coordenada c) {
        
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    double distancia(Coordenada c){
        
        double diferenciaX = x - c.getX();
        double diferenciaY = y - c.getY();

        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
            
    }
    
    static double distancia(Coordenada c1, Coordenada c2){
        double diferenciaX = c2.getX() - c1.getX();
        double diferenciaY = c2.getY() - c1.getY();

        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
            
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
    
    
    
}
