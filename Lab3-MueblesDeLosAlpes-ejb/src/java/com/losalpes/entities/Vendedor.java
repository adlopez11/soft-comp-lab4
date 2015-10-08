/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ $Id$
 * Vendedor.java Universidad de los Andes (Bogotá - Colombia) Departamento de
 * Ingeniería de Sistemas y Computación Licenciado bajo el esquema Academic Free
 * License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package com.losalpes.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Clase que modela un vendedor dentro del sistema.
 *
 */
@Entity
public class Vendedor implements Serializable {

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------
    /**
     * Número de identificación del vendedor
     */
    @Id
    private Long id;

    /**
     * Nombres del vendedor.
     */
    private String nombres;

    /**
     * Apellidos del vendedor.
     */
    private String apellidos;

    /**
     * Lista de ítems de experiencia del vendedor.
     */
    @OneToMany(mappedBy = "vendedor")
    private List<ExperienciaVendedor> experiencias;

    /**
     * Salario del vendedor.
     */
    private Double salario;

    /**
     * Comisión por ventas para el vendedor.
     */
    private Double comisionVentas;

    /**
     * Perfil de vendedor.
     */
    private String perfil;

    /**
     * Foto del vendedor.
     */
    private String foto;

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------
    /**
     * Constructor sin argumentos
     */
    public Vendedor() {
        experiencias = new ArrayList<ExperienciaVendedor>();
    }

    /**
     * Constructor con argumentos de la clase
     *
     * @param id Identificador único del vendedor
     * @param nombres Nombre(s) del vendedor
     * @param apellidos Apellido(s) del vendedor
     * @param experiencias Lista con la experiencia laboral del vendedor
     * @param salario Salario del vendedor
     * @param comisionVentas Valor en comisión por ventas
     * @param perfil Perfil del vendedor
     * @param foto Nombre de la foto del vendedor
     */
    public Vendedor(Long id, String nombres, String apellidos, List<ExperienciaVendedor> experiencias, Double salario, Double comisionVentas, String perfil, String foto) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.experiencias = experiencias;
        this.salario = salario;
        this.comisionVentas = comisionVentas;
        this.perfil = perfil;
        this.foto = foto;
    }

    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------
    /**
     * Devuelve el número único de identificación del vendedor
     *
     * @return id Número de identificación
     */
    public Long getIdentificacion() {
        return id;
    }

    /**
     * Modifica el número de identificación del cliente
     *
     * @param id Nuevo número de identificación
     */
    public void setIdentificacion(Long id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Double getComisionVentas() {
        return comisionVentas;
    }

    public void setComisionVentas(Double comisionVentas) {
        this.comisionVentas = comisionVentas;
    }

    public List<ExperienciaVendedor> getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(List<ExperienciaVendedor> experiencias) {
        this.experiencias = experiencias;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void addExperiencia(ExperienciaVendedor experiencia) {
        this.experiencias.add(experiencia);
    }

}
