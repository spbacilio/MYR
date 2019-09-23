///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.tmm.myr.base.entities;
//
//import java.io.Serializable;
//import java.math.BigDecimal;
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.Table;
//import javax.xml.bind.annotation.XmlRootElement;
//
///**
// *
// * @author bacil
// */
//@Entity
//@Table(name = "Damage_MyR_View")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "DamageMyRView.findAll", query = "SELECT d FROM DamageMyRView d")
//    , @NamedQuery(name = "DamageMyRView.findByMyRId", query = "SELECT d FROM DamageMyRView d WHERE d.myRId = :myRId")
//    , @NamedQuery(name = "DamageMyRView.findByEIRTypeId", query = "SELECT d FROM DamageMyRView d WHERE d.eIRTypeId = :eIRTypeId")
//    , @NamedQuery(name = "DamageMyRView.findByEIRType", query = "SELECT d FROM DamageMyRView d WHERE d.eIRType = :eIRType")
//    , @NamedQuery(name = "DamageMyRView.findByEIRComponentId", query = "SELECT d FROM DamageMyRView d WHERE d.eIRComponentId = :eIRComponentId")
//    , @NamedQuery(name = "DamageMyRView.findByComponent", query = "SELECT d FROM DamageMyRView d WHERE d.component = :component")
//    , @NamedQuery(name = "DamageMyRView.findByComponentCode", query = "SELECT d FROM DamageMyRView d WHERE d.componentCode = :componentCode")
//    , @NamedQuery(name = "DamageMyRView.findByEIRLocationId", query = "SELECT d FROM DamageMyRView d WHERE d.eIRLocationId = :eIRLocationId")
//    , @NamedQuery(name = "DamageMyRView.findByLocation", query = "SELECT d FROM DamageMyRView d WHERE d.location = :location")
//    , @NamedQuery(name = "DamageMyRView.findByLocationCode", query = "SELECT d FROM DamageMyRView d WHERE d.locationCode = :locationCode")
//    , @NamedQuery(name = "DamageMyRView.findByEIRDamageId", query = "SELECT d FROM DamageMyRView d WHERE d.eIRDamageId = :eIRDamageId")
//    , @NamedQuery(name = "DamageMyRView.findByDamage", query = "SELECT d FROM DamageMyRView d WHERE d.damage = :damage")
//    , @NamedQuery(name = "DamageMyRView.findByDamageCode", query = "SELECT d FROM DamageMyRView d WHERE d.damageCode = :damageCode")
//    , @NamedQuery(name = "DamageMyRView.findByReasonDamageId", query = "SELECT d FROM DamageMyRView d WHERE d.reasonDamageId = :reasonDamageId")
//    , @NamedQuery(name = "DamageMyRView.findByReason", query = "SELECT d FROM DamageMyRView d WHERE d.reason = :reason")
//    , @NamedQuery(name = "DamageMyRView.findByMyRDetailId", query = "SELECT d FROM DamageMyRView d WHERE d.myRDetailId = :myRDetailId")
//    , @NamedQuery(name = "DamageMyRView.findByQuantity", query = "SELECT d FROM DamageMyRView d WHERE d.quantity = :quantity")})
//public class DamageMyRView implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Column(name = "MyRId")
//    private Integer myRId;
//    @Column(name = "EIRTypeId")
//    private Integer eIRTypeId;
//    @Column(name = "EIRType")
//    private String eIRType;
//    @Column(name = "EIRComponentId")
//    private Integer eIRComponentId;
//    @Column(name = "Component")
//    private String component;
//    @Column(name = "ComponentCode")
//    private String componentCode;
//    @Column(name = "EIRLocationId")
//    private Integer eIRLocationId;
//    @Column(name = "Location")
//    private String location;
//    @Column(name = "LocationCode")
//    private String locationCode;
//    @Column(name = "EIRDamageId")
//    private Integer eIRDamageId;
//    @Column(name = "Damage")
//    private String damage;
//    @Column(name = "DamageCode")
//    private String damageCode;
//    @Column(name = "ReasonDamageId")
//    private Integer reasonDamageId;
//    @Column(name = "Reason")
//    private String reason;
//    @Basic(optional = false)
//    @Column(name = "MyRDetailId")
//    private int myRDetailId;
//    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
//    @Column(name = "Quantity")
//    private BigDecimal quantity;
//
//    public DamageMyRView() {
//    }
//
//    public Integer getMyRId() {
//        return myRId;
//    }
//
//    public void setMyRId(Integer myRId) {
//        this.myRId = myRId;
//    }
//
//    public Integer getEIRTypeId() {
//        return eIRTypeId;
//    }
//
//    public void setEIRTypeId(Integer eIRTypeId) {
//        this.eIRTypeId = eIRTypeId;
//    }
//
//    public String getEIRType() {
//        return eIRType;
//    }
//
//    public void setEIRType(String eIRType) {
//        this.eIRType = eIRType;
//    }
//
//    public Integer getEIRComponentId() {
//        return eIRComponentId;
//    }
//
//    public void setEIRComponentId(Integer eIRComponentId) {
//        this.eIRComponentId = eIRComponentId;
//    }
//
//    public String getComponent() {
//        return component;
//    }
//
//    public void setComponent(String component) {
//        this.component = component;
//    }
//
//    public String getComponentCode() {
//        return componentCode;
//    }
//
//    public void setComponentCode(String componentCode) {
//        this.componentCode = componentCode;
//    }
//
//    public Integer getEIRLocationId() {
//        return eIRLocationId;
//    }
//
//    public void setEIRLocationId(Integer eIRLocationId) {
//        this.eIRLocationId = eIRLocationId;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
//
//    public String getLocationCode() {
//        return locationCode;
//    }
//
//    public void setLocationCode(String locationCode) {
//        this.locationCode = locationCode;
//    }
//
//    public Integer getEIRDamageId() {
//        return eIRDamageId;
//    }
//
//    public void setEIRDamageId(Integer eIRDamageId) {
//        this.eIRDamageId = eIRDamageId;
//    }
//
//    public String getDamage() {
//        return damage;
//    }
//
//    public void setDamage(String damage) {
//        this.damage = damage;
//    }
//
//    public String getDamageCode() {
//        return damageCode;
//    }
//
//    public void setDamageCode(String damageCode) {
//        this.damageCode = damageCode;
//    }
//
//    public Integer getReasonDamageId() {
//        return reasonDamageId;
//    }
//
//    public void setReasonDamageId(Integer reasonDamageId) {
//        this.reasonDamageId = reasonDamageId;
//    }
//
//    public String getReason() {
//        return reason;
//    }
//
//    public void setReason(String reason) {
//        this.reason = reason;
//    }
//
//    public int getMyRDetailId() {
//        return myRDetailId;
//    }
//
//    public void setMyRDetailId(int myRDetailId) {
//        this.myRDetailId = myRDetailId;
//    }
//
//    public BigDecimal getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(BigDecimal quantity) {
//        this.quantity = quantity;
//    }
//    
//}
