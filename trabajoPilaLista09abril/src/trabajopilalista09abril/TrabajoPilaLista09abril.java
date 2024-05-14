/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopilalista09abril;

import controlador.Controlador;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class TrabajoPilaLista09abril {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista vis = new Vista();
        Controlador cont = new Controlador(vis);
        cont.iniciar();
        vis.setVisible(true);
    }
    
}
