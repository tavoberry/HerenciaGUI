/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Autobus;
import modelo.Taxi;
import vista.Registrar;

/**
 *
 * @author tavoberry
 */
public class ControladorRegistrar 
             implements ActionListener{
    Registrar vista;
    Taxi taxi;
    Autobus bus;
    
    
    public ControladorRegistrar(Registrar vista, 
            Taxi taxi, Autobus bus ){
        this.taxi = taxi;
        this.bus = bus;
        this.vista = vista;
        
        
        vista.btnGuardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==vista.btnGuardar){
            //Determinar si es un taxi o un autobus
            if (vista.optTaxi.isSelected()){
                //Es un taxi
                taxi.setMarca(vista.txtMarca.getText());
                taxi.setNumMotor(vista.txtNumeroMotor.getText());
                taxi.setNumCilindros(Integer.parseInt(
                        vista.cboCilindros.getSelectedItem().toString()));
                taxi.setModelo(Integer.parseInt(vista.cboModelo.
                        getSelectedItem().toString()));
                if (vista.optMagna.isSelected()){
                    taxi.setTipoGasolina("Magna");
                }
                if (vista.optPremium.isSelected()){
                    taxi.setTipoGasolina("Premium");
                }
                if (vista.optDiesel.isSelected()){
                    taxi.setTipoGasolina("Diesel");
                }
                if (vista.optOtro.isSelected()){
                    taxi.setTipoGasolina("Otro");
                }
                ControladorProgramaPrincipal.miTaxi[ControladorProgramaPrincipal.index]=taxi;
                ControladorProgramaPrincipal.index++;
            }
            else{
                //Es un autobus
                bus.setMarca(vista.txtMarca.getText());
                bus.setNumMotor(vista.txtNumeroMotor.getText());
                bus.setNumCilindros(Integer.parseInt(
                        vista.cboCilindros.getSelectedItem().toString()));
                bus.setModelo(Integer.parseInt(vista.cboModelo.
                        getSelectedItem().toString()));
                if (vista.optMagna.isSelected()){
                    bus.setTipoGasolina("Magna");
                }
                if (vista.optPremium.isSelected()){
                    bus.setTipoGasolina("Premium");
                }
                if (vista.optDiesel.isSelected()){
                    bus.setTipoGasolina("Diesel");
                }
                if (vista.optOtro.isSelected()){
                    bus.setTipoGasolina("Otro");
                }
                ControladorProgramaPrincipal.miAutobus[ControladorProgramaPrincipal.index]=bus;
                ControladorProgramaPrincipal.indexAutobus++;
            }
            JOptionPane.showMessageDialog(vista, "Registro guardado con éxito","Información", JOptionPane.INFORMATION_MESSAGE);
            vista.dispose();
        }
    }
}
