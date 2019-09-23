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
@Table(name = "Imex_UnitOfMeasure")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexUnitOfMeasure.findAll", query = "SELECT i FROM ImexUnitOfMeasure i")
    , @NamedQuery(name = "ImexUnitOfMeasure.findByUnitOfMeasureId", query = "SELECT i FROM ImexUnitOfMeasure i WHERE i.unitOfMeasureId = :unitOfMeasureId")
    , @NamedQuery(name = "ImexUnitOfMeasure.findByUnitOfMeasure", query = "SELECT i FROM ImexUnitOfMeasure i WHERE i.unitOfMeasure = :unitOfMeasure")
    , @NamedQuery(name = "ImexUnitOfMeasure.findByActive", query = "SELECT i FROM ImexUnitOfMeasure i WHERE i.active = :active")})
public class ImexUnitOfMeasure implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "UnitOfMeasureId")
    private Integer unitOfMeasureId;
    @Column(name = "UnitOfMeasure")
    private String unitOfMeasure;
    @Column(name = "Active")
    private Boolean active;

    public ImexUnitOfMeasure() {
    }

    public ImexUnitOfMeasure(Integer unitOfMeasureId) {
        this.unitOfMeasureId = unitOfMeasureId;
    }

    public Integer getUnitOfMeasureId() {
        return unitOfMeasureId;
    }

    public void setUnitOfMeasureId(Integer unitOfMeasureId) {
        this.unitOfMeasureId = unitOfMeasureId;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (unitOfMeasureId != null ? unitOfMeasureId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexUnitOfMeasure)) {
            return false;
        }
        ImexUnitOfMeasure other = (ImexUnitOfMeasure) object;
        if ((this.unitOfMeasureId == null && other.unitOfMeasureId != null) || (this.unitOfMeasureId != null && !this.unitOfMeasureId.equals(other.unitOfMeasureId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexUnitOfMeasure[ unitOfMeasureId=" + unitOfMeasureId + " ]";
    }
    
}
