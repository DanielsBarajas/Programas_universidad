/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.HistorialNavegacion;
import vista.Vista;


/**
 *
 * @author Usuario
 */
public class Controlador implements ActionListener{
    private Vista view ;
    
    private HistorialNavegacion historial = new HistorialNavegacion();
    
    public Controlador(Vista view){
        this.view = view; 
        this.view.JB_Adelante.addActionListener(this);
        this.view.JB_atras.addActionListener(this);
        this.view.JB_Agregar.addActionListener(this);
    }
    public void iniciar(){
        view.setTitle("Historial de navegacion");
        view.setLocationRelativeTo(null);
        historial.pushPilaAdelante("facebook");
        view.JBL_Pagina.setText(historial.mostrarActual());
        
//        pila.visitarPagina("Facebook");
//        view.JBL_Pagina.setText(pila.MostarPagina());
        
        
        
    }
    public void ActivacionBotones(){
        if(historial.AtrasVacia()){
            view.JB_atras.setEnabled(false);
        }else{
            view.JB_atras.setEnabled(true);
        }
        if(historial.AdelanteNulo()){
            view.JB_Adelante.setEnabled(false);
        }else{
            view.JB_Adelante.setEnabled(true);
        }
            
    }

    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == view.JB_Agregar) {
            historial.VisitarPagWeb(view.JTF_Texto.getText());
            view.JBL_Pagina.setText(historial.mostrarActual()); 
            ActivacionBotones();
            
        }
        if (e.getSource() == view.JB_Adelante) {
            historial.Avanzar();
            view.JBL_Pagina.setText(historial.mostrarActual()); 
            ActivacionBotones();
        }
        if (e.getSource() == view.JB_atras) {
            historial.retroceder();
            view.JBL_Pagina.setText(historial.mostrarActual()); 
            ActivacionBotones();
        }
        
        
        
//        if (e.getSource() == view.JB_Agregar) {
//            
//            pila.visitarPagina(view.JTF_Texto.getText());
//            
//            view.JB_Adelante.setEnabled(true);
//            
//            view.JBL_Pagina.setText(pila.MostarPagina());
//            
//        }
//        if(e.getSource() == view.JB_Adelante){
//            pila.Avanzar();
//            view.JBL_Pagina.setText(pila.MostarPagina());
//            if(pila.adelante()){
//                view.JB_Adelante.setEnabled(false);
//            }
////            if(pila.atras() == false){
////                view.JB_atras.setEnabled(true);
////            }
//        }
//        if(e.getSource() == view.JB_atras){
//            pila.Retroceder();
//            view.JBL_Pagina.setText(pila.MostarPagina());
//            if(pila.atras()){
//                view.JB_atras.setEnabled(false);
//            }
//            else if(pila.adelante() != true){
//                view.JB_Adelante.setEnabled(true);
//            }
        
    }
    
        
}
