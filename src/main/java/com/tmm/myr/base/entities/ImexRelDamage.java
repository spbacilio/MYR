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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bacil
 */
@Entity
@Table(name = "Imex_Rel_Damage")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexRelDamage.findAll", query = "SELECT i FROM ImexRelDamage i")
    , @NamedQuery(name = "ImexRelDamage.findByRelDamageId", query = "SELECT i FROM ImexRelDamage i WHERE i.relDamageId = :relDamageId")
    , @NamedQuery(name = "ImexRelDamage.findByStatusRelDamage", query = "SELECT i FROM ImexRelDamage i WHERE i.statusRelDamage = :statusRelDamage")})
public class ImexRelDamage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RelDamageId")
    private Integer relDamageId;
    @Basic(optional = false)
    @Column(name = "statusRelDamage")
    private int statusRelDamage;
    @JoinColumn(name = "EIRComponentId", referencedColumnName = "EIRComponentId")
    @ManyToOne(optional = false)
    private ImexEirComponents eIRComponentId;
    @JoinColumn(name = "EIRDamageId", referencedColumnName = "EIRDamageId")
    @ManyToOne(optional = false)
    private ImexEirDamage eIRDamageId;

    public ImexRelDamage() {
    }

    public ImexRelDamage(Integer relDamageId) {
        this.relDamageId = relDamageId;
    }

    public ImexRelDamage(Integer relDamageId, int statusRelDamage) {
        this.relDamageId = relDamageId;
        this.statusRelDamage = statusRelDamage;
    }

    public Integer getRelDamageId() {
        return relDamageId;
    }

    public void setRelDamageId(Integer relDamageId) {
        this.relDamageId = relDamageId;
    }

    public int getStatusRelDamage() {
        return statusRelDamage;
    }

    public void setStatusRelDamage(int statusRelDamage) {
        this.statusRelDamage = statusRelDamage;
    }

    public ImexEirComponents getEIRComponentId() {
        return eIRComponentId;
    }

    public void setEIRComponentId(ImexEirComponents eIRComponentId) {
        this.eIRComponentId = eIRComponentId;
    }

    public ImexEirDamage getEIRDamageId() {
        return eIRDamageId;
    }

    public void setEIRDamageId(ImexEirDamage eIRDamageId) {
        this.eIRDamageId = eIRDamageId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (relDamageId != null ? relDamageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexRelDamage)) {
            return false;
        }
        ImexRelDamage other = (ImexRelDamage) object;
        if ((this.relDamageId == null && other.relDamageId != null) || (this.relDamageId != null && !this.relDamageId.equals(other.relDamageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexRelDamage[ relDamageId=" + relDamageId + " ]";
    }
    
}
