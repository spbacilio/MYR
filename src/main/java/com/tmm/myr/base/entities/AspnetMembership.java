/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmm.myr.base.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bacil
 */
@Entity
@Table(name = "aspnet_Membership")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AspnetMembership.findAll", query = "SELECT a FROM AspnetMembership a")
    , @NamedQuery(name = "AspnetMembership.findByApplicationId", query = "SELECT a FROM AspnetMembership a WHERE a.applicationId = :applicationId")
    , @NamedQuery(name = "AspnetMembership.findByUserId", query = "SELECT a FROM AspnetMembership a WHERE a.userId = :userId")
    , @NamedQuery(name = "AspnetMembership.findByPassword", query = "SELECT a FROM AspnetMembership a WHERE a.password = :password")
    , @NamedQuery(name = "AspnetMembership.findByPasswordFormat", query = "SELECT a FROM AspnetMembership a WHERE a.passwordFormat = :passwordFormat")
    , @NamedQuery(name = "AspnetMembership.findByPasswordSalt", query = "SELECT a FROM AspnetMembership a WHERE a.passwordSalt = :passwordSalt")
    , @NamedQuery(name = "AspnetMembership.findByMobilePIN", query = "SELECT a FROM AspnetMembership a WHERE a.mobilePIN = :mobilePIN")
    , @NamedQuery(name = "AspnetMembership.findByEmail", query = "SELECT a FROM AspnetMembership a WHERE a.email = :email")
    , @NamedQuery(name = "AspnetMembership.findByLoweredEmail", query = "SELECT a FROM AspnetMembership a WHERE a.loweredEmail = :loweredEmail")
    , @NamedQuery(name = "AspnetMembership.findByPasswordQuestion", query = "SELECT a FROM AspnetMembership a WHERE a.passwordQuestion = :passwordQuestion")
    , @NamedQuery(name = "AspnetMembership.findByPasswordAnswer", query = "SELECT a FROM AspnetMembership a WHERE a.passwordAnswer = :passwordAnswer")
    , @NamedQuery(name = "AspnetMembership.findByIsApproved", query = "SELECT a FROM AspnetMembership a WHERE a.isApproved = :isApproved")
    , @NamedQuery(name = "AspnetMembership.findByIsLockedOut", query = "SELECT a FROM AspnetMembership a WHERE a.isLockedOut = :isLockedOut")
    , @NamedQuery(name = "AspnetMembership.findByCreateDate", query = "SELECT a FROM AspnetMembership a WHERE a.createDate = :createDate")
    , @NamedQuery(name = "AspnetMembership.findByLastLoginDate", query = "SELECT a FROM AspnetMembership a WHERE a.lastLoginDate = :lastLoginDate")
    , @NamedQuery(name = "AspnetMembership.findByLastPasswordChangedDate", query = "SELECT a FROM AspnetMembership a WHERE a.lastPasswordChangedDate = :lastPasswordChangedDate")
    , @NamedQuery(name = "AspnetMembership.findByLastLockoutDate", query = "SELECT a FROM AspnetMembership a WHERE a.lastLockoutDate = :lastLockoutDate")
    , @NamedQuery(name = "AspnetMembership.findByFailedPasswordAttemptCount", query = "SELECT a FROM AspnetMembership a WHERE a.failedPasswordAttemptCount = :failedPasswordAttemptCount")
    , @NamedQuery(name = "AspnetMembership.findByFailedPasswordAttemptWindowStart", query = "SELECT a FROM AspnetMembership a WHERE a.failedPasswordAttemptWindowStart = :failedPasswordAttemptWindowStart")
    , @NamedQuery(name = "AspnetMembership.findByFailedPasswordAnswerAttemptCount", query = "SELECT a FROM AspnetMembership a WHERE a.failedPasswordAnswerAttemptCount = :failedPasswordAnswerAttemptCount")
    , @NamedQuery(name = "AspnetMembership.findByFailedPasswordAnswerAttemptWindowStart", query = "SELECT a FROM AspnetMembership a WHERE a.failedPasswordAnswerAttemptWindowStart = :failedPasswordAnswerAttemptWindowStart")
    , @NamedQuery(name = "AspnetMembership.findByComment", query = "SELECT a FROM AspnetMembership a WHERE a.comment = :comment")
    , @NamedQuery(name = "AspnetMembership.findByIdTipoUsuario", query = "SELECT a FROM AspnetMembership a WHERE a.idTipoUsuario = :idTipoUsuario")
    , @NamedQuery(name = "AspnetMembership.findByUserIdModified", query = "SELECT a FROM AspnetMembership a WHERE a.userIdModified = :userIdModified")})
