/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.text.DecimalFormat;

/**
 *
 * @author Rodrigo
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        CREAR DOS MATRICES DE 5 X 5, LLENAR CON NÚMERO ALEATORIOS (DOUBLES) ENTRE 1
        Y 10, CREAR UNA MATRIZ DE 5 X 5 DONDE ALMACENE LOS RESULTADOS DE 
        MULTIPLICAR CADA POSICIÓN DE LAS MATRICES:
        MATRIZRESULTADOS[0][0] = MATRIZ1[0][0] X MATRIZ2[0][0]
        */
        
        double adMatriz[][] = new double[5][5];
        double adMatriz2[][] = new double[5][5];
        double adMaRe[][] = new double[5][5];
        DecimalFormat df = new DecimalFormat("#.00");
        //Llenar matriz 1
        for (int i = 0; i < adMatriz.length; i++) {
            for (int j = 0; j < adMatriz[i].length; j++) {
                adMatriz[i][j] = (Math.random() * 9)+1;
            }
        }

        //Imprimir matriz 1
        System.out.println("MATRIZ 1");
        for (int i = 0; i < adMatriz.length; i++) {
            for (int j = 0; j < adMatriz[i].length; j++) {
                System.out.print("[" + (df.format(adMatriz[i][j])) + "]");
            }
            System.out.println("");
        }

        //LLenar matriz 2
        for (int i = 0; i < adMatriz2.length; i++) {
            for (int j = 0; j < adMatriz2[i].length; j++) {
                adMatriz2[i][j] = (Math.random() * 9)+1;
            }
        }

        //Imprimir matriz 2
        System.out.println("\n MATRIZ 2");
        for (int i = 0; i < adMatriz.length; i++) {
            for (int j = 0; j < adMatriz[i].length; j++) {
                System.out.print("[" + (df.format(adMatriz2[i][j])) + "]");
            }
            System.out.println("");
        }

        //Multiplicar posicion de las matrices
        for (int i = 0; i < adMaRe.length; i++) {
            for (int j = 0; j < adMaRe[i].length; j++) {
                adMaRe[i][j] = adMatriz[i][j] * adMatriz2[i][j];
            }
        }

        //Imprimir matriz resultado
        System.out.println("\n MATRIZ RESULTADO");
        for (int i = 0; i < adMaRe.length; i++) {
            for (int j = 0; j < adMaRe[i].length; j++) {
                System.out.print("[" + (df.format(adMaRe[i][j])) + "]");
            }
            System.out.println("");
        }
    }

}
