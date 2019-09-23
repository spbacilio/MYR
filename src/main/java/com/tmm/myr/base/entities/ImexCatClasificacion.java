/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmm.myr.base.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bacil
 */
@Entity
@Table(name = "Imex_Cat_Clasificacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexCatClasificacion.findAll", query = "SELECT i FROM ImexCatClasificacion i")
    , @NamedQuery(name = "ImexCatClasificacion.findByClasificacionId", query = "SELECT i FROM ImexCatClasificacion i WHERE i.clasificacionId = :clasificacionId")
    , @NamedQuery(name = "ImexCatClasificacion.findByClasificacionDescripcion", query = "SELECT i FROM ImexCatClasificacion i WHERE i.clasificacionDescripcion = :clasificacionDescripcion")})
public class ImexCatClasificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ClasificacionId")
    private Integer clasificacionId;
    @Column(name = "ClasificacionDescripcion")
    private String clasificacionDescripcion;

    public ImexCatClasificacion() {
    }

    public ImexCatClasificacion(Integer clasificacionId) {
        this.clasificacionId = clasificacionId;
    }

    public Integer getClasificacionId() {
        return clasificacionId;
    }

    public void setClasificacionId(Integer clasificacionId) {
        this.clasificacionId = clasificacionId;
    }

    public String getClasificacionDescripcion() {
        return clasificacionDescripcion;
    }

    public void setClasificacionDescripcion(String clasificacionDescripcion) {
        this.clasificacionDescripcion = clasificacionDescripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clasificacionId != null ? clasificacionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexCatClasificacion)) {
            return false;
        }
        ImexCatClasificacion other = (ImexCatClasificacion) object;
        if ((this.clasificacionId == null && other.clasificacionId != null) || (this.clasificacionId != null && !this.clasificacionId.equals(other.clasificacionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexCatClasificacion[ clasificacionId=" + clasificacionId + " ]";
    }
    
}
