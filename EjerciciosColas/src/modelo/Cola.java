/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Cola {
    NodoCliente frente, finalCola; 
    int i = 0;

    public Cola(NodoCliente frente, NodoCliente finalCola) {
        this.frente = null;
        this.finalCola = null;
    }
    public boolean estaVacio(){
        return frente == null ;
    }
    
    public void Agregar(String nombre){
        i++;
        NodoCliente nuevoNodo = new NodoCliente(nombre, i);
        
        if(estaVacio()){
            frente = nuevoNodo;
            finalCola = nuevoNodo;
        }else{
            
            finalCola.siguiente = nuevoNodo;
            finalCola = nuevoNodo;
            
        }
        
    }
    public NodoCliente sacar(){
        NodoCliente afuera = frente;
        if(estaVacio()){
            System.out.println("No hay elementos en la cola");
        }else{
            frente = frente.siguiente;
            
        }
        return afuera ;
    }
    
    public void AtenderCliente(){
        if(estaVacio()){
            System.out.println("No hay clientes que atender");
        }else{
            System.out.println("Atendieno al cliente" + sacar().nombreCliente + "Numero de ticket" + sacar().numeroTicket);
            
        }
    }
    
    
    
    
    
    
    
    
    
    
    
}
