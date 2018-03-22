/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_funciones_stack;

/**
 *
 * @author Home
 */
public class EVA1_3_FUNCIONES_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicia main");
        A();
        System.out.println("Termina main");
    }

    public static void A() {
        System.out.println("Inicia A");
        B();
        System.out.println("Termina A");
    }

    public static void B() {
        System.out.println("Inicia B");
        C();
        System.out.println("Termina B");
    }

    public static void C() {
        System.out.println("Inicia C");
        D();
        System.out.println("Termina C");
    }

    public static void D() {
        System.out.println("Inicia D");
        System.out.println("Termina D");
    }

}
