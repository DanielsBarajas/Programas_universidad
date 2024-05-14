/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.util.HashMap;
import java.util.Map;
import modelo.CaracterNodo;
import modelo.PilaContra;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class Controlador {
    Vista view = new Vista();
    PilaContra pila = new PilaContra();
    
    public Controlador(Vista view){
        this.view = view;
    }
    public void inicio(){
        Map<Character, Character> llaveEncriptacion = new HashMap<>();
    
        llaveEncriptacion.put('a','@');
        llaveEncriptacion.put('e','*');
        llaveEncriptacion.put('i','/');
        llaveEncriptacion.put('o','{');
        llaveEncriptacion.put('u','&');
        
        String contra = view.Inicio();
        StringBuilder stringBuilder = new StringBuilder(contra);
        
        for (char c : contra.toCharArray()) {
            char caracter = llaveEncriptacion.getOrDefault(c, c);
            
            pila.push(c);
            
        }
        
        System.out.println("Contraseña Original"+contra );

         
        
    }
        
}
