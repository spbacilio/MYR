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
//@Table(name = "ShipperLLave_View")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "ShipperLLaveView.findAll", query = "SELECT s FROM ShipperLLaveView s")
//    , @NamedQuery(name = "ShipperLLaveView.findByShipperId", query = "SELECT s FROM ShipperLLaveView s WHERE s.shipperId = :shipperId")
//    , @NamedQuery(name = "ShipperLLaveView.findByLlave", query = "SELECT s FROM ShipperLLaveView s WHERE s.llave = :llave")})
//public class ShipperLLaveView implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Basic(optional = false)
//    @Column(name = "ShipperId")
//    private long shipperId;
//    @Basic(optional = false)
//    @Column(name = "Llave")
//    private int llave;
//
//    public ShipperLLaveView() {
//    }
//
//    public long getShipperId() {
//        return shipperId;
//    }
//
//    public void setShipperId(long shipperId) {
//        this.shipperId = shipperId;
//    }
//
//    public int getLlave() {
//        return llave;
//    }
//
//    public void setLlave(int llave) {
//        this.llave = llave;
//    }
//    
//}
