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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author bacil
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "Imex_Inventario")
@XmlRootElement
public class ImexInventario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "InventarioId")
    private Integer inventarioId;
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
    @Column(name = "anio")
    private Integer anio;
    @Column(name = "maquinaria")
    private String maquinaria;
    @Column(name = "tecnologia")
    private String tecnologia;
    @Column(name = "subTipoGS")
    private String subTipoGS;
    @Column(name = "placas")
    private String placas;
    @Column(name = "tipoRemolque")
    private String tipoRemolque;
    @Column(name = "condicion")
    private String condicion;
    @Column(name = "origen")
    private String origen;
    @Column(name = "transportista")
    private String transportista;
    @Column(name = "myr_id")
    private Integer myrId;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventarioId != null ? inventarioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexInventario)) {
            return false;
        }
        ImexInventario other = (ImexInventario) object;
        if ((this.inventarioId == null && other.inventarioId != null) || (this.inventarioId != null && !this.inventarioId.equals(other.inventarioId))) {
            return false;
        }
        return true;
    }
    
}
