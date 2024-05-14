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
     public int MenuInicio(){
        int op = 0;
        System.out.println("Bienvenido");
        System.out.println("Elija la op que desea realizar");
        System.out.println("1. Agregar evento");
        System.out.println("2. Eiminar evento");
        System.out.println("3. Buscar evento");
        System.out.println("4. listar evento");
        System.out.println("5. Salir");
        op = leer.nextInt();
        return op;
    }
     public Object preguIdEvent(){
        Object id;
        
        System.out.println("Ingrese el id del evento");
        id = leer.next();
   
        
        return id;
    }
    public Object TipoEven(){
        int op = 0;
        Object tipEvento = "";
        
        System.out.println("Elije el tipo de evento");
        System.out.println("1. publicacion");
        System.out.println("2. comentario");
        System.out.println("3. reaccion");
        op = leer.nextInt();
        leer.nextLine();
        
        switch (op) {
            case 1:
                tipEvento = "publicacion";
                break;
            case 2:
                tipEvento = "comentario";
                break;
            case 3:
                tipEvento = "reaccion";
                break;

        }
        System.out.println(tipEvento);
        
        
        return tipEvento;
    }
    public Object pregunIdUsuario(){
        Object idUsua;
        
        System.out.println("Ingrese su id usuario");
        idUsua = leer.nextInt();
        
        leer.nextLine();
        
        return idUsua;
    }
    public Object preguFecha(){
        Object fecha;
        
        System.out.println("Ingrese la fecha de la modificacion");
        fecha = leer.nextLine();
        
        
        return fecha;
    }
    public Object preguContenido(){
        Object contenido;
        
        System.out.println("Ingrese el contenido del evento");
        contenido = leer.nextLine();
        
        
        return contenido;
    }
    public Object menuBusqueda(){
        int op;
        Object valor;
        
        System.out.println("Escoja una opcion");
        System.out.println("Busqueda por:");
        System.out.println("1. Tipo evento");
        System.out.println("2. Id usuario");
        op = leer.nextInt();
        
        switch (op) {
            case 1:
                valor  = TipoEven();
                break;
            case 2:
                valor  = pregunIdUsuario();
                break;
            default:
                throw new AssertionError();
        }
        
        leer.nextLine();
        return valor;
    }
}
