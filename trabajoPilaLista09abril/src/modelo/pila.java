/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class pila {
    variable top;
    int size;
    
    public pila(){
        this.top = null;
        this.size = 0;
    }
    public void AgregarVariable(Object nombre, Object tamano){
        variable nuevoNodo = new variable(nombre, tamano);
        
        if (top ==  null){
            top = nuevoNodo;
        }else{
            nuevoNodo.siguiente = top;
            top = nuevoNodo;
            size++;
        }      
    } 
    public void eliminarVariable(){
        if (top ==  null){
            System.out.println("Pila vacia");
        }else{
            top = top.siguiente;

        }
        
        
    }
    
    
    
    
}
