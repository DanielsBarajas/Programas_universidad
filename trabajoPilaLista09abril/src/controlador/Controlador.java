/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.ListaEnlazada;
import modelo.pila;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class Controlador implements ActionListener{
    private Vista view ;
    private pila pila = new pila();
    private ListaEnlazada list = new ListaEnlazada();
    
    public Controlador(Vista view){
        this.view = view; 
        this.view.JB_Agregar.addActionListener(this);
        this.view.JB_botonLiberar.addActionListener(this);
        
    }
    public void iniciar(){
      view.setTitle("PilaListas");
        view.setLocationRelativeTo(null);
        
    }
    public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == view.JB_Agregar) {
            list.agregarHisto(view.JTF_Nombre.getText(), view.JTF_tamaño.getText());
            pila.AgregarVariable(view.JTF_Nombre.getText(), view.JTF_tamaño.getText());
            
            view.jTextArea1.setText(list.MostarUltimo()+"\n");
            
//            view.jTextArea1.setText(list.MostarListaMateriales());
            
            
            
        }
        if (e.getSource() == view.JB_botonLiberar) {
            JOptionPane.showMessageDialog(view, "liberando memoria");
            pila.eliminarVariable();
        }
    }
    
}
    
