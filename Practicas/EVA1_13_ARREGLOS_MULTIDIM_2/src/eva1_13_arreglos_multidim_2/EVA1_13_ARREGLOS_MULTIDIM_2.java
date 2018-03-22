/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_13_arreglos_multidim_2;

/**
 *
 * @author Home
 */
public class EVA1_13_ARREGLOS_MULTIDIM_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] aiMatriz= new int [3][];
        aiMatriz[0]= new int[2];
        System.out.println(aiMatriz[0]);
        System.out.println(aiMatriz[0][1]);
        aiMatriz[1]= new int[5];
        System.out.println(aiMatriz[1]);
        System.out.println(aiMatriz[1][1]);
        aiMatriz[2]= new int[10];
        System.out.println(aiMatriz[2]);
        System.out.println(aiMatriz[2][1]);
        
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                System.out.println(aiMatriz[i][j]);
                
            }
        }
    }
    
}
