/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class variable {
    Object nombre, tamaño;
    variable anterior,siguiente;

    public variable(Object nombre, Object tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.siguiente = null;
        this.anterior = null;
    }

    public Object getNombre() {
        return nombre;
    }

    public void setNombre(Object nombre) {
        this.nombre = nombre;
    }

    public Object getTamaño() {
        return tamaño;
    }

    public void setTamaño(Object tamaño) {
        this.tamaño = tamaño;
    }

    public variable getAnterior() {
        return anterior;
    }

    public void setAnterior(variable anterior) {
        this.anterior = anterior;
    }

    public variable getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(variable siguiente) {
        this.siguiente = siguiente;
    }
    public String toString() {
        return "Nombre: "+ getNombre()+ "tamaño: "+getTamaño()+"\n";
    }
}
    

