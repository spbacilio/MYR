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

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * The persistent class for the Imex_Cat_patios database table.
 * 
 * @author Samuel Pérez
 * @version 1.0
 * @since JDK 1.8
 * 
 * */
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "Imex_Cat_patios")
@XmlRootElement
public class ImexCatpatios implements Serializable {

	/**
	 * Serial id.
	 * */
    private static final long serialVersionUID = 1L;
    
    /**
     * Id.
     * */
    @Id
    @Basic(optional = false)
    @Column(name = "idCat_Patios")
    private Integer idCatPatios;
    
    /**
     * Type yard.
     * */
    @Column(name = "id_Cat_TipoPatio")
    private Integer idCatTipoPatio;
    
    /**
     * Name of yard.
     * */
    @Column(name = "NombrePatio")
    private String nombrePatio;

    /**
     * Id of deposit.
     * */
    @Column(name = "IdDeposito")
    private Integer idDeposito;

    /**
     * Status.
     * */
    @Column(name = "estatus")
    private String estatus;

    /**
     * Id service.
     * */
    @Column(name = "idcat_servicio")
    private Integer idcatServicio;
    
    /**
     * Active status.
     * */
    @Basic(optional = false)
    @Column(name = "isActive")
    private boolean isActive;

    /**
     * The hashcode.
     * @return Hash value.
     * */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatPatios != null ? idCatPatios.hashCode() : 0);
        return hash;
    }

    /**
     * Object validation.
     * @param object The Object.
     * @return True when validation is success, false otherwise.
     * */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ImexCatpatios)) {
            return false;
        }
        ImexCatpatios other = (ImexCatpatios) object;
        if ((this.idCatPatios == null && other.idCatPatios != null) || (this.idCatPatios != null && !this.idCatPatios.equals(other.idCatPatios))) {
            return false;
        }
        return true;
    }
    
}
