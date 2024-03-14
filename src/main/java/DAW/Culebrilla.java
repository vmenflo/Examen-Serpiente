/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package DAW;

import java.util.List;

/**
 *
 * @author Víctor
 */
public class Culebrilla {

    public static void main(String[] args) {

        //Generar matriz de 0
        int[][] matrizSerpiente = Metodos.generarMatrizSerpiente();
        //Dibujar Serpiente
        matrizSerpiente[2][3] = 1;
        matrizSerpiente[2][4] = 1;
        matrizSerpiente[2][5] = 1;
        matrizSerpiente[2][6] = 1;
        matrizSerpiente[3][6] = 1;
        matrizSerpiente[4][6] = 1;
        matrizSerpiente[4][5] = 1;
        matrizSerpiente[4][4] = 1;
        matrizSerpiente[4][3] = 1;
        matrizSerpiente[5][3] = 1;
        matrizSerpiente[6][3] = 1;

        //Mostrar matriz con serpiente
        Metodos.verMatriz(matrizSerpiente);
        
        //Encontrar cabeza
        celda coordenadas = Metodos.cabezaSerpiente(matrizSerpiente);
        System.out.println("La cabeza se encuentra en: " + coordenadas.toString());
        
        //Encontrar cuerpo
        List<celda> cuerpoSerpiente = Metodos.encontrarCuerpo(matrizSerpiente, coordenadas);
        System.out.println(cuerpoSerpiente);

    }
}
