
package interfaz_;

public class Interfaz_ {

    public static void main(String[] args) {
       Computador_torre pc = new Computador_torre();
       Portatil portatil = new Portatil();
       
       pc.dificil_transportar();
       pc.iniciar_sistema();
       portatil.transportar();
       portatil.iniciar_sistema();
       
    }
    
}
