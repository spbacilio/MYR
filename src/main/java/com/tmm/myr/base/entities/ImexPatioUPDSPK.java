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
public class ImexPatioUPDSPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ShipperId")
    private long shipperId;
    @Basic(optional = false)
    @Column(name = "idCat_Patios")
    private int idCatPatios;
    @Basic(optional = false)
    @Column(name = "TerminalId")
    private int terminalId;

    public ImexPatioUPDSPK() {
    }

    public ImexPatioUPDSPK(long shipperId, int idCatPatios, int terminalId) {
        this.shipperId = shipperId;
        this.idCatPatios = idCatPatios;
        this.terminalId = terminalId;
    }

    public long getShipperId() {
        return shipperId;
    }

    public void setShipperId(long shipperId) {
        this.shipperId = shipperId;
    }

    public int getIdCatPatios() {
        return idCatPatios;
    }

    public void setIdCatPatios(int idCatPatios) {
        this.idCatPatios = idCatPatios;
    }

    public int getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(int terminalId) {
        this.terminalId = terminalId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) shipperId;
        hash += (int) idCatPatios;
        hash += (int) terminalId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexPatioUPDSPK)) {
            return false;
        }
        ImexPatioUPDSPK other = (ImexPatioUPDSPK) object;
        if (this.shipperId != other.shipperId) {
            return false;
        }
        if (this.idCatPatios != other.idCatPatios) {
            return false;
        }
        if (this.terminalId != other.terminalId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexPatioUPDSPK[ shipperId=" + shipperId + ", idCatPatios=" + idCatPatios + ", terminalId=" + terminalId + " ]";
    }
    
}
