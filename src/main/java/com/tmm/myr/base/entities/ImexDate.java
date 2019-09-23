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
@Table(name = "Imex_Date")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexDate.findAll", query = "SELECT i FROM ImexDate i")
    , @NamedQuery(name = "ImexDate.findByDateId", query = "SELECT i FROM ImexDate i WHERE i.dateId = :dateId")
    , @NamedQuery(name = "ImexDate.findByIdPosicion", query = "SELECT i FROM ImexDate i WHERE i.idPosicion = :idPosicion")
    , @NamedQuery(name = "ImexDate.findByPosicion", query = "SELECT i FROM ImexDate i WHERE i.posicion = :posicion")
    , @NamedQuery(name = "ImexDate.findByIdCatPatios", query = "SELECT i FROM ImexDate i WHERE i.idCatPatios = :idCatPatios")
    , @NamedQuery(name = "ImexDate.findByOcupado", query = "SELECT i FROM ImexDate i WHERE i.ocupado = :ocupado")
    , @NamedQuery(name = "ImexDate.findByUserId", query = "SELECT i FROM ImexDate i WHERE i.userId = :userId")
    , @NamedQuery(name = "ImexDate.findByFechaAsignacion", query = "SELECT i FROM ImexDate i WHERE i.fechaAsignacion = :fechaAsignacion")
    , @NamedQuery(name = "ImexDate.findByGuia", query = "SELECT i FROM ImexDate i WHERE i.guia = :guia")
    , @NamedQuery(name = "ImexDate.findByChassisId", query = "SELECT i FROM ImexDate i WHERE i.chassisId = :chassisId")
    , @NamedQuery(name = "ImexDate.findByContainerId", query = "SELECT i FROM ImexDate i WHERE i.containerId = :containerId")
    , @NamedQuery(name = "ImexDate.findByIdReservacion", query = "SELECT i FROM ImexDate i WHERE i.idReservacion = :idReservacion")
    , @NamedQuery(name = "ImexDate.findByShipperId", query = "SELECT i FROM ImexDate i WHERE i.shipperId = :shipperId")
    , @NamedQuery(name = "ImexDate.findByTipoServicioId", query = "SELECT i FROM ImexDate i WHERE i.tipoServicioId = :tipoServicioId")
    , @NamedQuery(name = "ImexDate.findByTerminalId", query = "SELECT i FROM ImexDate i WHERE i.terminalId = :terminalId")
    , @NamedQuery(name = "ImexDate.findByFechaEscritura", query = "SELECT i FROM ImexDate i WHERE i.fechaEscritura = :fechaEscritura")
    , @NamedQuery(name = "ImexDate.findByBooking", query = "SELECT i FROM ImexDate i WHERE i.booking = :booking")
    , @NamedQuery(name = "ImexDate.findByTranTypeId", query = "SELECT i FROM ImexDate i WHERE i.tranTypeId = :tranTypeId")
    , @NamedQuery(name = "ImexDate.findByDateRegistered", query = "SELECT i FROM ImexDate i WHERE i.dateRegistered = :dateRegistered")
    , @NamedQuery(name = "ImexDate.findByTerminalAnteriorId", query = "SELECT i FROM ImexDate i WHERE i.terminalAnteriorId = :terminalAnteriorId")
    , @NamedQuery(name = "ImexDate.findByReservadoTerminal", query = "SELECT i FROM ImexDate i WHERE i.reservadoTerminal = :reservadoTerminal")
    , @NamedQuery(name = "ImexDate.findBySello", query = "SELECT i FROM ImexDate i WHERE i.sello = :sello")
    , @NamedQuery(name = "ImexDate.findByIdTrackingSir", query = "SELECT i FROM ImexDate i WHERE i.idTrackingSir = :idTrackingSir")
    , @NamedQuery(name = "ImexDate.findByIsActive", query = "SELECT i FROM ImexDate i WHERE i.isActive = :isActive")
    , @NamedQuery(name = "ImexDate.findByContainer", query = "SELECT i FROM ImexDate i WHERE i.container = :container")
    , @NamedQuery(name = "ImexDate.findByChassis", query = "SELECT i FROM ImexDate i WHERE i.chassis = :chassis")})
