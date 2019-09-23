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
@Table(name = "Imex_Cat_TipoInspeccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexCatTipoInspeccion.findAll", query = "SELECT i FROM ImexCatTipoInspeccion i")
    , @NamedQuery(name = "ImexCatTipoInspeccion.findByTipoInspeccionId", query = "SELECT i FROM ImexCatTipoInspeccion i WHERE i.tipoInspeccionId = :tipoInspeccionId")
    , @NamedQuery(name = "ImexCatTipoInspeccion.findByDescripcion", query = "SELECT i FROM ImexCatTipoInspeccion i WHERE i.descripcion = :descripcion")
    , @NamedQuery(name = "ImexCatTipoInspeccion.findByActivo", query = "SELECT i FROM ImexCatTipoInspeccion i WHERE i.activo = :activo")})
public class ImexCatTipoInspeccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TipoInspeccionId")
    private Integer tipoInspeccionId;
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;

    public ImexCatTipoInspeccion() {
    }

    public ImexCatTipoInspeccion(Integer tipoInspeccionId) {
        this.tipoInspeccionId = tipoInspeccionId;
    }

    public ImexCatTipoInspeccion(Integer tipoInspeccionId, boolean activo) {
        this.tipoInspeccionId = tipoInspeccionId;
        this.activo = activo;
    }

    public Integer getTipoInspeccionId() {
        return tipoInspeccionId;
    }

    public void setTipoInspeccionId(Integer tipoInspeccionId) {
        this.tipoInspeccionId = tipoInspeccionId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoInspeccionId != null ? tipoInspeccionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexCatTipoInspeccion)) {
            return false;
        }
        ImexCatTipoInspeccion other = (ImexCatTipoInspeccion) object;
        if ((this.tipoInspeccionId == null && other.tipoInspeccionId != null) || (this.tipoInspeccionId != null && !this.tipoInspeccionId.equals(other.tipoInspeccionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexCatTipoInspeccion[ tipoInspeccionId=" + tipoInspeccionId + " ]";
    }
    
}
