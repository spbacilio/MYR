/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmm.myr.base.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bacil
 */
@Entity
@Table(name = "Rel_Terminals")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RelTerminals.findAll", query = "SELECT r FROM RelTerminals r")
    , @NamedQuery(name = "RelTerminals.findByRelTerminalId", query = "SELECT r FROM RelTerminals r WHERE r.relTerminalId = :relTerminalId")
    , @NamedQuery(name = "RelTerminals.findByShipOperatorId", query = "SELECT r FROM RelTerminals r WHERE r.shipOperatorId = :shipOperatorId")
    , @NamedQuery(name = "RelTerminals.findByTerminalId", query = "SELECT r FROM RelTerminals r WHERE r.terminalId = :terminalId")
    , @NamedQuery(name = "RelTerminals.findByIsActive", query = "SELECT r FROM RelTerminals r WHERE r.isActive = :isActive")})
public class RelTerminals implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "relTerminalId")
    private Integer relTerminalId;
    @Basic(optional = false)
    @Column(name = "shipOperatorId")
    private int shipOperatorId;
    @Basic(optional = false)
    @Column(name = "terminalId")
    private int terminalId;
    @Basic(optional = false)
    @Column(name = "isActive")
    private boolean isActive;

    public RelTerminals() {
    }

    public RelTerminals(Integer relTerminalId) {
        this.relTerminalId = relTerminalId;
    }

    public RelTerminals(Integer relTerminalId, int shipOperatorId, int terminalId, boolean isActive) {
        this.relTerminalId = relTerminalId;
        this.shipOperatorId = shipOperatorId;
        this.terminalId = terminalId;
        this.isActive = isActive;
    }

    public Integer getRelTerminalId() {
        return relTerminalId;
    }

    public void setRelTerminalId(Integer relTerminalId) {
        this.relTerminalId = relTerminalId;
    }

    public int getShipOperatorId() {
        return shipOperatorId;
    }

    public void setShipOperatorId(int shipOperatorId) {
        this.shipOperatorId = shipOperatorId;
    }

    public int getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(int terminalId) {
        this.terminalId = terminalId;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (relTerminalId != null ? relTerminalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelTerminals)) {
            return false;
        }
        RelTerminals other = (RelTerminals) object;
        if ((this.relTerminalId == null && other.relTerminalId != null) || (this.relTerminalId != null && !this.relTerminalId.equals(other.relTerminalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.RelTerminals[ relTerminalId=" + relTerminalId + " ]";
    }
    
}
