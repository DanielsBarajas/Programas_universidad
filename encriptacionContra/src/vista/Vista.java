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
    
    public String Inicio(){
        
        System.out.println("Encriptador de texto");
        System.out.println("Ingrese la contraseña a encriptar");
        
        return leer.nextLine();
    }
}
