/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atencionllamadastelefonicas.dto;

/**
 *
 * @author HP
 */
public class ManejoEmpleado {
    private boolean cambioEmpleado;
    private Integer tipoEmpleado;
    private boolean sinCupo;

    /**
     * @return the cambioEmpleado
     */
    public boolean isCambioEmpleado() {
        return cambioEmpleado;
    }

    /**
     * @param cambioEmpleado the cambioEmpleado to set
     */
    public void setCambioEmpleado(boolean cambioEmpleado) {
        this.cambioEmpleado = cambioEmpleado;
    }

    /**
     * @return the tipoEmpleado
     */
    public Integer getTipoEmpleado() {
        return tipoEmpleado;
    }

    /**
     * @param tipoEmpleado the tipoEmpleado to set
     */
    public void setTipoEmpleado(Integer tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    /**
     * @return the sinCupo
     */
    public boolean isSinCupo() {
        return sinCupo;
    }

    /**
     * @param sinCupo the sinCupo to set
     */
    public void setSinCupo(boolean sinCupo) {
        this.sinCupo = sinCupo;
    }
    
    
    
    
}
