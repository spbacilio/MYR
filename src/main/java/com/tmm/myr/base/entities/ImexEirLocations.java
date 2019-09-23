/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmm.myr.base.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "Imex_Eir_Locations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexEirLocations.findAll", query = "SELECT i FROM ImexEirLocations i")
    , @NamedQuery(name = "ImexEirLocations.findByEIRLocationId", query = "SELECT i FROM ImexEirLocations i WHERE i.eIRLocationId = :eIRLocationId")
    , @NamedQuery(name = "ImexEirLocations.findByLocation", query = "SELECT i FROM ImexEirLocations i WHERE i.location = :location")
    , @NamedQuery(name = "ImexEirLocations.findByType", query = "SELECT i FROM ImexEirLocations i WHERE i.type = :type")
    , @NamedQuery(name = "ImexEirLocations.findByAARCode", query = "SELECT i FROM ImexEirLocations i WHERE i.aARCode = :aARCode")
    , @NamedQuery(name = "ImexEirLocations.findByLocationEN", query = "SELECT i FROM ImexEirLocations i WHERE i.locationEN = :locationEN")
    , @NamedQuery(name = "ImexEirLocations.findByIsActive", query = "SELECT i FROM ImexEirLocations i WHERE i.isActive = :isActive")})
public class ImexEirLocations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EIRLocationId")
    private Integer eIRLocationId;
    @Column(name = "Location")
    private String location;
    @Column(name = "Type")
    private String type;
    @Column(name = "AARCode")
    private String aARCode;
    @Column(name = "LocationEN")
    private String locationEN;
    @Basic(optional = false)
    @Column(name = "IsActive")
    private boolean isActive;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eIRLocationId")
    private Collection<ImexRelLocations> imexRelLocationsCollection;
    @JoinColumn(name = "EIRTypeId", referencedColumnName = "EIRTypeId")
    @ManyToOne(optional = false)
    private ImexEirType eIRTypeId;

    public ImexEirLocations() {
    }

    public ImexEirLocations(Integer eIRLocationId) {
        this.eIRLocationId = eIRLocationId;
    }

    public ImexEirLocations(Integer eIRLocationId, boolean isActive) {
        this.eIRLocationId = eIRLocationId;
        this.isActive = isActive;
    }

    public Integer getEIRLocationId() {
        return eIRLocationId;
    }

    public void setEIRLocationId(Integer eIRLocationId) {
        this.eIRLocationId = eIRLocationId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAARCode() {
        return aARCode;
    }

    public void setAARCode(String aARCode) {
        this.aARCode = aARCode;
    }

    public String getLocationEN() {
        return locationEN;
    }

    public void setLocationEN(String locationEN) {
        this.locationEN = locationEN;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @XmlTransient
    public Collection<ImexRelLocations> getImexRelLocationsCollection() {
        return imexRelLocationsCollection;
    }

    public void setImexRelLocationsCollection(Collection<ImexRelLocations> imexRelLocationsCollection) {
        this.imexRelLocationsCollection = imexRelLocationsCollection;
    }

    public ImexEirType getEIRTypeId() {
        return eIRTypeId;
    }

    public void setEIRTypeId(ImexEirType eIRTypeId) {
        this.eIRTypeId = eIRTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eIRLocationId != null ? eIRLocationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexEirLocations)) {
            return false;
        }
        ImexEirLocations other = (ImexEirLocations) object;
        if ((this.eIRLocationId == null && other.eIRLocationId != null) || (this.eIRLocationId != null && !this.eIRLocationId.equals(other.eIRLocationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexEirLocations[ eIRLocationId=" + eIRLocationId + " ]";
    }
    
}
