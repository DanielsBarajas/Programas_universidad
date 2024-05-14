/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Vista {
    Scanner leer = new Scanner(System.in);
    
    public String inicio(){
        String expresion = "";
        
            System.out.println("Ingrese la expresion algebraica");
            expresion = leer.nextLine();
            
        return expresion;
    }
    
    
}
