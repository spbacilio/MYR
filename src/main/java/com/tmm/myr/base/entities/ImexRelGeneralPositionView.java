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
//@Table(name = "Imex_Rel_General_Position_View")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "ImexRelGeneralPositionView.findAll", query = "SELECT i FROM ImexRelGeneralPositionView i")
//    , @NamedQuery(name = "ImexRelGeneralPositionView.findByPositionId", query = "SELECT i FROM ImexRelGeneralPositionView i WHERE i.positionId = :positionId")
//    , @NamedQuery(name = "ImexRelGeneralPositionView.findByPosition", query = "SELECT i FROM ImexRelGeneralPositionView i WHERE i.position = :position")
//    , @NamedQuery(name = "ImexRelGeneralPositionView.findByEIRTypeId", query = "SELECT i FROM ImexRelGeneralPositionView i WHERE i.eIRTypeId = :eIRTypeId")
//    , @NamedQuery(name = "ImexRelGeneralPositionView.findByComponent", query = "SELECT i FROM ImexRelGeneralPositionView i WHERE i.component = :component")
//    , @NamedQuery(name = "ImexRelGeneralPositionView.findByAARCodeComponent", query = "SELECT i FROM ImexRelGeneralPositionView i WHERE i.aARCodeComponent = :aARCodeComponent")
//    , @NamedQuery(name = "ImexRelGeneralPositionView.findByEIRComponentId", query = "SELECT i FROM ImexRelGeneralPositionView i WHERE i.eIRComponentId = :eIRComponentId")
//    , @NamedQuery(name = "ImexRelGeneralPositionView.findByIdGeneralPositionId", query = "SELECT i FROM ImexRelGeneralPositionView i WHERE i.idGeneralPositionId = :idGeneralPositionId")})
//public class ImexRelGeneralPositionView implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Basic(optional = false)
//    @Column(name = "PositionId")
//    private int positionId;
//    @Column(name = "Position")
//    private String position;
//    @Column(name = "EIRTypeId")
//    private Integer eIRTypeId;
//    @Column(name = "Component")
//    private String component;
//    @Column(name = "AARCode_Component")
//    private String aARCodeComponent;
//    @Basic(optional = false)
//    @Column(name = "EIRComponentId")
//    private int eIRComponentId;
//    @Basic(optional = false)
//    @Column(name = "IdGeneralPositionId")
//    private int idGeneralPositionId;
//
//    public ImexRelGeneralPositionView() {
//    }
//
//    public int getPositionId() {
//        return positionId;
//    }
//
//    public void setPositionId(int positionId) {
//        this.positionId = positionId;
//    }
//
//    public String getPosition() {
//        return position;
//    }
//
//    public void setPosition(String position) {
//        this.position = position;
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
//    public int getEIRComponentId() {
//        return eIRComponentId;
//    }
//
//    public void setEIRComponentId(int eIRComponentId) {
//        this.eIRComponentId = eIRComponentId;
//    }
//
//    public int getIdGeneralPositionId() {
//        return idGeneralPositionId;
//    }
//
//    public void setIdGeneralPositionId(int idGeneralPositionId) {
//        this.idGeneralPositionId = idGeneralPositionId;
//    }
//    
//}
