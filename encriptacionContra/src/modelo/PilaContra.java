/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class PilaContra {
    CaracterNodo top;
    int size;

    public PilaContra() {
        this.top = null;
        this.size = 0;
    }
    public boolean estaVacia(){
        return top == null;
    }
    public void push(char numero){
        CaracterNodo nuevoNodo = new CaracterNodo(numero);
        
        if (top == null){
            top = nuevoNodo;
        }else{
            nuevoNodo.siguiente = top;
            top = nuevoNodo;
        }
        size++;
    }
    public Object pop(){
        
        Object saleTop = top.caracter;
        if (top == null){
            System.out.println("pila vacia");
        }else{

            top = top.siguiente;
            
            size--;
        }
        return saleTop;
    }
    
    
    
}
