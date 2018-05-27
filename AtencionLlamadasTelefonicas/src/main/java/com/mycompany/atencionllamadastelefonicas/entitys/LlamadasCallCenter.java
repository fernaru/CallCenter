/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atencionllamadastelefonicas.entitys;

import java.util.List;

/**
 *
 * @author HP
 */
public class LlamadasCallCenter {
    
    private List<Integer> llamadasEntrantes;
    private List<Integer> llamadasFinalizadas;

    /**
     * @return the llamadasEntrantes
     */
    public List<Integer> getLlamadasEntrantes() {
        return llamadasEntrantes;
    }

    /**
     * @param llamadasEntrantes the llamadasEntrantes to set
     */
    public void setLlamadasEntrantes(List<Integer> llamadasEntrantes) {
        this.llamadasEntrantes = llamadasEntrantes;
    }

    /**
     * @return the llamadasFinalizadas
     */
    public List<Integer> getLlamadasFinalizadas() {
        return llamadasFinalizadas;
    }

    /**
     * @param llamadasFinalizadas the llamadasFinalizadas to set
     */
    public void setLlamadasFinalizadas(List<Integer> llamadasFinalizadas) {
        this.llamadasFinalizadas = llamadasFinalizadas;
    }
    
    
}
