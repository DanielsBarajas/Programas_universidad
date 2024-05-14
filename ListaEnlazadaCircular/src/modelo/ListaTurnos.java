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
    public void agregarTurno(Object Nombre,Object numCedula,Object tipoAsesoria){
       i++;
        Turno nuevoNodo = new Turno(i, Nombre, numCedula, tipoAsesoria);

        if(cabeza == null){
            cabeza = nuevoNodo;
            cabeza.setSiguiente(cabeza);
            cola = nuevoNodo;
            
        }else{

            cola.setSiguiente(nuevoNodo);
            cola = nuevoNodo;
            cola.setSiguiente(cabeza);
            
        }
        
    }
     public void iniciarTurnos(){
        tempo = cabeza;
    }
    public void MostrarTurnoPantalla(){
        System.out.println("Pantalla:");
        System.out.println("-----------------------------------------------");
        System.out.println("- Turno Actual: "+ tempo.getNumeroTurno());  
        System.out.println("-----------------------------------------------");
    }
    public void InformacionTurno(){
        System.out.println("Informacion turno");
        System.out.println("Turno: "+ tempo.getNumeroTurno()+" Nombre: "+tempo.getNombre()+" Cedula:" +
                tempo.getCedula()+" Tipo de asesoria: " + tempo.getTipoDeAsesoria());  
    }
    public void sigTurno(){
        tempo = tempo.getSiguiente();
    }
    public void EliminarTurnos(){
        i = 0;
        Turno temp = cabeza;
        while (temp.getSiguiente() != cabeza) {
            Turno siguiente = temp.getSiguiente();
            temp.setSiguiente(null); // Desvincular el nodo
            temp = siguiente;
        }
        cabeza = null;
    }
    public Turno verificar(){

        return cabeza;
    }
    public Turno verificarDos(){

        return cola;
    }
    public void MostrarNodos(){
        Turno temporal = cabeza;
        
        do{
            System.out.println(temporal.getNombre());
            
            temporal = temporal.getSiguiente();    
        }while(temporal != cabeza);
        
       
    }
    
    
    
}
