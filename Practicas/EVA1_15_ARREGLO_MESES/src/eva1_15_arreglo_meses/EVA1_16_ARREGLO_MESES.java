/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_15_arreglo_meses;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_16_ARREGLO_MESES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] asMeses = {"Enero", "Febrero", "Marzo", "Abril", 
        "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", 
        "Noviembre", "Diciembre", };
        int[] aiDias={31,28,31,30,31,30,31,31,30,31,30,31};
        //Equivalente a:
        /*
        String[]asMeses = new String[12];
        asMeses[0]= "Enero";
        asMeses[0]= "Febrero";
        */
        
        //Preguntar al usuario
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el # de mes [1 - 12]");
        int iMes = sc.nextInt();
        //Imprimir el mes 
        System.out.println("El mes es: " + asMeses[iMes-1] 
                + " y tiene "+aiDias[iMes-1] +" Dias.");
    }
    
}
