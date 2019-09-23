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
@Table(name = "Imex_MyR_Repairs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexMyRRepairs.findAll", query = "SELECT i FROM ImexMyRRepairs i")
    , @NamedQuery(name = "ImexMyRRepairs.findByMyRRepairId", query = "SELECT i FROM ImexMyRRepairs i WHERE i.myRRepairId = :myRRepairId")
    , @NamedQuery(name = "ImexMyRRepairs.findByEIRRepairId", query = "SELECT i FROM ImexMyRRepairs i WHERE i.eIRRepairId = :eIRRepairId")
    , @NamedQuery(name = "ImexMyRRepairs.findByStatusRepair", query = "SELECT i FROM ImexMyRRepairs i WHERE i.statusRepair = :statusRepair")
    , @NamedQuery(name = "ImexMyRRepairs.findByTabuladorId", query = "SELECT i FROM ImexMyRRepairs i WHERE i.tabuladorId = :tabuladorId")
    , @NamedQuery(name = "ImexMyRRepairs.findBySpecialRepairsId", query = "SELECT i FROM ImexMyRRepairs i WHERE i.specialRepairsId = :specialRepairsId")})
public class ImexMyRRepairs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MyRRepairId")
    private Integer myRRepairId;
    @Basic(optional = false)
    @Column(name = "EIRRepairId")
    private int eIRRepairId;
    @Basic(optional = false)
    @Column(name = "statusRepair")
    private int statusRepair;
    @Column(name = "TabuladorId")
    private Integer tabuladorId;
    @Column(name = "SpecialRepairsId")
    private Integer specialRepairsId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "myRRepairId")
    private Collection<ImexMyRRepairsPhoto> imexMyRRepairsPhotoCollection;
    @JoinColumn(name = "MyRDetailId", referencedColumnName = "MyRDetailId")
    @ManyToOne(optional = false)
    private ImexMyRDetails myRDetailId;

    public ImexMyRRepairs() {
    }

    public ImexMyRRepairs(Integer myRRepairId) {
        this.myRRepairId = myRRepairId;
    }

    public ImexMyRRepairs(Integer myRRepairId, int eIRRepairId, int statusRepair) {
        this.myRRepairId = myRRepairId;
        this.eIRRepairId = eIRRepairId;
        this.statusRepair = statusRepair;
    }

    public Integer getMyRRepairId() {
        return myRRepairId;
    }

    public void setMyRRepairId(Integer myRRepairId) {
        this.myRRepairId = myRRepairId;
    }

    public int getEIRRepairId() {
        return eIRRepairId;
    }

    public void setEIRRepairId(int eIRRepairId) {
        this.eIRRepairId = eIRRepairId;
    }

    public int getStatusRepair() {
        return statusRepair;
    }

    public void setStatusRepair(int statusRepair) {
        this.statusRepair = statusRepair;
    }

    public Integer getTabuladorId() {
        return tabuladorId;
    }

    public void setTabuladorId(Integer tabuladorId) {
        this.tabuladorId = tabuladorId;
    }

    public Integer getSpecialRepairsId() {
        return specialRepairsId;
    }

    public void setSpecialRepairsId(Integer specialRepairsId) {
        this.specialRepairsId = specialRepairsId;
    }

    @XmlTransient
    public Collection<ImexMyRRepairsPhoto> getImexMyRRepairsPhotoCollection() {
        return imexMyRRepairsPhotoCollection;
    }

    public void setImexMyRRepairsPhotoCollection(Collection<ImexMyRRepairsPhoto> imexMyRRepairsPhotoCollection) {
        this.imexMyRRepairsPhotoCollection = imexMyRRepairsPhotoCollection;
    }

    public ImexMyRDetails getMyRDetailId() {
        return myRDetailId;
    }

    public void setMyRDetailId(ImexMyRDetails myRDetailId) {
        this.myRDetailId = myRDetailId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (myRRepairId != null ? myRRepairId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexMyRRepairs)) {
            return false;
        }
        ImexMyRRepairs other = (ImexMyRRepairs) object;
        if ((this.myRRepairId == null && other.myRRepairId != null) || (this.myRRepairId != null && !this.myRRepairId.equals(other.myRRepairId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexMyRRepairs[ myRRepairId=" + myRRepairId + " ]";
    }
    
}
