/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ekeepoit.WSRestEkommerce.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Nico
 */
@Embeddable
public class PdoPdrPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "PDO_PDR_PDR_ID")
    private long pdoPdrPdrId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PDO_PDR_PDO_ID")
    private long pdoPdrPdoId;

    public PdoPdrPK() {
    }

    public PdoPdrPK(long pdoPdrPdrId, long pdoPdrPdoId) {
        this.pdoPdrPdrId = pdoPdrPdrId;
        this.pdoPdrPdoId = pdoPdrPdoId;
    }

    public long getPdoPdrPdrId() {
        return pdoPdrPdrId;
    }

    public void setPdoPdrPdrId(long pdoPdrPdrId) {
        this.pdoPdrPdrId = pdoPdrPdrId;
    }

    public long getPdoPdrPdoId() {
        return pdoPdrPdoId;
    }

    public void setPdoPdrPdoId(long pdoPdrPdoId) {
        this.pdoPdrPdoId = pdoPdrPdoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pdoPdrPdrId;
        hash += (int) pdoPdrPdoId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PdoPdrPK)) {
            return false;
        }
        PdoPdrPK other = (PdoPdrPK) object;
        if (this.pdoPdrPdrId != other.pdoPdrPdrId) {
            return false;
        }
        if (this.pdoPdrPdoId != other.pdoPdrPdoId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.WSRestEkommerce.modelo.PdoPdrPK[ pdoPdrPdrId=" + pdoPdrPdrId + ", pdoPdrPdoId=" + pdoPdrPdoId + " ]";
    }
    
}
