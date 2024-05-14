/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class ListaEnlazada {
    variable cabeza,cola;
    
    public ListaEnlazada(){
        cabeza = null;
        cola = null;
        
    }
    public boolean estaVacia(){
        return (cabeza == null)&&(cola == null);
    }
    public void agregarHisto(Object nombre, Object tamano){
        
        variable nuevoNodo = new variable(nombre, tamano);
        
         if (estaVacia()){
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        }else{
             
             nuevoNodo.setSiguiente(cabeza);
             cabeza = nuevoNodo;


        }
    }
    public  String MostarUltimo(){
        return cabeza.toString();
    }
//    public String MostarListaMateriales(){
//        
//        variable tempo = cabeza;
//        String nodo;
//        
//        if (estaVacia()){
//            System.out.println("No hay elementos en la lista");
//        }else{
//            while(tempo != null) {
//        
//            nodo = tempo.toString();
//            tempo = tempo.getSiguiente();
//            return nodo;
//        }
//        }
//        
//        return "";
//    }
    
    
}
