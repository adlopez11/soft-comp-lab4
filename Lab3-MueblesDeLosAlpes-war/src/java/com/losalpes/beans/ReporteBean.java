/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ $Id$
 * CarritoBean.java Universidad de los Andes (Bogotá - Colombia) Departamento de
 * Ingeniería de Sistemas y Computación Licenciado bajo el esquema Academic Free
 * License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package com.losalpes.beans;

import com.losalpes.servicios.IServicioReporteMockLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 * Managed Bean encargado del carrito de compras del cliente
 *
 */
public class ReporteBean implements Serializable {

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------
    /**
     * Relación con la interfaz que provee los servicios de las ventas
     */
    @EJB
    private IServicioReporteMockLocal servicioReporte;

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------
    /**
     * Constructor sin argumentos de la clase
     */
    public ReporteBean() {

    }

    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------
    /**
     * Devuelve todas las ventas realizadas en el sistema
     *
     * @return ventas Lista con todos las ventas del sistema
     */
    public List<Object[]> getReporte1() {
        return servicioReporte.getReporte1();
    }

}
