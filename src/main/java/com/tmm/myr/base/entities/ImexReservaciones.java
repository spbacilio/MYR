/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmm.myr.base.entities;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "Imex_Reservaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexReservaciones.findAll", query = "SELECT i FROM ImexReservaciones i")
    , @NamedQuery(name = "ImexReservaciones.findByReservacionesId", query = "SELECT i FROM ImexReservaciones i WHERE i.reservacionesId = :reservacionesId")
    , @NamedQuery(name = "ImexReservaciones.findByContenedor", query = "SELECT i FROM ImexReservaciones i WHERE i.contenedor = :contenedor")
    , @NamedQuery(name = "ImexReservaciones.findByBooking", query = "SELECT i FROM ImexReservaciones i WHERE i.booking = :booking")
    , @NamedQuery(name = "ImexReservaciones.findByBookingNaviera", query = "SELECT i FROM ImexReservaciones i WHERE i.bookingNaviera = :bookingNaviera")
    , @NamedQuery(name = "ImexReservaciones.findByFacturatario", query = "SELECT i FROM ImexReservaciones i WHERE i.facturatario = :facturatario")
    , @NamedQuery(name = "ImexReservaciones.findByShipperId", query = "SELECT i FROM ImexReservaciones i WHERE i.shipperId = :shipperId")
    , @NamedQuery(name = "ImexReservaciones.findByEntraAduana", query = "SELECT i FROM ImexReservaciones i WHERE i.entraAduana = :entraAduana")
    , @NamedQuery(name = "ImexReservaciones.findByWayBill", query = "SELECT i FROM ImexReservaciones i WHERE i.wayBill = :wayBill")
    , @NamedQuery(name = "ImexReservaciones.findByTrasportista", query = "SELECT i FROM ImexReservaciones i WHERE i.trasportista = :trasportista")
    , @NamedQuery(name = "ImexReservaciones.findByTerminalId", query = "SELECT i FROM ImexReservaciones i WHERE i.terminalId = :terminalId")
    , @NamedQuery(name = "ImexReservaciones.findByActivo", query = "SELECT i FROM ImexReservaciones i WHERE i.activo = :activo")
    , @NamedQuery(name = "ImexReservaciones.findByFechaAcaptura", query = "SELECT i FROM ImexReservaciones i WHERE i.fechaAcaptura = :fechaAcaptura")
    , @NamedQuery(name = "ImexReservaciones.findByReservacionOcupada", query = "SELECT i FROM ImexReservaciones i WHERE i.reservacionOcupada = :reservacionOcupada")
    , @NamedQuery(name = "ImexReservaciones.findByServicioId", query = "SELECT i FROM ImexReservaciones i WHERE i.servicioId = :servicioId")
    , @NamedQuery(name = "ImexReservaciones.findByPagaManiobraId", query = "SELECT i FROM ImexReservaciones i WHERE i.pagaManiobraId = :pagaManiobraId")
    , @NamedQuery(name = "ImexReservaciones.findByTamaniosId", query = "SELECT i FROM ImexReservaciones i WHERE i.tamaniosId = :tamaniosId")
    , @NamedQuery(name = "ImexReservaciones.findByClasificacionId", query = "SELECT i FROM ImexReservaciones i WHERE i.clasificacionId = :clasificacionId")
    , @NamedQuery(name = "ImexReservaciones.findByUserIdCancelo", query = "SELECT i FROM ImexReservaciones i WHERE i.userIdCancelo = :userIdCancelo")
    , @NamedQuery(name = "ImexReservaciones.findByFechaCancelacion", query = "SELECT i FROM ImexReservaciones i WHERE i.fechaCancelacion = :fechaCancelacion")
    , @NamedQuery(name = "ImexReservaciones.findByContainerId", query = "SELECT i FROM ImexReservaciones i WHERE i.containerId = :containerId")
    , @NamedQuery(name = "ImexReservaciones.findByObservaciones", query = "SELECT i FROM ImexReservaciones i WHERE i.observaciones = :observaciones")
    , @NamedQuery(name = "ImexReservaciones.findByEDI301Id", query = "SELECT i FROM ImexReservaciones i WHERE i.eDI301Id = :eDI301Id")
    , @NamedQuery(name = "ImexReservaciones.findByDaniosId", query = "SELECT i FROM ImexReservaciones i WHERE i.daniosId = :daniosId")
    , @NamedQuery(name = "ImexReservaciones.findByCicloReservacionesId", query = "SELECT i FROM ImexReservaciones i WHERE i.cicloReservacionesId = :cicloReservacionesId")
    , @NamedQuery(name = "ImexReservaciones.findByAtrid", query = "SELECT i FROM ImexReservaciones i WHERE i.atrid = :atrid")
    , @NamedQuery(name = "ImexReservaciones.findByAtr", query = "SELECT i FROM ImexReservaciones i WHERE i.atr = :atr")
    , @NamedQuery(name = "ImexReservaciones.findByFechaProcesoAtr", query = "SELECT i FROM ImexReservaciones i WHERE i.fechaProcesoAtr = :fechaProcesoAtr")
    , @NamedQuery(name = "ImexReservaciones.findByFactura", query = "SELECT i FROM ImexReservaciones i WHERE i.factura = :factura")})
