/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ColaBusesCiudad;
import modelo.ListaBuses;
import modelo.PilaRegistroCompra;
import vista.AdministrarBuses;
import vista.ComprarTicket;
import vista.Vista;
import vista.AdministrarTerminales;


/**
 *
 * @author Usuario
 */
public class Controlador implements ActionListener{
    
    private Vista view;
    private ComprarTicket viewComprarTickets;
    private AdministrarTerminales viewAdminTerminales;
    private AdministrarBuses viewAdminBuses;
    
    private PilaRegistroCompra pilaCompra = new PilaRegistroCompra();
    private ColaBusesCiudad colaTunja = new ColaBusesCiudad("TUNJA");
    private ColaBusesCiudad colaPaipa = new ColaBusesCiudad("PAIPA");
    private ColaBusesCiudad colaDuitma = new ColaBusesCiudad("DUITAMA");
    private ColaBusesCiudad colaSogamoso = new ColaBusesCiudad("SOGAMOSO");
    private ListaBuses listaBuses = new ListaBuses();
    private int cont = 1;
    

    public Controlador(Vista view, ComprarTicket viewComprarTickets, AdministrarTerminales viewAdminTerminales, AdministrarBuses viewAdminBuses) {
        this.view = view;
        this.viewComprarTickets = viewComprarTickets;
        this.viewAdminTerminales = viewAdminTerminales;
        this.viewAdminBuses = viewAdminBuses;
        this.view.JB_Administrar.addActionListener(this);
        this.view.JB_Comprar.addActionListener(this);
        this.viewComprarTickets.JB_ComprarTicket.addActionListener(this);
        this.viewComprarTickets.JB_Adelante.addActionListener(this);
        this.viewComprarTickets.JB_Atras.addActionListener(this);
        this.view.JB_Terminales.addActionListener(this);
        this.view.JB_Buses.addActionListener(this);
        this.viewAdminBuses.JB_AgregarBus.addActionListener(this);
        this.view.JB_Tunja.addActionListener(this);
        this.view.JB_Paipa.addActionListener(this);
        this.view.JB_Duitama.addActionListener(this);
        this.view.JB_Sogamoso.addActionListener(this);
        this.viewAdminTerminales.JB_EnviarBus.addActionListener(this);
        
    }
    
    
    public void inicio(){
        activaBotonesCiudades(false);
        activacionBtnTermiBuses(false);
        
        view.setTitle("TRANSVELOCITY");  
        this.view.setLocationRelativeTo(null);
    }
    
    //Metodo para la activacion de botones de ciudades
    public void activaBotonesCiudades(Boolean condicion){
        this.view.JB_Tunja.setVisible(condicion);
        this.view.JB_Paipa.setVisible(condicion);
        this.view.JB_Duitama.setVisible(condicion);
        this.view.JB_Sogamoso.setVisible(condicion);
    }
    //metodo para la activacion de botones de terminal y buses
    public void activacionBtnTermiBuses(boolean condicion){
        view.JB_Terminales.setVisible(condicion);
        view.JB_Buses.setVisible(condicion);
    }
    //metodo para activar botones de nuestro historial de tickets
    public void condicionBtnHistoPasajeros(){
        if(pilaCompra.AtrasVacia()){
            viewComprarTickets.JB_Atras.setEnabled(false);
        }else{
            viewComprarTickets.JB_Atras.setEnabled(true);
        }
        if(pilaCompra.AdelanteNulo()){
            viewComprarTickets.JB_Adelante.setEnabled(false);
        }else{
            viewComprarTickets.JB_Adelante.setEnabled(true);
        }
            
    }
    public void abrirCiudad(){
        view.JDK_escritorioPrincipal.add(viewAdminTerminales);
        viewAdminTerminales.show();
        activaBotonesCiudades(true);
    }
    //Envia el nodo o el bus al nuevo terminal
    public void seleccionOrigenDestino(){
        String ciudadOrigin = viewAdminTerminales.JL_CiudadOrigen.getText();
        String ciudadDestino = viewAdminTerminales.JCB_CiudadDestino.getSelectedItem().toString();
            
            switch (ciudadOrigin) {
                case "TUNJA":
                    switch (ciudadDestino) {
                        case "PAIPA" -> colaPaipa.agregar(colaTunja.enviarBusYSacarBus());
                        case "DUITAMA" -> colaDuitma.agregar(colaTunja.enviarBusYSacarBus());
                        case "SOGAMOSO" -> colaSogamoso.agregar(colaTunja.enviarBusYSacarBus());
                    }

                case "PAIPA":
                    
                   switch (ciudadDestino) {
                        case "TUNJA" -> colaTunja.agregar(colaPaipa.enviarBusYSacarBus());
                        case "DUITAMA" -> colaDuitma.agregar(colaPaipa.enviarBusYSacarBus());
                        case "SOGAMOSO" -> colaSogamoso.agregar(colaPaipa.enviarBusYSacarBus());
                    }

                case "DUITAMA":
                    switch (ciudadDestino) {
                        case "TUNJA" -> colaTunja.agregar(colaDuitma.enviarBusYSacarBus());
                        case "PAIPA" -> colaPaipa.agregar(colaDuitma.enviarBusYSacarBus());
                        case "SOGAMOSO" -> colaSogamoso.agregar(colaDuitma.enviarBusYSacarBus());
                    }

                case "SOGAMOSO":    
                    switch (ciudadDestino) {
                        case "TUNJA" -> colaTunja.agregar(colaSogamoso.enviarBusYSacarBus());
                        case "PAIPA" -> colaPaipa.agregar(colaSogamoso.enviarBusYSacarBus());
                        case "DUITAMA" -> colaDuitma.agregar(colaSogamoso.enviarBusYSacarBus());    
                    }
                    
                    break;

            }
    }
    
