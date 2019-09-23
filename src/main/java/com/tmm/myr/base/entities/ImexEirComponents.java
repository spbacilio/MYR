
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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *The persistent class for the Imex_Eir_Components database table.
 *
 * @author Samuel Pérez
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@Entity
@Table(name = "Imex_Eir_Components")
@XmlRootElement
public class ImexEirComponents implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EIRComponentId")
    private Integer eIRComponentId;
    @Column(name = "Component")
    private String component;
    @Column(name = "Type")
    private String type;
    @Column(name = "AARCode")
    private String aARCode;
    @Column(name = "ComponentEN")
    private String componentEN;
    @Basic(optional = false)
    @Column(name = "IsActive")
    private boolean isActive;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eIRComponentId")
    private Collection<ImexRelDamage> imexRelDamageCollection;
    @JoinColumn(name = "EIRTypeId", referencedColumnName = "EIRTypeId")
    @ManyToOne(optional = false)
    private ImexEirType eIRTypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eIRComponentId")
    private Collection<ImexRelLocations> imexRelLocationsCollection;
    @OneToMany(mappedBy = "eIRComponentId")
    private Collection<ImexTarifaComponentesMyR> imexTarifaComponentesMyRCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eIRComponentId")
    private Collection<ImexRelGeneralPositions> imexRelGeneralPositionsCollection;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eIRComponentId != null ? eIRComponentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexEirComponents)) {
            return false;
        }
        ImexEirComponents other = (ImexEirComponents) object;
        if ((this.eIRComponentId == null && other.eIRComponentId != null) || (this.eIRComponentId != null && !this.eIRComponentId.equals(other.eIRComponentId))) {
            return false;
        }
        return true;
    }
    
}
