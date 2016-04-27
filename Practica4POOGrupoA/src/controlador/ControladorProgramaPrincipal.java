/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.*;
import vista.ProgramaPrincipal;
import vista.*;

/**
 *
 * @author tavoberry
 */
public class ControladorProgramaPrincipal implements ActionListener{
    ProgramaPrincipal vista = new ProgramaPrincipal();
    public static Taxi []miTaxi = new Taxi[10];
    public static Autobus []miAutobus = new Autobus[10];
    public static int index;
    public static int indexAutobus;
    
    public ControladorProgramaPrincipal(ProgramaPrincipal vista, Taxi []miTaxi, Autobus []miAutobus){
        ControladorProgramaPrincipal.miAutobus=miAutobus;
        ControladorProgramaPrincipal.miTaxi=miTaxi;
        this.vista=vista;
        index=0;
        indexAutobus=0;
        
        vista.mnuVehiculoRegistrar.addActionListener(this);
        vista.mnuVehiculoSalir.addActionListener(this);
        vista.mnuTaxiVer.addActionListener(this);
        
        //Creamos los objetos de los arreglos miTaxi y miAutobus
        for(int i=0; i<10;i++){
            miTaxi[i]=new Taxi();
            miAutobus[i]=new Autobus();
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()== vista.mnuVehiculoRegistrar){
            Registrar vistaRegistro = new Registrar();
            ControladorRegistrar cr = new ControladorRegistrar(vistaRegistro,miTaxi[index],miAutobus[index]);
            vista.escritorio.add(vistaRegistro);
            vistaRegistro.setVisible(true);
            vistaRegistro.show();
        }
        if (e.getSource()== vista.mnuVehiculoSalir){
           System.exit(0);           
        }
        if (e.getSource()==vista.mnuTaxiVer){
            VerTaxi vistaVerTaxi = new VerTaxi();
            ControladorVerTaxi cVerTaxi = new ControladorVerTaxi(vistaVerTaxi, miTaxi[0]);
            vista.escritorio.add(vistaVerTaxi);
            vistaVerTaxi.setVisible(true);
            vistaVerTaxi.show();
        }
    }
}
