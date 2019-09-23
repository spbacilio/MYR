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
@Builder
@Setter
@Getter
@Entity
@Table(name = "Imex_Rel_Locations_View")
@XmlRootElement
public class ImexRelLocationsView implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "Location")
    private String location;
    @Column(name = "AARCode")
    private String aARCode;
    @Basic(optional = false)
    @Column(name = "EIRComponentId")
    private int eIRComponentId;
    @Basic(optional = false)
    @Column(name = "EIRTypeId")
    private int eIRTypeId;
    @Basic(optional = false)
    @Column(name = "EIRLocationId")
    private int eIRLocationId;
    @Basic(optional = false)
    @Column(name = "PosicionId")
    private int posicionId;
    @Basic(optional = false)
    @Column(name = "RelLocationId")
    private int relLocationId;
    
}
