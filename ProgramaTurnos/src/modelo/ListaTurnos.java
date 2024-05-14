/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class ListaTurnos {
    Turno cabeza;
    Turno cola;
     Turno tempo;
    int i = 0;
    
    public ListaTurnos(){
        cabeza = null;
        cola = null;
    }
    public void agregarTurno(Object Nombre){
        i++;
        
        Turno nuevoNodo = new Turno(Nombre, i);

        if(cabeza == null){
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            
        }else{

            cola.setSiguiente(nuevoNodo);
            cola = nuevoNodo;
            cola.setSiguiente(cabeza);
            
        }
        System.out.println(nuevoNodo.getTurno());
    }
//    public void eliminarTurno(){
//            Turno temporal = cabeza;
//            
//        
//        if(cabeza == null){
//            System.out.println("No hay turnos para eliminar");
//        }else{
//            
//                
//            while(temporal != cola){
//               
//                if(temporal.getSiguiente().equals(cola)){
//                    cola = temporal;
//                    cola.setSiguiente(cabeza);
//                }
//
//                temporal = temporal.getSiguiente();
//
//            }
//        
//        }
//    }
    
    public void iniciarJuego(){
        tempo = cabeza;
    }
    public void MostrarTurno(){
        
        System.out.println("Turno: "+ tempo.getTurno()+" Nombre: "+tempo.getNombre());
 
    }
    public void sigTurno(){
        tempo = tempo.getSiguiente();
    }
    
    
            
}
