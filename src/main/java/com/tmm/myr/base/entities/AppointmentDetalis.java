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
import javax.persistence.ManyToOne;
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
@Table(name = "AppointmentDetalis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AppointmentDetalis.findAll", query = "SELECT a FROM AppointmentDetalis a")
    , @NamedQuery(name = "AppointmentDetalis.findByAppointmentDetailId", query = "SELECT a FROM AppointmentDetalis a WHERE a.appointmentDetailId = :appointmentDetailId")
    , @NamedQuery(name = "AppointmentDetalis.findByLetters", query = "SELECT a FROM AppointmentDetalis a WHERE a.letters = :letters")
    , @NamedQuery(name = "AppointmentDetalis.findByNumbers", query = "SELECT a FROM AppointmentDetalis a WHERE a.numbers = :numbers")
    , @NamedQuery(name = "AppointmentDetalis.findByBooking", query = "SELECT a FROM AppointmentDetalis a WHERE a.booking = :booking")
    , @NamedQuery(name = "AppointmentDetalis.findByOwnerId", query = "SELECT a FROM AppointmentDetalis a WHERE a.ownerId = :ownerId")
    , @NamedQuery(name = "AppointmentDetalis.findBySizeId", query = "SELECT a FROM AppointmentDetalis a WHERE a.sizeId = :sizeId")
    , @NamedQuery(name = "AppointmentDetalis.findByUnitType", query = "SELECT a FROM AppointmentDetalis a WHERE a.unitType = :unitType")
    , @NamedQuery(name = "AppointmentDetalis.findByCategory", query = "SELECT a FROM AppointmentDetalis a WHERE a.category = :category")
    , @NamedQuery(name = "AppointmentDetalis.findByTransporter", query = "SELECT a FROM AppointmentDetalis a WHERE a.transporter = :transporter")
    , @NamedQuery(name = "AppointmentDetalis.findByDateRegistered", query = "SELECT a FROM AppointmentDetalis a WHERE a.dateRegistered = :dateRegistered")
    , @NamedQuery(name = "AppointmentDetalis.findByIsActive", query = "SELECT a FROM AppointmentDetalis a WHERE a.isActive = :isActive")})
public class AppointmentDetalis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "appointmentDetailId")
    private Integer appointmentDetailId;
    @Basic(optional = false)
    @Column(name = "letters")
    private String letters;
    @Column(name = "numbers")
    private String numbers;
    @Column(name = "booking")
    private String booking;
    @Basic(optional = false)
    @Column(name = "ownerId")
    private int ownerId;
    @Basic(optional = false)
    @Column(name = "sizeId")
    private int sizeId;
    @Basic(optional = false)
    @Column(name = "unitType")
    private String unitType;
    @Basic(optional = false)
    @Column(name = "category")
    private Character category;
    @Column(name = "transporter")
    private String transporter;
    @Basic(optional = false)
    @Column(name = "dateRegistered")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegistered;
    @Column(name = "isActive")
    private Boolean isActive;
    @JoinColumn(name = "appointmentId", referencedColumnName = "appointmentId")
    @ManyToOne(optional = false)
    private Appointment appointmentId;

    public AppointmentDetalis() {
    }

    public AppointmentDetalis(Integer appointmentDetailId) {
        this.appointmentDetailId = appointmentDetailId;
    }

    public AppointmentDetalis(Integer appointmentDetailId, String letters, int ownerId, int sizeId, String unitType, Character category, Date dateRegistered) {
        this.appointmentDetailId = appointmentDetailId;
        this.letters = letters;
        this.ownerId = ownerId;
        this.sizeId = sizeId;
        this.unitType = unitType;
        this.category = category;
        this.dateRegistered = dateRegistered;
    }

    public Integer getAppointmentDetailId() {
        return appointmentDetailId;
    }

    public void setAppointmentDetailId(Integer appointmentDetailId) {
        this.appointmentDetailId = appointmentDetailId;
    }

    public String getLetters() {
        return letters;
    }

    public void setLetters(String letters) {
        this.letters = letters;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String getBooking() {
        return booking;
    }

    public void setBooking(String booking) {
        this.booking = booking;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public Character getCategory() {
        return category;
    }

    public void setCategory(Character category) {
        this.category = category;
    }

    public String getTransporter() {
        return transporter;
    }

    public void setTransporter(String transporter) {
        this.transporter = transporter;
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

    public Appointment getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Appointment appointmentId) {
        this.appointmentId = appointmentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (appointmentDetailId != null ? appointmentDetailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AppointmentDetalis)) {
            return false;
        }
        AppointmentDetalis other = (AppointmentDetalis) object;
        if ((this.appointmentDetailId == null && other.appointmentDetailId != null) || (this.appointmentDetailId != null && !this.appointmentDetailId.equals(other.appointmentDetailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.AppointmentDetalis[ appointmentDetailId=" + appointmentDetailId + " ]";
    }
    
}
