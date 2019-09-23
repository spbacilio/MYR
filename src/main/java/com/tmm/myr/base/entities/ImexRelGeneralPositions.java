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
@Table(name = "Imex_Rel_General_Positions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexRelGeneralPositions.findAll", query = "SELECT i FROM ImexRelGeneralPositions i")
    , @NamedQuery(name = "ImexRelGeneralPositions.findByRelGeneralPositionId", query = "SELECT i FROM ImexRelGeneralPositions i WHERE i.relGeneralPositionId = :relGeneralPositionId")
    , @NamedQuery(name = "ImexRelGeneralPositions.findByStatusRelGeneralPositions", query = "SELECT i FROM ImexRelGeneralPositions i WHERE i.statusRelGeneralPositions = :statusRelGeneralPositions")})
public class ImexRelGeneralPositions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RelGeneralPositionId")
    private Integer relGeneralPositionId;
    @Basic(optional = false)
    @Column(name = "statusRelGeneralPositions")
    private int statusRelGeneralPositions;
    @JoinColumn(name = "EIRComponentId", referencedColumnName = "EIRComponentId")
    @ManyToOne(optional = false)
    private ImexEirComponents eIRComponentId;
    @JoinColumn(name = "EIRGeneralPositionId", referencedColumnName = "EIRGeneralPositionId")
    @ManyToOne(optional = false)
    private ImexEirGeneralPositions eIRGeneralPositionId;

    public ImexRelGeneralPositions() {
    }

    public ImexRelGeneralPositions(Integer relGeneralPositionId) {
        this.relGeneralPositionId = relGeneralPositionId;
    }

    public ImexRelGeneralPositions(Integer relGeneralPositionId, int statusRelGeneralPositions) {
        this.relGeneralPositionId = relGeneralPositionId;
        this.statusRelGeneralPositions = statusRelGeneralPositions;
    }

    public Integer getRelGeneralPositionId() {
        return relGeneralPositionId;
    }

    public void setRelGeneralPositionId(Integer relGeneralPositionId) {
        this.relGeneralPositionId = relGeneralPositionId;
    }

    public int getStatusRelGeneralPositions() {
        return statusRelGeneralPositions;
    }

    public void setStatusRelGeneralPositions(int statusRelGeneralPositions) {
        this.statusRelGeneralPositions = statusRelGeneralPositions;
    }

    public ImexEirComponents getEIRComponentId() {
        return eIRComponentId;
    }

    public void setEIRComponentId(ImexEirComponents eIRComponentId) {
        this.eIRComponentId = eIRComponentId;
    }

    public ImexEirGeneralPositions getEIRGeneralPositionId() {
        return eIRGeneralPositionId;
    }

    public void setEIRGeneralPositionId(ImexEirGeneralPositions eIRGeneralPositionId) {
        this.eIRGeneralPositionId = eIRGeneralPositionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (relGeneralPositionId != null ? relGeneralPositionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexRelGeneralPositions)) {
            return false;
        }
        ImexRelGeneralPositions other = (ImexRelGeneralPositions) object;
        if ((this.relGeneralPositionId == null && other.relGeneralPositionId != null) || (this.relGeneralPositionId != null && !this.relGeneralPositionId.equals(other.relGeneralPositionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexRelGeneralPositions[ relGeneralPositionId=" + relGeneralPositionId + " ]";
    }
    
}
