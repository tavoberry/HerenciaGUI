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
public class Taxi extends Vehiculo {
    private String numEconomico;
    private String nombreEmpresa;
    
    public Taxi(){
        super();
        numEconomico = "";
        nombreEmpresa = "";
    }
    
    @Override
    /**
     * Muestra los datos del Taxi
     * @return una cadena con los datos del taxi
     */
    public String mostrarDatos(){
        return 
                "\nMarca: "+ super.getMarca()+"\nModelo: "+super.getModelo()+
               "\nNúmero de motor "+super.getNumMotor()+
                "\nTipo de Gasolina "+super.getTipoGasolina()+
               "\nNúmero económico: "+numEconomico+
               "\nNombre de la empresa: "+nombreEmpresa; 
    }

    /**
     * @return the numEconomico
     */
    public String getNumEconomico() {
        return numEconomico;
    }

    /**
     * @param numEconomico the numEconomico to set
     */
    public void setNumEconomico(String numEconomico) {
        this.numEconomico = numEconomico;
    }

    /**
     * @return the nombreEmpresa
     */
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    /**
     * @param nombreEmpresa the nombreEmpresa to set
     */
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

   
}
