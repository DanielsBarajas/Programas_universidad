/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.ListaContactos;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class Controlador {
    Vista view = new Vista();
    ListaContactos list = new ListaContactos();
    boolean confir = true;
    public Controlador(Vista view){
        this.view = view;
    }
    public void Inicio(){
        
        System.out.println("*************************************");
        System.out.println("Gestion de contactos telefonicos");
        System.out.println("*************************************");
        
        
        while (confir != false) {
            switch (view.Menu()) {
            case 1:
                list.AgregarContLista(view.nombreContacto(), view.numeroContacto(), view.correoContacto());
                break;
            case 2:
                list.MostarListacontactos();
                list.EliminarContacto(view.verificacion());
                break;
            case 3:
                list.MostarListacontactos();
                break;
            case 4:
                list.MostarListacontactos();
                list.agregarFav(view.PregunFav());
                break;
            case 5:
                list.mostrarFav();
                break; 
            case 6:
                confir = false;
                break;
            default:
                System.out.println("El valor esta en los parametros");
        }
            
        }
        
        
        
        
        
        
        
        
        
    }
    
    
    
}
