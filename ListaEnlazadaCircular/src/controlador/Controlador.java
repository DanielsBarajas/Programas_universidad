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
    int i = 0;
    boolean confir = true;
    boolean confirTurno = true;
    
    public Controlador(Vista view){
        this.view = view;
        
    }
    
    public void inicio(){
        System.out.println("Bienvenido al sistema de gestio de turnos del banco");
        System.out.println("---------------------------------------------------");
        
        
        while (confir == true) {
           
            switch (view.mostrarMenu()) {
            case 1:
                list.agregarTurno(view.ingresarUsuario(), view.ingresCedula(), view.Accion());
                if (list.verificar() == list.verificarDos()) {
                    list.iniciarTurnos();
                }
                list.MostrarTurnoPantalla();
                
                break;
            case 2:
                
                
                if(list.verificar()!= null){
                    list.sigTurno();
                    list.MostrarTurnoPantalla();
                    list.InformacionTurno();
                    
                
                    
                    
                }else{
                    System.out.println("No hay turnos creados");
                }
                
                
                break;
            case 3:
                list.EliminarTurnos();
                
                break;
            default:
                throw new AssertionError();
        }
            
        }
        
        
        
    }
}
