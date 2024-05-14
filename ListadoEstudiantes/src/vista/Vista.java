/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Estudiante;

/**
 *
 * @author Usuario
 */
public class Vista {
    Scanner leer = new Scanner(System.in);
          
    public int MenuInicio(){
        int op = 0;
        System.out.println("Bienvenido");
        System.out.println("Elija la op que desea realizar");
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Eiminar estudiante");
        System.out.println("3. Ver estudiantes");
        System.out.println("4. Salir");
        op = leer.nextInt();
        return op;
    }
    public int menuAgregar(){
        int op = 0;
        
        System.out.println("Desea agregar el Estudiante");
        System.out.println("1. Al inicio");
        System.out.println("2. Al final");
        op = leer.nextInt();
        return op;
    }
    public int menuEliminar(){
        int op = 0;
        
        System.out.println("Desea eliminar el Estudiante");
        System.out.println("1. Al inicio");
        System.out.println("2. Al final");
        op = leer.nextInt();
        
        return op;
        
    }
    
    public Object preguNombre(){
        Object nombre= "";
        
        System.out.println("Ingrese el nombre del estudiante");
        nombre = leer.next();
        
        
        return nombre;
    }
    public Object preguEdad(){
        Object edad= 0;
        
        System.out.println("Ingrese la edad del estudiante");
        edad = leer.nextInt();
        leer.nextLine();
        
        return edad;
    }
    public Object preguFecha(){
        Object edad= 0;
        
        System.out.println("Ingrese la edad del estudiante");
        edad = leer.nextInt();
        leer.nextLine();
        
        return edad;
    }
    
    
    
    
    
    
}