public class AspnetMembership implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ApplicationId")
    private String applicationId;
    @Id
    @Basic(optional = false)
    @Column(name = "UserId")
    private String userId;
    @Basic(optional = false)
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @Column(name = "PasswordFormat")
    private int passwordFormat;
    @Basic(optional = false)
    @Column(name = "PasswordSalt")
    private String passwordSalt;
    @Column(name = "MobilePIN")
    private String mobilePIN;
    @Column(name = "Email")
    private String email;
    @Column(name = "LoweredEmail")
    private String loweredEmail;
    @Column(name = "PasswordQuestion")
    private String passwordQuestion;
    @Column(name = "PasswordAnswer")
    private String passwordAnswer;
    @Basic(optional = false)
    @Column(name = "IsApproved")
    private boolean isApproved;
    @Basic(optional = false)
    @Column(name = "IsLockedOut")
    private boolean isLockedOut;
    @Basic(optional = false)
    @Column(name = "CreateDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @Column(name = "LastLoginDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginDate;
    @Basic(optional = false)
    @Column(name = "LastPasswordChangedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastPasswordChangedDate;
    @Basic(optional = false)
    @Column(name = "LastLockoutDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLockoutDate;
    @Basic(optional = false)
    @Column(name = "FailedPasswordAttemptCount")
    private int failedPasswordAttemptCount;
    @Basic(optional = false)
    @Column(name = "FailedPasswordAttemptWindowStart")
    @Temporal(TemporalType.TIMESTAMP)
    private Date failedPasswordAttemptWindowStart;
    @Basic(optional = false)
    @Column(name = "FailedPasswordAnswerAttemptCount")
    private int failedPasswordAnswerAttemptCount;
    @Basic(optional = false)
    @Column(name = "FailedPasswordAnswerAttemptWindowStart")
    @Temporal(TemporalType.TIMESTAMP)
    private Date failedPasswordAnswerAttemptWindowStart;
    @Column(name = "Comment")
    private String comment;
    @Column(name = "IdTipoUsuario")
    private Integer idTipoUsuario;
    @Column(name = "UserIdModified")
    private String userIdModified;
    @JoinColumn(name = "UserId", referencedColumnName = "UserId", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private AspnetUsers aspnetUsers;

    public AspnetMembership() {
    }

    public AspnetMembership(String userId) {
        this.userId = userId;
    }

    public AspnetMembership(String userId, String applicationId, String password, int passwordFormat, String passwordSalt, boolean isApproved, boolean isLockedOut, Date createDate, Date lastLoginDate, Date lastPasswordChangedDate, Date lastLockoutDate, int failedPasswordAttemptCount, Date failedPasswordAttemptWindowStart, int failedPasswordAnswerAttemptCount, Date failedPasswordAnswerAttemptWindowStart) {
        this.userId = userId;
        this.applicationId = applicationId;
        this.password = password;
        this.passwordFormat = passwordFormat;
        this.passwordSalt = passwordSalt;
        this.isApproved = isApproved;
        this.isLockedOut = isLockedOut;
        this.createDate = createDate;
        this.lastLoginDate = lastLoginDate;
        this.lastPasswordChangedDate = lastPasswordChangedDate;
        this.lastLockoutDate = lastLockoutDate;
        this.failedPasswordAttemptCount = failedPasswordAttemptCount;
        this.failedPasswordAttemptWindowStart = failedPasswordAttemptWindowStart;
        this.failedPasswordAnswerAttemptCount = failedPasswordAnswerAttemptCount;
        this.failedPasswordAnswerAttemptWindowStart = failedPasswordAnswerAttemptWindowStart;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPasswordFormat() {
        return passwordFormat;
    }

    public void setPasswordFormat(int passwordFormat) {
        this.passwordFormat = passwordFormat;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    public String getMobilePIN() {
        return mobilePIN;
    }

    public void setMobilePIN(String mobilePIN) {
        this.mobilePIN = mobilePIN;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoweredEmail() {
        return loweredEmail;
    }

    public void setLoweredEmail(String loweredEmail) {
        this.loweredEmail = loweredEmail;
    }

    public String getPasswordQuestion() {
        return passwordQuestion;
    }

    public void setPasswordQuestion(String passwordQuestion) {
        this.passwordQuestion = passwordQuestion;
    }

    public String getPasswordAnswer() {
        return passwordAnswer;
    }

    public void setPasswordAnswer(String passwordAnswer) {
        this.passwordAnswer = passwordAnswer;
    }

    public boolean getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }

    public boolean getIsLockedOut() {
        return isLockedOut;
    }

    public void setIsLockedOut(boolean isLockedOut) {
        this.isLockedOut = isLockedOut;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getLastPasswordChangedDate() {
        return lastPasswordChangedDate;
    }

    public void setLastPasswordChangedDate(Date lastPasswordChangedDate) {
        this.lastPasswordChangedDate = lastPasswordChangedDate;
    }

    public Date getLastLockoutDate() {
        return lastLockoutDate;
    }

    public void setLastLockoutDate(Date lastLockoutDate) {
        this.lastLockoutDate = lastLockoutDate;
    }

    public int getFailedPasswordAttemptCount() {
        return failedPasswordAttemptCount;
    }

    public void setFailedPasswordAttemptCount(int failedPasswordAttemptCount) {
        this.failedPasswordAttemptCount = failedPasswordAttemptCount;
    }

    public Date getFailedPasswordAttemptWindowStart() {
        return failedPasswordAttemptWindowStart;
    }

    public void setFailedPasswordAttemptWindowStart(Date failedPasswordAttemptWindowStart) {
        this.failedPasswordAttemptWindowStart = failedPasswordAttemptWindowStart;
    }

    public int getFailedPasswordAnswerAttemptCount() {
        return failedPasswordAnswerAttemptCount;
    }

    public void setFailedPasswordAnswerAttemptCount(int failedPasswordAnswerAttemptCount) {
        this.failedPasswordAnswerAttemptCount = failedPasswordAnswerAttemptCount;
    }

    public Date getFailedPasswordAnswerAttemptWindowStart() {
        return failedPasswordAnswerAttemptWindowStart;
    }

    public void setFailedPasswordAnswerAttemptWindowStart(Date failedPasswordAnswerAttemptWindowStart) {
        this.failedPasswordAnswerAttemptWindowStart = failedPasswordAnswerAttemptWindowStart;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(Integer idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getUserIdModified() {
        return userIdModified;
    }

    public void setUserIdModified(String userIdModified) {
        this.userIdModified = userIdModified;
    }

    public AspnetUsers getAspnetUsers() {
        return aspnetUsers;
    }

    public void setAspnetUsers(AspnetUsers aspnetUsers) {
        this.aspnetUsers = aspnetUsers;
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
        if (!(object instanceof AspnetMembership)) {
            return false;
        }
        AspnetMembership other = (AspnetMembership) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.AspnetMembership[ userId=" + userId + " ]";
    }
    
}
