/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmm.myr.base.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 *
 * @author bacil
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@Entity
@Table(name = "Imex_MyR")
@XmlRootElement
public class ImexMyR implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MyRId")
    private Integer myRId;
    @Column(name = "CycleCode")
    private Integer cycleCode;
    @Column(name = "ContainerId")
    private Integer containerId;
    @Column(name = "ChassisId")
    private Integer chassisId;
    @Basic(optional = false)
    @Column(name = "TerminalId")
    private int terminalId;
    @Column(name = "DateCompleted")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCompleted;
    @Column(name = "UserImexId")
    private String userImexId;
    @Column(name = "CommentsCont")
    private String commentsCont;
    @Column(name = "CommentsChas")
    private String commentsChas;
    @Column(name = "DaniosId")
    private Integer daniosId;
    @Column(name = "ClasificacionId")
    private Integer clasificacionId;
    @Column(name = "TamaniosId")
    private Integer tamaniosId;
    @Column(name = "DaniosChId")
    private Integer daniosChId;
    @Column(name = "TamaniosChId")
    private Integer tamaniosChId;
    @Column(name = "ShipperId")
    private BigInteger shipperId;
    @Column(name = "TipoEirId")
    private Integer tipoEirId;
    @Column(name = "TipoInspeccionId")
    private Integer tipoInspeccionId;
    @Column(name = "DriverId")
    private Integer driverId;
    @Column(name = "serviceGroupId")
    private Integer serviceGroupId;
    @Column(name = "ShipperIdChassis")
    private BigInteger shipperIdChassis;
    @Column(name = "PedidoEnvido")
    private Integer pedidoEnvido;
    @OneToMany(mappedBy = "myRId")
    private Collection<ImexMyRDetails> imexMyRDetailsCollection;
    
//    @XmlTransient
//    public Collection<ImexMyRDetails> getImexMyRDetailsCollection() {
//        return imexMyRDetailsCollection;
//    }
//
//    public void setImexMyRDetailsCollection(Collection<ImexMyRDetails> imexMyRDetailsCollection) {
//        this.imexMyRDetailsCollection = imexMyRDetailsCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (myRId != null ? myRId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexMyR)) {
            return false;
        }
        ImexMyR other = (ImexMyR) object;
        if ((this.myRId == null && other.myRId != null) || (this.myRId != null && !this.myRId.equals(other.myRId))) {
            return false;
        }
        return true;
    }
    
}
