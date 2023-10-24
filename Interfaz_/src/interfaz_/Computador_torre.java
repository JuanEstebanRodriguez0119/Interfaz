/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz_;


public class Computador_torre implements Fijo, Sistema_operativo {

    @Override
    public void dificil_transportar() {
        System.out.println("Es dificil transportar");
    }

    @Override
    public void iniciar_sistema() {
        System.out.println("Corre el sistema operativo en el PC");
    }
  
}