public class ImexReservaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ReservacionesId")
    private Integer reservacionesId;
    @Column(name = "Contenedor")
    private String contenedor;
    @Column(name = "Booking")
    private String booking;
    @Column(name = "BookingNaviera")
    private String bookingNaviera;
    @Column(name = "Facturatario")
    private String facturatario;
    @Column(name = "ShipperId")
    private BigInteger shipperId;
    @Column(name = "EntraAduana")
    private Boolean entraAduana;
    @Column(name = "WayBill")
    private String wayBill;
    @Column(name = "Trasportista")
    private String trasportista;
    @Column(name = "TerminalId")
    private Integer terminalId;
    @Column(name = "Activo")
    private Boolean activo;
    @Column(name = "FechaAcaptura")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAcaptura;
    @Column(name = "ReservacionOcupada")
    private Boolean reservacionOcupada;
    @Column(name = "ServicioId")
    private Integer servicioId;
    @Column(name = "PagaManiobraId")
    private Integer pagaManiobraId;
    @Column(name = "TamaniosId")
    private Integer tamaniosId;
    @Column(name = "ClasificacionId")
    private Integer clasificacionId;
    @Column(name = "UserIdCancelo")
    private String userIdCancelo;
    @Column(name = "FechaCancelacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCancelacion;
    @Column(name = "ContainerId")
    private Integer containerId;
    @Column(name = "Observaciones")
    private String observaciones;
    @Column(name = "EDI301Id")
    private Integer eDI301Id;
    @Column(name = "DaniosId")
    private Integer daniosId;
    @Column(name = "CicloReservacionesId")
    private Integer cicloReservacionesId;
    @Column(name = "atrid")
    private Integer atrid;
    @Column(name = "atr")
    private Integer atr;
    @Column(name = "FechaProcesoAtr")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaProcesoAtr;
    @Column(name = "Factura")
    private String factura;
    @JoinColumn(name = "UserId", referencedColumnName = "UserId")
    @ManyToOne
    private AspnetUsers userId;

    public ImexReservaciones() {
    }

    public ImexReservaciones(Integer reservacionesId) {
        this.reservacionesId = reservacionesId;
    }

    public Integer getReservacionesId() {
        return reservacionesId;
    }

    public void setReservacionesId(Integer reservacionesId) {
        this.reservacionesId = reservacionesId;
    }

    public String getContenedor() {
        return contenedor;
    }

    public void setContenedor(String contenedor) {
        this.contenedor = contenedor;
    }

    public String getBooking() {
        return booking;
    }

    public void setBooking(String booking) {
        this.booking = booking;
    }

    public String getBookingNaviera() {
        return bookingNaviera;
    }

    public void setBookingNaviera(String bookingNaviera) {
        this.bookingNaviera = bookingNaviera;
    }

    public String getFacturatario() {
        return facturatario;
    }

    public void setFacturatario(String facturatario) {
        this.facturatario = facturatario;
    }

    public BigInteger getShipperId() {
        return shipperId;
    }

    public void setShipperId(BigInteger shipperId) {
        this.shipperId = shipperId;
    }

    public Boolean getEntraAduana() {
        return entraAduana;
    }

    public void setEntraAduana(Boolean entraAduana) {
        this.entraAduana = entraAduana;
    }

    public String getWayBill() {
        return wayBill;
    }

    public void setWayBill(String wayBill) {
        this.wayBill = wayBill;
    }

    public String getTrasportista() {
        return trasportista;
    }

    public void setTrasportista(String trasportista) {
        this.trasportista = trasportista;
    }

    public Integer getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(Integer terminalId) {
        this.terminalId = terminalId;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Date getFechaAcaptura() {
        return fechaAcaptura;
    }

    public void setFechaAcaptura(Date fechaAcaptura) {
        this.fechaAcaptura = fechaAcaptura;
    }

    public Boolean getReservacionOcupada() {
        return reservacionOcupada;
    }

    public void setReservacionOcupada(Boolean reservacionOcupada) {
        this.reservacionOcupada = reservacionOcupada;
    }

    public Integer getServicioId() {
        return servicioId;
    }

    public void setServicioId(Integer servicioId) {
        this.servicioId = servicioId;
    }

    public Integer getPagaManiobraId() {
        return pagaManiobraId;
    }

    public void setPagaManiobraId(Integer pagaManiobraId) {
        this.pagaManiobraId = pagaManiobraId;
    }

    public Integer getTamaniosId() {
        return tamaniosId;
    }

    public void setTamaniosId(Integer tamaniosId) {
        this.tamaniosId = tamaniosId;
    }

    public Integer getClasificacionId() {
        return clasificacionId;
    }

    public void setClasificacionId(Integer clasificacionId) {
        this.clasificacionId = clasificacionId;
    }

    public String getUserIdCancelo() {
        return userIdCancelo;
    }

    public void setUserIdCancelo(String userIdCancelo) {
        this.userIdCancelo = userIdCancelo;
    }

    public Date getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(Date fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public Integer getContainerId() {
        return containerId;
    }

    public void setContainerId(Integer containerId) {
        this.containerId = containerId;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getEDI301Id() {
        return eDI301Id;
    }

    public void setEDI301Id(Integer eDI301Id) {
        this.eDI301Id = eDI301Id;
    }

    public Integer getDaniosId() {
        return daniosId;
    }

    public void setDaniosId(Integer daniosId) {
        this.daniosId = daniosId;
    }

    public Integer getCicloReservacionesId() {
        return cicloReservacionesId;
    }

    public void setCicloReservacionesId(Integer cicloReservacionesId) {
        this.cicloReservacionesId = cicloReservacionesId;
    }

    public Integer getAtrid() {
        return atrid;
    }

    public void setAtrid(Integer atrid) {
        this.atrid = atrid;
    }

    public Integer getAtr() {
        return atr;
    }

    public void setAtr(Integer atr) {
        this.atr = atr;
    }

    public Date getFechaProcesoAtr() {
        return fechaProcesoAtr;
    }

    public void setFechaProcesoAtr(Date fechaProcesoAtr) {
        this.fechaProcesoAtr = fechaProcesoAtr;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public AspnetUsers getUserId() {
        return userId;
    }

    public void setUserId(AspnetUsers userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reservacionesId != null ? reservacionesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexReservaciones)) {
            return false;
        }
        ImexReservaciones other = (ImexReservaciones) object;
        if ((this.reservacionesId == null && other.reservacionesId != null) || (this.reservacionesId != null && !this.reservacionesId.equals(other.reservacionesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexReservaciones[ reservacionesId=" + reservacionesId + " ]";
    }
    
}
