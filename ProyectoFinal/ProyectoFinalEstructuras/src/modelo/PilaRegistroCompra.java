/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.SpringLayout;

/**
 *
 * @author Usuario
 */
public class PilaRegistroCompra {
    public NodoPasajero topAdelante;
    public NodoPasajero topAtras;
    public int valorDestino = 0;
    public String destino;
    
    public PilaRegistroCompra() {
        this.topAdelante = null;
        this.topAtras = null;
    }

     public void AgregarCompra(int numPasajero,int cedula,String nombre,String destino){
         
        asignacionPrecioTicket(destino);
         
        NodoPasajero nuevoNodo = new NodoPasajero(numPasajero,cedula, nombre,destino, this.valorDestino);
        
            
            VaciarPilaAdelante();
            pushPilaAdelante(nuevoNodo);
        
    }
    public void pushPilaAdelante(NodoPasajero nuevoNodo){
        
            nuevoNodo.siguiente = topAdelante;
            topAdelante = nuevoNodo;
        
        
    }
     public void pushPilaAtras(NodoPasajero nuevoNodo){
        
       
            nuevoNodo.siguiente = topAtras;
            topAtras = nuevoNodo;
        
    
    }
    public NodoPasajero popPilaAdelante(){
        NodoPasajero pasajero;
        
       if(AdelanteVacia()){
            throw new IllegalStateException("La pila está vacía");
        }
            pasajero = topAdelante;
            topAdelante = topAdelante.siguiente;
        
        
        return pasajero;
    }
    public NodoPasajero popPilaAtras(){
        NodoPasajero pasajero;
        
        if(AtrasVacia()){
            throw new IllegalStateException("La pila está vacía");
        }
            
            pasajero = topAtras;
            topAtras = topAtras.siguiente;
            
        
        
        return pasajero;
    }
   
    public void VaciarPilaAdelante(){
        while (!AdelanteVacia()) {
            pushPilaAtras(popPilaAdelante());
        }
  
    }
     public void retroceder(){
        pushPilaAdelante(popPilaAtras());
        
    }
    public void Avanzar(){
        pushPilaAtras(popPilaAdelante());
    }
    public String mostrarActual(){
        return topAdelante.toString();
    }
    public boolean AdelanteVacia(){
        return topAdelante == null;
    }
    public boolean AtrasVacia(){
        return topAtras == null;
    }
    public boolean AdelanteNulo(){
        return topAdelante.siguiente == null;
    }
    public void asignacionPrecioTicket(String destino){
        
        switch (destino) {
            case "VILLA DE LEYVA" -> this.valorDestino = 15000;
            case "CHIQUIQUIRA" -> this.valorDestino = 11000;
            case "SOGAMOSO" -> this.valorDestino = 10000;
            case "PAIPA" -> this.valorDestino = 15000;
            case "DUITAMA" -> this.valorDestino = 20000;
            case "CHIVATA" -> this.valorDestino = 8000;
            case "COMBITA" -> this.valorDestino = 11000;
            case "SAMACA" -> this.valorDestino = 12000;
            case "SACHICA" -> this.valorDestino = 15000;
                
            
        }
        
        
    }
    
}
