/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class SillaEnlazadas {
    Silla cabeza;
    Silla cola;
    Silla tempo;
    int sillas = 0;
    int participantes;
    
    
    public SillaEnlazadas(){
        cabeza = null;
        cola = null;
    }
    public void agregarSilla(Object Ocupada){

        sillas++;
        
        Silla nuevoNodo = new Silla(Ocupada, sillas);

        if(cabeza == null){
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            
        }else{

            cola.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(cola);
            cola = nuevoNodo;
            cola.setSiguiente(cabeza);
            
        }
        
        
        
    }
    public void cantidadSillas(int canSillas){
        
        for (int i = 0; i <= canSillas; i++) {
            agregarSilla(false);
            
        }
        
    }
    public void mostrarSillas(){
        
        Silla tempo =  cabeza;
       
        
        while(tempo != cola){
            System.out.println(tempo.getOcupada());
            
            tempo = tempo.getSiguiente();
        }
        
    }
    public void cantSillasYParticipates(){
        participantes = sillas;
        System.out.println("------------------------------------------");
        System.out.println("La cantidad de sillas que hay son:"+ (sillas-1));
        System.out.println("La cantidad de participantes que hay son:"+ participantes);
    }
    
    public void eliminarEvento(Object numAleatorioSilla){
        Silla temporal = cabeza;
        sillas--;
        if(cabeza == null){
            System.out.println("No hay eventos para eliminar");
        }else{
            
            
            while(temporal != cola) {
                
                if(temporal.getIndex().equals(numAleatorioSilla)){
                    if(temporal == cabeza){
                        cabeza = temporal.getSiguiente();
                        cola.setSiguiente(cabeza);
                    }
                    if(temporal == cola){
                        cola = temporal.getAnterior();
                        cabeza.setAnterior(cola);
                    }
                    if(temporal.getAnterior() != null){
                        temporal.getAnterior().setSiguiente(temporal.getSiguiente());
                    }
                    if(temporal.getSiguiente() != null){
                        temporal.getSiguiente().setAnterior(temporal.getAnterior());
                    }

                }
                
                temporal = temporal.getSiguiente();
                
            }
        }
        
        
    }
    public Object numAleatorio(){
        Object num = (int)(( Math.random()*sillas) + 1) ;
                
        return num; 
    }
    public void sillasOcupadas(){
        Silla tempo =  cabeza;
       
        
        while(tempo != cola){
            tempo.setOcupada(true);
            
            tempo = tempo.getSiguiente();
        }
    }
    
    
}
