/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_buscar_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_17_BUSCAR_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] aiDatos = new int[5];
        //LLenar el arreglo
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int) (Math.random() * 10) + 1;
            System.out.print(aiDatos[i] + " ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Que valor buscas?");
        int iVal = sc.nextInt();

        for (int i = 0; i < aiDatos.length; i++) {
            if (iVal == aiDatos[i]) //lo buscamos
            {
                System.out.println("El valor esta en la posición " + i);
                //Si queremos detenerlo, usariamos un break;
                break;
            }
                System.out.println("El valor no se encontro");
            
        }
    }

}
