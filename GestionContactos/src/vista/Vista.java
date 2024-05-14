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
    
    public int Menu(){
        int op = 0;
        
        System.out.println("Elija una opcion:");
        System.out.println("1. Agregar Contacto");
        System.out.println("2. Eliminar Contacto");
        System.out.println("3. Mostar Contactos");
        System.out.println("4. Agregar a favotitos");
        System.out.println("5. Mostar favotitos");
        System.out.println("6. Salir");
        op = leer.nextInt();
        leer.nextLine();

        return op;
    }
    public Object nombreContacto(){
        Object nombre = "";
        
        System.out.println("Ingrese el nombre del contacto nuevo");
        nombre = leer.nextLine();

        return nombre;
    }
    public Object numeroContacto(){
        Object numero = 0;
        
        System.out.println("Ingrese el numero del contacto nuevo");
        numero = leer.nextLine();

        return numero;
    }
    public Object correoContacto(){
        Object correo = "";
        
        System.out.println("Ingrese el correo del contacto nuevo");
        correo = leer.nextLine();

        return correo;
    }
    public int verificacion(){
        int index = 0;
        
        System.out.println("Elija el contacto que desea eliminar");
        index = leer.nextInt();
        
        return index;
    }
    public Object PregunFav(){
        int op ;
        System.out.println("Elija que contacto desea agregar a favoritos");
        op = leer.nextInt();
        
        return op;
    }
    
    
    
    
}