public class ImexDate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DateId")
    private Integer dateId;
    @Column(name = "IdPosicion")
    private Integer idPosicion;
    @Column(name = "posicion")
    private String posicion;
    @Column(name = "idCat_Patios")
    private Integer idCatPatios;
    @Column(name = "ocupado")
    private Boolean ocupado;
    @Column(name = "UserId")
    private String userId;
    @Column(name = "FechaAsignacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAsignacion;
    @Column(name = "Guia")
    private String guia;
    @Column(name = "ChassisId")
    private Integer chassisId;
    @Column(name = "ContainerId")
    private Integer containerId;
    @Column(name = "IdReservacion")
    private Integer idReservacion;
    @Column(name = "ShipperId")
    private BigInteger shipperId;
    @Column(name = "TipoServicioId")
    private Integer tipoServicioId;
    @Column(name = "TerminalId")
    private Integer terminalId;
    @Column(name = "FechaEscritura")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEscritura;
    @Column(name = "Booking")
    private String booking;
    @Column(name = "TranTypeId")
    private Integer tranTypeId;
    @Column(name = "DateRegistered")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegistered;
    @Column(name = "TerminalAnteriorId")
    private Integer terminalAnteriorId;
    @Basic(optional = false)
    @Column(name = "ReservadoTerminal")
    private boolean reservadoTerminal;
    @Column(name = "sello")
    private String sello;
    @Column(name = "IdTrackingSir")
    private Integer idTrackingSir;
    @Column(name = "isActive")
    private Boolean isActive;
    @Column(name = "Container")
    private String container;
    @Column(name = "Chassis")
    private String chassis;

    public ImexDate() {
    }

    public ImexDate(Integer dateId) {
        this.dateId = dateId;
    }

    public ImexDate(Integer dateId, boolean reservadoTerminal) {
        this.dateId = dateId;
        this.reservadoTerminal = reservadoTerminal;
    }

    public Integer getDateId() {
        return dateId;
    }

    public void setDateId(Integer dateId) {
        this.dateId = dateId;
    }

    public Integer getIdPosicion() {
        return idPosicion;
    }

    public void setIdPosicion(Integer idPosicion) {
        this.idPosicion = idPosicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Integer getIdCatPatios() {
        return idCatPatios;
    }

    public void setIdCatPatios(Integer idCatPatios) {
        this.idCatPatios = idCatPatios;
    }

    public Boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(Boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }

    public Integer getChassisId() {
        return chassisId;
    }

    public void setChassisId(Integer chassisId) {
        this.chassisId = chassisId;
    }

    public Integer getContainerId() {
        return containerId;
    }

    public void setContainerId(Integer containerId) {
        this.containerId = containerId;
    }

    public Integer getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(Integer idReservacion) {
        this.idReservacion = idReservacion;
    }

    public BigInteger getShipperId() {
        return shipperId;
    }

    public void setShipperId(BigInteger shipperId) {
        this.shipperId = shipperId;
    }

    public Integer getTipoServicioId() {
        return tipoServicioId;
    }

    public void setTipoServicioId(Integer tipoServicioId) {
        this.tipoServicioId = tipoServicioId;
    }

    public Integer getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(Integer terminalId) {
        this.terminalId = terminalId;
    }

    public Date getFechaEscritura() {
        return fechaEscritura;
    }

    public void setFechaEscritura(Date fechaEscritura) {
        this.fechaEscritura = fechaEscritura;
    }

    public String getBooking() {
        return booking;
    }

    public void setBooking(String booking) {
        this.booking = booking;
    }

    public Integer getTranTypeId() {
        return tranTypeId;
    }

    public void setTranTypeId(Integer tranTypeId) {
        this.tranTypeId = tranTypeId;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public Integer getTerminalAnteriorId() {
        return terminalAnteriorId;
    }

    public void setTerminalAnteriorId(Integer terminalAnteriorId) {
        this.terminalAnteriorId = terminalAnteriorId;
    }

    public boolean getReservadoTerminal() {
        return reservadoTerminal;
    }

    public void setReservadoTerminal(boolean reservadoTerminal) {
        this.reservadoTerminal = reservadoTerminal;
    }

    public String getSello() {
        return sello;
    }

    public void setSello(String sello) {
        this.sello = sello;
    }

    public Integer getIdTrackingSir() {
        return idTrackingSir;
    }

    public void setIdTrackingSir(Integer idTrackingSir) {
        this.idTrackingSir = idTrackingSir;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dateId != null ? dateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexDate)) {
            return false;
        }
        ImexDate other = (ImexDate) object;
        if ((this.dateId == null && other.dateId != null) || (this.dateId != null && !this.dateId.equals(other.dateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexDate[ dateId=" + dateId + " ]";
    }
    
}
