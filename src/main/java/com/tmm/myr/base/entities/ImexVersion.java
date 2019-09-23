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
@Table(name = "Imex_Version")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexVersion.findAll", query = "SELECT i FROM ImexVersion i")
    , @NamedQuery(name = "ImexVersion.findByVersioId", query = "SELECT i FROM ImexVersion i WHERE i.versioId = :versioId")
    , @NamedQuery(name = "ImexVersion.findByVersion", query = "SELECT i FROM ImexVersion i WHERE i.version = :version")
    , @NamedQuery(name = "ImexVersion.findByActivo", query = "SELECT i FROM ImexVersion i WHERE i.activo = :activo")
    , @NamedQuery(name = "ImexVersion.findByTerminalId", query = "SELECT i FROM ImexVersion i WHERE i.terminalId = :terminalId")})
public class ImexVersion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VersioId")
    private Integer versioId;
    @Column(name = "Version")
    private String version;
    @Column(name = "Activo")
    private Boolean activo;
    @Column(name = "TerminalId")
    private Integer terminalId;

    public ImexVersion() {
    }

    public ImexVersion(Integer versioId) {
        this.versioId = versioId;
    }

    public Integer getVersioId() {
        return versioId;
    }

    public void setVersioId(Integer versioId) {
        this.versioId = versioId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Integer getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(Integer terminalId) {
        this.terminalId = terminalId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (versioId != null ? versioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexVersion)) {
            return false;
        }
        ImexVersion other = (ImexVersion) object;
        if ((this.versioId == null && other.versioId != null) || (this.versioId != null && !this.versioId.equals(other.versioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexVersion[ versioId=" + versioId + " ]";
    }
    
}
