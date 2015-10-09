/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ $Id$
 * ServicioCarritoMock.java Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación Licenciado bajo el
 * esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package com.losalpes.servicios;

import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * Implementacion de los servicios del carrito de compras en el sistema.
 *
 */
@Stateless
public class ServicioReporteMock implements IServicioReporteMockRemote, IServicioReporteMockLocal {
    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Interface con referencia al servicio de persistencia en el sistema
     */
    @EJB
    private IServicioPersistenciaMockLocal persistencia;

    @Override
    public ArrayList<Object[]> getReporte1() {
        return (ArrayList<Object[]>) persistencia.findQuery("RegistroVenta.findAllSalesByUser");
    }

}
