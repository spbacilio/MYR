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
//@Table(name = "Container_MYR_View")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "ContainerMYRView.findAll", query = "SELECT c FROM ContainerMYRView c")
//    , @NamedQuery(name = "ContainerMYRView.findByMyRId", query = "SELECT c FROM ContainerMYRView c WHERE c.myRId = :myRId")
//    , @NamedQuery(name = "ContainerMYRView.findByTerminalId", query = "SELECT c FROM ContainerMYRView c WHERE c.terminalId = :terminalId")
//    , @NamedQuery(name = "ContainerMYRView.findByTerminalName", query = "SELECT c FROM ContainerMYRView c WHERE c.terminalName = :terminalName")
//    , @NamedQuery(name = "ContainerMYRView.findByDateCompleted", query = "SELECT c FROM ContainerMYRView c WHERE c.dateCompleted = :dateCompleted")
//    , @NamedQuery(name = "ContainerMYRView.findByDaniosId", query = "SELECT c FROM ContainerMYRView c WHERE c.daniosId = :daniosId")
//    , @NamedQuery(name = "ContainerMYRView.findByDaniosDescripcion", query = "SELECT c FROM ContainerMYRView c WHERE c.daniosDescripcion = :daniosDescripcion")
//    , @NamedQuery(name = "ContainerMYRView.findByClasificacionId", query = "SELECT c FROM ContainerMYRView c WHERE c.clasificacionId = :clasificacionId")
//    , @NamedQuery(name = "ContainerMYRView.findByClasificacionDescripcion", query = "SELECT c FROM ContainerMYRView c WHERE c.clasificacionDescripcion = :clasificacionDescripcion")
//    , @NamedQuery(name = "ContainerMYRView.findByTamaniosId", query = "SELECT c FROM ContainerMYRView c WHERE c.tamaniosId = :tamaniosId")
//    , @NamedQuery(name = "ContainerMYRView.findByTamaniosclv", query = "SELECT c FROM ContainerMYRView c WHERE c.tamaniosclv = :tamaniosclv")
//    , @NamedQuery(name = "ContainerMYRView.findByTamaniosDescripcion", query = "SELECT c FROM ContainerMYRView c WHERE c.tamaniosDescripcion = :tamaniosDescripcion")
//    , @NamedQuery(name = "ContainerMYRView.findByTamaniosChId", query = "SELECT c FROM ContainerMYRView c WHERE c.tamaniosChId = :tamaniosChId")
//    , @NamedQuery(name = "ContainerMYRView.findByShipperId", query = "SELECT c FROM ContainerMYRView c WHERE c.shipperId = :shipperId")
//    , @NamedQuery(name = "ContainerMYRView.findByMaritimeShippersDescription", query = "SELECT c FROM ContainerMYRView c WHERE c.maritimeShippersDescription = :maritimeShippersDescription")
//    , @NamedQuery(name = "ContainerMYRView.findByTipoEirId", query = "SELECT c FROM ContainerMYRView c WHERE c.tipoEirId = :tipoEirId")
//    , @NamedQuery(name = "ContainerMYRView.findByTipoEIR", query = "SELECT c FROM ContainerMYRView c WHERE c.tipoEIR = :tipoEIR")
//    , @NamedQuery(name = "ContainerMYRView.findByTipoInspeccion", query = "SELECT c FROM ContainerMYRView c WHERE c.tipoInspeccion = :tipoInspeccion")
//    , @NamedQuery(name = "ContainerMYRView.findByUserImexId", query = "SELECT c FROM ContainerMYRView c WHERE c.userImexId = :userImexId")
//    , @NamedQuery(name = "ContainerMYRView.findByContainerId", query = "SELECT c FROM ContainerMYRView c WHERE c.containerId = :containerId")
//    , @NamedQuery(name = "ContainerMYRView.findByContainer", query = "SELECT c FROM ContainerMYRView c WHERE c.container = :container")
//    , @NamedQuery(name = "ContainerMYRView.findByChassisId", query = "SELECT c FROM ContainerMYRView c WHERE c.chassisId = :chassisId")
//    , @NamedQuery(name = "ContainerMYRView.findByTipoInspeccionId", query = "SELECT c FROM ContainerMYRView c WHERE c.tipoInspeccionId = :tipoInspeccionId")
//    , @NamedQuery(name = "ContainerMYRView.findByServiceGroupId", query = "SELECT c FROM ContainerMYRView c WHERE c.serviceGroupId = :serviceGroupId")
//    , @NamedQuery(name = "ContainerMYRView.findByCommentsChas", query = "SELECT c FROM ContainerMYRView c WHERE c.commentsChas = :commentsChas")
//    , @NamedQuery(name = "ContainerMYRView.findByCommentsCont", query = "SELECT c FROM ContainerMYRView c WHERE c.commentsCont = :commentsCont")
//    , @NamedQuery(name = "ContainerMYRView.findByDaniosChId", query = "SELECT c FROM ContainerMYRView c WHERE c.daniosChId = :daniosChId")})
//public class ContainerMYRView implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Basic(optional = false)
//    @Column(name = "MyRId")
//    private int myRId;
//    @Column(name = "TerminalId")
//    private Integer terminalId;
//    @Column(name = "TerminalName")
//    private String terminalName;
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
//    @Column(name = "TipoInspeccion")
//    private String tipoInspeccion;
//    @Column(name = "UserImexId")
//    private String userImexId;
//    @Basic(optional = false)
//    @Column(name = "ContainerId")
//    private int containerId;
//    @Column(name = "Container")
//    private String container;
//    @Column(name = "ChassisId")
//    private Integer chassisId;
//    @Column(name = "TipoInspeccionId")
//    private Integer tipoInspeccionId;
//    @Column(name = "serviceGroupId")
//    private Integer serviceGroupId;
//    @Column(name = "CommentsChas")
//    private String commentsChas;
//    @Column(name = "CommentsCont")
//    private String commentsCont;
//    @Column(name = "DaniosChId")
//    private Integer daniosChId;
//
//    public ContainerMYRView() {
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
//    public int getContainerId() {
//        return containerId;
//    }
//
//    public void setContainerId(int containerId) {
//        this.containerId = containerId;
//    }
//
//    public String getContainer() {
//        return container;
//    }
//
//    public void setContainer(String container) {
//        this.container = container;
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
//    public Integer getTipoInspeccionId() {
//        return tipoInspeccionId;
//    }
//
//    public void setTipoInspeccionId(Integer tipoInspeccionId) {
//        this.tipoInspeccionId = tipoInspeccionId;
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
//    public String getCommentsChas() {
//        return commentsChas;
//    }
//
//    public void setCommentsChas(String commentsChas) {
//        this.commentsChas = commentsChas;
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
//    public Integer getDaniosChId() {
//        return daniosChId;
//    }
//
//    public void setDaniosChId(Integer daniosChId) {
//        this.daniosChId = daniosChId;
//    }
//    
//}
