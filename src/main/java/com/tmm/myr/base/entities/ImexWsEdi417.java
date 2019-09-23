/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmm.myr.base.entities;

import java.io.Serializable;
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
@Table(name = "Imex_WsEdi417")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexWsEdi417.findAll", query = "SELECT i FROM ImexWsEdi417 i")
    , @NamedQuery(name = "ImexWsEdi417.findByWsEdi417ID", query = "SELECT i FROM ImexWsEdi417 i WHERE i.wsEdi417ID = :wsEdi417ID")
    , @NamedQuery(name = "ImexWsEdi417.findByGuia", query = "SELECT i FROM ImexWsEdi417 i WHERE i.guia = :guia")
    , @NamedQuery(name = "ImexWsEdi417.findByFechaGuia", query = "SELECT i FROM ImexWsEdi417 i WHERE i.fechaGuia = :fechaGuia")
    , @NamedQuery(name = "ImexWsEdi417.findByUserImexId", query = "SELECT i FROM ImexWsEdi417 i WHERE i.userImexId = :userImexId")
    , @NamedQuery(name = "ImexWsEdi417.findByNiu", query = "SELECT i FROM ImexWsEdi417 i WHERE i.niu = :niu")
    , @NamedQuery(name = "ImexWsEdi417.findByFechaNIU", query = "SELECT i FROM ImexWsEdi417 i WHERE i.fechaNIU = :fechaNIU")
    , @NamedQuery(name = "ImexWsEdi417.findByEntry", query = "SELECT i FROM ImexWsEdi417 i WHERE i.entry = :entry")
    , @NamedQuery(name = "ImexWsEdi417.findByFechaENTRY", query = "SELECT i FROM ImexWsEdi417 i WHERE i.fechaENTRY = :fechaENTRY")
    , @NamedQuery(name = "ImexWsEdi417.findByFechaRegistro", query = "SELECT i FROM ImexWsEdi417 i WHERE i.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "ImexWsEdi417.findByN701", query = "SELECT i FROM ImexWsEdi417 i WHERE i.n701 = :n701")
    , @NamedQuery(name = "ImexWsEdi417.findByN702", query = "SELECT i FROM ImexWsEdi417 i WHERE i.n702 = :n702")
    , @NamedQuery(name = "ImexWsEdi417.findByN724", query = "SELECT i FROM ImexWsEdi417 i WHERE i.n724 = :n724")
    , @NamedQuery(name = "ImexWsEdi417.findByF902", query = "SELECT i FROM ImexWsEdi417 i WHERE i.f902 = :f902")
    , @NamedQuery(name = "ImexWsEdi417.findByF908", query = "SELECT i FROM ImexWsEdi417 i WHERE i.f908 = :f908")
    , @NamedQuery(name = "ImexWsEdi417.findByR205", query = "SELECT i FROM ImexWsEdi417 i WHERE i.r205 = :r205")
    , @NamedQuery(name = "ImexWsEdi417.findByH301", query = "SELECT i FROM ImexWsEdi417 i WHERE i.h301 = :h301")
    , @NamedQuery(name = "ImexWsEdi417.findByL503", query = "SELECT i FROM ImexWsEdi417 i WHERE i.l503 = :l503")
    , @NamedQuery(name = "ImexWsEdi417.findByL004", query = "SELECT i FROM ImexWsEdi417 i WHERE i.l004 = :l004")
    , @NamedQuery(name = "ImexWsEdi417.findByL008", query = "SELECT i FROM ImexWsEdi417 i WHERE i.l008 = :l008")
    , @NamedQuery(name = "ImexWsEdi417.findByL009", query = "SELECT i FROM ImexWsEdi417 i WHERE i.l009 = :l009")
    , @NamedQuery(name = "ImexWsEdi417.findByD902", query = "SELECT i FROM ImexWsEdi417 i WHERE i.d902 = :d902")
    , @NamedQuery(name = "ImexWsEdi417.findByD908", query = "SELECT i FROM ImexWsEdi417 i WHERE i.d908 = :d908")
    , @NamedQuery(name = "ImexWsEdi417.findByBx07", query = "SELECT i FROM ImexWsEdi417 i WHERE i.bx07 = :bx07")
    , @NamedQuery(name = "ImexWsEdi417.findByN102", query = "SELECT i FROM ImexWsEdi417 i WHERE i.n102 = :n102")
    , @NamedQuery(name = "ImexWsEdi417.findByN104", query = "SELECT i FROM ImexWsEdi417 i WHERE i.n104 = :n104")
    , @NamedQuery(name = "ImexWsEdi417.findByN101sh", query = "SELECT i FROM ImexWsEdi417 i WHERE i.n101sh = :n101sh")
    , @NamedQuery(name = "ImexWsEdi417.findByN102sh", query = "SELECT i FROM ImexWsEdi417 i WHERE i.n102sh = :n102sh")
    , @NamedQuery(name = "ImexWsEdi417.findByN104sh", query = "SELECT i FROM ImexWsEdi417 i WHERE i.n104sh = :n104sh")
    , @NamedQuery(name = "ImexWsEdi417.findByN101cn", query = "SELECT i FROM ImexWsEdi417 i WHERE i.n101cn = :n101cn")
    , @NamedQuery(name = "ImexWsEdi417.findByN102cn", query = "SELECT i FROM ImexWsEdi417 i WHERE i.n102cn = :n102cn")
    , @NamedQuery(name = "ImexWsEdi417.findByN104cn", query = "SELECT i FROM ImexWsEdi417 i WHERE i.n104cn = :n104cn")
    , @NamedQuery(name = "ImexWsEdi417.findByNoTren", query = "SELECT i FROM ImexWsEdi417 i WHERE i.noTren = :noTren")
    , @NamedQuery(name = "ImexWsEdi417.findByPFerroviaria", query = "SELECT i FROM ImexWsEdi417 i WHERE i.pFerroviaria = :pFerroviaria")
    , @NamedQuery(name = "ImexWsEdi417.findByStatusContainer", query = "SELECT i FROM ImexWsEdi417 i WHERE i.statusContainer = :statusContainer")
    , @NamedQuery(name = "ImexWsEdi417.findByNombreArchivo", query = "SELECT i FROM ImexWsEdi417 i WHERE i.nombreArchivo = :nombreArchivo")
    , @NamedQuery(name = "ImexWsEdi417.findByN901", query = "SELECT i FROM ImexWsEdi417 i WHERE i.n901 = :n901")
    , @NamedQuery(name = "ImexWsEdi417.findByN902", query = "SELECT i FROM ImexWsEdi417 i WHERE i.n902 = :n902")
    , @NamedQuery(name = "ImexWsEdi417.findByR201", query = "SELECT i FROM ImexWsEdi417 i WHERE i.r201 = :r201")
    , @NamedQuery(name = "ImexWsEdi417.findByR203", query = "SELECT i FROM ImexWsEdi417 i WHERE i.r203 = :r203")
    , @NamedQuery(name = "ImexWsEdi417.findByL502", query = "SELECT i FROM ImexWsEdi417 i WHERE i.l502 = :l502")
    , @NamedQuery(name = "ImexWsEdi417.findByN101bn", query = "SELECT i FROM ImexWsEdi417 i WHERE i.n101bn = :n101bn")
    , @NamedQuery(name = "ImexWsEdi417.findByN102bn", query = "SELECT i FROM ImexWsEdi417 i WHERE i.n102bn = :n102bn")
    , @NamedQuery(name = "ImexWsEdi417.findByN104bn", query = "SELECT i FROM ImexWsEdi417 i WHERE i.n104bn = :n104bn")
    , @NamedQuery(name = "ImexWsEdi417.findByL005", query = "SELECT i FROM ImexWsEdi417 i WHERE i.l005 = :l005")
    , @NamedQuery(name = "ImexWsEdi417.findByENTRYNumber", query = "SELECT i FROM ImexWsEdi417 i WHERE i.eNTRYNumber = :eNTRYNumber")
    , @NamedQuery(name = "ImexWsEdi417.findByNIUNumber", query = "SELECT i FROM ImexWsEdi417 i WHERE i.nIUNumber = :nIUNumber")
    , @NamedQuery(name = "ImexWsEdi417.findBySellos", query = "SELECT i FROM ImexWsEdi417 i WHERE i.sellos = :sellos")
    , @NamedQuery(name = "ImexWsEdi417.findByPeso", query = "SELECT i FROM ImexWsEdi417 i WHERE i.peso = :peso")
    , @NamedQuery(name = "ImexWsEdi417.findByUnidadMedida", query = "SELECT i FROM ImexWsEdi417 i WHERE i.unidadMedida = :unidadMedida")
    , @NamedQuery(name = "ImexWsEdi417.findByTransito", query = "SELECT i FROM ImexWsEdi417 i WHERE i.transito = :transito")
    , @NamedQuery(name = "ImexWsEdi417.findByOperacion", query = "SELECT i FROM ImexWsEdi417 i WHERE i.operacion = :operacion")
    , @NamedQuery(name = "ImexWsEdi417.findByContainerRelacionID", query = "SELECT i FROM ImexWsEdi417 i WHERE i.containerRelacionID = :containerRelacionID")
    , @NamedQuery(name = "ImexWsEdi417.findByFechaEscritura", query = "SELECT i FROM ImexWsEdi417 i WHERE i.fechaEscritura = :fechaEscritura")
    , @NamedQuery(name = "ImexWsEdi417.findByTerminalId", query = "SELECT i FROM ImexWsEdi417 i WHERE i.terminalId = :terminalId")
    , @NamedQuery(name = "ImexWsEdi417.findByImportador", query = "SELECT i FROM ImexWsEdi417 i WHERE i.importador = :importador")
    , @NamedQuery(name = "ImexWsEdi417.findByDomicilioImportador", query = "SELECT i FROM ImexWsEdi417 i WHERE i.domicilioImportador = :domicilioImportador")})
