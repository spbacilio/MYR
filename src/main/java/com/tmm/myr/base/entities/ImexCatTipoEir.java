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
@Table(name = "Imex_Cat_TipoEir")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexCatTipoEir.findAll", query = "SELECT i FROM ImexCatTipoEir i")
    , @NamedQuery(name = "ImexCatTipoEir.findByTipoEirId", query = "SELECT i FROM ImexCatTipoEir i WHERE i.tipoEirId = :tipoEirId")
    , @NamedQuery(name = "ImexCatTipoEir.findByDescripcion", query = "SELECT i FROM ImexCatTipoEir i WHERE i.descripcion = :descripcion")
    , @NamedQuery(name = "ImexCatTipoEir.findByActivo", query = "SELECT i FROM ImexCatTipoEir i WHERE i.activo = :activo")})
public class ImexCatTipoEir implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TipoEirId")
    private Integer tipoEirId;
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;

    public ImexCatTipoEir() {
    }

    public ImexCatTipoEir(Integer tipoEirId) {
        this.tipoEirId = tipoEirId;
    }

    public ImexCatTipoEir(Integer tipoEirId, boolean activo) {
        this.tipoEirId = tipoEirId;
        this.activo = activo;
    }

    public Integer getTipoEirId() {
        return tipoEirId;
    }

    public void setTipoEirId(Integer tipoEirId) {
        this.tipoEirId = tipoEirId;
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
        hash += (tipoEirId != null ? tipoEirId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexCatTipoEir)) {
            return false;
        }
        ImexCatTipoEir other = (ImexCatTipoEir) object;
        if ((this.tipoEirId == null && other.tipoEirId != null) || (this.tipoEirId != null && !this.tipoEirId.equals(other.tipoEirId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexCatTipoEir[ tipoEirId=" + tipoEirId + " ]";
    }
    
}