    public void actionPerformed (ActionEvent e){
        //Boton principal administar
        if(e.getSource() == view.JB_Administrar){ 
            activacionBtnTermiBuses(true);
            activaBotonesCiudades(false);         
        }
        //boton adminTerminales
        if(e.getSource() == view.JB_Terminales){
            activaBotonesCiudades(true);  
            activacionBtnTermiBuses(false);
        }
        //boton admin buses
        if(e.getSource() == view.JB_Buses){
            activacionBtnTermiBuses(false);
            view.JDK_escritorioPrincipal.add(viewAdminBuses);
            viewAdminBuses.show();
        }
        //Boton Agrega buses a la lista de buses
        if(e.getSource() == viewAdminBuses.JB_AgregarBus){
            listaBuses.agregarBus(Integer.parseInt(viewAdminBuses.JTF_Id.getText()),Integer.parseInt(viewAdminBuses.JTF_NumAsientos.getText()), null);
        }
        //botones de cada uno de los terminales
        if(e.getSource() == view.JB_Tunja){
            abrirCiudad();
            viewAdminTerminales.JL_CiudadOrigen.setText(colaTunja.ciudad);
            viewAdminTerminales.JL_BusesDisponibles.setText(String.valueOf(colaTunja.cantBuses));
            activaBotonesCiudades(false);
        }
        if(e.getSource() == view.JB_Paipa){
            abrirCiudad();
            viewAdminTerminales.JL_CiudadOrigen.setText(colaPaipa.ciudad);
            viewAdminTerminales.JL_BusesDisponibles.setText(String.valueOf(colaTunja.cantBuses));
            activaBotonesCiudades(false);
        }
        if(e.getSource() == view.JB_Duitama){
            abrirCiudad();
            viewAdminTerminales.JL_CiudadOrigen.setText(colaDuitma.ciudad);
            activaBotonesCiudades(false);
        }
        if(e.getSource() == view.JB_Sogamoso){
            abrirCiudad();
            viewAdminTerminales.JL_CiudadOrigen.setText(colaSogamoso.ciudad);
            activaBotonesCiudades(false);
        }
        //boton cambio de terminal
        if(e.getSource() == viewAdminTerminales.JB_EnviarBus){
            seleccionOrigenDestino();
            
        }
        //boton principal para comprar tickets
        if(e.getSource() == view.JB_Comprar){
           
            view.JDK_escritorioPrincipal.add(viewComprarTickets);
            viewComprarTickets.show();
  
        }      
        //Agrega el ticket comprado a la pila
        if(e.getSource() == viewComprarTickets.JB_ComprarTicket){
            
            pilaCompra.AgregarCompra(this.cont,Integer.parseInt(viewComprarTickets.JTF_NumIdentificacion.getText()),viewComprarTickets.JTF_Nombre.getText(),
                    viewComprarTickets.JCB_Destinos.getSelectedItem().toString());
            viewComprarTickets.JTA_Historial.setText(pilaCompra.mostrarActual()); 
            condicionBtnHistoPasajeros();
            this.cont++;
            
        }
        //Botones atras adelante pila historial de compra de tickets
        if (e.getSource() == viewComprarTickets.JB_Adelante) {
            pilaCompra.Avanzar();
            viewComprarTickets.JTA_Historial.setText(pilaCompra.mostrarActual()); 
            condicionBtnHistoPasajeros();
        }
        if (e.getSource() == viewComprarTickets.JB_Atras) {
            pilaCompra.retroceder();
            viewComprarTickets.JTA_Historial.setText(pilaCompra.mostrarActual()); 
            condicionBtnHistoPasajeros();
        }
        
    }
    
    
}
