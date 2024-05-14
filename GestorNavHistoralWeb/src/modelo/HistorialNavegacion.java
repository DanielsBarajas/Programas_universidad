/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class HistorialNavegacion {
    public PaginaWeb topAdelante;
    public PaginaWeb topAtras;

    public HistorialNavegacion() {
        this.topAdelante = null;
        this.topAtras = null;
    }
    
    public void VisitarPagWeb(String pagina){
        
        pushPilaAtras(topAdelante.titulo);
        VaciarPilaAdelante();
        
        pushPilaAdelante(pagina);
        
         
    }
    public void retroceder(){
        pushPilaAdelante(popPilaAtras());
        
    }
    public void Avanzar(){
        pushPilaAtras(popPilaAdelante());
    }
    public String mostrarActual(){
        String titulo = topAdelante.titulo;
        
        return titulo;
    }
    
    public String popPilaAdelante(){
        String pagina;
        
       if(AdelanteVacia()){
            throw new IllegalStateException("La pila está vacía");
        }
            pagina = topAdelante.titulo;
            topAdelante = topAdelante.siguiente;
        
        
        return pagina;
    }
    public String popPilaAtras(){
        
        
        if(AtrasVacia()){
            throw new IllegalStateException("La pila está vacía");
        }
            String pagina;
            pagina = topAtras.titulo;
            topAtras = topAtras.siguiente;
            
        
        
        return pagina;
    }
    
    public void pushPilaAtras(String titulo){
        
        PaginaWeb nuevoNodo = new PaginaWeb(titulo);
        
        nuevoNodo.siguiente = topAtras;
        topAtras = nuevoNodo;
    
    }
    public void pushPilaAdelante(String titulo){
        
        PaginaWeb nuevoNodo = new PaginaWeb(titulo);
        
        nuevoNodo.siguiente = topAdelante;
        topAdelante = nuevoNodo;
    
    }
    
    public void VaciarPilaAdelante(){
        while (!AdelanteVacia()) {
            popPilaAdelante();
        }
  
    }
    public boolean AdelanteVacia(){
        return topAdelante == null;
    }
    public boolean AtrasVacia(){
        return topAtras == null;
    }
    public boolean AdelanteNulo(){
        return topAdelante.siguiente == null;
    }
    
}
