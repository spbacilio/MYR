/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmm.myr.base.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author bacil
 */
@Entity
@Table(name = "Imex_Terminal")
@XmlRootElement
public class ImexTerminal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TerminalId")
    private Integer terminalId;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Codigo")
    private String codigo;
    @Column(name = "Splc")
    private String splc;
    @Column(name = "Activo")
    private Boolean activo;
    @Column(name = "Interpacifico")
    private Boolean interpacifico;
    @Column(name = "horas")
    private Integer horas;
    @Column(name = "horaDiferencia")
    private Integer horaDiferencia;
    @Column(name = "EmailOperaciones")
    private String emailOperaciones;
    @Column(name = "AceptaCambioPatio")
    private Boolean aceptaCambioPatio;
    @Basic(optional = false)
    @Column(name = "GeneraPedido")
    private boolean generaPedido;
    @Column(name = "Maritimo")
    private Integer maritimo;
    @Column(name = "ATR")
    private Boolean atr;
    @Column(name = "Intermodal")
    private Boolean intermodal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Latitud")
    private BigDecimal latitud;
    @Column(name = "Longitud")
    private BigDecimal longitud;
    @Column(name = "RutaServerLocal")
    private String rutaServerLocal;
    @Column(name = "Remolques")
    private Boolean remolques;
    @Column(name = "Trasvase")
    private Boolean trasvase;
    @Column(name = "SegmentoRed")
    private String segmentoRed;
    @Column(name = "SIMEXPRO")
    private Boolean simexpro;
    @Column(name = "SIMEX_API")
    private Boolean simexApi;
    @Column(name = "MaxContainers")
    private Integer maxContainers;
    @Column(name = "TiempoRecoleccion")
    private Integer tiempoRecoleccion;
    @OneToMany(mappedBy = "terminalId")
    private Collection<ImexTarifaShipper> imexTarifaShipperCollection;

    public ImexTerminal() {
    }

    public ImexTerminal(Integer terminalId) {
        this.terminalId = terminalId;
    }

    public ImexTerminal(Integer terminalId, boolean generaPedido) {
        this.terminalId = terminalId;
        this.generaPedido = generaPedido;
    }

    public Integer getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(Integer terminalId) {
        this.terminalId = terminalId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSplc() {
        return splc;
    }

    public void setSplc(String splc) {
        this.splc = splc;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Boolean getInterpacifico() {
        return interpacifico;
    }

    public void setInterpacifico(Boolean interpacifico) {
        this.interpacifico = interpacifico;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Integer getHoraDiferencia() {
        return horaDiferencia;
    }

    public void setHoraDiferencia(Integer horaDiferencia) {
        this.horaDiferencia = horaDiferencia;
    }

    public String getEmailOperaciones() {
        return emailOperaciones;
    }

    public void setEmailOperaciones(String emailOperaciones) {
        this.emailOperaciones = emailOperaciones;
    }

    public Boolean getAceptaCambioPatio() {
        return aceptaCambioPatio;
    }

    public void setAceptaCambioPatio(Boolean aceptaCambioPatio) {
        this.aceptaCambioPatio = aceptaCambioPatio;
    }

    public boolean getGeneraPedido() {
        return generaPedido;
    }

    public void setGeneraPedido(boolean generaPedido) {
        this.generaPedido = generaPedido;
    }

    public Integer getMaritimo() {
        return maritimo;
    }

    public void setMaritimo(Integer maritimo) {
        this.maritimo = maritimo;
    }

    public Boolean getAtr() {
        return atr;
    }

    public void setAtr(Boolean atr) {
        this.atr = atr;
    }

    public Boolean getIntermodal() {
        return intermodal;
    }

    public void setIntermodal(Boolean intermodal) {
        this.intermodal = intermodal;
    }

    public BigDecimal getLatitud() {
        return latitud;
    }

    public void setLatitud(BigDecimal latitud) {
        this.latitud = latitud;
    }

    public BigDecimal getLongitud() {
        return longitud;
    }

    public void setLongitud(BigDecimal longitud) {
        this.longitud = longitud;
    }

    public String getRutaServerLocal() {
        return rutaServerLocal;
    }

    public void setRutaServerLocal(String rutaServerLocal) {
        this.rutaServerLocal = rutaServerLocal;
    }

    public Boolean getRemolques() {
        return remolques;
    }

    public void setRemolques(Boolean remolques) {
        this.remolques = remolques;
    }

    public Boolean getTrasvase() {
        return trasvase;
    }

    public void setTrasvase(Boolean trasvase) {
        this.trasvase = trasvase;
    }

    public String getSegmentoRed() {
        return segmentoRed;
    }

    public void setSegmentoRed(String segmentoRed) {
        this.segmentoRed = segmentoRed;
    }

    public Boolean getSimexpro() {
        return simexpro;
    }

    public void setSimexpro(Boolean simexpro) {
        this.simexpro = simexpro;
    }

    public Boolean getSimexApi() {
        return simexApi;
    }

    public void setSimexApi(Boolean simexApi) {
        this.simexApi = simexApi;
    }

    public Integer getMaxContainers() {
        return maxContainers;
    }

    public void setMaxContainers(Integer maxContainers) {
        this.maxContainers = maxContainers;
    }

    public Integer getTiempoRecoleccion() {
        return tiempoRecoleccion;
    }

    public void setTiempoRecoleccion(Integer tiempoRecoleccion) {
        this.tiempoRecoleccion = tiempoRecoleccion;
    }

    @XmlTransient
    public Collection<ImexTarifaShipper> getImexTarifaShipperCollection() {
        return imexTarifaShipperCollection;
    }

    public void setImexTarifaShipperCollection(Collection<ImexTarifaShipper> imexTarifaShipperCollection) {
        this.imexTarifaShipperCollection = imexTarifaShipperCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (terminalId != null ? terminalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexTerminal)) {
            return false;
        }
        ImexTerminal other = (ImexTerminal) object;
        if ((this.terminalId == null && other.terminalId != null) || (this.terminalId != null && !this.terminalId.equals(other.terminalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexTerminal[ terminalId=" + terminalId + " ]";
    }
    
}
