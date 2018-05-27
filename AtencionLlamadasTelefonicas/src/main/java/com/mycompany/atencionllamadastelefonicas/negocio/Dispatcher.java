/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atencionllamadastelefonicas.negocio;

import com.mycompany.atencionllamadastelefonicas.dto.EmpleadoLlamada;
import com.mycompany.atencionllamadastelefonicas.dto.ManejoEmpleado;
import com.mycompany.atencionllamadastelefonicas.entitys.Empleados;
import com.mycompany.atencionllamadastelefonicas.entitys.LlamadasCallCenter;
import com.mycompany.atencionllamadastelefonicas.enumeradores.TipoEmpleado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Dispatcher extends Thread {

    public Dispatcher(String string) {
        super(string);
    }

    private Dispatcher() {

    }

    @Override
    public void run() {
        List<EmpleadoLlamada> ListaEmpleadoLlamada = new ArrayList<>();
        Empleados empl = new Empleados();
        empl.setOcupado(false);
        LlamadasCallCenter llamadas = new LlamadasCallCenter();
        llamadas.getLlamadasEntrantes().add(1);
        llamadas.getLlamadasEntrantes().add(2);
        llamadas.getLlamadasEntrantes().add(3);
        llamadas.getLlamadasEntrantes().add(4);
        llamadas.getLlamadasEntrantes().add(5);
        llamadas.getLlamadasEntrantes().add(6);
        llamadas.getLlamadasEntrantes().add(7);
        llamadas.getLlamadasEntrantes().add(8);
        llamadas.getLlamadasEntrantes().add(10);
        llamadas.getLlamadasEntrantes().add(11);
        llamadas.getLlamadasEntrantes().add(12);
        llamadas.getLlamadasEntrantes().add(13);
        llamadas.getLlamadasEntrantes().add(14);
        llamadas.getLlamadasEntrantes().add(15);
        llamadas.getLlamadasEntrantes().add(16);
        llamadas.getLlamadasEntrantes().add(17);
        llamadas.getLlamadasEntrantes().add(18);
        llamadas.getLlamadasEntrantes().add(19);
        llamadas.getLlamadasEntrantes().add(20);
        EmpleadoLlamada manejo = new EmpleadoLlamada();
        manejo.setEmpleado(empl);
        manejo.setLlamadas(llamadas);
        ListaEmpleadoLlamada.add(manejo);
    }

    public void dispatchCall(List<EmpleadoLlamada> ListaEmpleadoLlamada) {
        Integer contador;
        ManejoEmpleado manejoEmpleado;
        for (EmpleadoLlamada dato : ListaEmpleadoLlamada) {
            if (dato.getEmpleado().isOcupado() == false) {
                for (Integer llamadas : dato.getLlamadas().getLlamadasEntrantes()) {
                    contador = +1;
                    if (contador >= 10) {
                        manejoEmpleado = cambiosEmpleados(contador);
                        if (manejoEmpleado.isSinCupo()) {
                            if (TipoEmpleado.OPERADOR.getId().equals(manejoEmpleado.getTipoEmpleado()) && manejoEmpleado.isCambioEmpleado() == true) {
                                Thread operador = new Dispatcher("Proceso Operador");
                                operador.start();
                            } else if (TipoEmpleado.SUPERVISOR.getId().equals(manejoEmpleado.getTipoEmpleado()) && manejoEmpleado.isCambioEmpleado() == true) {
                                Thread supervisor = new Dispatcher("Proceso Supervisor");
                                supervisor.start();
                            } else if (TipoEmpleado.DIRECTOR.getId().equals(manejoEmpleado.getTipoEmpleado()) && manejoEmpleado.isCambioEmpleado() == true) {
                                Thread director = new Dispatcher("Proceso Director");
                                director.start();
                            }
                        }else{
                            System.out.println("Los Empleados estan ocupados");
                        }

                    }
                }
            }
        }

    }

    public ManejoEmpleado cambiosEmpleados(Integer datos) {
        ManejoEmpleado manejo = new ManejoEmpleado();
        switch (datos) {
            case 10:
                manejo.setCambioEmpleado(true);
                manejo.setTipoEmpleado(TipoEmpleado.OPERADOR.getId());
                manejo.setSinCupo(false);
                break;
            case 20:
                manejo.setCambioEmpleado(true);
                manejo.setTipoEmpleado(TipoEmpleado.SUPERVISOR.getId());
                manejo.setSinCupo(false);
                break;
            case 30:
                manejo.setCambioEmpleado(true);
                manejo.setTipoEmpleado(TipoEmpleado.SUPERVISOR.getId());
                manejo.setSinCupo(false);
                break;
            case 31:
                manejo.setCambioEmpleado(false);
                manejo.setSinCupo(true);
            default:
                break;
        }
        return manejo;

//        try {
//
//            Thread.sleep(canLlamadas * 10);
//        } catch (InterruptedException ex) {
//            System.out.println("Error: " + ex);
//        }
    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
