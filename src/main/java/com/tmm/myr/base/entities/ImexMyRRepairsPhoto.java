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
@Table(name = "Imex_MyR_Repairs_Photo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexMyRRepairsPhoto.findAll", query = "SELECT i FROM ImexMyRRepairsPhoto i")
    , @NamedQuery(name = "ImexMyRRepairsPhoto.findByMyRRepairPhotoId", query = "SELECT i FROM ImexMyRRepairsPhoto i WHERE i.myRRepairPhotoId = :myRRepairPhotoId")
    , @NamedQuery(name = "ImexMyRRepairsPhoto.findByFotoMYRId", query = "SELECT i FROM ImexMyRRepairsPhoto i WHERE i.fotoMYRId = :fotoMYRId")})
public class ImexMyRRepairsPhoto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MyRRepairPhotoId")
    private Integer myRRepairPhotoId;
    @Basic(optional = false)
    @Column(name = "FotoMYRId")
    private String fotoMYRId;
    @JoinColumn(name = "MyRRepairId", referencedColumnName = "MyRRepairId")
    @ManyToOne(optional = false)
    private ImexMyRRepairs myRRepairId;

    public ImexMyRRepairsPhoto() {
    }

    public ImexMyRRepairsPhoto(Integer myRRepairPhotoId) {
        this.myRRepairPhotoId = myRRepairPhotoId;
    }

    public ImexMyRRepairsPhoto(Integer myRRepairPhotoId, String fotoMYRId) {
        this.myRRepairPhotoId = myRRepairPhotoId;
        this.fotoMYRId = fotoMYRId;
    }

    public Integer getMyRRepairPhotoId() {
        return myRRepairPhotoId;
    }

    public void setMyRRepairPhotoId(Integer myRRepairPhotoId) {
        this.myRRepairPhotoId = myRRepairPhotoId;
    }

    public String getFotoMYRId() {
        return fotoMYRId;
    }

    public void setFotoMYRId(String fotoMYRId) {
        this.fotoMYRId = fotoMYRId;
    }

    public ImexMyRRepairs getMyRRepairId() {
        return myRRepairId;
    }

    public void setMyRRepairId(ImexMyRRepairs myRRepairId) {
        this.myRRepairId = myRRepairId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (myRRepairPhotoId != null ? myRRepairPhotoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexMyRRepairsPhoto)) {
            return false;
        }
        ImexMyRRepairsPhoto other = (ImexMyRRepairsPhoto) object;
        if ((this.myRRepairPhotoId == null && other.myRRepairPhotoId != null) || (this.myRRepairPhotoId != null && !this.myRRepairPhotoId.equals(other.myRRepairPhotoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexMyRRepairsPhoto[ myRRepairPhotoId=" + myRRepairPhotoId + " ]";
    }
    
}
