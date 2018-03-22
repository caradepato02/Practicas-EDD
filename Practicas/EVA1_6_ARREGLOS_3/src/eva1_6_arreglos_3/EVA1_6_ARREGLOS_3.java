/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_arreglos_3;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class EVA1_6_ARREGLOS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aiEdad[];
        Scanner sc = new Scanner(System.in);
        //System.out.println("aiEdad[5]"); error, se debe inicializar new

        System.out.println("Introduce la cantidad de edades a capturar");
        int iCant = sc.nextInt();//capturar desde el teclado. al dar enter
        aiEdad = new int[iCant];
        for(int i=0; i<aiEdad.length;i++){
            System.out.println("Introduce tu edad");
            aiEdad[i]= sc.nextInt();
        }
    }
}
