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
public abstract class Vehiculo {
    private String marca;
    private String numMotor;
    private int modelo;
    private int numCilindros;
    private String tipoGasolina;
    
    public Vehiculo(){
        marca = "";
        numMotor = "";
        modelo = 1990;
        numCilindros = 4;
        tipoGasolina = "Magna";
    }
    
    /**
     * Muestra los datos generales del vehículo
     * (marca, modelo y número de motor)
     * @return Regresa una cadena con los datos del vehículo
     */
    public abstract String mostrarDatos();

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the numMotor
     */
    public String getNumMotor() {
        return numMotor;
    }

    /**
     * @param numMotor the numMotor to set
     */
    public void setNumMotor(String numMotor) {
        this.numMotor = numMotor;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the numCilindros
     */
    public int getNumCilindros() {
        return numCilindros;
    }

    /**
     * @param numCilindros the numCilindros to set
     */
    public void setNumCilindros(int numCilindros) {
        this.numCilindros = numCilindros;
    }

    /**
     * @return the tipoGasolina
     */
    public String getTipoGasolina() {
        return tipoGasolina;
    }

    /**
     * @param tipoGasolina the tipoGasolina to set
     */
    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }
}
