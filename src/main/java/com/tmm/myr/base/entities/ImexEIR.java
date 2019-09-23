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
@Table(name = "Imex_EIR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexEIR.findAll", query = "SELECT i FROM ImexEIR i")
    , @NamedQuery(name = "ImexEIR.findByEirId", query = "SELECT i FROM ImexEIR i WHERE i.eirId = :eirId")
    , @NamedQuery(name = "ImexEIR.findByEirContenedorId", query = "SELECT i FROM ImexEIR i WHERE i.eirContenedorId = :eirContenedorId")
    , @NamedQuery(name = "ImexEIR.findByEirChasisId", query = "SELECT i FROM ImexEIR i WHERE i.eirChasisId = :eirChasisId")
    , @NamedQuery(name = "ImexEIR.findByClasificacionId", query = "SELECT i FROM ImexEIR i WHERE i.clasificacionId = :clasificacionId")
    , @NamedQuery(name = "ImexEIR.findByTamanioId", query = "SELECT i FROM ImexEIR i WHERE i.tamanioId = :tamanioId")
    , @NamedQuery(name = "ImexEIR.findByDaniosId", query = "SELECT i FROM ImexEIR i WHERE i.daniosId = :daniosId")
    , @NamedQuery(name = "ImexEIR.findByTerminalId", query = "SELECT i FROM ImexEIR i WHERE i.terminalId = :terminalId")
    , @NamedQuery(name = "ImexEIR.findByChassisId", query = "SELECT i FROM ImexEIR i WHERE i.chassisId = :chassisId")
    , @NamedQuery(name = "ImexEIR.findByContainerId", query = "SELECT i FROM ImexEIR i WHERE i.containerId = :containerId")
    , @NamedQuery(name = "ImexEIR.findByUsuario", query = "SELECT i FROM ImexEIR i WHERE i.usuario = :usuario")
    , @NamedQuery(name = "ImexEIR.findByFechaEIR", query = "SELECT i FROM ImexEIR i WHERE i.fechaEIR = :fechaEIR")
    , @NamedQuery(name = "ImexEIR.findByFechaEscritura", query = "SELECT i FROM ImexEIR i WHERE i.fechaEscritura = :fechaEscritura")
    , @NamedQuery(name = "ImexEIR.findByGrafiti", query = "SELECT i FROM ImexEIR i WHERE i.grafiti = :grafiti")
    , @NamedQuery(name = "ImexEIR.findByFumigado", query = "SELECT i FROM ImexEIR i WHERE i.fumigado = :fumigado")
    , @NamedQuery(name = "ImexEIR.findByFechaFumigado", query = "SELECT i FROM ImexEIR i WHERE i.fechaFumigado = :fechaFumigado")
    , @NamedQuery(name = "ImexEIR.findByComentario", query = "SELECT i FROM ImexEIR i WHERE i.comentario = :comentario")
    , @NamedQuery(name = "ImexEIR.findByFechaComentario", query = "SELECT i FROM ImexEIR i WHERE i.fechaComentario = :fechaComentario")
    , @NamedQuery(name = "ImexEIR.findByDaniosIdPrevious", query = "SELECT i FROM ImexEIR i WHERE i.daniosIdPrevious = :daniosIdPrevious")
    , @NamedQuery(name = "ImexEIR.findByPreviousComments", query = "SELECT i FROM ImexEIR i WHERE i.previousComments = :previousComments")
    , @NamedQuery(name = "ImexEIR.findByDatePreviousComments", query = "SELECT i FROM ImexEIR i WHERE i.datePreviousComments = :datePreviousComments")})
