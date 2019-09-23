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
@Table(name = "Imex_MyR_Details_Photo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexMyRDetailsPhoto.findAll", query = "SELECT i FROM ImexMyRDetailsPhoto i")
    , @NamedQuery(name = "ImexMyRDetailsPhoto.findByMyRDetailPhotoId", query = "SELECT i FROM ImexMyRDetailsPhoto i WHERE i.myRDetailPhotoId = :myRDetailPhotoId")
    , @NamedQuery(name = "ImexMyRDetailsPhoto.findByFotoMYRId", query = "SELECT i FROM ImexMyRDetailsPhoto i WHERE i.fotoMYRId = :fotoMYRId")})
public class ImexMyRDetailsPhoto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MyRDetailPhotoId")
    private Integer myRDetailPhotoId;
    @Basic(optional = false)
    @Column(name = "FotoMYRId")
    private String fotoMYRId;
    @JoinColumn(name = "MyRDetailId", referencedColumnName = "MyRDetailId")
    @ManyToOne(optional = false)
    private ImexMyRDetails myRDetailId;

    public ImexMyRDetailsPhoto() {
    }

    public ImexMyRDetailsPhoto(Integer myRDetailPhotoId) {
        this.myRDetailPhotoId = myRDetailPhotoId;
    }

    public ImexMyRDetailsPhoto(Integer myRDetailPhotoId, String fotoMYRId) {
        this.myRDetailPhotoId = myRDetailPhotoId;
        this.fotoMYRId = fotoMYRId;
    }

    public Integer getMyRDetailPhotoId() {
        return myRDetailPhotoId;
    }

    public void setMyRDetailPhotoId(Integer myRDetailPhotoId) {
        this.myRDetailPhotoId = myRDetailPhotoId;
    }

    public String getFotoMYRId() {
        return fotoMYRId;
    }

    public void setFotoMYRId(String fotoMYRId) {
        this.fotoMYRId = fotoMYRId;
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
        hash += (myRDetailPhotoId != null ? myRDetailPhotoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexMyRDetailsPhoto)) {
            return false;
        }
        ImexMyRDetailsPhoto other = (ImexMyRDetailsPhoto) object;
        if ((this.myRDetailPhotoId == null && other.myRDetailPhotoId != null) || (this.myRDetailPhotoId != null && !this.myRDetailPhotoId.equals(other.myRDetailPhotoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexMyRDetailsPhoto[ myRDetailPhotoId=" + myRDetailPhotoId + " ]";
    }
    
}