public class ImexWsEdi417 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "WsEdi417ID")
    private Integer wsEdi417ID;
    @Column(name = "Guia")
    private String guia;
    @Column(name = "FechaGuia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaGuia;
    @Column(name = "UserImexId")
    private Integer userImexId;
    @Column(name = "NIU")
    private Boolean niu;
    @Column(name = "FechaNIU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNIU;
    @Column(name = "ENTRY")
    private Boolean entry;
    @Column(name = "FechaENTRY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaENTRY;
    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "N701")
    private String n701;
    @Column(name = "N702")
    private String n702;
    @Column(name = "N724")
    private String n724;
    @Column(name = "F902")
    private String f902;
    @Column(name = "F908")
    private String f908;
    @Column(name = "R205")
    private String r205;
    @Column(name = "H301")
    private String h301;
    @Column(name = "L503")
    private String l503;
    @Column(name = "L004")
    private String l004;
    @Column(name = "L008")
    private String l008;
    @Column(name = "L009")
    private String l009;
    @Column(name = "D902")
    private String d902;
    @Column(name = "D908")
    private String d908;
    @Column(name = "BX07")
    private String bx07;
    @Column(name = "N102")
    private String n102;
    @Column(name = "N104")
    private String n104;
    @Column(name = "N101SH")
    private String n101sh;
    @Column(name = "N102SH")
    private String n102sh;
    @Column(name = "N104SH")
    private String n104sh;
    @Column(name = "N101CN")
    private String n101cn;
    @Column(name = "N102CN")
    private String n102cn;
    @Column(name = "N104CN")
    private String n104cn;
    @Column(name = "NoTren")
    private String noTren;
    @Column(name = "PFerroviaria")
    private String pFerroviaria;
    @Column(name = "statusContainer")
    private String statusContainer;
    @Column(name = "NombreArchivo")
    private String nombreArchivo;
    @Column(name = "N901")
    private String n901;
    @Column(name = "N902")
    private String n902;
    @Column(name = "R201")
    private String r201;
    @Column(name = "R203")
    private String r203;
    @Column(name = "L502")
    private String l502;
    @Column(name = "N101BN")
    private String n101bn;
    @Column(name = "N102BN")
    private String n102bn;
    @Column(name = "N104BN")
    private String n104bn;
    @Column(name = "L005")
    private String l005;
    @Column(name = "ENTRYNumber")
    private String eNTRYNumber;
    @Column(name = "NIUNumber")
    private String nIUNumber;
    @Column(name = "Sellos")
    private String sellos;
    @Column(name = "Peso")
    private String peso;
    @Column(name = "UnidadMedida")
    private String unidadMedida;
    @Column(name = "Transito")
    private String transito;
    @Column(name = "Operacion")
    private String operacion;
    @Column(name = "ContainerRelacionID")
    private Integer containerRelacionID;
    @Column(name = "FechaEscritura")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEscritura;
    @Column(name = "TerminalId")
    private Integer terminalId;
    @Column(name = "Importador")
    private String importador;
    @Column(name = "DomicilioImportador")
    private String domicilioImportador;
    @JoinColumn(name = "ContainerID", referencedColumnName = "ContainerId")
    @ManyToOne
    private ImexContainer containerID;

    public ImexWsEdi417() {
    }

    public ImexWsEdi417(Integer wsEdi417ID) {
        this.wsEdi417ID = wsEdi417ID;
    }

    public Integer getWsEdi417ID() {
        return wsEdi417ID;
    }

    public void setWsEdi417ID(Integer wsEdi417ID) {
        this.wsEdi417ID = wsEdi417ID;
    }

    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }

    public Date getFechaGuia() {
        return fechaGuia;
    }

    public void setFechaGuia(Date fechaGuia) {
        this.fechaGuia = fechaGuia;
    }

    public Integer getUserImexId() {
        return userImexId;
    }

    public void setUserImexId(Integer userImexId) {
        this.userImexId = userImexId;
    }

    public Boolean getNiu() {
        return niu;
    }

    public void setNiu(Boolean niu) {
        this.niu = niu;
    }

    public Date getFechaNIU() {
        return fechaNIU;
    }

    public void setFechaNIU(Date fechaNIU) {
        this.fechaNIU = fechaNIU;
    }

    public Boolean getEntry() {
        return entry;
    }

    public void setEntry(Boolean entry) {
        this.entry = entry;
    }

    public Date getFechaENTRY() {
        return fechaENTRY;
    }

    public void setFechaENTRY(Date fechaENTRY) {
        this.fechaENTRY = fechaENTRY;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getN701() {
        return n701;
    }

    public void setN701(String n701) {
        this.n701 = n701;
    }

    public String getN702() {
        return n702;
    }

    public void setN702(String n702) {
        this.n702 = n702;
    }

    public String getN724() {
        return n724;
    }

    public void setN724(String n724) {
        this.n724 = n724;
    }

    public String getF902() {
        return f902;
    }

    public void setF902(String f902) {
        this.f902 = f902;
    }

    public String getF908() {
        return f908;
    }

    public void setF908(String f908) {
        this.f908 = f908;
    }

    public String getR205() {
        return r205;
    }

    public void setR205(String r205) {
        this.r205 = r205;
    }

    public String getH301() {
        return h301;
    }

    public void setH301(String h301) {
        this.h301 = h301;
    }

    public String getL503() {
        return l503;
    }

    public void setL503(String l503) {
        this.l503 = l503;
    }

    public String getL004() {
        return l004;
    }

    public void setL004(String l004) {
        this.l004 = l004;
    }

    public String getL008() {
        return l008;
    }

    public void setL008(String l008) {
        this.l008 = l008;
    }

    public String getL009() {
        return l009;
    }

    public void setL009(String l009) {
        this.l009 = l009;
    }

    public String getD902() {
        return d902;
    }

    public void setD902(String d902) {
        this.d902 = d902;
    }

    public String getD908() {
        return d908;
    }

    public void setD908(String d908) {
        this.d908 = d908;
    }

    public String getBx07() {
        return bx07;
    }

    public void setBx07(String bx07) {
        this.bx07 = bx07;
    }

    public String getN102() {
        return n102;
    }

    public void setN102(String n102) {
        this.n102 = n102;
    }

    public String getN104() {
        return n104;
    }

    public void setN104(String n104) {
        this.n104 = n104;
    }

    public String getN101sh() {
        return n101sh;
    }

    public void setN101sh(String n101sh) {
        this.n101sh = n101sh;
    }

    public String getN102sh() {
        return n102sh;
    }

    public void setN102sh(String n102sh) {
        this.n102sh = n102sh;
    }

    public String getN104sh() {
        return n104sh;
    }

    public void setN104sh(String n104sh) {
        this.n104sh = n104sh;
    }

    public String getN101cn() {
        return n101cn;
    }

    public void setN101cn(String n101cn) {
        this.n101cn = n101cn;
    }

    public String getN102cn() {
        return n102cn;
    }

    public void setN102cn(String n102cn) {
        this.n102cn = n102cn;
    }

    public String getN104cn() {
        return n104cn;
    }

    public void setN104cn(String n104cn) {
        this.n104cn = n104cn;
    }

    public String getNoTren() {
        return noTren;
    }

    public void setNoTren(String noTren) {
        this.noTren = noTren;
    }

    public String getPFerroviaria() {
        return pFerroviaria;
    }

    public void setPFerroviaria(String pFerroviaria) {
        this.pFerroviaria = pFerroviaria;
    }

    public String getStatusContainer() {
        return statusContainer;
    }

    public void setStatusContainer(String statusContainer) {
        this.statusContainer = statusContainer;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getN901() {
        return n901;
    }

    public void setN901(String n901) {
        this.n901 = n901;
    }

    public String getN902() {
        return n902;
    }

    public void setN902(String n902) {
        this.n902 = n902;
    }

    public String getR201() {
        return r201;
    }

    public void setR201(String r201) {
        this.r201 = r201;
    }

    public String getR203() {
        return r203;
    }

    public void setR203(String r203) {
        this.r203 = r203;
    }

    public String getL502() {
        return l502;
    }

    public void setL502(String l502) {
        this.l502 = l502;
    }

    public String getN101bn() {
        return n101bn;
    }

    public void setN101bn(String n101bn) {
        this.n101bn = n101bn;
    }

    public String getN102bn() {
        return n102bn;
    }

    public void setN102bn(String n102bn) {
        this.n102bn = n102bn;
    }

    public String getN104bn() {
        return n104bn;
    }

    public void setN104bn(String n104bn) {
        this.n104bn = n104bn;
    }

    public String getL005() {
        return l005;
    }

    public void setL005(String l005) {
        this.l005 = l005;
    }

    public String getENTRYNumber() {
        return eNTRYNumber;
    }

    public void setENTRYNumber(String eNTRYNumber) {
        this.eNTRYNumber = eNTRYNumber;
    }

    public String getNIUNumber() {
        return nIUNumber;
    }

    public void setNIUNumber(String nIUNumber) {
        this.nIUNumber = nIUNumber;
    }

    public String getSellos() {
        return sellos;
    }

    public void setSellos(String sellos) {
        this.sellos = sellos;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getTransito() {
        return transito;
    }

    public void setTransito(String transito) {
        this.transito = transito;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Integer getContainerRelacionID() {
        return containerRelacionID;
    }

    public void setContainerRelacionID(Integer containerRelacionID) {
        this.containerRelacionID = containerRelacionID;
    }

    public Date getFechaEscritura() {
        return fechaEscritura;
    }

    public void setFechaEscritura(Date fechaEscritura) {
        this.fechaEscritura = fechaEscritura;
    }

    public Integer getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(Integer terminalId) {
        this.terminalId = terminalId;
    }

    public String getImportador() {
        return importador;
    }

    public void setImportador(String importador) {
        this.importador = importador;
    }

    public String getDomicilioImportador() {
        return domicilioImportador;
    }

    public void setDomicilioImportador(String domicilioImportador) {
        this.domicilioImportador = domicilioImportador;
    }

    public ImexContainer getContainerID() {
        return containerID;
    }

    public void setContainerID(ImexContainer containerID) {
        this.containerID = containerID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wsEdi417ID != null ? wsEdi417ID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexWsEdi417)) {
            return false;
        }
        ImexWsEdi417 other = (ImexWsEdi417) object;
        if ((this.wsEdi417ID == null && other.wsEdi417ID != null) || (this.wsEdi417ID != null && !this.wsEdi417ID.equals(other.wsEdi417ID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexWsEdi417[ wsEdi417ID=" + wsEdi417ID + " ]";
    }
    
}
