/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import InterfazGrafica.VentanaMyFarm;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class Main {
    /**
     * Metodo main que se encarga de llamar al JFrame que inicia el juego
     * @param args 
     */
    public static void main(String[] args) {
        VentanaMyFarm iniciarJuego = new VentanaMyFarm();
        iniciarJuego.setVisible(true);
    }

}
