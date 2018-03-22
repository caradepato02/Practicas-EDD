/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg3;

/**
 *
 * @author Rodrigo
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //-GENERAR UNA MATRIZ DE 5 X 5 ENTEROS, LLENAR CON NÚMERO ALEATORIOS ENTRE 1 Y 100 E IMPRIMIR
        //CREAR UNA COPIA DE LA MATRIZ, PERO EN ORDEN INVERSO:

        int aiMatriz[][] = new int[5][5];
        int aiInverso[][] = new int[5][5];

        //Lenar matriz
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                aiMatriz[i][j] = (int) (Math.random() * 99) + 1;
            }
        }
        //Imprimir matriz
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                System.out.print("[" + aiMatriz[i][j] + "]");
            }
            System.out.println("");
        }

        //LLenar matriz inversa
        for (int i = 0, iCont = aiMatriz.length - 1; i < aiInverso.length; i++, iCont--) {
            for (int j = 0, iCont2 = aiMatriz[i].length - 1; j < aiInverso[i].length; j++, iCont2--) {
                aiInverso[i][j] = aiMatriz[iCont][iCont2];
            }
        }
        System.out.println("\n MATRIZ INVERSA");
        //Imprimir matriz inversa
        for (int i = 0; i < aiInverso.length; i++) {
            for (int j = 0; j < aiInverso[i].length; j++) {
                System.out.print("[" + aiInverso[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
