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
@Table(name = "Imex_Cambia_Guia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexCambiaGuia.findAll", query = "SELECT i FROM ImexCambiaGuia i")
    , @NamedQuery(name = "ImexCambiaGuia.findByIdGuia", query = "SELECT i FROM ImexCambiaGuia i WHERE i.idGuia = :idGuia")
    , @NamedQuery(name = "ImexCambiaGuia.findByGuia", query = "SELECT i FROM ImexCambiaGuia i WHERE i.guia = :guia")
    , @NamedQuery(name = "ImexCambiaGuia.findByContainerId", query = "SELECT i FROM ImexCambiaGuia i WHERE i.containerId = :containerId")
    , @NamedQuery(name = "ImexCambiaGuia.findByTerminalId", query = "SELECT i FROM ImexCambiaGuia i WHERE i.terminalId = :terminalId")
    , @NamedQuery(name = "ImexCambiaGuia.findByGuiaFerromex", query = "SELECT i FROM ImexCambiaGuia i WHERE i.guiaFerromex = :guiaFerromex")
    , @NamedQuery(name = "ImexCambiaGuia.findByActivo", query = "SELECT i FROM ImexCambiaGuia i WHERE i.activo = :activo")
    , @NamedQuery(name = "ImexCambiaGuia.findByFechaRegistro", query = "SELECT i FROM ImexCambiaGuia i WHERE i.fechaRegistro = :fechaRegistro")})
public class ImexCambiaGuia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IdGuia")
    private Integer idGuia;
    @Column(name = "Guia")
    private String guia;
    @Column(name = "ContainerId")
    private Integer containerId;
    @Column(name = "TerminalId")
    private Integer terminalId;
    @Column(name = "GuiaFerromex")
    private String guiaFerromex;
    @Column(name = "Activo")
    private Boolean activo;
    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;

    public ImexCambiaGuia() {
    }

    public ImexCambiaGuia(Integer idGuia) {
        this.idGuia = idGuia;
    }

    public Integer getIdGuia() {
        return idGuia;
    }

    public void setIdGuia(Integer idGuia) {
        this.idGuia = idGuia;
    }

    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }

    public Integer getContainerId() {
        return containerId;
    }

    public void setContainerId(Integer containerId) {
        this.containerId = containerId;
    }

    public Integer getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(Integer terminalId) {
        this.terminalId = terminalId;
    }

    public String getGuiaFerromex() {
        return guiaFerromex;
    }

    public void setGuiaFerromex(String guiaFerromex) {
        this.guiaFerromex = guiaFerromex;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGuia != null ? idGuia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexCambiaGuia)) {
            return false;
        }
        ImexCambiaGuia other = (ImexCambiaGuia) object;
        if ((this.idGuia == null && other.idGuia != null) || (this.idGuia != null && !this.idGuia.equals(other.idGuia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexCambiaGuia[ idGuia=" + idGuia + " ]";
    }
    
}
