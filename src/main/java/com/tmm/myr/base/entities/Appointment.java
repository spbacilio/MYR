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
@Table(name = "Appointment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Appointment.findAll", query = "SELECT a FROM Appointment a")
    , @NamedQuery(name = "Appointment.findByAppointmentId", query = "SELECT a FROM Appointment a WHERE a.appointmentId = :appointmentId")
    , @NamedQuery(name = "Appointment.findByTerminalId", query = "SELECT a FROM Appointment a WHERE a.terminalId = :terminalId")
    , @NamedQuery(name = "Appointment.findByServiceType", query = "SELECT a FROM Appointment a WHERE a.serviceType = :serviceType")
    , @NamedQuery(name = "Appointment.findByBooking", query = "SELECT a FROM Appointment a WHERE a.booking = :booking")
    , @NamedQuery(name = "Appointment.findByUserId", query = "SELECT a FROM Appointment a WHERE a.userId = :userId")
    , @NamedQuery(name = "Appointment.findByBusinessName", query = "SELECT a FROM Appointment a WHERE a.businessName = :businessName")
    , @NamedQuery(name = "Appointment.findByRfc", query = "SELECT a FROM Appointment a WHERE a.rfc = :rfc")
    , @NamedQuery(name = "Appointment.findByBusinessAddress", query = "SELECT a FROM Appointment a WHERE a.businessAddress = :businessAddress")
    , @NamedQuery(name = "Appointment.findByPaymentEnabled", query = "SELECT a FROM Appointment a WHERE a.paymentEnabled = :paymentEnabled")
    , @NamedQuery(name = "Appointment.findByPaymentPath", query = "SELECT a FROM Appointment a WHERE a.paymentPath = :paymentPath")
    , @NamedQuery(name = "Appointment.findByDateRegistered", query = "SELECT a FROM Appointment a WHERE a.dateRegistered = :dateRegistered")
    , @NamedQuery(name = "Appointment.findByIsActive", query = "SELECT a FROM Appointment a WHERE a.isActive = :isActive")})
public class Appointment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "appointmentId")
    private Integer appointmentId;
    @Basic(optional = false)
    @Column(name = "terminalId")
    private int terminalId;
    @Basic(optional = false)
    @Column(name = "serviceType")
    private String serviceType;
    @Column(name = "booking")
    private String booking;
    @Column(name = "userId")
    private Integer userId;
    @Column(name = "businessName")
    private String businessName;
    @Column(name = "rfc")
    private String rfc;
    @Column(name = "businessAddress")
    private String businessAddress;
    @Basic(optional = false)
    @Column(name = "paymentEnabled")
    private boolean paymentEnabled;
    @Column(name = "paymentPath")
    private String paymentPath;
    @Basic(optional = false)
    @Column(name = "dateRegistered")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegistered;
    @Column(name = "isActive")
    private Boolean isActive;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appointmentId")
    private Collection<AppointmentDetalis> appointmentDetalisCollection;

    public Appointment() {
    }

    public Appointment(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Appointment(Integer appointmentId, int terminalId, String serviceType, boolean paymentEnabled, Date dateRegistered) {
        this.appointmentId = appointmentId;
        this.terminalId = terminalId;
        this.serviceType = serviceType;
        this.paymentEnabled = paymentEnabled;
        this.dateRegistered = dateRegistered;
    }

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(int terminalId) {
        this.terminalId = terminalId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getBooking() {
        return booking;
    }

    public void setBooking(String booking) {
        this.booking = booking;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public boolean getPaymentEnabled() {
        return paymentEnabled;
    }

    public void setPaymentEnabled(boolean paymentEnabled) {
        this.paymentEnabled = paymentEnabled;
    }

    public String getPaymentPath() {
        return paymentPath;
    }

    public void setPaymentPath(String paymentPath) {
        this.paymentPath = paymentPath;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @XmlTransient
    public Collection<AppointmentDetalis> getAppointmentDetalisCollection() {
        return appointmentDetalisCollection;
    }

    public void setAppointmentDetalisCollection(Collection<AppointmentDetalis> appointmentDetalisCollection) {
        this.appointmentDetalisCollection = appointmentDetalisCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (appointmentId != null ? appointmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Appointment)) {
            return false;
        }
        Appointment other = (Appointment) object;
        if ((this.appointmentId == null && other.appointmentId != null) || (this.appointmentId != null && !this.appointmentId.equals(other.appointmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.Appointment[ appointmentId=" + appointmentId + " ]";
    }
    
}
