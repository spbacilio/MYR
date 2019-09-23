/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmm.myr.base.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author bacil
 */
@Entity
@Table(name = "cat_maritimeshippers")
@XmlRootElement
public class CatMaritimeshippers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaritimeShippersId")
    private Long maritimeShippersId;
    @Column(name = "MaritimeShippersDescription")
    private String maritimeShippersDescription;
    @Column(name = "UserName")
    private String userName;
    @Column(name = "FechaAlta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "UserNameActualizo")
    private String userNameActualizo;
    @Column(name = "FechaActualizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizacion;
    @Column(name = "EsActivo")
    private Boolean esActivo;
    @Column(name = "FinanzasSAPId")
    private BigInteger finanzasSAPId;
    @Column(name = "EsMaritimo")
    private Boolean esMaritimo;
    @Column(name = "email")
    private String email;
    @Column(name = "EsInterpacifico")
    private Boolean esInterpacifico;
    @Column(name = "EsCrossborder")
    private Boolean esCrossborder;
    @Column(name = "OperacionesSAPId")
    private BigInteger operacionesSAPId;
    @Column(name = "MyRSAPId")
    private BigInteger myRSAPId;
    @Column(name = "FreePool")
    private Boolean freePool;
    @Column(name = "Desconsolidar")
    private Boolean desconsolidar;
    @Column(name = "EsPatioRevenu")
    private Boolean esPatioRevenu;
    @Column(name = "EsRemolque")
    private Boolean esRemolque;
    @Column(name = "EsRemolqueCrossBorder")
    private Boolean esRemolqueCrossBorder;
    @Column(name = "Notificacion24HCrossBorder")
    private Boolean notificacion24HCrossBorder;
    @OneToMany(mappedBy = "shipperId")
    private Collection<ImexTarifaShipper> imexTarifaShipperCollection;   
/*
    @XmlTransient
    public Collection<ImexTarifaShipper> getImexTarifaShipperCollection() {
        return imexTarifaShipperCollection;
    }

    public void setImexTarifaShipperCollection(Collection<ImexTarifaShipper> imexTarifaShipperCollection) {
        this.imexTarifaShipperCollection = imexTarifaShipperCollection;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maritimeShippersId != null ? maritimeShippersId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CatMaritimeshippers)) {
            return false;
        }
        CatMaritimeshippers other = (CatMaritimeshippers) object;
        if ((this.maritimeShippersId == null && other.maritimeShippersId != null) || (this.maritimeShippersId != null && !this.maritimeShippersId.equals(other.maritimeShippersId))) {
            return false;
        }
        return true;
    }
}
