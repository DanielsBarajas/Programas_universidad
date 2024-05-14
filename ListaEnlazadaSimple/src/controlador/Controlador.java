/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.ListaContacto;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class Controlador {
    Vista view = new Vista();
    ListaContacto list = new ListaContacto();
    boolean confir = true;
    
    public Controlador(Vista view){
        this.view = view;
    }
    public void Inicio(){
        
        System.out.println("*********************************************");
        System.out.print("Gestion de contactos telefonicos\n");
        System.out.println("*********************************************");
        
        while (confir != false) {
            
            switch(view.Menu()) {
                case 1:
                    list.AgregarContLista(view.nombreContacto(), view.numeroContacto(), view.correoContacto());
                   
                    break;
                case 2:
                    list.MostarListaMateriales();
                    list.EliminarContacto(view.verificacion());
                    
                    
                    break;
                case 3:
                    System.out.println("----------------------------");
                    list.MostarListaMateriales();
                    
                    break;
                case 4:
                    list.MostarListaMateriales();
                    list.agregarFav(view.PregunFav());
                    
                    break;
                case 5:
                    list.mostrarFav();
                    
                    break;
                case 6:
                    System.exit(0);
                    
                    break;
                default:
                    System.out.println("Valor ingresado fuera de parametros");
            }
            
        }
        
        
        
    }    
}
