/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Turno {
    private Object Nombre, turno;
    private Turno siguiente;

    public Turno(Object Nombre, Object turno) {
        this.Nombre = Nombre;
        this.turno = turno;
        this.siguiente = null;
    }

    public Object getNombre() {
        return Nombre;
    }

    public void setNombre(Object Nombre) {
        this.Nombre = Nombre;
    }

    public Object getTurno() {
        return turno;
    }

    public void setTurno(Object turno) {
        this.turno = turno;
    }

    public Turno getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Turno siguiente) {
        this.siguiente = siguiente;
    }
    
}
