/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import vista.Vista;

/**
 *
 * @author Usuario
 */
public class SecuenciaEvento {
    NodoEvento cabeza;
    NodoEvento cola;
    
    
    public SecuenciaEvento() {
        this.cabeza = null;
        this.cola = null;
    }
    public boolean estaVacia(){
        return cabeza == null;
    }
    public void agregarEvento(Object idEvento, Object tipoEvento, Object idUsuario, Object fechaHora,Object contenidoEvento){
        
        NodoEvento nuevoNodo = new NodoEvento(idEvento,tipoEvento, idUsuario,fechaHora,contenidoEvento);

        if(estaVacia()){
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        }else{

            cola.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(cola);
            cola = nuevoNodo;

        }
    }


        
    
    public void eliminarEvento(Object id){
        NodoEvento temporal = cabeza;
        
        if(estaVacia()){
            System.out.println("No hay eventos para eliminar");
        }else{
            
            
            while(temporal != null) {
                
                if(temporal.getIdEvento().equals(id)){
                    if(temporal == cabeza){
                        cabeza = temporal.getSiguiente();
                        
                    }
                    if(temporal == cola){
                        cola = temporal.getAnterior();
                    }
                    if(temporal.getAnterior() != null){
                        temporal.getAnterior().setSiguiente(temporal.getSiguiente());
                    }
                    if(temporal.getSiguiente() != null){
                        temporal.getSiguiente().setAnterior(temporal.getAnterior());
                    }

                }
                
                temporal = temporal.getSiguiente();
                
            }
        }
        
        
    }
    public void buscarEvento(Object op){
        NodoEvento temporal = cabeza;
    
        if(estaVacia()){
            System.out.println("No hay eventos para buscar");
        }else{
            System.out.println("Los nodos que coinciden con la busqueda son:");
            while(temporal != null) {
                
              if(temporal.getTipoEvento().equals(op)||temporal.getIdUsuario().equals(op)){
                  
                  mostarNodo(temporal);
              }
                
                temporal = temporal.getSiguiente();
            }
    }
    }
    public void mostarNodo(NodoEvento temporal){
        
                System.out.println("----------------------------------------------------------------------------------------------------------------");
                System.out.println("id evento: "+temporal.getIdEvento());
                System.out.println("Tipo evento: "+temporal.getTipoEvento());
                System.out.println("Id Usuario: "+temporal.getIdUsuario());
                System.out.println("Fecha de evento"+temporal.getFechaHora());
                System.out.println("Contenido del evento  "+temporal.getContenidoEvento());
    }
    public void listarEvento(){
        NodoEvento temporal = cabeza;
    
        if(estaVacia()){
            System.out.println("No hay eventos para listar");
        }else{
            while(temporal != null) {
                System.out.println("----------------------------------------------------------------------------------------------------------------");
                System.out.println("id evento: "+temporal.getIdEvento());
                System.out.println("Tipo evento: "+temporal.getTipoEvento());
                System.out.println("Id Usuario: "+temporal.getIdUsuario());
                System.out.println("Fecha de evento"+temporal.getFechaHora());
                System.out.println("Contenido del evento  "+temporal.getContenidoEvento());
                
                temporal= temporal.getSiguiente();
            }
    }
    }
}
