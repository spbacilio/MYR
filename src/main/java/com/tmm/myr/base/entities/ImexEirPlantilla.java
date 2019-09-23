/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmm.myr.base.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bacil
 */
@Entity
@Table(name = "Imex_Eir_Plantilla")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexEirPlantilla.findAll", query = "SELECT i FROM ImexEirPlantilla i")
    , @NamedQuery(name = "ImexEirPlantilla.findByEIRPlantillaId", query = "SELECT i FROM ImexEirPlantilla i WHERE i.eIRPlantillaId = :eIRPlantillaId")
    , @NamedQuery(name = "ImexEirPlantilla.findByDescripcion", query = "SELECT i FROM ImexEirPlantilla i WHERE i.descripcion = :descripcion")
    , @NamedQuery(name = "ImexEirPlantilla.findByFechaCreacion", query = "SELECT i FROM ImexEirPlantilla i WHERE i.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "ImexEirPlantilla.findByUserId", query = "SELECT i FROM ImexEirPlantilla i WHERE i.userId = :userId")})
public class ImexEirPlantilla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EIRPlantillaId")
    private Integer eIRPlantillaId;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "UserId")
    private String userId;

    public ImexEirPlantilla() {
    }

    public ImexEirPlantilla(Integer eIRPlantillaId) {
        this.eIRPlantillaId = eIRPlantillaId;
    }

    public Integer getEIRPlantillaId() {
        return eIRPlantillaId;
    }

    public void setEIRPlantillaId(Integer eIRPlantillaId) {
        this.eIRPlantillaId = eIRPlantillaId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eIRPlantillaId != null ? eIRPlantillaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexEirPlantilla)) {
            return false;
        }
        ImexEirPlantilla other = (ImexEirPlantilla) object;
        if ((this.eIRPlantillaId == null && other.eIRPlantillaId != null) || (this.eIRPlantillaId != null && !this.eIRPlantillaId.equals(other.eIRPlantillaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexEirPlantilla[ eIRPlantillaId=" + eIRPlantillaId + " ]";
    }
    
}
