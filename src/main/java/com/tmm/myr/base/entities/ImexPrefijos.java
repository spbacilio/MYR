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
@Table(name = "Imex_Prefijos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexPrefijos.findAll", query = "SELECT i FROM ImexPrefijos i")
    , @NamedQuery(name = "ImexPrefijos.findByPrefijoId", query = "SELECT i FROM ImexPrefijos i WHERE i.prefijoId = :prefijoId")
    , @NamedQuery(name = "ImexPrefijos.findByPrefijoInitial", query = "SELECT i FROM ImexPrefijos i WHERE i.prefijoInitial = :prefijoInitial")
    , @NamedQuery(name = "ImexPrefijos.findByTipoServicioId", query = "SELECT i FROM ImexPrefijos i WHERE i.tipoServicioId = :tipoServicioId")
    , @NamedQuery(name = "ImexPrefijos.findByTerminalId", query = "SELECT i FROM ImexPrefijos i WHERE i.terminalId = :terminalId")
    , @NamedQuery(name = "ImexPrefijos.findByTipoEquipoId", query = "SELECT i FROM ImexPrefijos i WHERE i.tipoEquipoId = :tipoEquipoId")
    , @NamedQuery(name = "ImexPrefijos.findByUserName", query = "SELECT i FROM ImexPrefijos i WHERE i.userName = :userName")
    , @NamedQuery(name = "ImexPrefijos.findByFechaAlta", query = "SELECT i FROM ImexPrefijos i WHERE i.fechaAlta = :fechaAlta")
    , @NamedQuery(name = "ImexPrefijos.findByShipperId", query = "SELECT i FROM ImexPrefijos i WHERE i.shipperId = :shipperId")})
public class ImexPrefijos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PrefijoId")
    private Integer prefijoId;
    @Basic(optional = false)
    @Column(name = "PrefijoInitial")
    private String prefijoInitial;
    @Basic(optional = false)
    @Column(name = "TipoServicioId")
    private int tipoServicioId;
    @Basic(optional = false)
    @Column(name = "TerminalId")
    private int terminalId;
    @Basic(optional = false)
    @Column(name = "TipoEquipoId")
    private int tipoEquipoId;
    @Basic(optional = false)
    @Column(name = "UserName")
    private String userName;
    @Basic(optional = false)
    @Column(name = "FechaAlta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Basic(optional = false)
    @Column(name = "ShipperId")
    private long shipperId;

    public ImexPrefijos() {
    }

    public ImexPrefijos(Integer prefijoId) {
        this.prefijoId = prefijoId;
    }

    public ImexPrefijos(Integer prefijoId, String prefijoInitial, int tipoServicioId, int terminalId, int tipoEquipoId, String userName, Date fechaAlta, long shipperId) {
        this.prefijoId = prefijoId;
        this.prefijoInitial = prefijoInitial;
        this.tipoServicioId = tipoServicioId;
        this.terminalId = terminalId;
        this.tipoEquipoId = tipoEquipoId;
        this.userName = userName;
        this.fechaAlta = fechaAlta;
        this.shipperId = shipperId;
    }

    public Integer getPrefijoId() {
        return prefijoId;
    }

    public void setPrefijoId(Integer prefijoId) {
        this.prefijoId = prefijoId;
    }

    public String getPrefijoInitial() {
        return prefijoInitial;
    }

    public void setPrefijoInitial(String prefijoInitial) {
        this.prefijoInitial = prefijoInitial;
    }

    public int getTipoServicioId() {
        return tipoServicioId;
    }

    public void setTipoServicioId(int tipoServicioId) {
        this.tipoServicioId = tipoServicioId;
    }

    public int getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(int terminalId) {
        this.terminalId = terminalId;
    }

    public int getTipoEquipoId() {
        return tipoEquipoId;
    }

    public void setTipoEquipoId(int tipoEquipoId) {
        this.tipoEquipoId = tipoEquipoId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public long getShipperId() {
        return shipperId;
    }

    public void setShipperId(long shipperId) {
        this.shipperId = shipperId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prefijoId != null ? prefijoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexPrefijos)) {
            return false;
        }
        ImexPrefijos other = (ImexPrefijos) object;
        if ((this.prefijoId == null && other.prefijoId != null) || (this.prefijoId != null && !this.prefijoId.equals(other.prefijoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexPrefijos[ prefijoId=" + prefijoId + " ]";
    }
    
}
