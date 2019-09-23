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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import lombok.ToString;
import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "Imex_Container")
@XmlRootElement
public class ImexContainer implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "ContainerId")
    private Integer containerId;
    
    @Column(name = "Container")
    private String container;
    
    @OneToMany(mappedBy = "containerId")
    private Collection<ImexInfoEntregaAduana> imexInfoEntregaAduanaCollection;
    
    @OneToMany(mappedBy = "containerID")
    private Collection<ImexWsEdi417> imexWsEdi417Collection;
    
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "containerid")
    private ImexContenedorFXEU imexContenedorFXEU;
    
    @OneToMany(mappedBy = "containerId")
    private Collection<ImexRelPhotoContainer> imexRelPhotoContainerCollection;
/*
    @XmlTransient
    public Collection<ImexInfoEntregaAduana> getImexInfoEntregaAduanaCollection() {
        return imexInfoEntregaAduanaCollection;
    }

    public void setImexInfoEntregaAduanaCollection(Collection<ImexInfoEntregaAduana> imexInfoEntregaAduanaCollection) {
        this.imexInfoEntregaAduanaCollection = imexInfoEntregaAduanaCollection;
    }

    @XmlTransient
    public Collection<ImexWsEdi417> getImexWsEdi417Collection() {
        return imexWsEdi417Collection;
    }

    public void setImexWsEdi417Collection(Collection<ImexWsEdi417> imexWsEdi417Collection) {
        this.imexWsEdi417Collection = imexWsEdi417Collection;
    }

    public ImexContenedorFXEU getImexContenedorFXEU() {
        return imexContenedorFXEU;
    }

    public void setImexContenedorFXEU(ImexContenedorFXEU imexContenedorFXEU) {
        this.imexContenedorFXEU = imexContenedorFXEU;
    }

    @XmlTransient
    public Collection<ImexRelPhotoContainer> getImexRelPhotoContainerCollection() {
        return imexRelPhotoContainerCollection;
    }

    public void setImexRelPhotoContainerCollection(Collection<ImexRelPhotoContainer> imexRelPhotoContainerCollection) {
        this.imexRelPhotoContainerCollection = imexRelPhotoContainerCollection;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (containerId != null ? containerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ImexContainer)) {
            return false;
        }
        ImexContainer other = (ImexContainer) object;
        if ((this.containerId == null && other.containerId != null) || (this.containerId != null && !this.containerId.equals(other.containerId))) {
            return false;
        }
        return true;
    }
    
}
