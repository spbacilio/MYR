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
@Table(name = "Imex_TrackingSir")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexTrackingSir.findAll", query = "SELECT i FROM ImexTrackingSir i")
    , @NamedQuery(name = "ImexTrackingSir.findByIdTrackingSir", query = "SELECT i FROM ImexTrackingSir i WHERE i.idTrackingSir = :idTrackingSir")
    , @NamedQuery(name = "ImexTrackingSir.findByContainer", query = "SELECT i FROM ImexTrackingSir i WHERE i.container = :container")
    , @NamedQuery(name = "ImexTrackingSir.findByChasis", query = "SELECT i FROM ImexTrackingSir i WHERE i.chasis = :chasis")
    , @NamedQuery(name = "ImexTrackingSir.findByDateRegistered", query = "SELECT i FROM ImexTrackingSir i WHERE i.dateRegistered = :dateRegistered")
    , @NamedQuery(name = "ImexTrackingSir.findByDateCompleted", query = "SELECT i FROM ImexTrackingSir i WHERE i.dateCompleted = :dateCompleted")
    , @NamedQuery(name = "ImexTrackingSir.findByTranTypeId", query = "SELECT i FROM ImexTrackingSir i WHERE i.tranTypeId = :tranTypeId")
    , @NamedQuery(name = "ImexTrackingSir.findByStatusContainerId", query = "SELECT i FROM ImexTrackingSir i WHERE i.statusContainerId = :statusContainerId")
    , @NamedQuery(name = "ImexTrackingSir.findByDescripcionEvento", query = "SELECT i FROM ImexTrackingSir i WHERE i.descripcionEvento = :descripcionEvento")
    , @NamedQuery(name = "ImexTrackingSir.findByTransportista", query = "SELECT i FROM ImexTrackingSir i WHERE i.transportista = :transportista")
    , @NamedQuery(name = "ImexTrackingSir.findByTerminado", query = "SELECT i FROM ImexTrackingSir i WHERE i.terminado = :terminado")
    , @NamedQuery(name = "ImexTrackingSir.findByEnviadoTracking", query = "SELECT i FROM ImexTrackingSir i WHERE i.enviadoTracking = :enviadoTracking")
    , @NamedQuery(name = "ImexTrackingSir.findByTerminalName", query = "SELECT i FROM ImexTrackingSir i WHERE i.terminalName = :terminalName")
    , @NamedQuery(name = "ImexTrackingSir.findByTerminalId", query = "SELECT i FROM ImexTrackingSir i WHERE i.terminalId = :terminalId")
    , @NamedQuery(name = "ImexTrackingSir.findByEventPSEXTId", query = "SELECT i FROM ImexTrackingSir i WHERE i.eventPSEXTId = :eventPSEXTId")
    , @NamedQuery(name = "ImexTrackingSir.findByTipoServicioId", query = "SELECT i FROM ImexTrackingSir i WHERE i.tipoServicioId = :tipoServicioId")
    , @NamedQuery(name = "ImexTrackingSir.findByShipperId", query = "SELECT i FROM ImexTrackingSir i WHERE i.shipperId = :shipperId")
    , @NamedQuery(name = "ImexTrackingSir.findByGuia", query = "SELECT i FROM ImexTrackingSir i WHERE i.guia = :guia")
    , @NamedQuery(name = "ImexTrackingSir.findByClvmigrar", query = "SELECT i FROM ImexTrackingSir i WHERE i.clvmigrar = :clvmigrar")
    , @NamedQuery(name = "ImexTrackingSir.findByIdmigrado", query = "SELECT i FROM ImexTrackingSir i WHERE i.idmigrado = :idmigrado")
    , @NamedQuery(name = "ImexTrackingSir.findByFechaEscritura", query = "SELECT i FROM ImexTrackingSir i WHERE i.fechaEscritura = :fechaEscritura")
    , @NamedQuery(name = "ImexTrackingSir.findByPagaManiobraId", query = "SELECT i FROM ImexTrackingSir i WHERE i.pagaManiobraId = :pagaManiobraId")
    , @NamedQuery(name = "ImexTrackingSir.findByFacturatario", query = "SELECT i FROM ImexTrackingSir i WHERE i.facturatario = :facturatario")
    , @NamedQuery(name = "ImexTrackingSir.findByPlataforma", query = "SELECT i FROM ImexTrackingSir i WHERE i.plataforma = :plataforma")
    , @NamedQuery(name = "ImexTrackingSir.findByPosicion", query = "SELECT i FROM ImexTrackingSir i WHERE i.posicion = :posicion")
    , @NamedQuery(name = "ImexTrackingSir.findByUserImex", query = "SELECT i FROM ImexTrackingSir i WHERE i.userImex = :userImex")
    , @NamedQuery(name = "ImexTrackingSir.findByBooking", query = "SELECT i FROM ImexTrackingSir i WHERE i.booking = :booking")
    , @NamedQuery(name = "ImexTrackingSir.findByTamanioId", query = "SELECT i FROM ImexTrackingSir i WHERE i.tamanioId = :tamanioId")
    , @NamedQuery(name = "ImexTrackingSir.findByClasificacionId", query = "SELECT i FROM ImexTrackingSir i WHERE i.clasificacionId = :clasificacionId")
    , @NamedQuery(name = "ImexTrackingSir.findByIdEstacionOrigen", query = "SELECT i FROM ImexTrackingSir i WHERE i.idEstacionOrigen = :idEstacionOrigen")
    , @NamedQuery(name = "ImexTrackingSir.findByIdManiobrasAnden", query = "SELECT i FROM ImexTrackingSir i WHERE i.idManiobrasAnden = :idManiobrasAnden")
    , @NamedQuery(name = "ImexTrackingSir.findByPedidoProcesado", query = "SELECT i FROM ImexTrackingSir i WHERE i.pedidoProcesado = :pedidoProcesado")
    , @NamedQuery(name = "ImexTrackingSir.findByIdEstacionDestino", query = "SELECT i FROM ImexTrackingSir i WHERE i.idEstacionDestino = :idEstacionDestino")
    , @NamedQuery(name = "ImexTrackingSir.findByUsuarioCambioCont", query = "SELECT i FROM ImexTrackingSir i WHERE i.usuarioCambioCont = :usuarioCambioCont")
    , @NamedQuery(name = "ImexTrackingSir.findByComentarioCont", query = "SELECT i FROM ImexTrackingSir i WHERE i.comentarioCont = :comentarioCont")
    , @NamedQuery(name = "ImexTrackingSir.findByUsuarioCambioCh", query = "SELECT i FROM ImexTrackingSir i WHERE i.usuarioCambioCh = :usuarioCambioCh")
    , @NamedQuery(name = "ImexTrackingSir.findByComentarioCh", query = "SELECT i FROM ImexTrackingSir i WHERE i.comentarioCh = :comentarioCh")
    , @NamedQuery(name = "ImexTrackingSir.findByFechaIngreso", query = "SELECT i FROM ImexTrackingSir i WHERE i.fechaIngreso = :fechaIngreso")
    , @NamedQuery(name = "ImexTrackingSir.findByFechaComentarioCont", query = "SELECT i FROM ImexTrackingSir i WHERE i.fechaComentarioCont = :fechaComentarioCont")
    , @NamedQuery(name = "ImexTrackingSir.findByFechaComentarioCh", query = "SELECT i FROM ImexTrackingSir i WHERE i.fechaComentarioCh = :fechaComentarioCh")
    , @NamedQuery(name = "ImexTrackingSir.findBySello", query = "SELECT i FROM ImexTrackingSir i WHERE i.sello = :sello")
    , @NamedQuery(name = "ImexTrackingSir.findByPlacas", query = "SELECT i FROM ImexTrackingSir i WHERE i.placas = :placas")
    , @NamedQuery(name = "ImexTrackingSir.findByEirId", query = "SELECT i FROM ImexTrackingSir i WHERE i.eirId = :eirId")
    , @NamedQuery(name = "ImexTrackingSir.findByPedidoGeneradoId", query = "SELECT i FROM ImexTrackingSir i WHERE i.pedidoGeneradoId = :pedidoGeneradoId")
    , @NamedQuery(name = "ImexTrackingSir.findByPOShipper", query = "SELECT i FROM ImexTrackingSir i WHERE i.pOShipper = :pOShipper")
    , @NamedQuery(name = "ImexTrackingSir.findByFechaPOShipper", query = "SELECT i FROM ImexTrackingSir i WHERE i.fechaPOShipper = :fechaPOShipper")
    , @NamedQuery(name = "ImexTrackingSir.findByIdCatPatios", query = "SELECT i FROM ImexTrackingSir i WHERE i.idCatPatios = :idCatPatios")
    , @NamedQuery(name = "ImexTrackingSir.findByHide", query = "SELECT i FROM ImexTrackingSir i WHERE i.hide = :hide")})
