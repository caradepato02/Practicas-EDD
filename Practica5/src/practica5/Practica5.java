/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 *
 * @author Rodrigo
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        CREAR UN ARREGLO CON 50 ELEMENTOS, LLENARLO CON VALORES ALEATORIOS ENTRE 1
        Y 100, E IMPRIMIR UNA LISTA CON LOS VALORES PARES QUE CONTENGA.

         */
        int aiArreglo[] = new int[50];
        int iCantPar = 0;

        //Llenar arreglo
        for (int i = 0; i < aiArreglo.length; i++) {
            aiArreglo[i] = (int) (Math.random() * 99) + 1;
        }

        //Imprimir arreglo
        for (int i = 0; i < aiArreglo.length; i++) {
            System.out.println("[" + aiArreglo[i] + "]");
        }

        //Contar cantidad de pares
        for (int i = 0; i < aiArreglo.length; i++) {
            if (aiArreglo[i] % 2 == 0) {
                iCantPar++;
            }
        }

        //Crear arreglo de pares
        int aiPares[] = new int[iCantPar];

        //Guardar pares en el arreglo
        for (int i = 0, j = 0; i < aiArreglo.length; i++) {
            if (aiArreglo[i] % 2 == 0) {
                aiPares[j] = aiArreglo[i];
                j++;
            }
        }

        //Imprimir arreglo de pares
        System.out.println("\n NUMEROS PARES");
        for (int i = 0; i < aiPares.length; i++) {
            System.out.println("Numeros pares: " + aiPares[i]);
        }

    }

}
