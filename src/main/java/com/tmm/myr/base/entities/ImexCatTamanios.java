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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author bacil
 */

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Builder
@Entity
@Table(name = "Imex_Cat_Tamanios")
@XmlRootElement
public class ImexCatTamanios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TamaniosId")
    private Integer tamaniosId;
    @Column(name = "Tamaniosclv")
    private String tamaniosclv;
    @Column(name = "TamaniosDescripcion")
    private String tamaniosDescripcion;
    @Column(name = "TipoEquipoId")
    private Integer tipoEquipoId;
    @Column(name = "ACTIVO")
    private Boolean activo;
    @Column(name = "Pop")
    private Short pop;
    @Column(name = "ComboInvetarioFXE")
    private Boolean comboInvetarioFXE;
    @Column(name = "TamanioPulgadas")
    private Integer tamanioPulgadas;
    @Column(name = "Alto")
    private Integer alto;
    @Column(name = "Ancho")
    private Integer ancho;
    @Column(name = "Profundidad")
    private Integer profundidad;
    @Column(name = "PesoMaximo")
    private Integer pesoMaximo;
    @JoinColumn(name = "TipoServicioId", referencedColumnName = "TipoServicioId")
    @ManyToOne
    private ImexCatTipoServicio tipoServicioId;  

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tamaniosId != null ? tamaniosId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexCatTamanios)) {
            return false;
        }
        ImexCatTamanios other = (ImexCatTamanios) object;
        if ((this.tamaniosId == null && other.tamaniosId != null) || (this.tamaniosId != null && !this.tamaniosId.equals(other.tamaniosId))) {
            return false;
        }
        return true;
    }
    
}
