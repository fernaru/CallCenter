/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atencionllamadastelefonicas.enumeradores;

/**
 *
 * @author HP
 */
public enum TipoEmpleado {
    OPERADOR(1),
    SUPERVISOR(2),
    DIRECTOR(3);
    
    private Integer id;

    private TipoEmpleado(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
}
