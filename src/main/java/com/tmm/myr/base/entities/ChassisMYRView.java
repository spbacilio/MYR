///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.tmm.myr.base.entities;
//
//import java.io.Serializable;
//import java.math.BigInteger;
//import java.util.Date;
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.xml.bind.annotation.XmlRootElement;
//
///**
// *
// * @author bacil
// */
//@Entity
//@Table(name = "Chassis_MYR_View")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "ChassisMYRView.findAll", query = "SELECT c FROM ChassisMYRView c")
//    , @NamedQuery(name = "ChassisMYRView.findByChassis", query = "SELECT c FROM ChassisMYRView c WHERE c.chassis = :chassis")
//    , @NamedQuery(name = "ChassisMYRView.findByMyRId", query = "SELECT c FROM ChassisMYRView c WHERE c.myRId = :myRId")
//    , @NamedQuery(name = "ChassisMYRView.findByTerminalId", query = "SELECT c FROM ChassisMYRView c WHERE c.terminalId = :terminalId")
//    , @NamedQuery(name = "ChassisMYRView.findByTerminalName", query = "SELECT c FROM ChassisMYRView c WHERE c.terminalName = :terminalName")
//    , @NamedQuery(name = "ChassisMYRView.findByChassisId", query = "SELECT c FROM ChassisMYRView c WHERE c.chassisId = :chassisId")
//    , @NamedQuery(name = "ChassisMYRView.findByDateCompleted", query = "SELECT c FROM ChassisMYRView c WHERE c.dateCompleted = :dateCompleted")
//    , @NamedQuery(name = "ChassisMYRView.findByDaniosId", query = "SELECT c FROM ChassisMYRView c WHERE c.daniosId = :daniosId")
//    , @NamedQuery(name = "ChassisMYRView.findByDaniosDescripcion", query = "SELECT c FROM ChassisMYRView c WHERE c.daniosDescripcion = :daniosDescripcion")
//    , @NamedQuery(name = "ChassisMYRView.findByClasificacionId", query = "SELECT c FROM ChassisMYRView c WHERE c.clasificacionId = :clasificacionId")
//    , @NamedQuery(name = "ChassisMYRView.findByClasificacionDescripcion", query = "SELECT c FROM ChassisMYRView c WHERE c.clasificacionDescripcion = :clasificacionDescripcion")
//    , @NamedQuery(name = "ChassisMYRView.findByTamaniosId", query = "SELECT c FROM ChassisMYRView c WHERE c.tamaniosId = :tamaniosId")
//    , @NamedQuery(name = "ChassisMYRView.findByTamaniosclv", query = "SELECT c FROM ChassisMYRView c WHERE c.tamaniosclv = :tamaniosclv")
//    , @NamedQuery(name = "ChassisMYRView.findByTamaniosDescripcion", query = "SELECT c FROM ChassisMYRView c WHERE c.tamaniosDescripcion = :tamaniosDescripcion")
//    , @NamedQuery(name = "ChassisMYRView.findByTamaniosChId", query = "SELECT c FROM ChassisMYRView c WHERE c.tamaniosChId = :tamaniosChId")
//    , @NamedQuery(name = "ChassisMYRView.findByShipperId", query = "SELECT c FROM ChassisMYRView c WHERE c.shipperId = :shipperId")
//    , @NamedQuery(name = "ChassisMYRView.findByMaritimeShippersDescription", query = "SELECT c FROM ChassisMYRView c WHERE c.maritimeShippersDescription = :maritimeShippersDescription")
//    , @NamedQuery(name = "ChassisMYRView.findByTipoEirId", query = "SELECT c FROM ChassisMYRView c WHERE c.tipoEirId = :tipoEirId")
//    , @NamedQuery(name = "ChassisMYRView.findByTipoEIR", query = "SELECT c FROM ChassisMYRView c WHERE c.tipoEIR = :tipoEIR")
//    , @NamedQuery(name = "ChassisMYRView.findByTipoInspeccionId", query = "SELECT c FROM ChassisMYRView c WHERE c.tipoInspeccionId = :tipoInspeccionId")
//    , @NamedQuery(name = "ChassisMYRView.findByTipoInspeccion", query = "SELECT c FROM ChassisMYRView c WHERE c.tipoInspeccion = :tipoInspeccion")
//    , @NamedQuery(name = "ChassisMYRView.findByUserImexId", query = "SELECT c FROM ChassisMYRView c WHERE c.userImexId = :userImexId")
//    , @NamedQuery(name = "ChassisMYRView.findByServiceGroupId", query = "SELECT c FROM ChassisMYRView c WHERE c.serviceGroupId = :serviceGroupId")
//    , @NamedQuery(name = "ChassisMYRView.findByCommentsCont", query = "SELECT c FROM ChassisMYRView c WHERE c.commentsCont = :commentsCont")
//    , @NamedQuery(name = "ChassisMYRView.findByCommentsChas", query = "SELECT c FROM ChassisMYRView c WHERE c.commentsChas = :commentsChas")
//    , @NamedQuery(name = "ChassisMYRView.findByDaniosChId", query = "SELECT c FROM ChassisMYRView c WHERE c.daniosChId = :daniosChId")
//    , @NamedQuery(name = "ChassisMYRView.findByShipperIdChassis", query = "SELECT c FROM ChassisMYRView c WHERE c.shipperIdChassis = :shipperIdChassis")})
//public class ChassisMYRView implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Column(name = "Chassis")
//    private String chassis;
//    @Basic(optional = false)
//    @Column(name = "MyRId")
//    private int myRId;
//    @Column(name = "TerminalId")
//    private Integer terminalId;
//    @Column(name = "TerminalName")
//    private String terminalName;
//    @Column(name = "ChassisId")
//    private Integer chassisId;
//    @Column(name = "DateCompleted")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date dateCompleted;
//    @Column(name = "DaniosId")
//    private Integer daniosId;
//    @Column(name = "DaniosDescripcion")
//    private String daniosDescripcion;
//    @Column(name = "ClasificacionId")
//    private Integer clasificacionId;
//    @Column(name = "ClasificacionDescripcion")
//    private String clasificacionDescripcion;
//    @Column(name = "TamaniosId")
//    private Integer tamaniosId;
//    @Column(name = "Tamaniosclv")
//    private String tamaniosclv;
//    @Column(name = "TamaniosDescripcion")
//    private String tamaniosDescripcion;
//    @Column(name = "TamaniosChId")
//    private Integer tamaniosChId;
//    @Column(name = "ShipperId")
//    private BigInteger shipperId;
//    @Column(name = "MaritimeShippersDescription")
//    private String maritimeShippersDescription;
//    @Column(name = "TipoEirId")
//    private Integer tipoEirId;
//    @Column(name = "TipoEIR")
//    private String tipoEIR;
//    @Column(name = "TipoInspeccionId")
//    private Integer tipoInspeccionId;
//    @Column(name = "TipoInspeccion")
//    private String tipoInspeccion;
//    @Column(name = "UserImexId")
//    private String userImexId;
//    @Column(name = "serviceGroupId")
//    private Integer serviceGroupId;
//    @Column(name = "CommentsCont")
//    private String commentsCont;
//    @Column(name = "CommentsChas")
//    private String commentsChas;
//    @Column(name = "DaniosChId")
//    private Integer daniosChId;
//    @Column(name = "ShipperIdChassis")
//    private BigInteger shipperIdChassis;
//
//    public ChassisMYRView() {
//    }
//
//    public String getChassis() {
//        return chassis;
//    }
//
//    public void setChassis(String chassis) {
//        this.chassis = chassis;
//    }
//
//    public int getMyRId() {
//        return myRId;
//    }
//
//    public void setMyRId(int myRId) {
//        this.myRId = myRId;
//    }
//
//    public Integer getTerminalId() {
//        return terminalId;
//    }
//
//    public void setTerminalId(Integer terminalId) {
//        this.terminalId = terminalId;
//    }
//
//    public String getTerminalName() {
//        return terminalName;
//    }
//
//    public void setTerminalName(String terminalName) {
//        this.terminalName = terminalName;
//    }
//
//    public Integer getChassisId() {
//        return chassisId;
//    }
//
//    public void setChassisId(Integer chassisId) {
//        this.chassisId = chassisId;
//    }
//
//    public Date getDateCompleted() {
//        return dateCompleted;
//    }
//
//    public void setDateCompleted(Date dateCompleted) {
//        this.dateCompleted = dateCompleted;
//    }
//
//    public Integer getDaniosId() {
//        return daniosId;
//    }
//
//    public void setDaniosId(Integer daniosId) {
//        this.daniosId = daniosId;
//    }
//
//    public String getDaniosDescripcion() {
//        return daniosDescripcion;
//    }
//
//    public void setDaniosDescripcion(String daniosDescripcion) {
//        this.daniosDescripcion = daniosDescripcion;
//    }
//
//    public Integer getClasificacionId() {
//        return clasificacionId;
//    }
//
//    public void setClasificacionId(Integer clasificacionId) {
//        this.clasificacionId = clasificacionId;
//    }
//
//    public String getClasificacionDescripcion() {
//        return clasificacionDescripcion;
//    }
//
//    public void setClasificacionDescripcion(String clasificacionDescripcion) {
//        this.clasificacionDescripcion = clasificacionDescripcion;
//    }
//
//    public Integer getTamaniosId() {
//        return tamaniosId;
//    }
//
//    public void setTamaniosId(Integer tamaniosId) {
//        this.tamaniosId = tamaniosId;
//    }
//
//    public String getTamaniosclv() {
//        return tamaniosclv;
//    }
//
//    public void setTamaniosclv(String tamaniosclv) {
//        this.tamaniosclv = tamaniosclv;
//    }
//
//    public String getTamaniosDescripcion() {
//        return tamaniosDescripcion;
//    }
//
//    public void setTamaniosDescripcion(String tamaniosDescripcion) {
//        this.tamaniosDescripcion = tamaniosDescripcion;
//    }
//
//    public Integer getTamaniosChId() {
//        return tamaniosChId;
//    }
//
//    public void setTamaniosChId(Integer tamaniosChId) {
//        this.tamaniosChId = tamaniosChId;
//    }
//
//    public BigInteger getShipperId() {
//        return shipperId;
//    }
//
//    public void setShipperId(BigInteger shipperId) {
//        this.shipperId = shipperId;
//    }
//
//    public String getMaritimeShippersDescription() {
//        return maritimeShippersDescription;
//    }
//
//    public void setMaritimeShippersDescription(String maritimeShippersDescription) {
//        this.maritimeShippersDescription = maritimeShippersDescription;
//    }
//
//    public Integer getTipoEirId() {
//        return tipoEirId;
//    }
//
//    public void setTipoEirId(Integer tipoEirId) {
//        this.tipoEirId = tipoEirId;
//    }
//
//    public String getTipoEIR() {
//        return tipoEIR;
//    }
//
//    public void setTipoEIR(String tipoEIR) {
//        this.tipoEIR = tipoEIR;
//    }
//
//    public Integer getTipoInspeccionId() {
//        return tipoInspeccionId;
//    }
//
//    public void setTipoInspeccionId(Integer tipoInspeccionId) {
//        this.tipoInspeccionId = tipoInspeccionId;
//    }
//
//    public String getTipoInspeccion() {
//        return tipoInspeccion;
//    }
//
//    public void setTipoInspeccion(String tipoInspeccion) {
//        this.tipoInspeccion = tipoInspeccion;
//    }
//
//    public String getUserImexId() {
//        return userImexId;
//    }
//
//    public void setUserImexId(String userImexId) {
//        this.userImexId = userImexId;
//    }
//
//    public Integer getServiceGroupId() {
//        return serviceGroupId;
//    }
//
//    public void setServiceGroupId(Integer serviceGroupId) {
//        this.serviceGroupId = serviceGroupId;
//    }
//
//    public String getCommentsCont() {
//        return commentsCont;
//    }
//
//    public void setCommentsCont(String commentsCont) {
//        this.commentsCont = commentsCont;
//    }
//
//    public String getCommentsChas() {
//        return commentsChas;
//    }
//
//    public void setCommentsChas(String commentsChas) {
//        this.commentsChas = commentsChas;
//    }
//
//    public Integer getDaniosChId() {
//        return daniosChId;
//    }
//
//    public void setDaniosChId(Integer daniosChId) {
//        this.daniosChId = daniosChId;
//    }
//
//    public BigInteger getShipperIdChassis() {
//        return shipperIdChassis;
//    }
//
//    public void setShipperIdChassis(BigInteger shipperIdChassis) {
//        this.shipperIdChassis = shipperIdChassis;
//    }
//    
//}