public class ImexEIR implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EirId")
    private Integer eirId;
    @Column(name = "EirContenedorId")
    private Integer eirContenedorId;
    @Column(name = "EirChasisId")
    private Integer eirChasisId;
    @Column(name = "ClasificacionId")
    private Integer clasificacionId;
    @Column(name = "TamanioId")
    private Integer tamanioId;
    @Column(name = "DaniosId")
    private Integer daniosId;
    @Column(name = "TerminalId")
    private Integer terminalId;
    @Column(name = "ChassisId")
    private Integer chassisId;
    @Column(name = "ContainerId")
    private Integer containerId;
    @Column(name = "Usuario")
    private String usuario;
    @Column(name = "FechaEIR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEIR;
    @Column(name = "FechaEscritura")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEscritura;
    @Basic(optional = false)
    @Column(name = "Grafiti")
    private boolean grafiti;
    @Basic(optional = false)
    @Column(name = "Fumigado")
    private boolean fumigado;
    @Column(name = "FechaFumigado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFumigado;
    @Column(name = "Comentario")
    private String comentario;
    @Column(name = "FechaComentario")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaComentario;
    @Column(name = "DaniosIdPrevious")
    private Integer daniosIdPrevious;
    @Column(name = "PreviousComments")
    private String previousComments;
    @Column(name = "DatePreviousComments")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datePreviousComments;

    public ImexEIR() {
    }

    public ImexEIR(Integer eirId) {
        this.eirId = eirId;
    }

    public ImexEIR(Integer eirId, boolean grafiti, boolean fumigado) {
        this.eirId = eirId;
        this.grafiti = grafiti;
        this.fumigado = fumigado;
    }

    public Integer getEirId() {
        return eirId;
    }

    public void setEirId(Integer eirId) {
        this.eirId = eirId;
    }

    public Integer getEirContenedorId() {
        return eirContenedorId;
    }

    public void setEirContenedorId(Integer eirContenedorId) {
        this.eirContenedorId = eirContenedorId;
    }

    public Integer getEirChasisId() {
        return eirChasisId;
    }

    public void setEirChasisId(Integer eirChasisId) {
        this.eirChasisId = eirChasisId;
    }

    public Integer getClasificacionId() {
        return clasificacionId;
    }

    public void setClasificacionId(Integer clasificacionId) {
        this.clasificacionId = clasificacionId;
    }

    public Integer getTamanioId() {
        return tamanioId;
    }

    public void setTamanioId(Integer tamanioId) {
        this.tamanioId = tamanioId;
    }

    public Integer getDaniosId() {
        return daniosId;
    }

    public void setDaniosId(Integer daniosId) {
        this.daniosId = daniosId;
    }

    public Integer getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(Integer terminalId) {
        this.terminalId = terminalId;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFechaEIR() {
        return fechaEIR;
    }

    public void setFechaEIR(Date fechaEIR) {
        this.fechaEIR = fechaEIR;
    }

    public Date getFechaEscritura() {
        return fechaEscritura;
    }

    public void setFechaEscritura(Date fechaEscritura) {
        this.fechaEscritura = fechaEscritura;
    }

    public boolean getGrafiti() {
        return grafiti;
    }

    public void setGrafiti(boolean grafiti) {
        this.grafiti = grafiti;
    }

    public boolean getFumigado() {
        return fumigado;
    }

    public void setFumigado(boolean fumigado) {
        this.fumigado = fumigado;
    }

    public Date getFechaFumigado() {
        return fechaFumigado;
    }

    public void setFechaFumigado(Date fechaFumigado) {
        this.fechaFumigado = fechaFumigado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaComentario() {
        return fechaComentario;
    }

    public void setFechaComentario(Date fechaComentario) {
        this.fechaComentario = fechaComentario;
    }

    public Integer getDaniosIdPrevious() {
        return daniosIdPrevious;
    }

    public void setDaniosIdPrevious(Integer daniosIdPrevious) {
        this.daniosIdPrevious = daniosIdPrevious;
    }

    public String getPreviousComments() {
        return previousComments;
    }

    public void setPreviousComments(String previousComments) {
        this.previousComments = previousComments;
    }

    public Date getDatePreviousComments() {
        return datePreviousComments;
    }

    public void setDatePreviousComments(Date datePreviousComments) {
        this.datePreviousComments = datePreviousComments;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eirId != null ? eirId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexEIR)) {
            return false;
        }
        ImexEIR other = (ImexEIR) object;
        if ((this.eirId == null && other.eirId != null) || (this.eirId != null && !this.eirId.equals(other.eirId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexEIR[ eirId=" + eirId + " ]";
    }
    
}
