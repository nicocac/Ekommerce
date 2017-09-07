/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ekeepoit.WSRestEkommerce.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nico
 */
@Entity
@Table(name = "pdo_pdr")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PdoPdr.findAll", query = "SELECT p FROM PdoPdr p")})
public class PdoPdr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PdoPdrPK pdoPdrPK;
    @Column(name = "PDO_PDR_FECHA_ALTA")
    @Temporal(TemporalType.DATE)
    private Date pdoPdrFechaAlta;
    @Size(max = 30)
    @Column(name = "PDO_PDR_USUARIO_ALTA")
    private String pdoPdrUsuarioAlta;
    @Column(name = "PDO_PDR_FECHA_ULT_MOD")
    @Temporal(TemporalType.DATE)
    private Date pdoPdrFechaUltMod;
    @Size(max = 30)
    @Column(name = "PDO_PDR_USUARIO_ULT_MOD")
    private String pdoPdrUsuarioUltMod;
    @Column(name = "PDO_PDR_FECHA_BAJA")
    @Temporal(TemporalType.DATE)
    private Date pdoPdrFechaBaja;
    @Size(max = 30)
    @Column(name = "PDO_PDR_USUARIO_BAJA")
    private String pdoPdrUsuarioBaja;

    public PdoPdr() {
    }

    public PdoPdr(PdoPdrPK pdoPdrPK) {
        this.pdoPdrPK = pdoPdrPK;
    }

    public PdoPdr(long pdoPdrPdrId, long pdoPdrPdoId) {
        this.pdoPdrPK = new PdoPdrPK(pdoPdrPdrId, pdoPdrPdoId);
    }

    public PdoPdrPK getPdoPdrPK() {
        return pdoPdrPK;
    }

    public void setPdoPdrPK(PdoPdrPK pdoPdrPK) {
        this.pdoPdrPK = pdoPdrPK;
    }

    public Date getPdoPdrFechaAlta() {
        return pdoPdrFechaAlta;
    }

    public void setPdoPdrFechaAlta(Date pdoPdrFechaAlta) {
        this.pdoPdrFechaAlta = pdoPdrFechaAlta;
    }

    public String getPdoPdrUsuarioAlta() {
        return pdoPdrUsuarioAlta;
    }

    public void setPdoPdrUsuarioAlta(String pdoPdrUsuarioAlta) {
        this.pdoPdrUsuarioAlta = pdoPdrUsuarioAlta;
    }

    public Date getPdoPdrFechaUltMod() {
        return pdoPdrFechaUltMod;
    }

    public void setPdoPdrFechaUltMod(Date pdoPdrFechaUltMod) {
        this.pdoPdrFechaUltMod = pdoPdrFechaUltMod;
    }

    public String getPdoPdrUsuarioUltMod() {
        return pdoPdrUsuarioUltMod;
    }

    public void setPdoPdrUsuarioUltMod(String pdoPdrUsuarioUltMod) {
        this.pdoPdrUsuarioUltMod = pdoPdrUsuarioUltMod;
    }

    public Date getPdoPdrFechaBaja() {
        return pdoPdrFechaBaja;
    }

    public void setPdoPdrFechaBaja(Date pdoPdrFechaBaja) {
        this.pdoPdrFechaBaja = pdoPdrFechaBaja;
    }

    public String getPdoPdrUsuarioBaja() {
        return pdoPdrUsuarioBaja;
    }

    public void setPdoPdrUsuarioBaja(String pdoPdrUsuarioBaja) {
        this.pdoPdrUsuarioBaja = pdoPdrUsuarioBaja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pdoPdrPK != null ? pdoPdrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PdoPdr)) {
            return false;
        }
        PdoPdr other = (PdoPdr) object;
        if ((this.pdoPdrPK == null && other.pdoPdrPK != null) || (this.pdoPdrPK != null && !this.pdoPdrPK.equals(other.pdoPdrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.WSRestEkommerce.modelo.PdoPdr[ pdoPdrPK=" + pdoPdrPK + " ]";
    }
    
}
