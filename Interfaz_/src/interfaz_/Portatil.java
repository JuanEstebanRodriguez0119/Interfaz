
package interfaz_;

public class Portatil implements Portable, Sistema_operativo {

    @Override
    public void transportar() {
        System.out.println("Es facil de transportar");
    }

    @Override
    public void iniciar_sistema() {
        System.out.println("Inicia el sistema en el portatil");
    }
    
}
