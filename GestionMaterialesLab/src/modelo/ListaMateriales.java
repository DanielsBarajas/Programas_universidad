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
    Material cabeza, cola;
    int numMateriales = 0;
    public ListaMateriales(){
        cabeza = null;
        cola = null;
    }
    
    public boolean estaVacia(){
        return (cabeza == null)&&(cola == null);
    }
    
    public void AgregarMatLista(Object Material, Object tipoMaterial){
        numMateriales++;
        Material nuevoNodo = new Material(Material, tipoMaterial, numMateriales);
        
        if(estaVacia()){
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            
        }else{
            cola.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(cola);
            cola = nuevoNodo;
        
        }

    }
    public void MostarMateriales(){
        Material tempo = cabeza;
        
        
        if(estaVacia()){
            System.out.println("No hay elementos que mostrar en la lista");
        }else{
            
            while (tempo != null) {
                
                System.out.println("Numero de material: "+tempo.getNumMaterial()+"\nMaterial: "+tempo.getMaterial()+"\nTipoMaterial: "+tempo.getTipoMaterial());
                System.out.println("---------------------------------");
              tempo = tempo.getSiguiente();
            }

        }
        
    }
    public void EliminarUltimo(){
        
        if(estaVacia()){
             System.out.println("No hay elementos que eliminar de la lista");
             
        }else{
            
            if(cabeza.getSiguiente() == null){
                cabeza = null;
            }else{
                cola = cola.getAnterior();
                cola.setSiguiente(null);
                numMateriales--;
            }
            
            
            
        }

    }
    
}
