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
import vista.VerTaxi;

/**
 *
 * @author tavoberry
 */
public class ControladorVerTaxi implements ActionListener{
    VerTaxi vista;
    Taxi taxi;
    int indiceMaximo;
    int indice;
    
    
    
    public ControladorVerTaxi(VerTaxi vista, Taxi taxi){
        this.taxi = taxi;    
        this.vista = vista;
        indiceMaximo = ControladorProgramaPrincipal.index;
        indice = 0;
        
        vista.btnAnterior.addActionListener(this);
        vista.btnSiguiente.addActionListener(this);
        vista.txtDatos.setText(taxi.mostrarDatos());
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==vista.btnSiguiente){
            if (indice < indiceMaximo-1){ 
                indice++;
                taxi = ControladorProgramaPrincipal.miTaxi[indice];
                vista.txtDatos.setText(taxi.mostrarDatos());
            }
            else{
                JOptionPane.showMessageDialog(vista, "Ya no existen taxis registrados", "Aviso",JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource()==vista.btnAnterior){
            if (indice > 0){
                indice--;
                taxi = ControladorProgramaPrincipal.miTaxi[indice];
                vista.txtDatos.setText(taxi.mostrarDatos());
            }
            else{
                JOptionPane.showMessageDialog(vista, "Ya no existen taxis registrados", "Aviso",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
}
