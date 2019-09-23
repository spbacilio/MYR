/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmm.myr.base.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
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
@Table(name = "Imex_PatioUPDS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexPatioUPDS.findAll", query = "SELECT i FROM ImexPatioUPDS i")
    , @NamedQuery(name = "ImexPatioUPDS.findByShipperId", query = "SELECT i FROM ImexPatioUPDS i WHERE i.imexPatioUPDSPK.shipperId = :shipperId")
    , @NamedQuery(name = "ImexPatioUPDS.findByIdCatPatios", query = "SELECT i FROM ImexPatioUPDS i WHERE i.imexPatioUPDSPK.idCatPatios = :idCatPatios")
    , @NamedQuery(name = "ImexPatioUPDS.findByTerminalId", query = "SELECT i FROM ImexPatioUPDS i WHERE i.imexPatioUPDSPK.terminalId = :terminalId")
    , @NamedQuery(name = "ImexPatioUPDS.findByBeneficialOwnerId", query = "SELECT i FROM ImexPatioUPDS i WHERE i.beneficialOwnerId = :beneficialOwnerId")})
public class ImexPatioUPDS implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ImexPatioUPDSPK imexPatioUPDSPK;
    @Basic(optional = false)
    @Column(name = "BeneficialOwnerId")
    private long beneficialOwnerId;

    public ImexPatioUPDS() {
    }

    public ImexPatioUPDS(ImexPatioUPDSPK imexPatioUPDSPK) {
        this.imexPatioUPDSPK = imexPatioUPDSPK;
    }

    public ImexPatioUPDS(ImexPatioUPDSPK imexPatioUPDSPK, long beneficialOwnerId) {
        this.imexPatioUPDSPK = imexPatioUPDSPK;
        this.beneficialOwnerId = beneficialOwnerId;
    }

    public ImexPatioUPDS(long shipperId, int idCatPatios, int terminalId) {
        this.imexPatioUPDSPK = new ImexPatioUPDSPK(shipperId, idCatPatios, terminalId);
    }

    public ImexPatioUPDSPK getImexPatioUPDSPK() {
        return imexPatioUPDSPK;
    }

    public void setImexPatioUPDSPK(ImexPatioUPDSPK imexPatioUPDSPK) {
        this.imexPatioUPDSPK = imexPatioUPDSPK;
    }

    public long getBeneficialOwnerId() {
        return beneficialOwnerId;
    }

    public void setBeneficialOwnerId(long beneficialOwnerId) {
        this.beneficialOwnerId = beneficialOwnerId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imexPatioUPDSPK != null ? imexPatioUPDSPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexPatioUPDS)) {
            return false;
        }
        ImexPatioUPDS other = (ImexPatioUPDS) object;
        if ((this.imexPatioUPDSPK == null && other.imexPatioUPDSPK != null) || (this.imexPatioUPDSPK != null && !this.imexPatioUPDSPK.equals(other.imexPatioUPDSPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexPatioUPDS[ imexPatioUPDSPK=" + imexPatioUPDSPK + " ]";
    }
    
}
