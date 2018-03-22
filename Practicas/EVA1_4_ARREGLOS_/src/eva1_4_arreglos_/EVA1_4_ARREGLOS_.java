/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_arreglos_;

/**
 *
 * @author Home
 */
public class EVA1_4_ARREGLOS_ {

    
     public static final int ARRE_TAMA =30;
    public static void main(String[] args) {
       int aiEdad[] = new int [ARRE_TAMA];//DECLARAMOS UN IDENTIFICADOR DE TIPO ARREGLO
       //ARREGLOS DIEMPRE EMPIEZA EN 0
       //HAY QUE MOVERLOS A UN VALOR PREVIO AL TAMAÑO DEL ARREGLO
       for (int i = 0; i < ARRE_TAMA; i++){
           System.out.println ("aiEdad[" + i +"]="+ aiEdad[i]);
           
       }
       aiEdad[0] = 25; //pocision cero (primer posision del arreglo)un valor de 25
       //llenar con vlores desde 0 y 36
        for (int i = 0; i < aiEdad.length; i++){
       //Math.random regresa vaores ente 0 y 1 --> 0.13526545
       //hay que hacer un casting de double a entero (int)
               
       aiEdad[i]= (int)(Math.random() * 36);
       }
       
       for (int i = 0; i < ARRE_TAMA; i++){//leemos nuestro arreglo
           System.out.println ("aiEdad[" + i +"]="+ aiEdad[i]);
       }
       
    }
    
       }
