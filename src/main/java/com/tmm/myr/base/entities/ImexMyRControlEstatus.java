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
@Table(name = "Imex_MyR_Control_Estatus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexMyRControlEstatus.findAll", query = "SELECT i FROM ImexMyRControlEstatus i")
    , @NamedQuery(name = "ImexMyRControlEstatus.findByOrdenServicioId", query = "SELECT i FROM ImexMyRControlEstatus i WHERE i.ordenServicioId = :ordenServicioId")
    , @NamedQuery(name = "ImexMyRControlEstatus.findByServiceGroupId", query = "SELECT i FROM ImexMyRControlEstatus i WHERE i.serviceGroupId = :serviceGroupId")
    , @NamedQuery(name = "ImexMyRControlEstatus.findByEIRTypeId", query = "SELECT i FROM ImexMyRControlEstatus i WHERE i.eIRTypeId = :eIRTypeId")
    , @NamedQuery(name = "ImexMyRControlEstatus.findByMyRIdUltimo", query = "SELECT i FROM ImexMyRControlEstatus i WHERE i.myRIdUltimo = :myRIdUltimo")
    , @NamedQuery(name = "ImexMyRControlEstatus.findByPo", query = "SELECT i FROM ImexMyRControlEstatus i WHERE i.po = :po")
    , @NamedQuery(name = "ImexMyRControlEstatus.findByUserNamePO", query = "SELECT i FROM ImexMyRControlEstatus i WHERE i.userNamePO = :userNamePO")
    , @NamedQuery(name = "ImexMyRControlEstatus.findByFechaPO", query = "SELECT i FROM ImexMyRControlEstatus i WHERE i.fechaPO = :fechaPO")})
public class ImexMyRControlEstatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OrdenServicioId")
    private Integer ordenServicioId;
    @Basic(optional = false)
    @Column(name = "serviceGroupId")
    private int serviceGroupId;
    @Basic(optional = false)
    @Column(name = "EIRTypeId")
    private int eIRTypeId;
    @Column(name = "MyRId_Ultimo")
    private Integer myRIdUltimo;
    @Column(name = "PO")
    private String po;
    @Column(name = "UserNamePO")
    private String userNamePO;
    @Column(name = "FechaPO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPO;

    public ImexMyRControlEstatus() {
    }

    public ImexMyRControlEstatus(Integer ordenServicioId) {
        this.ordenServicioId = ordenServicioId;
    }

    public ImexMyRControlEstatus(Integer ordenServicioId, int serviceGroupId, int eIRTypeId) {
        this.ordenServicioId = ordenServicioId;
        this.serviceGroupId = serviceGroupId;
        this.eIRTypeId = eIRTypeId;
    }

    public Integer getOrdenServicioId() {
        return ordenServicioId;
    }

    public void setOrdenServicioId(Integer ordenServicioId) {
        this.ordenServicioId = ordenServicioId;
    }

    public int getServiceGroupId() {
        return serviceGroupId;
    }

    public void setServiceGroupId(int serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
    }

    public int getEIRTypeId() {
        return eIRTypeId;
    }

    public void setEIRTypeId(int eIRTypeId) {
        this.eIRTypeId = eIRTypeId;
    }

    public Integer getMyRIdUltimo() {
        return myRIdUltimo;
    }

    public void setMyRIdUltimo(Integer myRIdUltimo) {
        this.myRIdUltimo = myRIdUltimo;
    }

    public String getPo() {
        return po;
    }

    public void setPo(String po) {
        this.po = po;
    }

    public String getUserNamePO() {
        return userNamePO;
    }

    public void setUserNamePO(String userNamePO) {
        this.userNamePO = userNamePO;
    }

    public Date getFechaPO() {
        return fechaPO;
    }

    public void setFechaPO(Date fechaPO) {
        this.fechaPO = fechaPO;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ordenServicioId != null ? ordenServicioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexMyRControlEstatus)) {
            return false;
        }
        ImexMyRControlEstatus other = (ImexMyRControlEstatus) object;
        if ((this.ordenServicioId == null && other.ordenServicioId != null) || (this.ordenServicioId != null && !this.ordenServicioId.equals(other.ordenServicioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexMyRControlEstatus[ ordenServicioId=" + ordenServicioId + " ]";
    }
    
}
