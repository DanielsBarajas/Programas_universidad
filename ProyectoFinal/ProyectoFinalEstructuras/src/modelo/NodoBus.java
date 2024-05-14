/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class NodoBus {

    public NodoBus siguiente,anterior;
    public int id, cantidadAsientos;
    public String origen, destino;
    

    public NodoBus(int id, int cantidadAsientos,String origen, String destino ) {
        this.siguiente = null;
        this.anterior = null;
        this.id = id;
        this.cantidadAsientos = cantidadAsientos;
        this.origen = origen;
        this.destino = destino;
        
    }
    
    
    
}
