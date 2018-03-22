/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_7_copia_arreglos_1;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class EVA1_7_COPIA_ARREGLOS_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int miArreglo[] = new int[5]; 
        System.out.println("Ingresa 5 valores");
        Scanner sc = new Scanner (System.in);
        for(int i =0; i<5;i++){
            miArreglo[i] = sc.nextInt();
        }
        for (int i : miArreglo) {
            System.out.println("Dato = "+ miArreglo[i]);
        }
        System.out.println(miArreglo);
    }
    
}
