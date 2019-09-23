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
@Table(name = "Imex_Chassis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexChassis.findAll", query = "SELECT i FROM ImexChassis i")
    , @NamedQuery(name = "ImexChassis.findByChassisId", query = "SELECT i FROM ImexChassis i WHERE i.chassisId = :chassisId")
    , @NamedQuery(name = "ImexChassis.findByChassis", query = "SELECT i FROM ImexChassis i WHERE i.chassis = :chassis")})
public class ImexChassis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ChassisId")
    private Integer chassisId;
    @Column(name = "Chassis")
    private String chassis;
    @OneToMany(mappedBy = "chassisId")
    private Collection<ImexRelPhotoChassis> imexRelPhotoChassisCollection;

    public ImexChassis() {
    }

    public ImexChassis(Integer chassisId) {
        this.chassisId = chassisId;
    }

    public Integer getChassisId() {
        return chassisId;
    }

    public void setChassisId(Integer chassisId) {
        this.chassisId = chassisId;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    @XmlTransient
    public Collection<ImexRelPhotoChassis> getImexRelPhotoChassisCollection() {
        return imexRelPhotoChassisCollection;
    }

    public void setImexRelPhotoChassisCollection(Collection<ImexRelPhotoChassis> imexRelPhotoChassisCollection) {
        this.imexRelPhotoChassisCollection = imexRelPhotoChassisCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chassisId != null ? chassisId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexChassis)) {
            return false;
        }
        ImexChassis other = (ImexChassis) object;
        if ((this.chassisId == null && other.chassisId != null) || (this.chassisId != null && !this.chassisId.equals(other.chassisId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexChassis[ chassisId=" + chassisId + " ]";
    }
    
}
