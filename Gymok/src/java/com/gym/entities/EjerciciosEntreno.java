/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gym.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alexis
 */
@Entity
@Table(name = "ejercicios_entreno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EjerciciosEntreno.findAll", query = "SELECT e FROM EjerciciosEntreno e"),
    @NamedQuery(name = "EjerciciosEntreno.findById", query = "SELECT e FROM EjerciciosEntreno e WHERE e.id = :id"),
    @NamedQuery(name = "EjerciciosEntreno.findBySemana", query = "SELECT e FROM EjerciciosEntreno e WHERE e.semana = :semana"),
    @NamedQuery(name = "EjerciciosEntreno.findByDia", query = "SELECT e FROM EjerciciosEntreno e WHERE e.dia = :dia"),
    @NamedQuery(name = "EjerciciosEntreno.findBySerie", query = "SELECT e FROM EjerciciosEntreno e WHERE e.serie = :serie"),
    @NamedQuery(name = "EjerciciosEntreno.findByRepeticiones", query = "SELECT e FROM EjerciciosEntreno e WHERE e.repeticiones = :repeticiones"),
    @NamedQuery(name = "EjerciciosEntreno.findByPeso", query = "SELECT e FROM EjerciciosEntreno e WHERE e.peso = :peso")})
public class EjerciciosEntreno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "semana")
    private Integer semana;
    @Column(name = "dia")
    private Integer dia;
    @Column(name = "serie")
    private Integer serie;
    @Column(name = "repeticiones")
    private Integer repeticiones;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "peso")
    private Double peso;
    @JoinColumn(name = "id_entreno", referencedColumnName = "id")
    @ManyToOne
    private Entreno idEntreno;
    @JoinColumn(name = "id_ejercicio", referencedColumnName = "id")
    @ManyToOne
    private Ejercicio idEjercicio;

    public EjerciciosEntreno() {
    }

    public EjerciciosEntreno(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSemana() {
        return semana;
    }

    public void setSemana(Integer semana) {
        this.semana = semana;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public Integer getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(Integer repeticiones) {
        this.repeticiones = repeticiones;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Entreno getIdEntreno() {
        return idEntreno;
    }

    public void setIdEntreno(Entreno idEntreno) {
        this.idEntreno = idEntreno;
    }

    public Ejercicio getIdEjercicio() {
        return idEjercicio;
    }

    public void setIdEjercicio(Ejercicio idEjercicio) {
        this.idEjercicio = idEjercicio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EjerciciosEntreno)) {
            return false;
        }
        EjerciciosEntreno other = (EjerciciosEntreno) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.EjerciciosEntreno[ id=" + id + " ]";
    }
    
}
