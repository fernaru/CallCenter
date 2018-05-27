/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atencionllamadastelefonicas.main;

import com.mycompany.atencionllamadastelefonicas.negocio.Dispatcher;

/**
 *
 * @author HP
 */
public class main {
    public static void main(String[] args){
        Thread operador = new Dispatcher("Proceso Operador");
        operador.start();
    }
}
