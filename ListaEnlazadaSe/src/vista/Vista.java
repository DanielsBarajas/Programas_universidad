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
        System.out.println("1. Agregar material");
        System.out.println("2. Eliminar ultimo material");
        System.out.println("3. Mostar materiales");
        System.out.println("4. Registro lista");
        op = leer.nextInt();
        return op;
    }
    public Object material(){
        Object material = 0;
        System.out.println("Ingrese el nombre del material");
        material = leer.next();
        
        return material;
    }
    public String tipoMaterial(){
        int op = 0;
        String tipoMaterial = "";
        System.out.println("Ingrese el tipo de material");
        System.out.println("1. Vidrio");
        System.out.println("2. Metal");
        System.out.println("3. Porcelana");
        System.out.println("4. Material volumetrico");
        op = leer.nextInt();
        
        switch (op) {
            case 1:
                tipoMaterial = "Vidrio";
                break;
            case 2:
                tipoMaterial = "Metal";
                break;
            case 3:
                tipoMaterial = "Porcelana";
                break;
            case 4:
                tipoMaterial = "Material volumetrico";
                break;    
        }

        return tipoMaterial;
    }
    public String NombreUsuario(){
        String Nombre = "";
        System.out.println("Ingrese el nombre de quien modifica: ");
        Nombre = leer.next();
        return Nombre;
    }
    
    
    
}
