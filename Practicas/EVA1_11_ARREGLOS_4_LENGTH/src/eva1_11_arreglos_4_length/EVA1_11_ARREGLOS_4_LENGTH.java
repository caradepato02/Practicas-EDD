/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_arreglos_4_length;

/**
 *
 * @author Administrador
 */
public class EVA1_11_ARREGLOS_4_LENGTH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] aiDatos = new int[5];
        aiDatos[0]=10;
        aiDatos[1]=20;
        aiDatos[2]=30;
        aiDatos[3]=40;
        aiDatos[4]=50;
        for (int i=0;i<aiDatos.length;i++){
            System.out.println("["+ i + "]=" +aiDatos[i]);
        }
        int aiGrande[] = new int [aiDatos.length];
        
         for(int i=0;i<aiDatos.length;i++){
             aiGrande[i]=(int)aiDatos[i];
         }
         aiDatos[2]=6666666;
         System.out.println("\n Copia ");
         for (int i=0;i<aiGrande.length;i++){
            System.out.println("["+ i + "]=" +aiGrande[i]);
        }   
        
    }
}
