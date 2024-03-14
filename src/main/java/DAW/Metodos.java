/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAW;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Víctor
 */
public class Metodos {
    //Método para hacer una matriz
    public static int[][] generarMatrizSerpiente(){
        int[][] matriz = new int[10][10];
        for (int i=0;i<matriz.length;i++) {
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]=0;
            }
        }
        return matriz;
    }
    
    //Metodo ver matriz
    public static void verMatriz(int[][] matriz) {
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + "  ");  
            }
            System.out.println();
        }
    }
    //Método para encontrar la cabeza serpiente
    public static celda cabezaSerpiente(int[][] matriz){
        //Y = fila
        //X = columna
        celda coordenadas = new celda(0,0);
        for (int i=0;i<matriz.length;i++) {
            for(int j=0; j<matriz[i].length;j++){
                if(matriz[i][j]==1){
                    coordenadas.cambiarCoordenadas(i, j);
                    return coordenadas;
                }
            }
        }
        return null;
    }
    
    public static List<celda> encontrarCuerpo(int[][] matriz, celda coordenada){
        List<celda> serpiente = new ArrayList();
        celda cabeza = new celda(coordenada.getY(),coordenada.getX());
        serpiente.add(cabeza);
        matriz[coordenada.getY()][coordenada.getX()]=0;
        //Importante cambio donde ya he estado
        //Controlar el bucle
        boolean salir=false;
        //Busqueda del cuerpo
        do{
        //izquierda
        if(matriz[coordenada.getY()][coordenada.getX()-1]==1){
            matriz[coordenada.getY()][coordenada.getX()-1]=0;
            coordenada.cambiarCoordenadas(coordenada.getY(), coordenada.getX()-1);
            celda nueva = new celda(coordenada.getY(),coordenada.getX());
            serpiente.add(nueva);
        }
        //Derecha
        else if(matriz[coordenada.getY()][coordenada.getX()+1]==1){
            matriz[coordenada.getY()][coordenada.getX()+1]=0;
            coordenada.cambiarCoordenadas(coordenada.getY(), coordenada.getX()+1);
            celda nueva = new celda(coordenada.getY(),coordenada.getX());
            serpiente.add(nueva);
        }
        //Arriba
        else if(matriz[coordenada.getY()+1][coordenada.getX()]==1){
            matriz[coordenada.getY()+1][coordenada.getX()]=0;
            coordenada.cambiarCoordenadas(coordenada.getY()+1, coordenada.getX());
            celda nueva = new celda(coordenada.getY(),coordenada.getX());
            serpiente.add(nueva);        }
        //Abajo
        else if(matriz[coordenada.getY()-1][coordenada.getX()]==1){
            matriz[coordenada.getY()-1][coordenada.getX()]=0;
            coordenada.cambiarCoordenadas(coordenada.getY()-1, coordenada.getX());
            celda nueva = new celda(coordenada.getY(),coordenada.getX());
            serpiente.add(nueva);
        }
        //nada
        else{
        //significa que no hay
        salir=true;
        }
        }while(!salir);
        return serpiente;
    }
}
