/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_arreglos_multidim;

/**
 *
 * @author Home
 */
public class EVA1_12_ARREGLOS_MULTIDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] aiMatriz= new int [3][3];
        System.out.println(aiMatriz);
       aiMatriz[0][0]=10;
       aiMatriz[0][1]=20;
       aiMatriz[0][2]=30;
       aiMatriz[1][0]=40;
       aiMatriz[1][1]=50;
       aiMatriz[1][2]=60;
       aiMatriz[2][0]=70;
       aiMatriz[2][1]=80;
       aiMatriz[2][2]=90;
        System.out.println(aiMatriz[0]);
        System.out.println(aiMatriz[1);
        System.out.println(aiMatriz[2]);
       for(int i=0; i<3;i++){
           for(int j=0; j<3;j++){
               System.out.println(aiMatriz[i][j]);
           }
       }
    }
    
}
