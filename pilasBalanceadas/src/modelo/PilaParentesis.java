/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class PilaParentesis {
    
    NodoParentesis top;
    int size;

    public PilaParentesis() {   
        top = null;
        size = 0;
    }
    public boolean estaVacia(){
        return top == null;
    }
    public void push(char Dato){
        NodoParentesis nuevoNodo = new NodoParentesis(Dato);
        
        if (estaVacia()){
            top = nuevoNodo;
        }else{
            nuevoNodo.siguiente = top;
            top = nuevoNodo;
        }
        size++;
    }
    public void pop(){
        
        if (estaVacia()){
            System.out.println("pila vacia");
        }else{

            top = top.siguiente;
            
            size--;
        }

    }
    public void estaBalanceado(String expresion){
        
        for (int i = 0; i < expresion.length(); i++) {
            if(expresion.charAt(i) == '('){
                
                push(expresion.charAt(i));
                System.out.println("agrego"); 
               
            }else if(expresion.charAt(i) == ')'){
                pop();
                System.out.println("elimino");
            }
        }
    }
    
    
    
    
    
    
    
}
