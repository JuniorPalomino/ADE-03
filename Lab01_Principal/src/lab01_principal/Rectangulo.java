/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01_principal;

/**
 *
 * @author H P
 */
public class Rectangulo {
    
    private Coordenada esquina1;
    private Coordenada esquina2;
    
    public Rectangulo() {
    
    }

    public Rectangulo(Coordenada c1, Coordenada c2) {
        setEsquina1(c1);
        setEsquina2(c2);
    }

    public Coordenada getEsquina1() {
        return esquina1;
    }

    public void setEsquina1(Coordenada esquina1) {
        this.esquina1 = esquina1;
    }

    public Coordenada getEsquina2() {
        return esquina2;
    }

    public void setEsquina2(Coordenada esquina2) {
        this.esquina2 = esquina2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "esquina1=" + esquina1 + ", esquina2=" + esquina2 + '}';
    }
    
   
            
    
}
