/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.ListaMateriales;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class Controlador {
    
    Vista view = new Vista();
    ListaMateriales list = new ListaMateriales();
    ArrayList<Object> registro = new ArrayList<>();
    Object nombre = "";
    boolean confir = true;
    
    public Controlador(Vista view){
        this.view = view;
    }
    public void Inicio(){
        
        System.out.println("*********************************************");
        System.out.print("Gestion de lista de materiales de laboratotion\n");
        System.out.println("*********************************************");
        
        
        
        
        while (confir != false) {
            
            switch(view.Menu()) {
                case 1:
                    list.AgregarMatLista(view.material(), view.tipoMaterial());
                     nombre = view.NombreUsuario();
                    registro.add("Nombre: "+nombre + " Accion: Agregar");
                   
                    break;
                case 2:
                    list.EliminarUltimo();
                    nombre = view.NombreUsuario();
                    registro.add("Nombre: "+nombre + " Accion: Eliminar");
                    
                    break;
                case 3:
                    System.out.println("----------------------------");
                    list.MostarListaMateriales();
                    
                    break;
                case 4:
                    System.out.println("----------------------------");
                    System.out.println(registro.getLast());
                    System.out.println("----------------------------");
                    break;
                default:
                    System.out.println("Valor ingresado fuera de parametros");
            }
            
        }
        
            
        
    }
}
