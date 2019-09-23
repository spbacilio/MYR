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
@Table(name = "Imex_Eir_Type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexEirType.findAll", query = "SELECT i FROM ImexEirType i")
    , @NamedQuery(name = "ImexEirType.findByEIRTypeId", query = "SELECT i FROM ImexEirType i WHERE i.eIRTypeId = :eIRTypeId")
    , @NamedQuery(name = "ImexEirType.findByEIRType", query = "SELECT i FROM ImexEirType i WHERE i.eIRType = :eIRType")})
public class ImexEirType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EIRTypeId")
    private Integer eIRTypeId;
    @Column(name = "EIRType")
    private String eIRType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eIRTypeId")
    private Collection<ImexEirComponents> imexEirComponentsCollection;
    @OneToMany(mappedBy = "eIRTypeId")
    private Collection<ImexEirRepair> imexEirRepairCollection;
    @OneToMany(mappedBy = "eIRTypeId")
    private Collection<ImexEirGeneralPositions> imexEirGeneralPositionsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eIRTypeId")
    private Collection<ImexEirLocations> imexEirLocationsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eIRTypeId")
    private Collection<ImexEirDamage> imexEirDamageCollection;

    public ImexEirType() {
    }

    public ImexEirType(Integer eIRTypeId) {
        this.eIRTypeId = eIRTypeId;
    }

    public Integer getEIRTypeId() {
        return eIRTypeId;
    }

    public void setEIRTypeId(Integer eIRTypeId) {
        this.eIRTypeId = eIRTypeId;
    }

    public String getEIRType() {
        return eIRType;
    }

    public void setEIRType(String eIRType) {
        this.eIRType = eIRType;
    }

    @XmlTransient
    public Collection<ImexEirComponents> getImexEirComponentsCollection() {
        return imexEirComponentsCollection;
    }

    public void setImexEirComponentsCollection(Collection<ImexEirComponents> imexEirComponentsCollection) {
        this.imexEirComponentsCollection = imexEirComponentsCollection;
    }

    @XmlTransient
    public Collection<ImexEirRepair> getImexEirRepairCollection() {
        return imexEirRepairCollection;
    }

    public void setImexEirRepairCollection(Collection<ImexEirRepair> imexEirRepairCollection) {
        this.imexEirRepairCollection = imexEirRepairCollection;
    }

    @XmlTransient
    public Collection<ImexEirGeneralPositions> getImexEirGeneralPositionsCollection() {
        return imexEirGeneralPositionsCollection;
    }

    public void setImexEirGeneralPositionsCollection(Collection<ImexEirGeneralPositions> imexEirGeneralPositionsCollection) {
        this.imexEirGeneralPositionsCollection = imexEirGeneralPositionsCollection;
    }

    @XmlTransient
    public Collection<ImexEirLocations> getImexEirLocationsCollection() {
        return imexEirLocationsCollection;
    }

    public void setImexEirLocationsCollection(Collection<ImexEirLocations> imexEirLocationsCollection) {
        this.imexEirLocationsCollection = imexEirLocationsCollection;
    }

    @XmlTransient
    public Collection<ImexEirDamage> getImexEirDamageCollection() {
        return imexEirDamageCollection;
    }

    public void setImexEirDamageCollection(Collection<ImexEirDamage> imexEirDamageCollection) {
        this.imexEirDamageCollection = imexEirDamageCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eIRTypeId != null ? eIRTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexEirType)) {
            return false;
        }
        ImexEirType other = (ImexEirType) object;
        if ((this.eIRTypeId == null && other.eIRTypeId != null) || (this.eIRTypeId != null && !this.eIRTypeId.equals(other.eIRTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexEirType[ eIRTypeId=" + eIRTypeId + " ]";
    }
    
}
