/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class NodoPasajero {
    public NodoPasajero siguiente,anterior;
    public String nombre, destino;
    public int valorTicket = 0,cedula, numPasajero;

    public NodoPasajero(int numPasajero,int cedula,String nombre,String destino, int valorTicket) {
        this.siguiente = null;
        this.anterior = null;
        this.numPasajero = numPasajero;
        this.nombre = nombre;
        this.cedula = cedula;
        this.destino = destino;
        this.valorTicket = valorTicket;
    }
    

    @Override
    public String toString() {
        return this.numPasajero+"."+"\nNombre: "+ this.nombre + "\nCedula: "+ 
                this.cedula+"\nDestino: "+this.destino + "\nValor ticket: " +"$ "+ this.valorTicket+" pesos";
    }
    
    
    
}
