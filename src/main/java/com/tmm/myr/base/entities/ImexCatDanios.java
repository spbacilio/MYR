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
@Table(name = "Imex_Cat_Danios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexCatDanios.findAll", query = "SELECT i FROM ImexCatDanios i")
    , @NamedQuery(name = "ImexCatDanios.findByDaniosId", query = "SELECT i FROM ImexCatDanios i WHERE i.daniosId = :daniosId")
    , @NamedQuery(name = "ImexCatDanios.findByDaniosDescripcion", query = "SELECT i FROM ImexCatDanios i WHERE i.daniosDescripcion = :daniosDescripcion")
    , @NamedQuery(name = "ImexCatDanios.findByActivo", query = "SELECT i FROM ImexCatDanios i WHERE i.activo = :activo")})
public class ImexCatDanios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DaniosId")
    private Integer daniosId;
    @Column(name = "DaniosDescripcion")
    private String daniosDescripcion;
    @Column(name = "Activo")
    private Boolean activo;

    public ImexCatDanios() {
    }

    public ImexCatDanios(Integer daniosId) {
        this.daniosId = daniosId;
    }

    public Integer getDaniosId() {
        return daniosId;
    }

    public void setDaniosId(Integer daniosId) {
        this.daniosId = daniosId;
    }

    public String getDaniosDescripcion() {
        return daniosDescripcion;
    }

    public void setDaniosDescripcion(String daniosDescripcion) {
        this.daniosDescripcion = daniosDescripcion;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (daniosId != null ? daniosId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexCatDanios)) {
            return false;
        }
        ImexCatDanios other = (ImexCatDanios) object;
        if ((this.daniosId == null && other.daniosId != null) || (this.daniosId != null && !this.daniosId.equals(other.daniosId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexCatDanios[ daniosId=" + daniosId + " ]";
    }
    
}
