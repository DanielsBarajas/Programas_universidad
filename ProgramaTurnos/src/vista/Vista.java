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
    
    public int mostrarMenu(){
        int op = 0;
        System.out.println("Bienvenido al banco");
        System.out.println("Elija la op que desea realizar");
        System.out.println("1. Agrear part");
        System.out.println("2. Eliminar ultimo turno");
        System.out.println("3. Iniciar juego");
        System.out.println("4. Salir");
        op = leer.nextInt();
        return op;
    }
    public int MenuPregunta(){
        int op = 0;
        System.out.println("Es tu turno");
        System.out.println("Elija la op que desea realizar");
        System.out.println("1. Siguiente turno");
        System.out.println("2. terminar juego");
        op = leer.nextInt();
        return op;
    }
    public Object ingresarUsuario(){
        Object nombre;
        
        System.out.println("Ingrese el nombre del nuevo turno");
        nombre = leer.next();
        leer.nextLine();

        return nombre;
    }
    
    
}
