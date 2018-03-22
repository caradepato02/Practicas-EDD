/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg2;

/**
 *
 * @author Rodrigo
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //GENERAR UNA MATRIZ DE 100 x 100 ENTEROS, LLENARLOS CON CEROS Y UNOS, E IMPRIMIR
       
        int aiMatriz[][] = new int[100][100];

        //Llenar matriz
        for (int i = 0; i < aiMatriz.length; i++) {
            aiMatriz[i][i] = 1;
        }
        //Imprimir matriz
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                System.out.print("[" + aiMatriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
