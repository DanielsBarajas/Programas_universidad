/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class PaginaWeb {
    String titulo;
    PaginaWeb siguiente, anterior;

    public PaginaWeb(String titulo) {
        this.titulo = titulo;
        this.siguiente = null;
        this.anterior = null;
    }
    
    
    
}
