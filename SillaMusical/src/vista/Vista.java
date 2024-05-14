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
    
    
    public int CantSillas(){
        int op;
        System.out.println("Bienvenido al juego de la silla");
        System.out.println("Ingrese la cantidad de sillas iniciales");
        op = leer.nextInt();
        return op;
    }
    public int MenuRonda(){
        int op;
        System.out.println("Elija una opcion");
        System.out.println("1. Iniciar musica");
        System.out.println("2. ver sillas");
        System.out.println("3. Salir juego");
        op = leer.nextInt();
        return op;
    }
    
    
    
}
