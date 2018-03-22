/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_arreglos_2;

/**
 *
 * @author Administrador
 */
public class EVA1_5_ARREGLOS_2 {

    public static final int ARRE_TAMA = 30;

    public static void main(String[] args) {
        int aiEdad[] = new int[ARRE_TAMA];
        //for(int i=0 ;i<aiEdad.length;i++)
        for (int i = 0; i < ARRE_TAMA; i++) {
            System.out.println("aiEdad[" + i + "]=" + aiEdad[i]);
        }
        aiEdad[0] = 25;

        //Llenar con valores entre 0 y 36
        for (int i = 0; i < aiEdad.length; i++) {
            //Hay que hacer una csting de double a entero (int)
            aiEdad[i] = (int) (Math.random() * 36);
        }
        for (int i = 0; i < ARRE_TAMA; i++) {
            System.out.println("aiEdad[" + i + "]=" + aiEdad[i]);
        }
    }
}
