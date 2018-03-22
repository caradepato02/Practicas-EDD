/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_19_arreglos_args;

/**
 *
 * @author invitado
 */
public class EVA1_19_ARREGLOS_ARGS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aiDatos[] ={0,1,2,3,4,5,6,7,8,9};
        for (int aiDato : aiDatos) {
            System.out.println("Valor = " + aiDato);
        }
        aiDatos = new int[10];
        aiDatos[0]=10;
        aiDatos[1]=20;
        aiDatos[2]=30;
        aiDatos[3]=40;
        aiDatos[4]=50;
        aiDatos[5]=60;
        aiDatos[6]=70;
        aiDatos[7]=80;
        aiDatos[8]=90;
        aiDatos[9]=100;
               imprimir(aiDatos);
    }
    
        static void  imprimir(int[] aiDatos){
            for (int aiDato : aiDatos) {
                System.out.println("Valor = "+ aiDato );
            }
        }
}
