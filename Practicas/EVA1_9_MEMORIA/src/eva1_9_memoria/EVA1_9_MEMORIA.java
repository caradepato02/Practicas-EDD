/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_memoria;

/**
 *
 * @author Home
 */
public class EVA1_9_MEMORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EVA1_9_MEMORIA pObj = new EVA1_9_MEMORIA();
        //Para deshacerse de la memoria de un objeto
        pObj = null; //libera la memoria creada para el objeto
        
        EVA1_9_MEMORIA pObjt2 = new  EVA1_9_MEMORIA();
        EVA1_9_MEMORIA pCopia = pObjt2;
        pObjt2 =null; //mp se elimina el objeto, porque sigue apuntado
        pCopia = null; //ahora si, el obejto se elimina, no queda mas referencias del objeto
    }
    
}
