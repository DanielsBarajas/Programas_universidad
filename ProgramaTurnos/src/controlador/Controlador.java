/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.ListaTurnos;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class Controlador {
    Vista view = new Vista();
    ListaTurnos list = new ListaTurnos();
    
    public Controlador(Vista view){
        this.view = view;
        
    }
    
    public void inicio(){
        boolean confir = true;
        boolean confirTurno = true;
        
        while (confir == true) {  
            
            switch(view.mostrarMenu()){
                case 1:
                    list.agregarTurno( view.ingresarUsuario());
                    break;
                case 2:

                    break;
                case 3:
                    list.iniciarJuego();
                    while (confirTurno == true) {
                        list.MostrarTurno();
                        
                        switch (view.MenuPregunta()) {
                            case 1:
                                list.sigTurno();
                                break;
                            case 2:
                                confirTurno = false;
                                break;
                            default:
                                System.out.println("numero fuera de rango");
                                
                        }
                        
                        
                    }
                        
                    break;
                case 4:
                    confir = false;
                    break;


                default:

            }
            
        }
        
    }
}
