/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmm.myr.base.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bacil
 */
@Entity
@Table(name = "Imex_ShipperUser")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexShipperUser.findAll", query = "SELECT i FROM ImexShipperUser i")
    , @NamedQuery(name = "ImexShipperUser.findById", query = "SELECT i FROM ImexShipperUser i WHERE i.id = :id")
    , @NamedQuery(name = "ImexShipperUser.findByUserId", query = "SELECT i FROM ImexShipperUser i WHERE i.userId = :userId")
    , @NamedQuery(name = "ImexShipperUser.findByMaritimeShipperId", query = "SELECT i FROM ImexShipperUser i WHERE i.maritimeShipperId = :maritimeShipperId")
    , @NamedQuery(name = "ImexShipperUser.findByUserIdUpdate", query = "SELECT i FROM ImexShipperUser i WHERE i.userIdUpdate = :userIdUpdate")
    , @NamedQuery(name = "ImexShipperUser.findByDateUpdate", query = "SELECT i FROM ImexShipperUser i WHERE i.dateUpdate = :dateUpdate")})
public class ImexShipperUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "UserId")
    private String userId;
    @Column(name = "MaritimeShipperId")
    private BigInteger maritimeShipperId;
    @Column(name = "UserIdUpdate")
    private String userIdUpdate;
    @Column(name = "DateUpdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdate;

    public ImexShipperUser() {
    }

    public ImexShipperUser(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigInteger getMaritimeShipperId() {
        return maritimeShipperId;
    }

    public void setMaritimeShipperId(BigInteger maritimeShipperId) {
        this.maritimeShipperId = maritimeShipperId;
    }

    public String getUserIdUpdate() {
        return userIdUpdate;
    }

    public void setUserIdUpdate(String userIdUpdate) {
        this.userIdUpdate = userIdUpdate;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexShipperUser)) {
            return false;
        }
        ImexShipperUser other = (ImexShipperUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexShipperUser[ id=" + id + " ]";
    }
    
}
