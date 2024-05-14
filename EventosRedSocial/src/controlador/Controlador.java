/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.SecuenciaEvento;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class Controlador {
    Vista view = new Vista();
    SecuenciaEvento list = new SecuenciaEvento();
    
    public Controlador(Vista view){
        this.view = view;
    }
    
    public void inicio(){
        
        boolean confir = true;
        
        while (confir == true) {  
            
            switch (view.MenuInicio()) {
            case 1:
                list.agregarEvento(view.preguIdEvent(),view.TipoEven(),view.pregunIdUsuario(),view.preguFecha(),view.preguContenido());
                break;
            case 2:
                list.eliminarEvento(view.preguIdEvent());
                break;
            case 3:
                list.buscarEvento(view.menuBusqueda());
                break;
            case 4:
                list.listarEvento();
                break;
            case 5:
                confir = false;
                break;
                
            default:
                
        }
        }

    }
}
