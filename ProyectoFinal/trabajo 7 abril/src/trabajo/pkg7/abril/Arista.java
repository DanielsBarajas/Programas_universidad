/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.pkg7.abril;

/**
 *
 * @author Usuario
 */
public class Arista {
    private Nodo origen;
    private Nodo destino;
    private double distancia; // en kilómetros
    private double tiempo; // en minutos
    // Otros atributos como recursos, tipo de transporte, etc.

    public Arista(Nodo origen, Nodo destino, double distancia, double tiempo) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.tiempo = tiempo;
    }

    // Getters
    public Nodo getOrigen() {
        return origen;
    }

    public Nodo getDestino() {
        return destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getTiempo() {
        return tiempo;
    }
}



