/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.SillaEnlazadas;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class Controlador {
    Vista view = new Vista();
    SillaEnlazadas list = new SillaEnlazadas();
    
    public Controlador(Vista view){
        this.view = view;
    }
    
    public void inicio(){
        boolean confir = true;
        
        list.cantidadSillas(view.CantSillas());
        
        
        
       while (confir == true) {  
            list.cantSillasYParticipates();
            
            switch(view.MenuRonda()){
                case 1:
                    Object num = list.numAleatorio();
                    list.eliminarEvento(num);
                    System.out.println("-------------------------------");
                    list.sillasOcupadas();

                    
                    break;
                case 2:
                    
                    list.mostrarSillas();
                    
                    break;
                case 3:
                    
                    System.exit(0);
                    
                    break;

                default:
                    System.out.println("Numero ingresado fuera de parametros");
            }
        
        
        
        
        
        
    }
}
}
