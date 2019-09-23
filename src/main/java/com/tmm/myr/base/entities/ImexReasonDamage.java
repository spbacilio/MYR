
package com.tmm.myr.base.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import groovy.transform.ToString;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 *The class for persistence to the Imex_Reason_Damage table.
 *
 * @author Samuel Pérez
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 */
@ToString
@Builder
@Getter
@Setter
@Entity
@Table(name = "Imex_Reason_Damage")
@XmlRootElement
public class ImexReasonDamage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ReasonDamageId")
    private Integer reasonDamageId;
    @Column(name = "Reason")
    private String reason;

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexReasonDamage)) {
            return false;
        }
        ImexReasonDamage other = (ImexReasonDamage) object;
        if ((this.reasonDamageId == null && other.reasonDamageId != null) || (this.reasonDamageId != null && !this.reasonDamageId.equals(other.reasonDamageId))) {
            return false;
        }
        return true;
    }
    
}
