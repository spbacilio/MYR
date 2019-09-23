///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.tmm.myr.base.entities;
//
//import java.io.Serializable;
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
//@Table(name = "Stock_View")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "StockView.findAll", query = "SELECT s FROM StockView s")
//    , @NamedQuery(name = "StockView.findByInventarioId", query = "SELECT s FROM StockView s WHERE s.inventarioId = :inventarioId")
//    , @NamedQuery(name = "StockView.findByFechaAsignacion", query = "SELECT s FROM StockView s WHERE s.fechaAsignacion = :fechaAsignacion")
//    , @NamedQuery(name = "StockView.findByTerminalId", query = "SELECT s FROM StockView s WHERE s.terminalId = :terminalId")
//    , @NamedQuery(name = "StockView.findByDescripcion", query = "SELECT s FROM StockView s WHERE s.descripcion = :descripcion")
//    , @NamedQuery(name = "StockView.findByCodigo", query = "SELECT s FROM StockView s WHERE s.codigo = :codigo")
//    , @NamedQuery(name = "StockView.findByContainerId", query = "SELECT s FROM StockView s WHERE s.containerId = :containerId")
//    , @NamedQuery(name = "StockView.findByContainer", query = "SELECT s FROM StockView s WHERE s.container = :container")
//    , @NamedQuery(name = "StockView.findByMaritimeShippersId", query = "SELECT s FROM StockView s WHERE s.maritimeShippersId = :maritimeShippersId")
//    , @NamedQuery(name = "StockView.findByMaritimeShippersDescription", query = "SELECT s FROM StockView s WHERE s.maritimeShippersDescription = :maritimeShippersDescription")})
//public class StockView implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Basic(optional = false)
//    @Column(name = "InventarioId")
//    private int inventarioId;
//    @Column(name = "FechaAsignacion")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date fechaAsignacion;
//    @Basic(optional = false)
//    @Column(name = "TerminalId")
//    private int terminalId;
//    @Column(name = "Descripcion")
//    private String descripcion;
//    @Column(name = "Codigo")
//    private String codigo;
//    @Basic(optional = false)
//    @Column(name = "ContainerId")
//    private int containerId;
//    @Column(name = "Container")
//    private String container;
//    @Basic(optional = false)
//    @Column(name = "MaritimeShippersId")
//    private long maritimeShippersId;
//    @Column(name = "MaritimeShippersDescription")
//    private String maritimeShippersDescription;
//
//    public StockView() {
//    }
//
//    public int getInventarioId() {
//        return inventarioId;
//    }
//
//    public void setInventarioId(int inventarioId) {
//        this.inventarioId = inventarioId;
//    }
//
//    public Date getFechaAsignacion() {
//        return fechaAsignacion;
//    }
//
//    public void setFechaAsignacion(Date fechaAsignacion) {
//        this.fechaAsignacion = fechaAsignacion;
//    }
//
//    public int getTerminalId() {
//        return terminalId;
//    }
//
//    public void setTerminalId(int terminalId) {
//        this.terminalId = terminalId;
//    }
//
//    public String getDescripcion() {
//        return descripcion;
//    }
//
//    public void setDescripcion(String descripcion) {
//        this.descripcion = descripcion;
//    }
//
//    public String getCodigo() {
//        return codigo;
//    }
//
//    public void setCodigo(String codigo) {
//        this.codigo = codigo;
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
//    public long getMaritimeShippersId() {
//        return maritimeShippersId;
//    }
//
//    public void setMaritimeShippersId(long maritimeShippersId) {
//        this.maritimeShippersId = maritimeShippersId;
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
//}
