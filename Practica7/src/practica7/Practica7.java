/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

/**
 *
 * @author Rodrigo
 */
public class Practica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        CREAR UN ARREGLO CON 50 ELEMENTOS, LLENARLO CON VALORES ALEATORIOS ENTRE 1
         Y 100, E IMPRIMIR EL VALOR MÁS PEQUEÑO Y MÁS GRANDE EN EL ARREGLO (Y SU
        POSICIÓN)
         */

        int aiArreglo[] = new int[50];

        //Llenar arreglo
        for (int i = 0; i < aiArreglo.length; i++) {
            aiArreglo[i] = (int) (Math.random() * 99) + 1;
        }

        //Imprimir arreglo
        for (int i = 0; i < aiArreglo.length; i++) {
            System.out.println("[" + aiArreglo[i] + "]");
        }

        //Encontrar valor mayor
        int iMayor = 0;
        int iPosMay = 0;
        for (int i = 0; i < aiArreglo.length; i++) {
            if (iMayor < aiArreglo[i]) {
                iMayor = aiArreglo[i];
            }
        }
        //Encontrar cantidad que se repite el valor mayor
        for (int i = 0; i < aiArreglo.length; i++) {
            if (iMayor == aiArreglo[i]) {
                iPosMay++;
            }
        }

        //Guardar posicion de valor mayor
        int aiPosMay[] = new int[iPosMay];
        for (int i = 0, j = 0; i < aiArreglo.length; i++) {
            if (iMayor == aiArreglo[i]) {
                aiPosMay[j] = i;
                j++;

            }
        }

        //Encontrar valor menor
        int iMenor = 100;
        int iPosMen = 0;
        for (int i = 0; i < aiArreglo.length; i++) {
            if (iMenor > aiArreglo[i]) {
                iMenor = aiArreglo[i];
            }

        }
        //Encontrar cantidad que se repite el valor menor
        for (int i = 0; i < aiArreglo.length; i++) {
            if (iMenor == aiArreglo[i]) {
                iPosMen++;
            }
        }

        //Guardar posicion de valor menor
        int aiPosMen[] = new int[iPosMen];
        for (int i = 0, j = 0; i < aiArreglo.length; i++) {
            if (iMenor == aiArreglo[i]) {
                aiPosMen[j] = i;
                j++;

            }
        }

        //Impresion de informacion de valor mayor
        System.out.println("\n Valor mas grande: " + iMayor);
        System.out.print("Posiciones del valor mayor: ");
        for (int i = 0; i < aiPosMay.length; i++) {
            System.out.print("[" + aiPosMay[i] + "] ");
        }

        //Impresion de informacion de valor menor
        System.out.println("\n Valor mas pequeño: " + iMenor);
        System.out.print("Posiciones del valor menor: ");
        for (int i = 0; i < aiPosMen.length; i++) {
            System.out.print("[" + aiPosMen[i] + "] ");
        }
    }

}
