/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ $Id$
 * Mueble.java Universidad de los Andes (Bogotá - Colombia) Departamento de
 * Ingeniería de Sistemas y Computación Licenciado bajo el esquema Academic Free
 * License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package com.losalpes.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * Clase que representa la información de un mueble en el sistema
 *
 */
@Entity
public class Mueble implements Serializable {

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------
    @Id
    @SequenceGenerator(name = "SeqMueble")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SeqMueble")
    private Long id;
    /**
     * Referencia que identifica el modelo del mueble en el sistema.
     */
    private Long referencia;

    /**
     * Nombre del mueble.
     */
    private String nombre;

    /**
     * Descripción del mueble.
     */
    private String descripcion;

    /**
     * Tipo de mueble.
     */
    @Enumerated(EnumType.STRING)
    private TipoMueble tipo;

    /**
     * Precio del mueble
     */
    private Double precio;

    /**
     * Nombre de la imágen
     */
    private String imagen;

    /**
     * Cantidad de items
     */
    private Integer cantidad;

    /**
     * Indica si el mueble fue seleccionado
     */
    private Boolean seleccion;

    //-----------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------
    /**
     * Constructor sin argumentos de la clase
     */
    public Mueble() {

    }

    /**
     * Constructor de la clase. Inicializa los atributos con los valores que
     * ingresan por parametro.
     *
     * @param referencia Referencia del mueble
     * @param nombre Nombre del mueble
     * @param descripcion Descripión del mueble
     * @param tipo Tipo de mueble
     * @param cantidad Cantidad de ejemplares
     */
    public Mueble(Long referencia, String nombre, String descripcion, TipoMueble tipo, Integer cantidad, String imagen, Double precio) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.imagen = imagen;
        this.precio = precio;
    }

    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------
    /**
     * Devuelve la descripción del mueble
     *
     * @return descripcion Descripción del mueble
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Modifica la descripción del mueble
     *
     * @param descripcion Nueva descripción del mueble
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Devuelve el nombre del mueble
     *
     * @return nombre Nombre del mueble
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del mueble
     *
     * @param nombre Nuevo nombre del mueble
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la referencia del mueble
     *
     * @return referencia Referencia del mueble
     */
    public Long getReferencia() {
        return referencia;
    }

    /**
     * Modifica la referencia del mueble
     *
     * @param referencia Nueva referencia del mueble
     */
    public void setReferencia(Long referencia) {
        this.referencia = referencia;
    }

    /**
     * Devuelve el tipo de mueble
     *
     * @return tipo Tipo de mueble
     */
    public TipoMueble getTipo() {
        return tipo;
    }

    /**
     * Modifica el tipo de mueble
     *
     * @param tipo Nuevo tipo de mueble
     */
    public void setTipo(TipoMueble tipo) {
        this.tipo = tipo;
    }

    /**
     * Devuelve el estado de selección del mueble
     *
     * @return seleccion Verdadero o falso
     */
    public Boolean getSeleccion() {
        return seleccion;
    }

    /**
     * Cambia el estado de selección de un mueble
     *
     * @param seleccion Nuevo estado de selección
     */
    public void setSeleccion(Boolean seleccion) {
        this.seleccion = seleccion;
    }

    /**
     * Devuelve la cantidad de ejemplares de un mueble
     *
     * @return cantidad Cantidad de muebles
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Modifica la cantidad de ejemplares de un mueble
     *
     * @param cantidad Nueva cantidad de muebles
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Nombre de la imagen
     *
     * @return imagen Nombre de la imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Modifica el nombre de la imagen
     *
     * @param imagen Nuevo nombre de imagen
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * Devuelve el precio del mueble
     *
     * @return precio Precio del mueble
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * Modifica el precio del mueble
     *
     * @param precio Nuevo precio del mueble
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------
    /**
     * Aumenta la cantidad de muebles
     */
    public void incrementarCantidad() {
        cantidad++;
    }

    /**
     * Reduce la cantidad de muebles
     */
    public void reducirCantidad() {
        cantidad--;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
