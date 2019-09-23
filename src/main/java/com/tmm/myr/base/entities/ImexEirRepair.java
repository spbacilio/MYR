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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Imex_Eir_Repair")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexEirRepair.findAll", query = "SELECT i FROM ImexEirRepair i")
    , @NamedQuery(name = "ImexEirRepair.findByEIRRepairId", query = "SELECT i FROM ImexEirRepair i WHERE i.eIRRepairId = :eIRRepairId")
    , @NamedQuery(name = "ImexEirRepair.findByRepair", query = "SELECT i FROM ImexEirRepair i WHERE i.repair = :repair")
    , @NamedQuery(name = "ImexEirRepair.findByAARCode", query = "SELECT i FROM ImexEirRepair i WHERE i.aARCode = :aARCode")
    , @NamedQuery(name = "ImexEirRepair.findByRepairEN", query = "SELECT i FROM ImexEirRepair i WHERE i.repairEN = :repairEN")
    , @NamedQuery(name = "ImexEirRepair.findByIsActive", query = "SELECT i FROM ImexEirRepair i WHERE i.isActive = :isActive")})
public class ImexEirRepair implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EIRRepairId")
    private Integer eIRRepairId;
    @Column(name = "Repair")
    private String repair;
    @Column(name = "AARCode")
    private String aARCode;
    @Column(name = "RepairEN")
    private String repairEN;
    @Basic(optional = false)
    @Column(name = "IsActive")
    private boolean isActive;
    @JoinColumn(name = "EIRTypeId", referencedColumnName = "EIRTypeId")
    @ManyToOne
    private ImexEirType eIRTypeId;
    @OneToMany(mappedBy = "eIRRepairdId")
    private Collection<ImexTarifaComponentesMyR> imexTarifaComponentesMyRCollection;

    public ImexEirRepair() {
    }

    public ImexEirRepair(Integer eIRRepairId) {
        this.eIRRepairId = eIRRepairId;
    }

    public ImexEirRepair(Integer eIRRepairId, boolean isActive) {
        this.eIRRepairId = eIRRepairId;
        this.isActive = isActive;
    }

    public Integer getEIRRepairId() {
        return eIRRepairId;
    }

    public void setEIRRepairId(Integer eIRRepairId) {
        this.eIRRepairId = eIRRepairId;
    }

    public String getRepair() {
        return repair;
    }

    public void setRepair(String repair) {
        this.repair = repair;
    }

    public String getAARCode() {
        return aARCode;
    }

    public void setAARCode(String aARCode) {
        this.aARCode = aARCode;
    }

    public String getRepairEN() {
        return repairEN;
    }

    public void setRepairEN(String repairEN) {
        this.repairEN = repairEN;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public ImexEirType getEIRTypeId() {
        return eIRTypeId;
    }

    public void setEIRTypeId(ImexEirType eIRTypeId) {
        this.eIRTypeId = eIRTypeId;
    }

    @XmlTransient
    public Collection<ImexTarifaComponentesMyR> getImexTarifaComponentesMyRCollection() {
        return imexTarifaComponentesMyRCollection;
    }

    public void setImexTarifaComponentesMyRCollection(Collection<ImexTarifaComponentesMyR> imexTarifaComponentesMyRCollection) {
        this.imexTarifaComponentesMyRCollection = imexTarifaComponentesMyRCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eIRRepairId != null ? eIRRepairId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexEirRepair)) {
            return false;
        }
        ImexEirRepair other = (ImexEirRepair) object;
        if ((this.eIRRepairId == null && other.eIRRepairId != null) || (this.eIRRepairId != null && !this.eIRRepairId.equals(other.eIRRepairId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexEirRepair[ eIRRepairId=" + eIRRepairId + " ]";
    }
    
}
