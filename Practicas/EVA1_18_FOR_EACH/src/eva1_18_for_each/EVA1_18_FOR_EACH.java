/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_for_each;

/**
 *
 * @author invitado
 */
public class EVA1_18_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aiDatos[] = {1,2,3,4,5,6,7,8,9,10};
        
        for (int iVal : aiDatos) {
            System.out.println("Valor = " +iVal);
        }
        String asCadenas[] = {"Rodrigo","Euardo","Hernandez","chavez","!!!"};
        
                for (String sCade : asCadenas) {
                    System.out.println("Cadena = " +sCade);
            
        }
                int aiMatriz[][] =new int[3][3];
                aiMatriz[0][0]=10;
                aiMatriz[0][1]=20;
                aiMatriz[0][2]=30;
                aiMatriz[1][0]=40;
                aiMatriz[1][1]=50;
                aiMatriz[1][2]=60;
                aiMatriz[2][0]=70;
                aiMatriz[2][1]=80;
                aiMatriz[2][2]=90;
                
                for (int[] matriz : aiMatriz) {
                    for (int n : matriz) {
                        System.out.println("Matriz = " + n);
                    }
                    
                
        }
                int aiCubo[][][]= new int [2][2][2];
                    for (int i = 0; i < aiCubo.length; i++) {
                        for (int j = 0; j < aiCubo[i].length ; j++) {
                            for (int k = 0; k < aiCubo[i][j].length; k++) {
                                aiCubo[i][j][k]= (int)(Math.random()*50);
                            }
                        }
                    }
                    for (int[][] aiCubo1 : aiCubo) {
                        for (int[] aiCubo11 : aiCubo1) {
                            for (int b : aiCubo11) {
                                System.out.println("Valor = " +b);
                            }
                        }
                    }
    }
    
}
