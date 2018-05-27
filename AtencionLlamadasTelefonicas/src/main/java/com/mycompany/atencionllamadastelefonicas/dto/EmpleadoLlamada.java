/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atencionllamadastelefonicas.dto;

import com.mycompany.atencionllamadastelefonicas.entitys.Empleados;
import com.mycompany.atencionllamadastelefonicas.entitys.LlamadasCallCenter;

/**
 *
 * @author HP
 */
public class EmpleadoLlamada {
    
    private Empleados empleado;
    private LlamadasCallCenter llamadas;

    /**
     * @return the empleado
     */
    public Empleados getEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(Empleados empleado) {
        this.empleado = empleado;
    }

    /**
     * @return the llamadas
     */
    public LlamadasCallCenter getLlamadas() {
        return llamadas;
    }

    /**
     * @param llamadas the llamadas to set
     */
    public void setLlamadas(LlamadasCallCenter llamadas) {
        this.llamadas = llamadas;
    }
    
    
}
