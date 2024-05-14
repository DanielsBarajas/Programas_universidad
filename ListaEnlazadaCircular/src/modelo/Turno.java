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
    Object numeroTurno,nombre, cedula, tipoDeAsesoria;
    Turno siguiente;
    
    public Turno(Object numeroTurno, Object nombre, Object cedula,Object tipoDeAsesoria){
        this.numeroTurno = numeroTurno;
        this.nombre = nombre;
        this.cedula = cedula;
        this.tipoDeAsesoria = tipoDeAsesoria;
        this.siguiente = null;
    }
    
    public Object getNumeroTurno() {
        return numeroTurno;
    }

    public void setNumeroTurno(Object numeroTurno) {
        this.numeroTurno = numeroTurno;
    }

    public Object getNombre() {
        return nombre;
    }

    public void setNombre(Object nombre) {
        this.nombre = nombre;
    }

    public Object getCedula() {
        return cedula;
    }

    public void setCedula(Object cedula) {
        this.cedula = cedula;
    }

    public Object getTipoDeAsesoria() {
        return tipoDeAsesoria;
    }

    public void setTipoDeAsesoria(Object tipoDeAsesoria) {
        this.tipoDeAsesoria = tipoDeAsesoria;
    }

    public Turno getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Turno siguiente) {
        this.siguiente = siguiente;
    }
}
