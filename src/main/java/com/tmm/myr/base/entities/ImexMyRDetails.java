/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmm.myr.base.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "Imex_MyR_Details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexMyRDetails.findAll", query = "SELECT i FROM ImexMyRDetails i")
    , @NamedQuery(name = "ImexMyRDetails.findByMyRDetailId", query = "SELECT i FROM ImexMyRDetails i WHERE i.myRDetailId = :myRDetailId")
    , @NamedQuery(name = "ImexMyRDetails.findByEirTypeId", query = "SELECT i FROM ImexMyRDetails i WHERE i.eirTypeId = :eirTypeId")
    , @NamedQuery(name = "ImexMyRDetails.findByEirComponentId", query = "SELECT i FROM ImexMyRDetails i WHERE i.eirComponentId = :eirComponentId")
    , @NamedQuery(name = "ImexMyRDetails.findByEirLocationId", query = "SELECT i FROM ImexMyRDetails i WHERE i.eirLocationId = :eirLocationId")
    , @NamedQuery(name = "ImexMyRDetails.findByEirDamageId", query = "SELECT i FROM ImexMyRDetails i WHERE i.eirDamageId = :eirDamageId")
    , @NamedQuery(name = "ImexMyRDetails.findByUm", query = "SELECT i FROM ImexMyRDetails i WHERE i.um = :um")
    , @NamedQuery(name = "ImexMyRDetails.findByReasonDamageId", query = "SELECT i FROM ImexMyRDetails i WHERE i.reasonDamageId = :reasonDamageId")
    , @NamedQuery(name = "ImexMyRDetails.findByQuantity", query = "SELECT i FROM ImexMyRDetails i WHERE i.quantity = :quantity")})
public class ImexMyRDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MyRDetailId")
    private Integer myRDetailId;
    @Column(name = "EirTypeId")
    private Integer eirTypeId;
    @Column(name = "EirComponentId")
    private Integer eirComponentId;
    @Column(name = "EirLocationId")
    private Integer eirLocationId;
    @Column(name = "EirDamageId")
    private Integer eirDamageId;
    @Column(name = "UM")
    private String um;
    @Column(name = "ReasonDamageId")
    private Integer reasonDamageId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Quantity")
    private BigDecimal quantity;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "myRDetailId")
    private Collection<ImexMyRRepairs> imexMyRRepairsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "myRDetailId")
    private Collection<ImexMyRDetailsPhoto> imexMyRDetailsPhotoCollection;
    @JoinColumn(name = "MyRId", referencedColumnName = "MyRId")
    @ManyToOne
    private ImexMyR myRId;

    public ImexMyRDetails() {
    }

    public ImexMyRDetails(Integer myRDetailId) {
        this.myRDetailId = myRDetailId;
    }

    public Integer getMyRDetailId() {
        return myRDetailId;
    }

    public void setMyRDetailId(Integer myRDetailId) {
        this.myRDetailId = myRDetailId;
    }

    public Integer getEirTypeId() {
        return eirTypeId;
    }

    public void setEirTypeId(Integer eirTypeId) {
        this.eirTypeId = eirTypeId;
    }

    public Integer getEirComponentId() {
        return eirComponentId;
    }

    public void setEirComponentId(Integer eirComponentId) {
        this.eirComponentId = eirComponentId;
    }

    public Integer getEirLocationId() {
        return eirLocationId;
    }

    public void setEirLocationId(Integer eirLocationId) {
        this.eirLocationId = eirLocationId;
    }

    public Integer getEirDamageId() {
        return eirDamageId;
    }

    public void setEirDamageId(Integer eirDamageId) {
        this.eirDamageId = eirDamageId;
    }

    public String getUm() {
        return um;
    }

    public void setUm(String um) {
        this.um = um;
    }

    public Integer getReasonDamageId() {
        return reasonDamageId;
    }

    public void setReasonDamageId(Integer reasonDamageId) {
        this.reasonDamageId = reasonDamageId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    @XmlTransient
    public Collection<ImexMyRRepairs> getImexMyRRepairsCollection() {
        return imexMyRRepairsCollection;
    }

    public void setImexMyRRepairsCollection(Collection<ImexMyRRepairs> imexMyRRepairsCollection) {
        this.imexMyRRepairsCollection = imexMyRRepairsCollection;
    }

    @XmlTransient
    public Collection<ImexMyRDetailsPhoto> getImexMyRDetailsPhotoCollection() {
        return imexMyRDetailsPhotoCollection;
    }

    public void setImexMyRDetailsPhotoCollection(Collection<ImexMyRDetailsPhoto> imexMyRDetailsPhotoCollection) {
        this.imexMyRDetailsPhotoCollection = imexMyRDetailsPhotoCollection;
    }

    public ImexMyR getMyRId() {
        return myRId;
    }

    public void setMyRId(ImexMyR myRId) {
        this.myRId = myRId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (myRDetailId != null ? myRDetailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexMyRDetails)) {
            return false;
        }
        ImexMyRDetails other = (ImexMyRDetails) object;
        if ((this.myRDetailId == null && other.myRDetailId != null) || (this.myRDetailId != null && !this.myRDetailId.equals(other.myRDetailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexMyRDetails[ myRDetailId=" + myRDetailId + " ]";
    }
    
}
