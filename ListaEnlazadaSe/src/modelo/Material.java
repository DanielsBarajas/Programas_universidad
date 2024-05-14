/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Material {
    public Object Material, tipoMaterial, numMaterial ;
    Material siguiente, anterior;

    public Material(Object Material, Object tipoMaterial, Object numMaterial) {
        this.Material = Material;
        this.tipoMaterial = tipoMaterial;
        this.numMaterial = numMaterial;
        this.siguiente = null;
        this.anterior = null;
    }

    public Material getAnterior() {
        return anterior;
    }

    public void setAnterior(Material anterior) {
        this.anterior = anterior;
    }

    public Object getMaterial() {
        return Material;
    }

    public void setMaterial(Object Material) {
        this.Material = Material;
    }

    public Object getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(Object tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public Object getNumMaterial() {
        return numMaterial;
    }

    public void setNumMaterial(Object numMaterial) {
        this.numMaterial = numMaterial;
    }

    public Material getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Material siguiente) {
        this.siguiente = siguiente;
    }
    
}
