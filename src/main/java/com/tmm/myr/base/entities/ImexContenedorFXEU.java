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
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bacil
 */
@Entity
@Table(name = "Imex_ContenedorFXEU")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexContenedorFXEU.findAll", query = "SELECT i FROM ImexContenedorFXEU i")
    , @NamedQuery(name = "ImexContenedorFXEU.findByContenedorFXEUId", query = "SELECT i FROM ImexContenedorFXEU i WHERE i.contenedorFXEUId = :contenedorFXEUId")
    , @NamedQuery(name = "ImexContenedorFXEU.findByTipoContenedorid", query = "SELECT i FROM ImexContenedorFXEU i WHERE i.tipoContenedorid = :tipoContenedorid")
    , @NamedQuery(name = "ImexContenedorFXEU.findByTamaniosid", query = "SELECT i FROM ImexContenedorFXEU i WHERE i.tamaniosid = :tamaniosid")})
public class ImexContenedorFXEU implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ContenedorFXEUId")
    private Integer contenedorFXEUId;
    @Basic(optional = false)
    @Column(name = "TipoContenedorid")
    private int tipoContenedorid;
    @Column(name = "Tamaniosid")
    private Integer tamaniosid;
    @JoinColumn(name = "Containerid", referencedColumnName = "ContainerId")
    @OneToOne(optional = false)
    private ImexContainer containerid;

    public ImexContenedorFXEU() {
    }

    public ImexContenedorFXEU(Integer contenedorFXEUId) {
        this.contenedorFXEUId = contenedorFXEUId;
    }

    public ImexContenedorFXEU(Integer contenedorFXEUId, int tipoContenedorid) {
        this.contenedorFXEUId = contenedorFXEUId;
        this.tipoContenedorid = tipoContenedorid;
    }

    public Integer getContenedorFXEUId() {
        return contenedorFXEUId;
    }

    public void setContenedorFXEUId(Integer contenedorFXEUId) {
        this.contenedorFXEUId = contenedorFXEUId;
    }

    public int getTipoContenedorid() {
        return tipoContenedorid;
    }

    public void setTipoContenedorid(int tipoContenedorid) {
        this.tipoContenedorid = tipoContenedorid;
    }

    public Integer getTamaniosid() {
        return tamaniosid;
    }

    public void setTamaniosid(Integer tamaniosid) {
        this.tamaniosid = tamaniosid;
    }

    public ImexContainer getContainerid() {
        return containerid;
    }

    public void setContainerid(ImexContainer containerid) {
        this.containerid = containerid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contenedorFXEUId != null ? contenedorFXEUId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexContenedorFXEU)) {
            return false;
        }
        ImexContenedorFXEU other = (ImexContenedorFXEU) object;
        if ((this.contenedorFXEUId == null && other.contenedorFXEUId != null) || (this.contenedorFXEUId != null && !this.contenedorFXEUId.equals(other.contenedorFXEUId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexContenedorFXEU[ contenedorFXEUId=" + contenedorFXEUId + " ]";
    }
    
}
