/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Contacto {
    Object nombre, numeroTelefonico, correo,index;
    Contacto siguiente;

    public Contacto(Object nombre, Object numeroTelefonico, Object correo, Object index) {
        this.nombre = nombre;
        this.numeroTelefonico = numeroTelefonico;
        this.correo = correo;
        this.index = index;
        this.siguiente = null;
    }

    public Object getNombre() {
        return nombre;
    }

    public void setNombre(Object nombre) {
        this.nombre = nombre;
    }

    public Object getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(Object numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public Object getCorreo() {
        return correo;
    }

    public void setCorreo(Object correo) {
        this.correo = correo;
    }

    public Object getIndex() {
        return index;
    }

    public void setIndex(Object index) {
        this.index = index;
    }

    public Contacto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Contacto siguiente) {
        this.siguiente = siguiente;
    }
    public String toString(){
        return this.index +".\nNombre contacto: "+this.nombre +"\nNumero: "+ this.numeroTelefonico+"\nCorreo: "+this.correo;
    }
    
    
    
    
    
    
}
