/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gym.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author alexis
 */
@Entity
@Table(name = "entrenos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entrenos.findAll", query = "SELECT e FROM Entrenos e"),
    @NamedQuery(name = "Entrenos.findById", query = "SELECT e FROM Entrenos e WHERE e.id = :id"),
    @NamedQuery(name = "Entrenos.findByFecha", query = "SELECT e FROM Entrenos e WHERE e.fecha = :fecha"),
    @NamedQuery(name = "Entrenos.findBySemanas", query = "SELECT e FROM Entrenos e WHERE e.semanas = :semanas"),
    @NamedQuery(name = "Entrenos.findByDias", query = "SELECT e FROM Entrenos e WHERE e.dias = :dias")})
public class Entreno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "semanas")
    private Integer semanas;
    @Column(name = "dias")
    private Integer dias;
    @OneToMany(mappedBy = "idEntreno")
    private Collection<EjerciciosEntreno> ejerciciosEntrenoCollection;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne
    private Usuario idUsuario;

    public Entreno() {
    }

    public Entreno(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getSemanas() {
        return semanas;
    }

    public void setSemanas(Integer semanas) {
        this.semanas = semanas;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    @XmlTransient
    public Collection<EjerciciosEntreno> getEjerciciosEntrenoCollection() {
        return ejerciciosEntrenoCollection;
    }

    public void setEjerciciosEntrenoCollection(Collection<EjerciciosEntreno> ejerciciosEntrenoCollection) {
        this.ejerciciosEntrenoCollection = ejerciciosEntrenoCollection;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
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
        if (!(object instanceof Entreno)) {
            return false;
        }
        Entreno other = (Entreno) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Entrenos[ id=" + id + " ]";
    }
    
}
