/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_copia_arreglos_2;

/**
 *
 * @author Home
 */
public class EVA1_8_COPIA_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int miArreglo[] = new int[5]; 
        System.out.println("5 valores");
        miArreglo[0]=10;
        miArreglo[1]=14;
        miArreglo[2]=15;
        miArreglo[3]=16;
        miArreglo[4]=18;
        
        for (int i : miArreglo) {
            System.out.println("Dato = " + miArreglo[i]);
            
        }
        
        int aiCopia[] = new int[5];
        for(int i=0; i < miArreglo.length;i++){
            aiCopia[i] = miArreglo[i];
        }
        for (int i : aiCopia) {
            System.out.println("Dato = "+ aiCopia[i]);
            
        }
    }
    
}

