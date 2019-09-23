/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmm.myr.base.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author bacil
 */
@Entity
@Table(name = "Imex_Cat_TipoServicio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexCatTipoServicio.findAll", query = "SELECT i FROM ImexCatTipoServicio i")
    , @NamedQuery(name = "ImexCatTipoServicio.findByTipoServicioId", query = "SELECT i FROM ImexCatTipoServicio i WHERE i.tipoServicioId = :tipoServicioId")
    , @NamedQuery(name = "ImexCatTipoServicio.findByTipoServicio", query = "SELECT i FROM ImexCatTipoServicio i WHERE i.tipoServicio = :tipoServicio")
    , @NamedQuery(name = "ImexCatTipoServicio.findByTipoServicioEN", query = "SELECT i FROM ImexCatTipoServicio i WHERE i.tipoServicioEN = :tipoServicioEN")})
public class ImexCatTipoServicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TipoServicioId")
    private Integer tipoServicioId;
    @Column(name = "TipoServicio")
    private String tipoServicio;
    @Column(name = "TipoServicioEN")
    private String tipoServicioEN;
    @OneToMany(mappedBy = "tipoServicioId")
    private Collection<ImexCatTamanios> imexCatTamaniosCollection;

    public ImexCatTipoServicio() {
    }

    public ImexCatTipoServicio(Integer tipoServicioId) {
        this.tipoServicioId = tipoServicioId;
    }

    public Integer getTipoServicioId() {
        return tipoServicioId;
    }

    public void setTipoServicioId(Integer tipoServicioId) {
        this.tipoServicioId = tipoServicioId;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getTipoServicioEN() {
        return tipoServicioEN;
    }

    public void setTipoServicioEN(String tipoServicioEN) {
        this.tipoServicioEN = tipoServicioEN;
    }

    @XmlTransient
    public Collection<ImexCatTamanios> getImexCatTamaniosCollection() {
        return imexCatTamaniosCollection;
    }

    public void setImexCatTamaniosCollection(Collection<ImexCatTamanios> imexCatTamaniosCollection) {
        this.imexCatTamaniosCollection = imexCatTamaniosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoServicioId != null ? tipoServicioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexCatTipoServicio)) {
            return false;
        }
        ImexCatTipoServicio other = (ImexCatTipoServicio) object;
        if ((this.tipoServicioId == null && other.tipoServicioId != null) || (this.tipoServicioId != null && !this.tipoServicioId.equals(other.tipoServicioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexCatTipoServicio[ tipoServicioId=" + tipoServicioId + " ]";
    }
    
}
