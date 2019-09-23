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
@Table(name = "Imex_Rel_PhotoChassis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexRelPhotoChassis.findAll", query = "SELECT i FROM ImexRelPhotoChassis i")
    , @NamedQuery(name = "ImexRelPhotoChassis.findByRelationId", query = "SELECT i FROM ImexRelPhotoChassis i WHERE i.relationId = :relationId")
    , @NamedQuery(name = "ImexRelPhotoChassis.findByChassisGuid", query = "SELECT i FROM ImexRelPhotoChassis i WHERE i.chassisGuid = :chassisGuid")})
public class ImexRelPhotoChassis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RelationId")
    private Integer relationId;
    @Column(name = "ChassisGuid")
    private String chassisGuid;
    @JoinColumn(name = "ChassisId", referencedColumnName = "ChassisId")
    @ManyToOne
    private ImexChassis chassisId;

    public ImexRelPhotoChassis() {
    }

    public ImexRelPhotoChassis(Integer relationId) {
        this.relationId = relationId;
    }

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    public String getChassisGuid() {
        return chassisGuid;
    }

    public void setChassisGuid(String chassisGuid) {
        this.chassisGuid = chassisGuid;
    }

    public ImexChassis getChassisId() {
        return chassisId;
    }

    public void setChassisId(ImexChassis chassisId) {
        this.chassisId = chassisId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (relationId != null ? relationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexRelPhotoChassis)) {
            return false;
        }
        ImexRelPhotoChassis other = (ImexRelPhotoChassis) object;
        if ((this.relationId == null && other.relationId != null) || (this.relationId != null && !this.relationId.equals(other.relationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexRelPhotoChassis[ relationId=" + relationId + " ]";
    }
    
}
