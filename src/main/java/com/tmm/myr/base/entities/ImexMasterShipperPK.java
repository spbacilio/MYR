/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmm.myr.base.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author bacil
 */
@Embeddable
public class ImexMasterShipperPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ShipperIdMaster")
    private long shipperIdMaster;
    @Basic(optional = false)
    @Column(name = "ShipperIdChildren")
    private long shipperIdChildren;

    public ImexMasterShipperPK() {
    }

    public ImexMasterShipperPK(long shipperIdMaster, long shipperIdChildren) {
        this.shipperIdMaster = shipperIdMaster;
        this.shipperIdChildren = shipperIdChildren;
    }

    public long getShipperIdMaster() {
        return shipperIdMaster;
    }

    public void setShipperIdMaster(long shipperIdMaster) {
        this.shipperIdMaster = shipperIdMaster;
    }

    public long getShipperIdChildren() {
        return shipperIdChildren;
    }

    public void setShipperIdChildren(long shipperIdChildren) {
        this.shipperIdChildren = shipperIdChildren;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) shipperIdMaster;
        hash += (int) shipperIdChildren;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexMasterShipperPK)) {
            return false;
        }
        ImexMasterShipperPK other = (ImexMasterShipperPK) object;
        if (this.shipperIdMaster != other.shipperIdMaster) {
            return false;
        }
        if (this.shipperIdChildren != other.shipperIdChildren) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexMasterShipperPK[ shipperIdMaster=" + shipperIdMaster + ", shipperIdChildren=" + shipperIdChildren + " ]";
    }
    
}
