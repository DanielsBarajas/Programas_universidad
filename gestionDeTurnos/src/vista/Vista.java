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
 
        System.out.println("Elija la op que desea realizar");
        System.out.println("1. Nuevo turno");
        System.out.println("2. Cambiar turno en pantalla");
        System.out.println("3. reiniciar turnos");
        op = leer.nextInt();
        
        return op;
    }
    public Object ingresarUsuario(){
        Object nombre;
        
        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        leer.nextLine();

        return nombre;
    }
    public Object ingresCedula(){
        Object cedula;
        
        System.out.println("Ingrese su cedula");
        cedula = leer.next();
        leer.nextLine();

        return cedula;
    }
    public Object Accion(){
        int op = 0;
        Object accion = "";
        
        System.out.println("Elija que tipo de accion desea realizar ");
        System.out.println("1. Asesoria ");
        System.out.println("2. Retirar/depositar");
        System.out.println("3. Queja,reclamo o sugerencia");
        op = leer.nextInt();
        
        switch (op) {
            case 1:
                accion ="Asesoria";
                break;
            case 2:
                accion ="Retirar/depositar";
                break;
            case 3:
                accion ="Queja,reclamo o sugerencia";
                break;
        }

        return accion;
    }
    
}
