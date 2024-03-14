/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAW;

/**
 *
 * @author Víctor
 */
public class celda {
    //Atributo
    private int y;
    private int x;
    
    //Constructor

    public celda(int y, int x) {
        this.y = y;
        this.x = x;
    }
    //Getter and Setter

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    //Metodo para cambiar coordenadas
    public void cambiarCoordenadas(int y, int x){
        this.y = y;
        this.x = x;
    }
    //To string

    @Override
    public String toString() {
        return "celda{" + "Altura=" + y + ", Base=" + x + '}';
    }
    
}
