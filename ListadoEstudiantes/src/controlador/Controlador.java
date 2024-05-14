/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.ListaEnlazadaEstudiante;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class Controlador {
    Vista view = new Vista();
    ListaEnlazadaEstudiante list = new ListaEnlazadaEstudiante();
    
    public Controlador(Vista view){
        this.view = view;
    }
    
    public void inicio(){
        boolean confir = true;
        while(confir == true){ 
        
            switch (view.MenuInicio()) {
                case 1:
                    switch (view.menuAgregar()) {
                        case 1:
                            list.agregarInicio(view.preguNombre(), view.preguEdad());
                            break;
                        case 2:
                            list.agregarFinal(view.preguNombre(), view.preguEdad());
                            break;
                        default:
                            System.out.println("Valor ingresado fuera de parametros");
                    }
                    
                    list.ImprimirLista();
                    break;
                case 2:
                    switch (view.menuEliminar()) {
                        case 1:
                            list.EliminarInicio();
                            break;
                        case 2:
                            list.EliminarFinal();
                            break;
                        default:
                            System.out.println("Valor ingresado fuera de parametros");
                    }
                    
                    list.ImprimirLista();
                    break;
                case 3:
                    list.ImprimirLista();
                    break;
                case 4:
                    confir = false;
                    break;


                default:
                    throw new AssertionError();
            }
        }
    }
    
}
