/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.pkg7.abril;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class Grafo {
    private Map<Nodo, List<Arista>> mapaAdyacencia;

    public Grafo() {
        mapaAdyacencia = new HashMap<>();
    }

    // Método para agregar una arista al grafo
    public void agregarArista(Arista arista) {
        mapaAdyacencia.computeIfAbsent(arista.getOrigen(), k -> new ArrayList<>()).add(arista);
        // Si el grafo es no dirigido, también agregaríamos la arista en la dirección opuesta.
    }

    public Map<Nodo, List<Arista>> getMapaAdyacencia() {
        return mapaAdyacencia;
    }
}
