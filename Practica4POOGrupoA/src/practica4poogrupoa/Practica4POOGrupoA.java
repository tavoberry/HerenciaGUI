/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4poogrupoa;

import controlador.ControladorProgramaPrincipal;
import modelo.Autobus;
import modelo.Taxi;
import vista.ProgramaPrincipal;

/**
 *
 * @author tavoberry
 */
public class Practica4POOGrupoA {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Taxi []t = new Taxi[10];
        Autobus []a = new Autobus[10];
        ProgramaPrincipal v = new ProgramaPrincipal();
        ControladorProgramaPrincipal c = new ControladorProgramaPrincipal(v,t,a);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }
    
}
