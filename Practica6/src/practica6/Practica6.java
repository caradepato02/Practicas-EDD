/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

/**
 *
 * @author Rodrigo
 */
public class Practica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        TOME LA PRÁCTICA 5 COMO BASE. GENERE UN ARREGLO QUE CONTENGA EXACTAMENTE LA
        MISMA CANTIDAD DE VALORES PARES DEL ARREGLO CON VALORES ALEATORIOS. COPIE
        LOS VALORES PARES AL NUEVO ARREGLO. HAGA LO MISMO PARA LOS VALORES IMPARES.
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

        //Crar arreglo de impares
        int aiImpar[] = new int[(50-iCantPar)];
        for (int i = 0, j = 0; i < aiArreglo.length; i++) {
            if (aiArreglo[i] % 2 != 0) {
                aiImpar[j] = aiArreglo[i];
                j++;
            }
        }
        
        //Imprimir arreglo de pares
        System.out.println("\n NUMEROS IMPARES");
        for (int i = 0; i < aiImpar.length; i++) {
            System.out.println("Numeros impares: " + aiImpar[i]);
        }
    }

}
