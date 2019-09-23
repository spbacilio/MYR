/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmm.myr.base.entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bacil
 */
@Entity
@Table(name = "Imex_MasterShipper")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexMasterShipper.findAll", query = "SELECT i FROM ImexMasterShipper i")
    , @NamedQuery(name = "ImexMasterShipper.findByShipperIdMaster", query = "SELECT i FROM ImexMasterShipper i WHERE i.imexMasterShipperPK.shipperIdMaster = :shipperIdMaster")
    , @NamedQuery(name = "ImexMasterShipper.findByShipperIdChildren", query = "SELECT i FROM ImexMasterShipper i WHERE i.imexMasterShipperPK.shipperIdChildren = :shipperIdChildren")})
public class ImexMasterShipper implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ImexMasterShipperPK imexMasterShipperPK;

    public ImexMasterShipper() {
    }

    public ImexMasterShipper(ImexMasterShipperPK imexMasterShipperPK) {
        this.imexMasterShipperPK = imexMasterShipperPK;
    }

    public ImexMasterShipper(long shipperIdMaster, long shipperIdChildren) {
        this.imexMasterShipperPK = new ImexMasterShipperPK(shipperIdMaster, shipperIdChildren);
    }

    public ImexMasterShipperPK getImexMasterShipperPK() {
        return imexMasterShipperPK;
    }

    public void setImexMasterShipperPK(ImexMasterShipperPK imexMasterShipperPK) {
        this.imexMasterShipperPK = imexMasterShipperPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imexMasterShipperPK != null ? imexMasterShipperPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexMasterShipper)) {
            return false;
        }
        ImexMasterShipper other = (ImexMasterShipper) object;
        if ((this.imexMasterShipperPK == null && other.imexMasterShipperPK != null) || (this.imexMasterShipperPK != null && !this.imexMasterShipperPK.equals(other.imexMasterShipperPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexMasterShipper[ imexMasterShipperPK=" + imexMasterShipperPK + " ]";
    }
    
}
