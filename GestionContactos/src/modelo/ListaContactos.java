/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ListaContactos {
    Contacto cabeza, cola;
    ArrayList<Object> favoritos = new ArrayList<>();
    int i = 0;
    public ListaContactos(){
        
        cabeza = null;
        cola = null;
 
    }
    public boolean estaVacia(){
        return (cabeza == null) &&(cola == null);
    }
    
    
    public void AgregarContLista(Object nombre, Object numero, Object correo){
        i++;
        Contacto nuevoNodo = new Contacto(nombre, numero, correo, i);
        
        if(estaVacia()){
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        }else{
            cola.setSiguiente(nuevoNodo);
            cola = nuevoNodo;
            cola.setSiguiente(null);
            
        }
   
    }
    public void EliminarContacto(Object index){
        Contacto tempo = cabeza;
        Contacto anterior = null;
        
        if(estaVacia()){
            System.out.println("No hay elementos que eliminar de la lista");
        }else{
            
            if(cabeza.getIndex().equals(index)){
                cabeza = cabeza.getSiguiente();
            }
            while(tempo != null){
                
                if(tempo.getIndex().equals(index)){
                    anterior.setSiguiente(tempo.getSiguiente());
                }
                
                anterior = tempo;
                tempo = tempo.getSiguiente();
            }
            reorganizarIndices();
            i--;
        }
 
    }
    public void reorganizarIndices(){
        Contacto tempo = cabeza;
        int index = 0;
        
        while(tempo != null){
            index++;
            tempo.setIndex(index);
            
            tempo = tempo.getSiguiente();
        }
            
            
            
        }
    public void MostarListacontactos(){
        Contacto temporal = cabeza;
        
        if(estaVacia()){
            System.out.println("No hay elementos en la lista");
        }else{
            while (temporal != null) {
                
                System.out.println(temporal.index +".\nNombre contacto: "+temporal.nombre +"\nNumero: "+ temporal.numeroTelefonico+"\nCorreo: "+temporal.correo);
                System.out.println("-----------------------------------------------------");
                temporal = temporal.getSiguiente();
                
            }
        }
    }
    public void agregarFav(Object favorito){
        Contacto temporal = cabeza;
        
        while (temporal != null) {
            
            if(temporal.getIndex().equals(favorito)){
                    favoritos.add(temporal);
            }
            
            
            temporal = temporal.getSiguiente();
                
            }

    }
    public void mostrarFav(){
        
        for (int j = 0; j < favoritos.size(); j++) {
            System.out.println(favoritos.get(j).toString());
        }
   
    }
    
}