public class ImexTrackingSir implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IdTrackingSir")
    private Integer idTrackingSir;
    @Column(name = "Container")
    private Integer container;
    @Column(name = "Chasis")
    private Integer chasis;
    @Column(name = "DateRegistered")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegistered;
    @Column(name = "DateCompleted")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCompleted;
    @Column(name = "TranTypeId")
    private Integer tranTypeId;
    @Column(name = "StatusContainerId")
    private Integer statusContainerId;
    @Column(name = "DescripcionEvento")
    private String descripcionEvento;
    @Column(name = "Transportista")
    private String transportista;
    @Column(name = "Terminado")
    private Boolean terminado;
    @Column(name = "EnviadoTracking")
    private Boolean enviadoTracking;
    @Column(name = "TerminalName")
    private String terminalName;
    @Column(name = "TerminalId")
    private Integer terminalId;
    @Column(name = "EventPSEXTId")
    private Integer eventPSEXTId;
    @Column(name = "TipoServicioId")
    private Integer tipoServicioId;
    @Column(name = "ShipperId")
    private BigInteger shipperId;
    @Column(name = "Guia")
    private String guia;
    @Column(name = "clvmigrar")
    private Integer clvmigrar;
    @Column(name = "idmigrado")
    private Integer idmigrado;
    @Column(name = "FechaEscritura")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEscritura;
    @Column(name = "PagaManiobraId")
    private Integer pagaManiobraId;
    @Column(name = "Facturatario")
    private String facturatario;
    @Column(name = "Plataforma")
    private String plataforma;
    @Column(name = "Posicion")
    private String posicion;
    @Column(name = "UserImex")
    private String userImex;
    @Column(name = "Booking")
    private String booking;
    @Column(name = "TamanioId")
    private Integer tamanioId;
    @Column(name = "ClasificacionId")
    private Integer clasificacionId;
    @Column(name = "Id_Estacion_Origen")
    private String idEstacionOrigen;
    @Column(name = "IdManiobrasAnden")
    private Integer idManiobrasAnden;
    @Column(name = "PedidoProcesado")
    private Boolean pedidoProcesado;
    @Column(name = "Id_Estacion_Destino")
    private String idEstacionDestino;
    @Column(name = "UsuarioCambioCont")
    private String usuarioCambioCont;
    @Column(name = "ComentarioCont")
    private String comentarioCont;
    @Column(name = "UsuarioCambioCh")
    private String usuarioCambioCh;
    @Column(name = "ComentarioCh")
    private String comentarioCh;
    @Column(name = "FechaIngreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Column(name = "FechaComentarioCont")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaComentarioCont;
    @Column(name = "FechaComentarioCh")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaComentarioCh;
    @Column(name = "sello")
    private String sello;
    @Column(name = "Placas")
    private String placas;
    @Column(name = "EirId")
    private Integer eirId;
    @Basic(optional = false)
    @Column(name = "PedidoGeneradoId")
    private int pedidoGeneradoId;
    @Column(name = "POShipper")
    private String pOShipper;
    @Column(name = "FechaPOShipper")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPOShipper;
    @Column(name = "idCat_Patios")
    private Integer idCatPatios;
    @Column(name = "hide")
    private Boolean hide;

    public ImexTrackingSir() {
    }

    public ImexTrackingSir(Integer idTrackingSir) {
        this.idTrackingSir = idTrackingSir;
    }

    public ImexTrackingSir(Integer idTrackingSir, int pedidoGeneradoId) {
        this.idTrackingSir = idTrackingSir;
        this.pedidoGeneradoId = pedidoGeneradoId;
    }

    public Integer getIdTrackingSir() {
        return idTrackingSir;
    }

    public void setIdTrackingSir(Integer idTrackingSir) {
        this.idTrackingSir = idTrackingSir;
    }

    public Integer getContainer() {
        return container;
    }

    public void setContainer(Integer container) {
        this.container = container;
    }

    public Integer getChasis() {
        return chasis;
    }

    public void setChasis(Integer chasis) {
        this.chasis = chasis;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public Date getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public Integer getTranTypeId() {
        return tranTypeId;
    }

    public void setTranTypeId(Integer tranTypeId) {
        this.tranTypeId = tranTypeId;
    }

    public Integer getStatusContainerId() {
        return statusContainerId;
    }

    public void setStatusContainerId(Integer statusContainerId) {
        this.statusContainerId = statusContainerId;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    public void setDescripcionEvento(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
    }

    public String getTransportista() {
        return transportista;
    }

    public void setTransportista(String transportista) {
        this.transportista = transportista;
    }

    public Boolean getTerminado() {
        return terminado;
    }

    public void setTerminado(Boolean terminado) {
        this.terminado = terminado;
    }

    public Boolean getEnviadoTracking() {
        return enviadoTracking;
    }

    public void setEnviadoTracking(Boolean enviadoTracking) {
        this.enviadoTracking = enviadoTracking;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    public Integer getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(Integer terminalId) {
        this.terminalId = terminalId;
    }

    public Integer getEventPSEXTId() {
        return eventPSEXTId;
    }

    public void setEventPSEXTId(Integer eventPSEXTId) {
        this.eventPSEXTId = eventPSEXTId;
    }

    public Integer getTipoServicioId() {
        return tipoServicioId;
    }

    public void setTipoServicioId(Integer tipoServicioId) {
        this.tipoServicioId = tipoServicioId;
    }

    public BigInteger getShipperId() {
        return shipperId;
    }

    public void setShipperId(BigInteger shipperId) {
        this.shipperId = shipperId;
    }

    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }

    public Integer getClvmigrar() {
        return clvmigrar;
    }

    public void setClvmigrar(Integer clvmigrar) {
        this.clvmigrar = clvmigrar;
    }

    public Integer getIdmigrado() {
        return idmigrado;
    }

    public void setIdmigrado(Integer idmigrado) {
        this.idmigrado = idmigrado;
    }

    public Date getFechaEscritura() {
        return fechaEscritura;
    }

    public void setFechaEscritura(Date fechaEscritura) {
        this.fechaEscritura = fechaEscritura;
    }

    public Integer getPagaManiobraId() {
        return pagaManiobraId;
    }

    public void setPagaManiobraId(Integer pagaManiobraId) {
        this.pagaManiobraId = pagaManiobraId;
    }

    public String getFacturatario() {
        return facturatario;
    }

    public void setFacturatario(String facturatario) {
        this.facturatario = facturatario;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getUserImex() {
        return userImex;
    }

    public void setUserImex(String userImex) {
        this.userImex = userImex;
    }

    public String getBooking() {
        return booking;
    }

    public void setBooking(String booking) {
        this.booking = booking;
    }

    public Integer getTamanioId() {
        return tamanioId;
    }

    public void setTamanioId(Integer tamanioId) {
        this.tamanioId = tamanioId;
    }

    public Integer getClasificacionId() {
        return clasificacionId;
    }

    public void setClasificacionId(Integer clasificacionId) {
        this.clasificacionId = clasificacionId;
    }

    public String getIdEstacionOrigen() {
        return idEstacionOrigen;
    }

    public void setIdEstacionOrigen(String idEstacionOrigen) {
        this.idEstacionOrigen = idEstacionOrigen;
    }

    public Integer getIdManiobrasAnden() {
        return idManiobrasAnden;
    }

    public void setIdManiobrasAnden(Integer idManiobrasAnden) {
        this.idManiobrasAnden = idManiobrasAnden;
    }

    public Boolean getPedidoProcesado() {
        return pedidoProcesado;
    }

    public void setPedidoProcesado(Boolean pedidoProcesado) {
        this.pedidoProcesado = pedidoProcesado;
    }

    public String getIdEstacionDestino() {
        return idEstacionDestino;
    }

    public void setIdEstacionDestino(String idEstacionDestino) {
        this.idEstacionDestino = idEstacionDestino;
    }

    public String getUsuarioCambioCont() {
        return usuarioCambioCont;
    }

    public void setUsuarioCambioCont(String usuarioCambioCont) {
        this.usuarioCambioCont = usuarioCambioCont;
    }

    public String getComentarioCont() {
        return comentarioCont;
    }

    public void setComentarioCont(String comentarioCont) {
        this.comentarioCont = comentarioCont;
    }

    public String getUsuarioCambioCh() {
        return usuarioCambioCh;
    }

    public void setUsuarioCambioCh(String usuarioCambioCh) {
        this.usuarioCambioCh = usuarioCambioCh;
    }

    public String getComentarioCh() {
        return comentarioCh;
    }

    public void setComentarioCh(String comentarioCh) {
        this.comentarioCh = comentarioCh;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaComentarioCont() {
        return fechaComentarioCont;
    }

    public void setFechaComentarioCont(Date fechaComentarioCont) {
        this.fechaComentarioCont = fechaComentarioCont;
    }

    public Date getFechaComentarioCh() {
        return fechaComentarioCh;
    }

    public void setFechaComentarioCh(Date fechaComentarioCh) {
        this.fechaComentarioCh = fechaComentarioCh;
    }

    public String getSello() {
        return sello;
    }

    public void setSello(String sello) {
        this.sello = sello;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public Integer getEirId() {
        return eirId;
    }

    public void setEirId(Integer eirId) {
        this.eirId = eirId;
    }

    public int getPedidoGeneradoId() {
        return pedidoGeneradoId;
    }

    public void setPedidoGeneradoId(int pedidoGeneradoId) {
        this.pedidoGeneradoId = pedidoGeneradoId;
    }

    public String getPOShipper() {
        return pOShipper;
    }

    public void setPOShipper(String pOShipper) {
        this.pOShipper = pOShipper;
    }

    public Date getFechaPOShipper() {
        return fechaPOShipper;
    }

    public void setFechaPOShipper(Date fechaPOShipper) {
        this.fechaPOShipper = fechaPOShipper;
    }

    public Integer getIdCatPatios() {
        return idCatPatios;
    }

    public void setIdCatPatios(Integer idCatPatios) {
        this.idCatPatios = idCatPatios;
    }

    public Boolean getHide() {
        return hide;
    }

    public void setHide(Boolean hide) {
        this.hide = hide;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTrackingSir != null ? idTrackingSir.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexTrackingSir)) {
            return false;
        }
        ImexTrackingSir other = (ImexTrackingSir) object;
        if ((this.idTrackingSir == null && other.idTrackingSir != null) || (this.idTrackingSir != null && !this.idTrackingSir.equals(other.idTrackingSir))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexTrackingSir[ idTrackingSir=" + idTrackingSir + " ]";
    }
    
}
