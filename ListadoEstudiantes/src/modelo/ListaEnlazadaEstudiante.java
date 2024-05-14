/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class ListaEnlazadaEstudiante {
    Estudiante cabeza;
    Estudiante cola;

    public ListaEnlazadaEstudiante() {
        this.cabeza = null;
        this.cola = null;
    }
    public boolean estaVacia(){
        return cabeza == null;
    }
    public void agregarInicio(Object nombre, Object edad){
        Estudiante nuevoNodo = new Estudiante(nombre, edad);
        
        if(estaVacia()){
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        }else{

            nuevoNodo.setSiguiente(cabeza);
            nuevoNodo.setAnterior(null);
            cabeza = nuevoNodo;

        }
 
    }
    public void agregarFinal(Object nombre, Object edad){
        Estudiante nuevoNodo = new Estudiante(nombre, edad);
        
        if(estaVacia()){
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        }else{

            cola.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(cola);
            cola = nuevoNodo;

        }
    }
    public void EliminarInicio(){
        if(estaVacia()){
            System.out.println("No hay estudiantes en la lista");
        }else{
            cabeza = cabeza.getSiguiente();
            cabeza.setAnterior(null);
        }
        
    }
    public void EliminarFinal(){
        if(estaVacia()){
            System.out.println("No hay estudiantes en la lista");
        }else{
            cola = cola.getAnterior();
            cola.setSiguiente(null);
            
                    
        }
        
    }
    public void ImprimirLista(){
        Estudiante tempo = cabeza;
        
        if(tempo == null){
            System.out.println("No hay estudiantes en la lista");
            System.out.println("------------------------------");
        }else{
            while(tempo != null){

                System.out.println(tempo.getNombre()+"  "+tempo.getEdad());


                tempo = tempo.getSiguiente();
            }
        }
        
        
        
    }
    
    
    
    
}
