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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Imex_TarifaShipper")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexTarifaShipper.findAll", query = "SELECT i FROM ImexTarifaShipper i")
    , @NamedQuery(name = "ImexTarifaShipper.findByTarifaShipperId", query = "SELECT i FROM ImexTarifaShipper i WHERE i.tarifaShipperId = :tarifaShipperId")
    , @NamedQuery(name = "ImexTarifaShipper.findByTarifaId", query = "SELECT i FROM ImexTarifaShipper i WHERE i.tarifaId = :tarifaId")
    , @NamedQuery(name = "ImexTarifaShipper.findByUnidadesDias", query = "SELECT i FROM ImexTarifaShipper i WHERE i.unidadesDias = :unidadesDias")
    , @NamedQuery(name = "ImexTarifaShipper.findByActivo", query = "SELECT i FROM ImexTarifaShipper i WHERE i.activo = :activo")
    , @NamedQuery(name = "ImexTarifaShipper.findByUserName", query = "SELECT i FROM ImexTarifaShipper i WHERE i.userName = :userName")
    , @NamedQuery(name = "ImexTarifaShipper.findByFechaVigenciaInicio", query = "SELECT i FROM ImexTarifaShipper i WHERE i.fechaVigenciaInicio = :fechaVigenciaInicio")
    , @NamedQuery(name = "ImexTarifaShipper.findByFechaVigenciaFin", query = "SELECT i FROM ImexTarifaShipper i WHERE i.fechaVigenciaFin = :fechaVigenciaFin")
    , @NamedQuery(name = "ImexTarifaShipper.findByUserNameCancelo", query = "SELECT i FROM ImexTarifaShipper i WHERE i.userNameCancelo = :userNameCancelo")
    , @NamedQuery(name = "ImexTarifaShipper.findByFechaCancelo", query = "SELECT i FROM ImexTarifaShipper i WHERE i.fechaCancelo = :fechaCancelo")
    , @NamedQuery(name = "ImexTarifaShipper.findByTasaIVAId", query = "SELECT i FROM ImexTarifaShipper i WHERE i.tasaIVAId = :tasaIVAId")})
public class ImexTarifaShipper implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TarifaShipperId")
    private Integer tarifaShipperId;
    @Column(name = "TarifaId")
    private Integer tarifaId;
    @Column(name = "UnidadesDias")
    private Integer unidadesDias;
    @Column(name = "Activo")
    private Boolean activo;
    @Column(name = "UserName")
    private String userName;
    @Column(name = "FechaVigenciaInicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVigenciaInicio;
    @Column(name = "FechaVigenciaFin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVigenciaFin;
    @Column(name = "UserNameCancelo")
    private String userNameCancelo;
    @Column(name = "FechaCancelo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCancelo;
    @Column(name = "TasaIVAId")
    private Integer tasaIVAId;
    @JoinColumn(name = "ShipperId", referencedColumnName = "MaritimeShippersId")
    @ManyToOne
    private CatMaritimeshippers shipperId;
    @JoinColumn(name = "TerminalId", referencedColumnName = "TerminalId")
    @ManyToOne
    private ImexTerminal terminalId;

    public ImexTarifaShipper() {
    }

    public ImexTarifaShipper(Integer tarifaShipperId) {
        this.tarifaShipperId = tarifaShipperId;
    }

    public Integer getTarifaShipperId() {
        return tarifaShipperId;
    }

    public void setTarifaShipperId(Integer tarifaShipperId) {
        this.tarifaShipperId = tarifaShipperId;
    }

    public Integer getTarifaId() {
        return tarifaId;
    }

    public void setTarifaId(Integer tarifaId) {
        this.tarifaId = tarifaId;
    }

    public Integer getUnidadesDias() {
        return unidadesDias;
    }

    public void setUnidadesDias(Integer unidadesDias) {
        this.unidadesDias = unidadesDias;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getFechaVigenciaInicio() {
        return fechaVigenciaInicio;
    }

    public void setFechaVigenciaInicio(Date fechaVigenciaInicio) {
        this.fechaVigenciaInicio = fechaVigenciaInicio;
    }

    public Date getFechaVigenciaFin() {
        return fechaVigenciaFin;
    }

    public void setFechaVigenciaFin(Date fechaVigenciaFin) {
        this.fechaVigenciaFin = fechaVigenciaFin;
    }

    public String getUserNameCancelo() {
        return userNameCancelo;
    }

    public void setUserNameCancelo(String userNameCancelo) {
        this.userNameCancelo = userNameCancelo;
    }

    public Date getFechaCancelo() {
        return fechaCancelo;
    }

    public void setFechaCancelo(Date fechaCancelo) {
        this.fechaCancelo = fechaCancelo;
    }

    public Integer getTasaIVAId() {
        return tasaIVAId;
    }

    public void setTasaIVAId(Integer tasaIVAId) {
        this.tasaIVAId = tasaIVAId;
    }

    public CatMaritimeshippers getShipperId() {
        return shipperId;
    }

    public void setShipperId(CatMaritimeshippers shipperId) {
        this.shipperId = shipperId;
    }

    public ImexTerminal getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(ImexTerminal terminalId) {
        this.terminalId = terminalId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tarifaShipperId != null ? tarifaShipperId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexTarifaShipper)) {
            return false;
        }
        ImexTarifaShipper other = (ImexTarifaShipper) object;
        if ((this.tarifaShipperId == null && other.tarifaShipperId != null) || (this.tarifaShipperId != null && !this.tarifaShipperId.equals(other.tarifaShipperId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexTarifaShipper[ tarifaShipperId=" + tarifaShipperId + " ]";
    }
    
}
