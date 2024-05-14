/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.PilaParentesis;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class Controlador {
    Vista view = new Vista();
    PilaParentesis pila = new PilaParentesis();
    
    public Controlador(Vista view){
        this.view = view;
    }
    public void inicio(){
        
        pila.estaBalanceado(view.ingresarExpresion());
        
        if(pila.estaVacia() == true){
            System.out.println("la expresion esta balanceada");
        }else{
             System.out.println("La expresion no esta balanceada");
        }

    }
    
}
