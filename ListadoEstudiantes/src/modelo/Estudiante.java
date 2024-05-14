/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    private Object Nombre, edad;
    private Estudiante anterior, siguiente;

    public Estudiante(Object Nombre, Object edad) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.anterior = null;
        this.siguiente = null;
    }

    public Object getNombre() {
        return Nombre;
    }

    public void setNombre(Object Nombre) {
        this.Nombre = Nombre;
    }

    public Object getEdad() {
        return edad;
    }

    public void setEdad(Object edad) {
        this.edad = edad;
    }

    public Estudiante getAnterior() {
        return anterior;
    }

    public void setAnterior(Estudiante anterior) {
        this.anterior = anterior;
    }

    public Estudiante getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Estudiante siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
    
}
