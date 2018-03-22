/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_memoria_objetos;

/**
 *
 * @author Home
 */
public class EVA1_2_MEMORIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int IOtroval = 10;
        double dSalario = 500.50;
        Prueba pObj = new Prueba();
        System.out.println("IOtroval = " + IOtroval);
        System.out.println("DSalario = " + dSalario);
        System.out.println("pObj" + pObj);
        System.out.println("Valor de IVal=" + pObj.IVal);

    }

}

class Prueba {

    int IVal = 5;
}
