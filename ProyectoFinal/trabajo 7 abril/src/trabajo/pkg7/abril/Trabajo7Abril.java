/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.pkg7.abril;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Trabajo7Abril {

   public static void main(String[] args) {
        // Crear nodos
        Nodo nodoA = new Nodo("Tunja");
        Nodo nodoB = new Nodo("Paipa");
        Nodo nodoC = new Nodo("Duitama");
        Nodo nodoD = new Nodo("Sogamoso");
        Nodo nodoE = new Nodo("chiquiquira");
        

        // Crear aristas
        Arista aristaAB = new Arista(nodoA, nodoB, 5.0, 10.0);
        Arista aristaAC = new Arista(nodoA, nodoC, 7.0, 15.0);
        Arista aristaAD = new Arista(nodoA, nodoD, 7.0, 15.0);
        

        // Crear el grafo de la red de transporte
        Grafo grafoTransporte = new Grafo();

        // Agregar aristas al grafo
        grafoTransporte.agregarArista(aristaAB);
        grafoTransporte.agregarArista(aristaAC);

        // Ejemplo de consulta de aristas
        List<Arista> aristasDesdeA = grafoTransporte.getMapaAdyacencia().get(nodoA);
        for (Arista arista : aristasDesdeA) {
            System.out.println("Desde " + arista.getOrigen().getNombre() + " hasta " + arista.getDestino().getNombre() +
                    ": Distancia = " + arista.getDistancia() + " km, Tiempo = " + arista.getTiempo() + " minutos");
        }
    }
    
    
}
