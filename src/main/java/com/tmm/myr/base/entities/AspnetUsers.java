/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmm.myr.base.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author bacil
 */
@Entity
@Table(name = "aspnet_Users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AspnetUsers.findAll", query = "SELECT a FROM AspnetUsers a")
    , @NamedQuery(name = "AspnetUsers.findByApplicationId", query = "SELECT a FROM AspnetUsers a WHERE a.applicationId = :applicationId")
    , @NamedQuery(name = "AspnetUsers.findByUserId", query = "SELECT a FROM AspnetUsers a WHERE a.userId = :userId")
    , @NamedQuery(name = "AspnetUsers.findByUserName", query = "SELECT a FROM AspnetUsers a WHERE a.userName = :userName")
    , @NamedQuery(name = "AspnetUsers.findByLoweredUserName", query = "SELECT a FROM AspnetUsers a WHERE a.loweredUserName = :loweredUserName")
    , @NamedQuery(name = "AspnetUsers.findByMobileAlias", query = "SELECT a FROM AspnetUsers a WHERE a.mobileAlias = :mobileAlias")
    , @NamedQuery(name = "AspnetUsers.findByIsAnonymous", query = "SELECT a FROM AspnetUsers a WHERE a.isAnonymous = :isAnonymous")
    , @NamedQuery(name = "AspnetUsers.findByLastActivityDate", query = "SELECT a FROM AspnetUsers a WHERE a.lastActivityDate = :lastActivityDate")
    , @NamedQuery(name = "AspnetUsers.findByName", query = "SELECT a FROM AspnetUsers a WHERE a.name = :name")
    , @NamedQuery(name = "AspnetUsers.findByLastName", query = "SELECT a FROM AspnetUsers a WHERE a.lastName = :lastName")
    , @NamedQuery(name = "AspnetUsers.findByFirstTimeChangedPassword", query = "SELECT a FROM AspnetUsers a WHERE a.firstTimeChangedPassword = :firstTimeChangedPassword")})
public class AspnetUsers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ApplicationId")
    private String applicationId;
    @Id
    @Basic(optional = false)
    @Column(name = "UserId")
    private String userId;
    @Basic(optional = false)
    @Column(name = "UserName")
    private String userName;
    @Basic(optional = false)
    @Column(name = "LoweredUserName")
    private String loweredUserName;
    @Column(name = "MobileAlias")
    private String mobileAlias;
    @Basic(optional = false)
    @Column(name = "IsAnonymous")
    private boolean isAnonymous;
    @Basic(optional = false)
    @Column(name = "LastActivityDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastActivityDate;
    @Column(name = "Name")
    private String name;
    @Column(name = "LastName")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "FirstTimeChangedPassword")
    private boolean firstTimeChangedPassword;
    @OneToMany(mappedBy = "userId")
    private Collection<ImexReservaciones> imexReservacionesCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "aspnetUsers")
    private AspnetMembership aspnetMembership;

    public AspnetUsers() {
    }

    public AspnetUsers(String userId) {
        this.userId = userId;
    }

    public AspnetUsers(String userId, String applicationId, String userName, String loweredUserName, boolean isAnonymous, Date lastActivityDate, boolean firstTimeChangedPassword) {
        this.userId = userId;
        this.applicationId = applicationId;
        this.userName = userName;
        this.loweredUserName = loweredUserName;
        this.isAnonymous = isAnonymous;
        this.lastActivityDate = lastActivityDate;
        this.firstTimeChangedPassword = firstTimeChangedPassword;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoweredUserName() {
        return loweredUserName;
    }

    public void setLoweredUserName(String loweredUserName) {
        this.loweredUserName = loweredUserName;
    }

    public String getMobileAlias() {
        return mobileAlias;
    }

    public void setMobileAlias(String mobileAlias) {
        this.mobileAlias = mobileAlias;
    }

    public boolean getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public Date getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean getFirstTimeChangedPassword() {
        return firstTimeChangedPassword;
    }

    public void setFirstTimeChangedPassword(boolean firstTimeChangedPassword) {
        this.firstTimeChangedPassword = firstTimeChangedPassword;
    }

    @XmlTransient
    public Collection<ImexReservaciones> getImexReservacionesCollection() {
        return imexReservacionesCollection;
    }

    public void setImexReservacionesCollection(Collection<ImexReservaciones> imexReservacionesCollection) {
        this.imexReservacionesCollection = imexReservacionesCollection;
    }

    public AspnetMembership getAspnetMembership() {
        return aspnetMembership;
    }

    public void setAspnetMembership(AspnetMembership aspnetMembership) {
        this.aspnetMembership = aspnetMembership;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspnetUsers)) {
            return false;
        }
        AspnetUsers other = (AspnetUsers) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.AspnetUsers[ userId=" + userId + " ]";
    }
    
}
