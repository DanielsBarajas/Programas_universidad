/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;



/**
 *
 * @author Usuario
 */
public class ListaMateriales {
    
    Material cabeza,cola;
    int numMaterial = 0;
    
    
    
    public ListaMateriales() {
        cabeza = null;
        cola = null;
    }
    
    public boolean estaVacia(){
        return (cabeza == null)&&(cola == null);
    }
    
    public void AgregarMatLista(Object Material, Object tipoMaterial){
        numMaterial++;
        Material nuevoNodo = new Material(Material, tipoMaterial, numMaterial);

        
        if (estaVacia()){
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        }else{
            cola.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(cola);
            cola = nuevoNodo;

        }
    }
    public void EliminarUltimo(){
        if (estaVacia()){
            System.out.println("No hay elementos que eliminar de la lista");
        }else{
            cola = cola.getAnterior();
            cola.setSiguiente(null);
            numMaterial--;
        }
    }
    public void MostarListaMateriales(){
        
        Material tempo = cabeza;
        
        if (estaVacia()){
            System.out.println("No hay elementos que eliminar de la lista");
        }else{
            while(tempo != null) {
        
            System.out.println("Numero de material: "+tempo.getNumMaterial()+"\nMaterial: "+tempo.getMaterial()+"\nTipoMaterial: "+tempo.getTipoMaterial());
            System.out.println("----------------------------");
            tempo = tempo.getSiguiente();
            
        }
        }
        
        
    }
    
}
