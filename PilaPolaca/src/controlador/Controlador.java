/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.naming.spi.DirStateFactory;
import modelo.PilaNodo;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class Controlador {
    Vista view = new Vista();
    PilaNodo pila = new PilaNodo();
    
    public Controlador(Vista view){
        this.view = view;
    }
    public void inicio(){
        
        
        String expresion = view.inicio();
        char op = ' ';
        int result = 0;
        
        for (int i = 0; i < expresion.length(); i++) {
            
            if(isNumeric(String.valueOf(expresion.charAt(i)))){
                char val = expresion.charAt(i);
                pila.push(val);
            }
            
        switch (expresion.charAt(i)) {
            case '+':
                op = '+';
                break;
            case '-':
                op = '-';
                break;
            case '*':
                op = '*';
                break;
            case '/':
                op = '/';
                break;

        }
        result = pila.op(op, Integer.valueOf(pila.pop()), pila.pop());
        pila.pop();
        }
        System.out.println(pila.pop());
        
        
        

    }
    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str); 
        } catch (NumberFormatException nfe) {
            return false; //Error no es numerico
        }
        return true; //Es numerico
}
}
