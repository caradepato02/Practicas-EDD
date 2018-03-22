/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Solicitar cantidad de edades
        System.out.println("¿Cuántas edades va a capturar?");
        Scanner sc = new Scanner(System.in);
        int iCant = sc.nextInt();
        int aiEdades[] = new int[iCant];
        int iSumaSqrt = 0;
        System.out.println("");
        //Solicitar las edades
        for (int i = 0; i < aiEdades.length; i++) {
            System.out.println("Ingrese edad # " + (i + 1));
            aiEdades[i] = sc.nextInt();
        }

        //Bubble sort
        int n = aiEdades.length;
        int bubble;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (aiEdades[j - 1] > aiEdades[j]) {
                    bubble = aiEdades[j - 1];
                    aiEdades[j - 1] = aiEdades[j];
                    aiEdades[j] = bubble;
                }
            }

        }
        //Imprimir arreglo
        /*for (int i = 0; i < aiEdades.length; i++) {
            System.out.println(aiEdades[i]);
        }*/

        //Encontrar mediana
        double iMediana;
        if ((aiEdades.length % 2) == 0) {
            iMediana = (double) (aiEdades[((aiEdades.length / 2)) - 1] + aiEdades[((aiEdades.length / 2))]) / 2;
        } else {
            iMediana = aiEdades[((aiEdades.length / 2))];

        }

        //Sumar las edades
        int iSuma = 0;
        for (int i = 0; i < aiEdades.length; i++) {
            iSuma += aiEdades[i];
        }

        //Suma de los cuadrados para la varianza estandar
        for (int i = 0; i < aiEdades.length; i++) {
            iSumaSqrt += Math.pow((aiEdades[i] - (iSuma / iCant)), 2);
        }
        //Calculo de la varianza estandar
        double dDesviacion;
        dDesviacion = Math.sqrt(iSumaSqrt / iCant);

        int aiModa[] = new int[aiEdades.length];

        //Contar cantidad de repeticiones
        for (int i = 0; i < aiEdades.length; i++) {
            for (int j = i, k = 0; j < aiEdades.length; j++) {
                if (aiEdades[i] == aiEdades[j]) {
                    k++;
                }
                aiModa[i] = k;
            }
        }
        int x = 0;
        int y = 0;
        //Encontrar moda
        int a = 0;
        //Encontrar número de repeticiones mayor
        for (int i = 0; i < aiModa.length; i++) {
            if (a < aiModa[i]) {
                a = aiModa[i];
            }
        }

        for (int i = 0; i < aiModa.length; i++) {
            if (x < aiModa[i]) {
                x = i;
                if (aiModa[i] == a && a > 1)//contar cantidad numeros moda
                {
                    y++;
                }
            }
        }

        //En caso de numeros con la misma cantidad de repeticiones
        int aiCantModa[] = new int[y];
        if (y > 1) {
            //Generar arreglo multimodal
            for (int i = 0, j = 0; i < aiModa.length; i++) {
                if (aiModa[i] == a && a > 1) {
                    aiCantModa[j] = i;
                    j++;
                }
            }
        }
        int iModa = aiEdades[x];

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("\nEl promedio es: " + (double) (iSuma / iCant));
        if (y == 0) {
            System.out.println("No hay moda");
        } else if (y > 1) {
            System.out.println("Los valores moda son: ");
            for (int i = 0; i < aiCantModa.length; i++) {
                System.out.print("[" + aiEdades[aiCantModa[i]] + "] ");
            }
        } else {
            System.out.println("La moda es: " + iModa);
        }
        System.out.println("La mediana es: " + iMediana);

        System.out.println("La desviación estandar es: " + df.format(dDesviacion));

    }

}
