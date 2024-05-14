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
public class ListaContacto {
    Contacto cabeza,cola;
    int i =0;
    ArrayList<Object> favoritos = new ArrayList<>();
    
    public ListaContacto() {
        cabeza = null;
        cola = null;
    }
    
    public boolean estaVacia(){
        return (cabeza == null)&&(cola == null);
    }
    public void AgregarContLista(Object nombre, Object numero, Object correo){
        i++;
        Contacto nuevoNodo = new Contacto(nombre, numero, correo,i);

        if (estaVacia()){
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
        
        if (estaVacia()){
            System.out.println("No hay elementos que eliminar de la lista");
        }else{
            if(cabeza.getIndex().equals(index)){
                    cabeza = cabeza.getSiguiente();
            }
            while (tempo != null) {
               
                if(tempo.getIndex().equals(index)){
                    anterior.setSiguiente(tempo.getSiguiente());
                }
                
                anterior = tempo;
                tempo = tempo.getSiguiente();
                
                
            } 
            reorganizarIndices();
        }
    }
    public void MostarListaMateriales(){
        
        Contacto tempo = cabeza;
        
        if (estaVacia()){
            System.out.println("No hay elementos en la lista");
        }else{
            while(tempo != null) {
        
            System.out.println(tempo.getIndex()+ ".\n Nombre contacto: "+tempo.getNombre()+"\nNumero: "+tempo.getNumeroTelefonico()+"\nCorreo: "+tempo.getCorreo());
            System.out.println("----------------------------");
            tempo = tempo.getSiguiente();
            
        }
        } 
    }
    public void reorganizarIndices(){
        Contacto tempo = cabeza;
        int index = 0;
        while (tempo != null) {
            index++;
            tempo.setIndex(index);
            
            tempo = tempo.getSiguiente();
            
        }
        
    }
    public void agregarFav(Object favorito){
        
        Contacto tempo = cabeza;
        
        while (tempo != null) {
            if(tempo.getIndex().equals(favorito)){
                favoritos.add(tempo);
            }
            
            tempo = tempo.getSiguiente();
            
        }
        
        
    }
    public void mostrarFav(){
        
        
        for (int j = 0; j < favoritos.size(); j++) {
            System.out.println(favoritos.get(j).toString());
            
        }
        
    }
}
