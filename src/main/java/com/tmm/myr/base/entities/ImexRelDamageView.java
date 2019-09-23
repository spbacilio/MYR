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
//@Table(name = "Imex_Rel_Damage_View")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "ImexRelDamageView.findAll", query = "SELECT i FROM ImexRelDamageView i")
//    , @NamedQuery(name = "ImexRelDamageView.findByEIRComponentId", query = "SELECT i FROM ImexRelDamageView i WHERE i.eIRComponentId = :eIRComponentId")
//    , @NamedQuery(name = "ImexRelDamageView.findByComponent", query = "SELECT i FROM ImexRelDamageView i WHERE i.component = :component")
//    , @NamedQuery(name = "ImexRelDamageView.findByEIRDamageId", query = "SELECT i FROM ImexRelDamageView i WHERE i.eIRDamageId = :eIRDamageId")
//    , @NamedQuery(name = "ImexRelDamageView.findByDamage", query = "SELECT i FROM ImexRelDamageView i WHERE i.damage = :damage")
//    , @NamedQuery(name = "ImexRelDamageView.findByAARCodeComponent", query = "SELECT i FROM ImexRelDamageView i WHERE i.aARCodeComponent = :aARCodeComponent")
//    , @NamedQuery(name = "ImexRelDamageView.findByAARCodeDamage", query = "SELECT i FROM ImexRelDamageView i WHERE i.aARCodeDamage = :aARCodeDamage")
//    , @NamedQuery(name = "ImexRelDamageView.findByEIRTypeId", query = "SELECT i FROM ImexRelDamageView i WHERE i.eIRTypeId = :eIRTypeId")
//    , @NamedQuery(name = "ImexRelDamageView.findByRelDamageId", query = "SELECT i FROM ImexRelDamageView i WHERE i.relDamageId = :relDamageId")})
//public class ImexRelDamageView implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Basic(optional = false)
//    @Column(name = "EIRComponentId")
//    private int eIRComponentId;
//    @Column(name = "Component")
//    private String component;
//    @Basic(optional = false)
//    @Column(name = "EIRDamageId")
//    private int eIRDamageId;
//    @Column(name = "Damage")
//    private String damage;
//    @Column(name = "AARCode_Component")
//    private String aARCodeComponent;
//    @Column(name = "AARCode_Damage")
//    private String aARCodeDamage;
//    @Basic(optional = false)
//    @Column(name = "EIRTypeId")
//    private int eIRTypeId;
//    @Basic(optional = false)
//    @Column(name = "RelDamageId")
//    private int relDamageId;
//
//    public ImexRelDamageView() {
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
//    public String getComponent() {
//        return component;
//    }
//
//    public void setComponent(String component) {
//        this.component = component;
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
//    public String getDamage() {
//        return damage;
//    }
//
//    public void setDamage(String damage) {
//        this.damage = damage;
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
//    public String getAARCodeDamage() {
//        return aARCodeDamage;
//    }
//
//    public void setAARCodeDamage(String aARCodeDamage) {
//        this.aARCodeDamage = aARCodeDamage;
//    }
//
//    public int getEIRTypeId() {
//        return eIRTypeId;
//    }
//
//    public void setEIRTypeId(int eIRTypeId) {
//        this.eIRTypeId = eIRTypeId;
//    }
//
//    public int getRelDamageId() {
//        return relDamageId;
//    }
//
//    public void setRelDamageId(int relDamageId) {
//        this.relDamageId = relDamageId;
//    }
//    
//}
