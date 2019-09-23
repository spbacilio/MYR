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
@Table(name = "Imex_Eir_Status_Repairs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexEirStatusRepairs.findAll", query = "SELECT i FROM ImexEirStatusRepairs i")
    , @NamedQuery(name = "ImexEirStatusRepairs.findByStatusRepairId", query = "SELECT i FROM ImexEirStatusRepairs i WHERE i.statusRepairId = :statusRepairId")
    , @NamedQuery(name = "ImexEirStatusRepairs.findByStatus", query = "SELECT i FROM ImexEirStatusRepairs i WHERE i.status = :status")})
public class ImexEirStatusRepairs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "statusRepairId")
    private Integer statusRepairId;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;

    public ImexEirStatusRepairs() {
    }

    public ImexEirStatusRepairs(Integer statusRepairId) {
        this.statusRepairId = statusRepairId;
    }

    public ImexEirStatusRepairs(Integer statusRepairId, String status) {
        this.statusRepairId = statusRepairId;
        this.status = status;
    }

    public Integer getStatusRepairId() {
        return statusRepairId;
    }

    public void setStatusRepairId(Integer statusRepairId) {
        this.statusRepairId = statusRepairId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (statusRepairId != null ? statusRepairId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexEirStatusRepairs)) {
            return false;
        }
        ImexEirStatusRepairs other = (ImexEirStatusRepairs) object;
        if ((this.statusRepairId == null && other.statusRepairId != null) || (this.statusRepairId != null && !this.statusRepairId.equals(other.statusRepairId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexEirStatusRepairs[ statusRepairId=" + statusRepairId + " ]";
    }
    
}
