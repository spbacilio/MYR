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
@Table(name = "Imex_Rel_PhotoContainer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexRelPhotoContainer.findAll", query = "SELECT i FROM ImexRelPhotoContainer i")
    , @NamedQuery(name = "ImexRelPhotoContainer.findByRelationId", query = "SELECT i FROM ImexRelPhotoContainer i WHERE i.relationId = :relationId")
    , @NamedQuery(name = "ImexRelPhotoContainer.findByContainerGuid", query = "SELECT i FROM ImexRelPhotoContainer i WHERE i.containerGuid = :containerGuid")})
public class ImexRelPhotoContainer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RelationId")
    private Integer relationId;
    @Column(name = "ContainerGuid")
    private String containerGuid;
    @JoinColumn(name = "ContainerId", referencedColumnName = "ContainerId")
    @ManyToOne
    private ImexContainer containerId;

    public ImexRelPhotoContainer() {
    }

    public ImexRelPhotoContainer(Integer relationId) {
        this.relationId = relationId;
    }

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    public String getContainerGuid() {
        return containerGuid;
    }

    public void setContainerGuid(String containerGuid) {
        this.containerGuid = containerGuid;
    }

    public ImexContainer getContainerId() {
        return containerId;
    }

    public void setContainerId(ImexContainer containerId) {
        this.containerId = containerId;
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
        if (!(object instanceof ImexRelPhotoContainer)) {
            return false;
        }
        ImexRelPhotoContainer other = (ImexRelPhotoContainer) object;
        if ((this.relationId == null && other.relationId != null) || (this.relationId != null && !this.relationId.equals(other.relationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexRelPhotoContainer[ relationId=" + relationId + " ]";
    }
    
}
