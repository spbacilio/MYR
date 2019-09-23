///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.tmm.myr.base.entities;
//
//import java.io.Serializable;
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
//@Table(name = "Imex_Rel_Repair_View")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "ImexRelRepairView.findAll", query = "SELECT i FROM ImexRelRepairView i")
//    , @NamedQuery(name = "ImexRelRepairView.findByEIRRepairId", query = "SELECT i FROM ImexRelRepairView i WHERE i.eIRRepairId = :eIRRepairId")
//    , @NamedQuery(name = "ImexRelRepairView.findByRepair", query = "SELECT i FROM ImexRelRepairView i WHERE i.repair = :repair")
//    , @NamedQuery(name = "ImexRelRepairView.findByAARCodeRepair", query = "SELECT i FROM ImexRelRepairView i WHERE i.aARCodeRepair = :aARCodeRepair")
//    , @NamedQuery(name = "ImexRelRepairView.findByEIRTypeId", query = "SELECT i FROM ImexRelRepairView i WHERE i.eIRTypeId = :eIRTypeId")
//    , @NamedQuery(name = "ImexRelRepairView.findByComponent", query = "SELECT i FROM ImexRelRepairView i WHERE i.component = :component")
//    , @NamedQuery(name = "ImexRelRepairView.findByAARCodeComponent", query = "SELECT i FROM ImexRelRepairView i WHERE i.aARCodeComponent = :aARCodeComponent")
//    , @NamedQuery(name = "ImexRelRepairView.findByDamage", query = "SELECT i FROM ImexRelRepairView i WHERE i.damage = :damage")
//    , @NamedQuery(name = "ImexRelRepairView.findByAARCodeDamage", query = "SELECT i FROM ImexRelRepairView i WHERE i.aARCodeDamage = :aARCodeDamage")
//    , @NamedQuery(name = "ImexRelRepairView.findByEIRDamageId", query = "SELECT i FROM ImexRelRepairView i WHERE i.eIRDamageId = :eIRDamageId")
//    , @NamedQuery(name = "ImexRelRepairView.findByRelRepairId", query = "SELECT i FROM ImexRelRepairView i WHERE i.relRepairId = :relRepairId")
//    , @NamedQuery(name = "ImexRelRepairView.findByEIRComponentId", query = "SELECT i FROM ImexRelRepairView i WHERE i.eIRComponentId = :eIRComponentId")})
//public class ImexRelRepairView implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Basic(optional = false)
//    @Column(name = "EIRRepairId")
//    private int eIRRepairId;
//    @Column(name = "Repair")
//    private String repair;
//    @Column(name = "AARCode_Repair")
//    private String aARCodeRepair;
//    @Column(name = "EIRTypeId")
//    private Integer eIRTypeId;
//    @Column(name = "Component")
//    private String component;
//    @Column(name = "AARCode_Component")
//    private String aARCodeComponent;
//    @Column(name = "Damage")
//    private String damage;
//    @Column(name = "AARCode_Damage")
//    private String aARCodeDamage;
//    @Basic(optional = false)
//    @Column(name = "EIRDamageId")
//    private int eIRDamageId;
//    @Basic(optional = false)
//    @Column(name = "RelRepairId")
//    private int relRepairId;
//    @Basic(optional = false)
//    @Column(name = "EIRComponentId")
//    private int eIRComponentId;
//
//    public ImexRelRepairView() {
//    }
//
//    public int getEIRRepairId() {
//        return eIRRepairId;
//    }
//
//    public void setEIRRepairId(int eIRRepairId) {
//        this.eIRRepairId = eIRRepairId;
//    }
//
//    public String getRepair() {
//        return repair;
//    }
//
//    public void setRepair(String repair) {
//        this.repair = repair;
//    }
//
//    public String getAARCodeRepair() {
//        return aARCodeRepair;
//    }
//
//    public void setAARCodeRepair(String aARCodeRepair) {
//        this.aARCodeRepair = aARCodeRepair;
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
//    public String getComponent() {
//        return component;
//    }
//
//    public void setComponent(String component) {
//        this.component = component;
//    }
//
//    public String getAARCodeComponent() {
//        return aARCodeComponent;
//    }
//
//    public void setAARCodeComponent(String aARCodeComponent) {
//        this.aARCodeComponent = aARCodeComponent;
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
//    public String getAARCodeDamage() {
//        return aARCodeDamage;
//    }
//
//    public void setAARCodeDamage(String aARCodeDamage) {
//        this.aARCodeDamage = aARCodeDamage;
//    }
//
//    public int getEIRDamageId() {
//        return eIRDamageId;
//    }
//
//    public void setEIRDamageId(int eIRDamageId) {
//        this.eIRDamageId = eIRDamageId;
//    }
//
//    public int getRelRepairId() {
//        return relRepairId;
//    }
//
//    public void setRelRepairId(int relRepairId) {
//        this.relRepairId = relRepairId;
//    }
//
//    public int getEIRComponentId() {
//        return eIRComponentId;
//    }
//
//    public void setEIRComponentId(int eIRComponentId) {
//        this.eIRComponentId = eIRComponentId;
//    }
//    
//}
