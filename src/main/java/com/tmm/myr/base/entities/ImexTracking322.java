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
//import javax.persistence.Id;
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
//@Table(name = "Imex_Tracking322")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "ImexTracking322.findAll", query = "SELECT i FROM ImexTracking322 i")
//    , @NamedQuery(name = "ImexTracking322.findByIdTracking", query = "SELECT i FROM ImexTracking322 i WHERE i.idTracking = :idTracking")
//    , @NamedQuery(name = "ImexTracking322.findByEvento", query = "SELECT i FROM ImexTracking322 i WHERE i.evento = :evento")
//    , @NamedQuery(name = "ImexTracking322.findByContenedor", query = "SELECT i FROM ImexTracking322 i WHERE i.contenedor = :contenedor")
//    , @NamedQuery(name = "ImexTracking322.findByChasis", query = "SELECT i FROM ImexTracking322 i WHERE i.chasis = :chasis")
//    , @NamedQuery(name = "ImexTracking322.findByLlenoVacio", query = "SELECT i FROM ImexTracking322 i WHERE i.llenoVacio = :llenoVacio")
//    , @NamedQuery(name = "ImexTracking322.findByMotorCarrier", query = "SELECT i FROM ImexTracking322 i WHERE i.motorCarrier = :motorCarrier")
//    , @NamedQuery(name = "ImexTracking322.findByIdMotorCarrier", query = "SELECT i FROM ImexTracking322 i WHERE i.idMotorCarrier = :idMotorCarrier")
//    , @NamedQuery(name = "ImexTracking322.findByFechaEvento", query = "SELECT i FROM ImexTracking322 i WHERE i.fechaEvento = :fechaEvento")
//    , @NamedQuery(name = "ImexTracking322.findByHoraEvento", query = "SELECT i FROM ImexTracking322 i WHERE i.horaEvento = :horaEvento")
//    , @NamedQuery(name = "ImexTracking322.findBySello", query = "SELECT i FROM ImexTracking322 i WHERE i.sello = :sello")
//    , @NamedQuery(name = "ImexTracking322.findByTamanoContenedor", query = "SELECT i FROM ImexTracking322 i WHERE i.tamanoContenedor = :tamanoContenedor")
//    , @NamedQuery(name = "ImexTracking322.findByGuia", query = "SELECT i FROM ImexTracking322 i WHERE i.guia = :guia")
//    , @NamedQuery(name = "ImexTracking322.findByPeso", query = "SELECT i FROM ImexTracking322 i WHERE i.peso = :peso")
//    , @NamedQuery(name = "ImexTracking322.findByIdEstacionOrigen", query = "SELECT i FROM ImexTracking322 i WHERE i.idEstacionOrigen = :idEstacionOrigen")
//    , @NamedQuery(name = "ImexTracking322.findByIdEstacionDestino", query = "SELECT i FROM ImexTracking322 i WHERE i.idEstacionDestino = :idEstacionDestino")
//    , @NamedQuery(name = "ImexTracking322.findByBooking", query = "SELECT i FROM ImexTracking322 i WHERE i.booking = :booking")
//    , @NamedQuery(name = "ImexTracking322.findByBookingUP", query = "SELECT i FROM ImexTracking322 i WHERE i.bookingUP = :bookingUP")
//    , @NamedQuery(name = "ImexTracking322.findByRevenue", query = "SELECT i FROM ImexTracking322 i WHERE i.revenue = :revenue")
//    , @NamedQuery(name = "ImexTracking322.findByIdConsignatario", query = "SELECT i FROM ImexTracking322 i WHERE i.idConsignatario = :idConsignatario")
//    , @NamedQuery(name = "ImexTracking322.findByConsignatario", query = "SELECT i FROM ImexTracking322 i WHERE i.consignatario = :consignatario")
//    , @NamedQuery(name = "ImexTracking322.findByIdShipper", query = "SELECT i FROM ImexTracking322 i WHERE i.idShipper = :idShipper")
//    , @NamedQuery(name = "ImexTracking322.findByShipper", query = "SELECT i FROM ImexTracking322 i WHERE i.shipper = :shipper")
//    , @NamedQuery(name = "ImexTracking322.findByPosicionPlataforma", query = "SELECT i FROM ImexTracking322 i WHERE i.posicionPlataforma = :posicionPlataforma")
//    , @NamedQuery(name = "ImexTracking322.findByIDBillofLading", query = "SELECT i FROM ImexTracking322 i WHERE i.iDBillofLading = :iDBillofLading")
//    , @NamedQuery(name = "ImexTracking322.findByBillofLading", query = "SELECT i FROM ImexTracking322 i WHERE i.billofLading = :billofLading")
//    , @NamedQuery(name = "ImexTracking322.findBySaedisId", query = "SELECT i FROM ImexTracking322 i WHERE i.saedisId = :saedisId")
//    , @NamedQuery(name = "ImexTracking322.findByEnviado", query = "SELECT i FROM ImexTracking322 i WHERE i.enviado = :enviado")
//    , @NamedQuery(name = "ImexTracking322.findByFEnvio", query = "SELECT i FROM ImexTracking322 i WHERE i.fEnvio = :fEnvio")
//    , @NamedQuery(name = "ImexTracking322.findByTerminalId", query = "SELECT i FROM ImexTracking322 i WHERE i.terminalId = :terminalId")
//    , @NamedQuery(name = "ImexTracking322.findByShipperId", query = "SELECT i FROM ImexTracking322 i WHERE i.shipperId = :shipperId")
//    , @NamedQuery(name = "ImexTracking322.findByFechaRegistro", query = "SELECT i FROM ImexTracking322 i WHERE i.fechaRegistro = :fechaRegistro")
//    , @NamedQuery(name = "ImexTracking322.findByTipoServicioId", query = "SELECT i FROM ImexTracking322 i WHERE i.tipoServicioId = :tipoServicioId")
//    , @NamedQuery(name = "ImexTracking322.findByFechaEvento1", query = "SELECT i FROM ImexTracking322 i WHERE i.fechaEvento1 = :fechaEvento1")
//    , @NamedQuery(name = "ImexTracking322.findByTranTypeId", query = "SELECT i FROM ImexTracking322 i WHERE i.tranTypeId = :tranTypeId")
//    , @NamedQuery(name = "ImexTracking322.findByIdTrackingSir", query = "SELECT i FROM ImexTracking322 i WHERE i.idTrackingSir = :idTrackingSir")
//    , @NamedQuery(name = "ImexTracking322.findByFechaGuiaEdi", query = "SELECT i FROM ImexTracking322 i WHERE i.fechaGuiaEdi = :fechaGuiaEdi")})
//public class ImexTracking322 implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Id
//    @Basic(optional = false)
//    @Column(name = "Id_Tracking")
//    private Integer idTracking;
//    @Basic(optional = false)
//    @Column(name = "Evento")
//    private String evento;
//    @Column(name = "Contenedor")
//    private String contenedor;
//    @Column(name = "Chasis")
//    private String chasis;
//    @Column(name = "Lleno_Vacio")
//    private Boolean llenoVacio;
//    @Column(name = "Motor_Carrier")
//    private String motorCarrier;
//    @Column(name = "Id_Motor_Carrier")
//    private String idMotorCarrier;
//    @Column(name = "Fecha_Evento")
//    private String fechaEvento;
//    @Column(name = "Hora_Evento")
//    private String horaEvento;
//    @Column(name = "Sello")
//    private String sello;
//    @Column(name = "Tamano_Contenedor")
//    private String tamanoContenedor;
//    @Column(name = "Guia")
//    private String guia;
//    @Column(name = "Peso")
//    private String peso;
//    @Column(name = "Id_Estacion_Origen")
//    private String idEstacionOrigen;
//    @Column(name = "Id_Estacion_Destino")
//    private String idEstacionDestino;
//    @Column(name = "Booking")
//    private String booking;
//    @Column(name = "Booking_UP")
//    private String bookingUP;
//    @Column(name = "Revenue")
//    private String revenue;
//    @Column(name = "Id_Consignatario")
//    private String idConsignatario;
//    @Column(name = "Consignatario")
//    private String consignatario;
//    @Column(name = "Id_Shipper")
//    private String idShipper;
//    @Column(name = "Shipper")
//    private String shipper;
//    @Column(name = "Posicion_Plataforma")
//    private String posicionPlataforma;
//    @Column(name = "ID_Bill_of_Lading")
//    private String iDBillofLading;
//    @Column(name = "Bill_of_Lading")
//    private String billofLading;
//    @Column(name = "SaedisId")
//    private Integer saedisId;
//    @Column(name = "Enviado")
//    private Short enviado;
//    @Column(name = "F_Envio")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date fEnvio;
//    @Column(name = "TerminalId")
//    private Integer terminalId;
//    @Column(name = "ShipperId")
//    private BigInteger shipperId;
//    @Column(name = "FechaRegistro")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date fechaRegistro;
//    @Column(name = "TipoServicioId")
//    private Integer tipoServicioId;
//    @Column(name = "FechaEvento")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date fechaEvento1;
//    @Column(name = "TranTypeId")
//    private Integer tranTypeId;
//    @Column(name = "IdTrackingSir")
//    private Integer idTrackingSir;
//    @Column(name = "FechaGuiaEdi")
//    private String fechaGuiaEdi;
//
//    public ImexTracking322() {
//    }
//
//    public ImexTracking322(Integer idTracking) {
//        this.idTracking = idTracking;
//    }
//
//    public ImexTracking322(Integer idTracking, String evento) {
//        this.idTracking = idTracking;
//        this.evento = evento;
//    }
//
//    public Integer getIdTracking() {
//        return idTracking;
//    }
//
//    public void setIdTracking(Integer idTracking) {
//        this.idTracking = idTracking;
//    }
//
//    public String getEvento() {
//        return evento;
//    }
//
//    public void setEvento(String evento) {
//        this.evento = evento;
//    }
//
//    public String getContenedor() {
//        return contenedor;
//    }
//
//    public void setContenedor(String contenedor) {
//        this.contenedor = contenedor;
//    }
//
//    public String getChasis() {
//        return chasis;
//    }
//
//    public void setChasis(String chasis) {
//        this.chasis = chasis;
//    }
//
//    public Boolean getLlenoVacio() {
//        return llenoVacio;
//    }
//
//    public void setLlenoVacio(Boolean llenoVacio) {
//        this.llenoVacio = llenoVacio;
//    }
//
//    public String getMotorCarrier() {
//        return motorCarrier;
//    }
//
//    public void setMotorCarrier(String motorCarrier) {
//        this.motorCarrier = motorCarrier;
//    }
//
//    public String getIdMotorCarrier() {
//        return idMotorCarrier;
//    }
//
//    public void setIdMotorCarrier(String idMotorCarrier) {
//        this.idMotorCarrier = idMotorCarrier;
//    }
//
//    public String getFechaEvento() {
//        return fechaEvento;
//    }
//
//    public void setFechaEvento(String fechaEvento) {
//        this.fechaEvento = fechaEvento;
//    }
//
//    public String getHoraEvento() {
//        return horaEvento;
//    }
//
//    public void setHoraEvento(String horaEvento) {
//        this.horaEvento = horaEvento;
//    }
//
//    public String getSello() {
//        return sello;
//    }
//
//    public void setSello(String sello) {
//        this.sello = sello;
//    }
//
//    public String getTamanoContenedor() {
//        return tamanoContenedor;
//    }
//
//    public void setTamanoContenedor(String tamanoContenedor) {
//        this.tamanoContenedor = tamanoContenedor;
//    }
//
//    public String getGuia() {
//        return guia;
//    }
//
//    public void setGuia(String guia) {
//        this.guia = guia;
//    }
//
//    public String getPeso() {
//        return peso;
//    }
//
//    public void setPeso(String peso) {
//        this.peso = peso;
//    }
//
//    public String getIdEstacionOrigen() {
//        return idEstacionOrigen;
//    }
//
//    public void setIdEstacionOrigen(String idEstacionOrigen) {
//        this.idEstacionOrigen = idEstacionOrigen;
//    }
//
//    public String getIdEstacionDestino() {
//        return idEstacionDestino;
//    }
//
//    public void setIdEstacionDestino(String idEstacionDestino) {
//        this.idEstacionDestino = idEstacionDestino;
//    }
//
//    public String getBooking() {
//        return booking;
//    }
//
//    public void setBooking(String booking) {
//        this.booking = booking;
//    }
//
//    public String getBookingUP() {
//        return bookingUP;
//    }
//
//    public void setBookingUP(String bookingUP) {
//        this.bookingUP = bookingUP;
//    }
//
//    public String getRevenue() {
//        return revenue;
//    }
//
//    public void setRevenue(String revenue) {
//        this.revenue = revenue;
//    }
//
//    public String getIdConsignatario() {
//        return idConsignatario;
//    }
//
//    public void setIdConsignatario(String idConsignatario) {
//        this.idConsignatario = idConsignatario;
//    }
//
//    public String getConsignatario() {
//        return consignatario;
//    }
//
//    public void setConsignatario(String consignatario) {
//        this.consignatario = consignatario;
//    }
//
//    public String getIdShipper() {
//        return idShipper;
//    }
//
//    public void setIdShipper(String idShipper) {
//        this.idShipper = idShipper;
//    }
//
//    public String getShipper() {
//        return shipper;
//    }
//
//    public void setShipper(String shipper) {
//        this.shipper = shipper;
//    }
//
//    public String getPosicionPlataforma() {
//        return posicionPlataforma;
//    }
//
//    public void setPosicionPlataforma(String posicionPlataforma) {
//        this.posicionPlataforma = posicionPlataforma;
//    }
//
//    public String getIDBillofLading() {
//        return iDBillofLading;
//    }
//
//    public void setIDBillofLading(String iDBillofLading) {
//        this.iDBillofLading = iDBillofLading;
//    }
//
//    public String getBillofLading() {
//        return billofLading;
//    }
//
//    public void setBillofLading(String billofLading) {
//        this.billofLading = billofLading;
//    }
//
//    public Integer getSaedisId() {
//        return saedisId;
//    }
//
//    public void setSaedisId(Integer saedisId) {
//        this.saedisId = saedisId;
//    }
//
//    public Short getEnviado() {
//        return enviado;
//    }
//
//    public void setEnviado(Short enviado) {
//        this.enviado = enviado;
//    }
//
//    public Date getFEnvio() {
//        return fEnvio;
//    }
//
//    public void setFEnvio(Date fEnvio) {
//        this.fEnvio = fEnvio;
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
//    public BigInteger getShipperId() {
//        return shipperId;
//    }
//
//    public void setShipperId(BigInteger shipperId) {
//        this.shipperId = shipperId;
//    }
//
//    public Date getFechaRegistro() {
//        return fechaRegistro;
//    }
//
//    public void setFechaRegistro(Date fechaRegistro) {
//        this.fechaRegistro = fechaRegistro;
//    }
//
//    public Integer getTipoServicioId() {
//        return tipoServicioId;
//    }
//
//    public void setTipoServicioId(Integer tipoServicioId) {
//        this.tipoServicioId = tipoServicioId;
//    }
//
//    public Date getFechaEvento1() {
//        return fechaEvento1;
//    }
//
//    public void setFechaEvento1(Date fechaEvento1) {
//        this.fechaEvento1 = fechaEvento1;
//    }
//
//    public Integer getTranTypeId() {
//        return tranTypeId;
//    }
//
//    public void setTranTypeId(Integer tranTypeId) {
//        this.tranTypeId = tranTypeId;
//    }
//
//    public Integer getIdTrackingSir() {
//        return idTrackingSir;
//    }
//
//    public void setIdTrackingSir(Integer idTrackingSir) {
//        this.idTrackingSir = idTrackingSir;
//    }
//
//    public String getFechaGuiaEdi() {
//        return fechaGuiaEdi;
//    }
//
//    public void setFechaGuiaEdi(String fechaGuiaEdi) {
//        this.fechaGuiaEdi = fechaGuiaEdi;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (idTracking != null ? idTracking.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof ImexTracking322)) {
//            return false;
//        }
//        ImexTracking322 other = (ImexTracking322) object;
//        if ((this.idTracking == null && other.idTracking != null) || (this.idTracking != null && !this.idTracking.equals(other.idTracking))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.tmm.myr.base.entities.ImexTracking322[ idTracking=" + idTracking + " ]";
//    }
//    
//}
