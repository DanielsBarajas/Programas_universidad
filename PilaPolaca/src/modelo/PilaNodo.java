/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class PilaNodo {
    Nodo top;
    int size;
    
    public PilaNodo(){
        top = null;
        size = 0;
    }
    
    public boolean estaVacia(){
        return top == null;
    }
    public void push(char numero){
        Nodo nuevoNodo = new Nodo(numero);
        
        if (estaVacia()){
            top = nuevoNodo;
        }else{
            nuevoNodo.siguiente = top;
            top = nuevoNodo;
        }
        size++;
    }
    public char pop(){
        char saleTop = top.numero;
        if (estaVacia()){
            System.out.println("pila vacia");
        }else{

            top = top.siguiente;
            
            size--;
        }
        return saleTop;
    }
    public int op(char op,int a, int b){
        int result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                result = a/b;
                break;

        }
        
        
        return result;
    }
    
    
}
