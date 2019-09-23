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
@Table(name = "Imex_Rel_Locations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexRelLocations.findAll", query = "SELECT i FROM ImexRelLocations i")
    , @NamedQuery(name = "ImexRelLocations.findByRelLocationId", query = "SELECT i FROM ImexRelLocations i WHERE i.relLocationId = :relLocationId")
    , @NamedQuery(name = "ImexRelLocations.findByStatusRelLocations", query = "SELECT i FROM ImexRelLocations i WHERE i.statusRelLocations = :statusRelLocations")})
public class ImexRelLocations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RelLocationId")
    private Integer relLocationId;
    @Basic(optional = false)
    @Column(name = "statusRelLocations")
    private int statusRelLocations;
    @JoinColumn(name = "EIRComponentId", referencedColumnName = "EIRComponentId")
    @ManyToOne(optional = false)
    private ImexEirComponents eIRComponentId;
    @JoinColumn(name = "EIRGeneralPositionId", referencedColumnName = "EIRGeneralPositionId")
    @ManyToOne(optional = false)
    private ImexEirGeneralPositions eIRGeneralPositionId;
    @JoinColumn(name = "EIRLocationId", referencedColumnName = "EIRLocationId")
    @ManyToOne(optional = false)
    private ImexEirLocations eIRLocationId;

    public ImexRelLocations() {
    }

    public ImexRelLocations(Integer relLocationId) {
        this.relLocationId = relLocationId;
    }

    public ImexRelLocations(Integer relLocationId, int statusRelLocations) {
        this.relLocationId = relLocationId;
        this.statusRelLocations = statusRelLocations;
    }

    public Integer getRelLocationId() {
        return relLocationId;
    }

    public void setRelLocationId(Integer relLocationId) {
        this.relLocationId = relLocationId;
    }

    public int getStatusRelLocations() {
        return statusRelLocations;
    }

    public void setStatusRelLocations(int statusRelLocations) {
        this.statusRelLocations = statusRelLocations;
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

    public ImexEirLocations getEIRLocationId() {
        return eIRLocationId;
    }

    public void setEIRLocationId(ImexEirLocations eIRLocationId) {
        this.eIRLocationId = eIRLocationId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (relLocationId != null ? relLocationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexRelLocations)) {
            return false;
        }
        ImexRelLocations other = (ImexRelLocations) object;
        if ((this.relLocationId == null && other.relLocationId != null) || (this.relLocationId != null && !this.relLocationId.equals(other.relLocationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexRelLocations[ relLocationId=" + relLocationId + " ]";
    }
    
}
