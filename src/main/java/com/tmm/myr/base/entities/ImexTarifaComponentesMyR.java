/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmm.myr.base.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "Imex_TarifaComponentes_MyR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexTarifaComponentesMyR.findAll", query = "SELECT i FROM ImexTarifaComponentesMyR i")
    , @NamedQuery(name = "ImexTarifaComponentesMyR.findByTabuladorId", query = "SELECT i FROM ImexTarifaComponentesMyR i WHERE i.tabuladorId = :tabuladorId")
    , @NamedQuery(name = "ImexTarifaComponentesMyR.findByTarifaId", query = "SELECT i FROM ImexTarifaComponentesMyR i WHERE i.tarifaId = :tarifaId")
    , @NamedQuery(name = "ImexTarifaComponentesMyR.findBySpecialRepairsId", query = "SELECT i FROM ImexTarifaComponentesMyR i WHERE i.specialRepairsId = :specialRepairsId")
    , @NamedQuery(name = "ImexTarifaComponentesMyR.findByJobCondCd", query = "SELECT i FROM ImexTarifaComponentesMyR i WHERE i.jobCondCd = :jobCondCd")
    , @NamedQuery(name = "ImexTarifaComponentesMyR.findByLabor", query = "SELECT i FROM ImexTarifaComponentesMyR i WHERE i.labor = :labor")
    , @NamedQuery(name = "ImexTarifaComponentesMyR.findByBaseMaterial", query = "SELECT i FROM ImexTarifaComponentesMyR i WHERE i.baseMaterial = :baseMaterial")
    , @NamedQuery(name = "ImexTarifaComponentesMyR.findByUserName", query = "SELECT i FROM ImexTarifaComponentesMyR i WHERE i.userName = :userName")
    , @NamedQuery(name = "ImexTarifaComponentesMyR.findByFechaAlta", query = "SELECT i FROM ImexTarifaComponentesMyR i WHERE i.fechaAlta = :fechaAlta")
    , @NamedQuery(name = "ImexTarifaComponentesMyR.findByFechaBaja", query = "SELECT i FROM ImexTarifaComponentesMyR i WHERE i.fechaBaja = :fechaBaja")
    , @NamedQuery(name = "ImexTarifaComponentesMyR.findByActivo", query = "SELECT i FROM ImexTarifaComponentesMyR i WHERE i.activo = :activo")
    , @NamedQuery(name = "ImexTarifaComponentesMyR.findByUserNameBaja", query = "SELECT i FROM ImexTarifaComponentesMyR i WHERE i.userNameBaja = :userNameBaja")
    , @NamedQuery(name = "ImexTarifaComponentesMyR.findByLength", query = "SELECT i FROM ImexTarifaComponentesMyR i WHERE i.length = :length")
    , @NamedQuery(name = "ImexTarifaComponentesMyR.findByWidth", query = "SELECT i FROM ImexTarifaComponentesMyR i WHERE i.width = :width")
    , @NamedQuery(name = "ImexTarifaComponentesMyR.findByUnitOfMeasureId", query = "SELECT i FROM ImexTarifaComponentesMyR i WHERE i.unitOfMeasureId = :unitOfMeasureId")})
public class ImexTarifaComponentesMyR implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TabuladorId")
    private Integer tabuladorId;
    @Basic(optional = false)
    @Column(name = "TarifaId")
    private int tarifaId;
    @Column(name = "SpecialRepairsId")
    private Integer specialRepairsId;
    @Column(name = "JobCondCd")
    private String jobCondCd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Labor")
    private BigDecimal labor;
    @Column(name = "BaseMaterial")
    private BigDecimal baseMaterial;
    @Column(name = "UserName")
    private String userName;
    @Column(name = "FechaAlta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "FechaBaja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;
    @Column(name = "Activo")
    private Boolean activo;
    @Column(name = "UserNameBaja")
    private String userNameBaja;
    @Column(name = "Length")
    private String length;
    @Column(name = "Width")
    private String width;
    @Column(name = "UnitOfMeasureId")
    private Integer unitOfMeasureId;
    @JoinColumn(name = "EIRComponentId", referencedColumnName = "EIRComponentId")
    @ManyToOne
    private ImexEirComponents eIRComponentId;
    @JoinColumn(name = "EIRRepairdId", referencedColumnName = "EIRRepairId")
    @ManyToOne
    private ImexEirRepair eIRRepairdId;

    public ImexTarifaComponentesMyR() {
    }

    public ImexTarifaComponentesMyR(Integer tabuladorId) {
        this.tabuladorId = tabuladorId;
    }

    public ImexTarifaComponentesMyR(Integer tabuladorId, int tarifaId) {
        this.tabuladorId = tabuladorId;
        this.tarifaId = tarifaId;
    }

    public Integer getTabuladorId() {
        return tabuladorId;
    }

    public void setTabuladorId(Integer tabuladorId) {
        this.tabuladorId = tabuladorId;
    }

    public int getTarifaId() {
        return tarifaId;
    }

    public void setTarifaId(int tarifaId) {
        this.tarifaId = tarifaId;
    }

    public Integer getSpecialRepairsId() {
        return specialRepairsId;
    }

    public void setSpecialRepairsId(Integer specialRepairsId) {
        this.specialRepairsId = specialRepairsId;
    }

    public String getJobCondCd() {
        return jobCondCd;
    }

    public void setJobCondCd(String jobCondCd) {
        this.jobCondCd = jobCondCd;
    }

    public BigDecimal getLabor() {
        return labor;
    }

    public void setLabor(BigDecimal labor) {
        this.labor = labor;
    }

    public BigDecimal getBaseMaterial() {
        return baseMaterial;
    }

    public void setBaseMaterial(BigDecimal baseMaterial) {
        this.baseMaterial = baseMaterial;
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

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getUserNameBaja() {
        return userNameBaja;
    }

    public void setUserNameBaja(String userNameBaja) {
        this.userNameBaja = userNameBaja;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public Integer getUnitOfMeasureId() {
        return unitOfMeasureId;
    }

    public void setUnitOfMeasureId(Integer unitOfMeasureId) {
        this.unitOfMeasureId = unitOfMeasureId;
    }

    public ImexEirComponents getEIRComponentId() {
        return eIRComponentId;
    }

    public void setEIRComponentId(ImexEirComponents eIRComponentId) {
        this.eIRComponentId = eIRComponentId;
    }

    public ImexEirRepair getEIRRepairdId() {
        return eIRRepairdId;
    }

    public void setEIRRepairdId(ImexEirRepair eIRRepairdId) {
        this.eIRRepairdId = eIRRepairdId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tabuladorId != null ? tabuladorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexTarifaComponentesMyR)) {
            return false;
        }
        ImexTarifaComponentesMyR other = (ImexTarifaComponentesMyR) object;
        if ((this.tabuladorId == null && other.tabuladorId != null) || (this.tabuladorId != null && !this.tabuladorId.equals(other.tabuladorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexTarifaComponentesMyR[ tabuladorId=" + tabuladorId + " ]";
    }
    
}
