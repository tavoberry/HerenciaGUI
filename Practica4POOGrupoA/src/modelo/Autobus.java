/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author tavoberry
 */
public class Autobus extends Vehiculo{
    private int numAutobus;
    private int numAsientos;
    
    public Autobus(){
        super();
        numAsientos = 30;
        numAutobus = 1;
    }
    
    /**
     * Muestra los el número de autobús y 
     * total de asientos 
     * @return regresa una cadena
     */
    @Override
    public String mostrarDatos(){
        return "Número de Autobus: "+numAutobus
               + " Total de asientos: "+numAsientos; 
    }

    /**
     * @return the numAutobus
     */
    public int getNumAutobus() {
        return numAutobus;
    }

    /**
     * @param numAutobus the numAutobus to set
     */
    public void setNumAutobus(int numAutobus) {
        this.numAutobus = numAutobus;
    }

    /**
     * @return the numAsientos
     */
    public int getNumAsientos() {
        return numAsientos;
    }

    /**
     * @param numAsientos the numAsientos to set
     */
    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }
}
