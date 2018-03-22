/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_arreglos_3;

/**
 *
 * @author Home
 */
public class EVA1_10_ARREGLOS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       persona apGente[] = new persona[5];
       apGente[0] = new persona(); //Constructor default
       apGente[1] = new persona("Tania", "Rascon", 24);
       apGente[2] = new persona("Erika", "Ojeda", 21 );
       apGente[3] = new persona("Cinthia", "Chavez", 20);
       apGente[4] = new persona("Jonathan", "Aguilera", 19);
        System.out.println("Original");
       for(int i=0; i<apGente.length; i++){
           System.out.println("Nombre:"+ apGente[i].getsNomb() );
           System.out.println("Apellido:"+ apGente[i].getsApe() );
           System.out.println("Edad:"+ apGente[i].getiEdad());
           System.out.println("");
       }
       persona apCopia[] =new persona[apGente.length];
       for(int i= 0;i<apGente.length;i++){
           apCopia[i]=apGente[i];
       }
       apGente[2]=new persona("hola","adios",55);
        System.out.println("Copia");
       for(int i=0; i<apCopia.length; i++){
           System.out.println("Nombre:"+ apCopia[i].getsNomb() );
           System.out.println("Apellido:"+ apCopia[i].getsApe() );
           System.out.println("Edad:"+ apCopia[i].getiEdad());
           System.out.println("");
       }
        System.out.println("Original");
       for(int i=0; i<apGente.length; i++){
           System.out.println("Nombre:"+ apGente[i].getsNomb() );
           System.out.println("Apellido:"+ apGente[i].getsApe() );
           System.out.println("Edad:"+ apGente[i].getiEdad());
           System.out.println("");
       }
       
    }
}
    class persona{
        private String sNomb;
        private String sApe;
        private int iEdad;

        public persona() {
           sNomb = "Rodrigo";
            sApe = "Reyes";
            iEdad = 19; 
        }

        public persona(String sNomb, String sApe, int iEdad) {
            this.sNomb = sNomb;
            this.sApe = sApe;
            this.iEdad = iEdad;
        }

        public int getiEdad() {
            return iEdad;
        }

    public String getsApe() {
        return sApe;
    }

        

        public String getsNomb() {
            return sNomb;
        }
        
        
    }

    
    
    
    

