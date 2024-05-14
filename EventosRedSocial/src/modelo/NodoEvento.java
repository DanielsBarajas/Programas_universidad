/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class NodoEvento {
    private Object idEvento,tipoEvento,idUsuario,fechaHora, contenidoEvento ;
    private NodoEvento anterior, siguiente;

    public NodoEvento(Object idEvento, Object tipoEvento, Object idUsuario, Object fechaHora, Object contenidoEvento) {
        this.idEvento = idEvento;
        this.tipoEvento = tipoEvento;
        this.idUsuario = idUsuario;
        this.fechaHora = fechaHora;
        this.contenidoEvento = contenidoEvento;
        this.anterior = null;
        this.siguiente = null;
    }

    public Object getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Object idEvento) {
        this.idEvento = idEvento;
    }

    public Object getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(Object tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public Object getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Object idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Object getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Object fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Object getContenidoEvento() {
        return contenidoEvento;
    }

    public void setContenidoEvento(Object contenidoEvento) {
        this.contenidoEvento = contenidoEvento;
    }

    public NodoEvento getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoEvento anterior) {
        this.anterior = anterior;
    }

    public NodoEvento getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEvento siguiente) {
        this.siguiente = siguiente;
    }

    
}
