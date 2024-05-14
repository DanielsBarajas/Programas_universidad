/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Silla {
    
    private Object ocupada, index;
    private Silla siguiente, anterior;

    

    public Silla(Object ocupada, Object index) {
        this.ocupada = ocupada;
        this.index = index;
        this.siguiente = null;
        this.anterior = null;
    }
    public Object getIndex() {
        return index;
    }

    public void setIndex(Object index) {
        this.index = index;
    }
    public Object getOcupada() {
        return ocupada;
    }

    public void setOcupada(Object ocupada) {
        this.ocupada = ocupada;
    }

    public Silla getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Silla siguiente) {
        this.siguiente = siguiente;
    }
    public Silla getAnterior() {
        return anterior;
    }

    public void setAnterior(Silla anterior) {
        this.anterior = anterior;
    }
          
}
