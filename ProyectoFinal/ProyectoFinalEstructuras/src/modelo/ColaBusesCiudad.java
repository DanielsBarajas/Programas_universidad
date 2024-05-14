/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class ColaBusesCiudad {
    
    public NodoBus frente;
    public NodoBus cola;
    public String ciudad;
    public int cantBuses;

    public ColaBusesCiudad(String ciudad) {
        this.frente = null;
        this.cola = null;
        this.ciudad = ciudad;
        this.cantBuses = 0;
    }
    public void agregar(NodoBus bus){
        cantBuses++;
        
        bus.origen = this.ciudad;
        
        if(colaVacia()){
            frente = bus;
            cola = bus;
        }else{
            
            cola.siguiente = bus;
            cola = bus;

        }
    }
    public void agregarConValores(int id, int cantPasajeros){
        
        NodoBus nuevoNodo = new NodoBus(id, cantPasajeros, null,null);
        
        agregar(nuevoNodo);
        
        
    }
    public NodoBus enviarBusYSacarBus(){
        
        if(colaVacia()){
           throw new IllegalStateException("La cola esta vacia ");
        }
        
        NodoBus nodoAenviar = frente;
        frente = frente.siguiente;
        
        cantBuses--;
        
        return nodoAenviar;
    }
    
    public boolean colaVacia(){
        return cola == null;
    }
    
    
    
    
}
