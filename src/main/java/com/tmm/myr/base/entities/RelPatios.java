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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author bacilio
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Builder
@Entity
@Table(name = "Rel_Patios")
@XmlRootElement
public class RelPatios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "relPatioId")
    private Integer relPatioId;
    @Basic(optional = false)
    @Column(name = "terminalId")
    private int terminalId;
    @Basic(optional = false)
    @Column(name = "patioId")
    private int patioId;
    @Basic(optional = false)
    @Column(name = "isActive")
    private boolean isActive;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (relPatioId != null ? relPatioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof RelPatios)) {
            return false;
        }
        RelPatios other = (RelPatios) object;
        if ((this.relPatioId == null && other.relPatioId != null) || (this.relPatioId != null && !this.relPatioId.equals(other.relPatioId))) {
            return false;
        }
        return true;
    }
    
}
