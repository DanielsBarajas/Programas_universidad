/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class ListaBuses {
    public NodoBus cabeza;
    public NodoBus cola;
   
    public ListaBuses() {
        this.cabeza = null;
        this.cola = null;
    }
    
    public boolean listaVacia(){
        return cabeza == null;
    }
    
    public void agregarBus(int id, int numAsientos, String origen){
        
        NodoBus nuevoNodo = new NodoBus(id, numAsientos, origen, null);
        
        if(listaVacia()){
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        }else{
            
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
            
        }
    }
    
    public void ImprimirLista(){
        NodoBus tempo = cabeza;
        
        if(tempo == null){
            System.out.println("No hay estudiantes en la lista");
            System.out.println("------------------------------");
        }else{
            while(tempo != null){

                System.out.println(tempo.id+"\n" + tempo.cantidadAsientos + "\n"+ tempo.origen);


                tempo = tempo.siguiente;
            }
        }
        
        
        
    }
}
