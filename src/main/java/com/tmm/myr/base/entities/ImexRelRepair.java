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
@Table(name = "Imex_Rel_Repair")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexRelRepair.findAll", query = "SELECT i FROM ImexRelRepair i")
    , @NamedQuery(name = "ImexRelRepair.findByRelRepairId", query = "SELECT i FROM ImexRelRepair i WHERE i.relRepairId = :relRepairId")
    , @NamedQuery(name = "ImexRelRepair.findByEIRComponentId", query = "SELECT i FROM ImexRelRepair i WHERE i.eIRComponentId = :eIRComponentId")
    , @NamedQuery(name = "ImexRelRepair.findByEIRDamageId", query = "SELECT i FROM ImexRelRepair i WHERE i.eIRDamageId = :eIRDamageId")
    , @NamedQuery(name = "ImexRelRepair.findByEIRRepairId", query = "SELECT i FROM ImexRelRepair i WHERE i.eIRRepairId = :eIRRepairId")
    , @NamedQuery(name = "ImexRelRepair.findByStatusRelRepair", query = "SELECT i FROM ImexRelRepair i WHERE i.statusRelRepair = :statusRelRepair")})
public class ImexRelRepair implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RelRepairId")
    private Integer relRepairId;
    @Basic(optional = false)
    @Column(name = "EIRComponentId")
    private int eIRComponentId;
    @Basic(optional = false)
    @Column(name = "EIRDamageId")
    private int eIRDamageId;
    @Basic(optional = false)
    @Column(name = "EIRRepairId")
    private int eIRRepairId;
    @Basic(optional = false)
    @Column(name = "statusRelRepair")
    private int statusRelRepair;

    public ImexRelRepair() {
    }

    public ImexRelRepair(Integer relRepairId) {
        this.relRepairId = relRepairId;
    }

    public ImexRelRepair(Integer relRepairId, int eIRComponentId, int eIRDamageId, int eIRRepairId, int statusRelRepair) {
        this.relRepairId = relRepairId;
        this.eIRComponentId = eIRComponentId;
        this.eIRDamageId = eIRDamageId;
        this.eIRRepairId = eIRRepairId;
        this.statusRelRepair = statusRelRepair;
    }

    public Integer getRelRepairId() {
        return relRepairId;
    }

    public void setRelRepairId(Integer relRepairId) {
        this.relRepairId = relRepairId;
    }

    public int getEIRComponentId() {
        return eIRComponentId;
    }

    public void setEIRComponentId(int eIRComponentId) {
        this.eIRComponentId = eIRComponentId;
    }

    public int getEIRDamageId() {
        return eIRDamageId;
    }

    public void setEIRDamageId(int eIRDamageId) {
        this.eIRDamageId = eIRDamageId;
    }

    public int getEIRRepairId() {
        return eIRRepairId;
    }

    public void setEIRRepairId(int eIRRepairId) {
        this.eIRRepairId = eIRRepairId;
    }

    public int getStatusRelRepair() {
        return statusRelRepair;
    }

    public void setStatusRelRepair(int statusRelRepair) {
        this.statusRelRepair = statusRelRepair;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (relRepairId != null ? relRepairId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexRelRepair)) {
            return false;
        }
        ImexRelRepair other = (ImexRelRepair) object;
        if ((this.relRepairId == null && other.relRepairId != null) || (this.relRepairId != null && !this.relRepairId.equals(other.relRepairId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexRelRepair[ relRepairId=" + relRepairId + " ]";
    }
    
}
