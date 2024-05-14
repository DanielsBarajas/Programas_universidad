/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinalestructuras;

import controlador.Controlador;
import vista.AdministrarBuses;
import vista.AdministrarTerminales;
import vista.ComprarTicket;
import vista.Vista;



/**
 *
 * @author Usuario
 */
public class ProyectoFinalEstructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista view = new Vista();
        ComprarTicket compraTicket = new ComprarTicket();
        AdministrarTerminales viewAdminTerminales = new AdministrarTerminales();
        AdministrarBuses viewAdminBuses = new AdministrarBuses();
        Controlador cont = new Controlador(view, compraTicket,viewAdminTerminales, viewAdminBuses);
        cont.inicio();
        view.setVisible(true);
    }
    
}
