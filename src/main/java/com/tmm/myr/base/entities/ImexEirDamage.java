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

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The main class for Imex_Eir_Damage table persistence.
 *
 * @author bacilio
 */
@ToString
@Builder
@Getter
@Setter
@Entity
@Table(name = "Imex_Eir_Damage")
@XmlRootElement
public class ImexEirDamage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EIRDamageId")
    private Integer eIRDamageId;
    @Column(name = "Damage")
    private String damage;
    @Column(name = "Type")
    private String type;
    @Column(name = "AARCode")
    private String aARCode;
    @Column(name = "DamageEN")
    private String damageEN;
    @Basic(optional = false)
    @Column(name = "IsActive")
    private boolean isActive;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eIRDamageId")
    private Collection<ImexRelDamage> imexRelDamageCollection;
    @JoinColumn(name = "EIRTypeId", referencedColumnName = "EIRTypeId")
    @ManyToOne(optional = false)
    private ImexEirType eIRTypeId;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eIRDamageId != null ? eIRDamageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexEirDamage)) {
            return false;
        }
        ImexEirDamage other = (ImexEirDamage) object;
        if ((this.eIRDamageId == null && other.eIRDamageId != null) || (this.eIRDamageId != null && !this.eIRDamageId.equals(other.eIRDamageId))) {
            return false;
        }
        return true;
    }
    
}
