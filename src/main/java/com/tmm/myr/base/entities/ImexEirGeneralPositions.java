/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmm.myr.base.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 *
 * @author bacilio
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "Imex_Eir_General_Positions")
@XmlRootElement
public class ImexEirGeneralPositions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EIRGeneralPositionId")
    private Integer eIRGeneralPositionId;
    @Column(name = "Position")
    private String position;
    @Basic(optional = false)
    @Column(name = "IsActive")
    private boolean isActive;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eIRGeneralPositionId")
    private Collection<ImexRelLocations> imexRelLocationsCollection;
    @JoinColumn(name = "EIRTypeId", referencedColumnName = "EIRTypeId")
    @ManyToOne
    private ImexEirType eIRTypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eIRGeneralPositionId")
    private Collection<ImexRelGeneralPositions> imexRelGeneralPositionsCollection;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eIRGeneralPositionId != null ? eIRGeneralPositionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexEirGeneralPositions)) {
            return false;
        }
        ImexEirGeneralPositions other = (ImexEirGeneralPositions) object;
        if ((this.eIRGeneralPositionId == null && other.eIRGeneralPositionId != null) || (this.eIRGeneralPositionId != null && !this.eIRGeneralPositionId.equals(other.eIRGeneralPositionId))) {
            return false;
        }
        return true;
    }
    
}
