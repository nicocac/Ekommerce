/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ekeepoit.WSRestEkommerce.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nico
 */
@Entity
@Table(name = "detalles_stock")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetallesStock.findAll", query = "SELECT d FROM DetallesStock d")})
public class DetallesStock implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SDD_ID")
    private Long sddId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SDD_PDO_ID")
    private long sddPdoId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "SDD_TIPO_MOVIMIENTO")
    private String sddTipoMovimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "SDD_TIPO_ORIGEN")
    private String sddTipoOrigen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SDD_ORIGEN")
    private long sddOrigen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "SDD_DECLARADO")
    private String sddDeclarado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SDD_CANTIDAD")
    private long sddCantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SDD_FECHA_ALTA")
    @Temporal(TemporalType.DATE)
    private Date sddFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SDD_USUARIO_ALTA")
    private String sddUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SDD_FECHA_ULT_MOD")
    @Temporal(TemporalType.DATE)
    private Date sddFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SDD_USUARIO_ULT_MOD")
    private String sddUsuarioUltMod;
    @Column(name = "SDD_FECHA_BAJA")
    @Temporal(TemporalType.DATE)
    private Date sddFechaBaja;
    @Size(max = 20)
    @Column(name = "SDD_USUARIO_BAJA")
    private String sddUsuarioBaja;

    public DetallesStock() {
    }

    public DetallesStock(Long sddId) {
        this.sddId = sddId;
    }

    public DetallesStock(Long sddId, long sddPdoId, String sddTipoMovimiento, String sddTipoOrigen, long sddOrigen, String sddDeclarado, long sddCantidad, Date sddFechaAlta, String sddUsuarioAlta, Date sddFechaUltMod, String sddUsuarioUltMod) {
        this.sddId = sddId;
        this.sddPdoId = sddPdoId;
        this.sddTipoMovimiento = sddTipoMovimiento;
        this.sddTipoOrigen = sddTipoOrigen;
        this.sddOrigen = sddOrigen;
        this.sddDeclarado = sddDeclarado;
        this.sddCantidad = sddCantidad;
        this.sddFechaAlta = sddFechaAlta;
        this.sddUsuarioAlta = sddUsuarioAlta;
        this.sddFechaUltMod = sddFechaUltMod;
        this.sddUsuarioUltMod = sddUsuarioUltMod;
    }

    public Long getSddId() {
        return sddId;
    }

    public void setSddId(Long sddId) {
        this.sddId = sddId;
    }

    public long getSddPdoId() {
        return sddPdoId;
    }

    public void setSddPdoId(long sddPdoId) {
        this.sddPdoId = sddPdoId;
    }

    public String getSddTipoMovimiento() {
        return sddTipoMovimiento;
    }

    public void setSddTipoMovimiento(String sddTipoMovimiento) {
        this.sddTipoMovimiento = sddTipoMovimiento;
    }

    public String getSddTipoOrigen() {
        return sddTipoOrigen;
    }

    public void setSddTipoOrigen(String sddTipoOrigen) {
        this.sddTipoOrigen = sddTipoOrigen;
    }

    public long getSddOrigen() {
        return sddOrigen;
    }

    public void setSddOrigen(long sddOrigen) {
        this.sddOrigen = sddOrigen;
    }

    public String getSddDeclarado() {
        return sddDeclarado;
    }

    public void setSddDeclarado(String sddDeclarado) {
        this.sddDeclarado = sddDeclarado;
    }

    public long getSddCantidad() {
        return sddCantidad;
    }

    public void setSddCantidad(long sddCantidad) {
        this.sddCantidad = sddCantidad;
    }

    public Date getSddFechaAlta() {
        return sddFechaAlta;
    }

    public void setSddFechaAlta(Date sddFechaAlta) {
        this.sddFechaAlta = sddFechaAlta;
    }

    public String getSddUsuarioAlta() {
        return sddUsuarioAlta;
    }

    public void setSddUsuarioAlta(String sddUsuarioAlta) {
        this.sddUsuarioAlta = sddUsuarioAlta;
    }

    public Date getSddFechaUltMod() {
        return sddFechaUltMod;
    }

    public void setSddFechaUltMod(Date sddFechaUltMod) {
        this.sddFechaUltMod = sddFechaUltMod;
    }

    public String getSddUsuarioUltMod() {
        return sddUsuarioUltMod;
    }

    public void setSddUsuarioUltMod(String sddUsuarioUltMod) {
        this.sddUsuarioUltMod = sddUsuarioUltMod;
    }

    public Date getSddFechaBaja() {
        return sddFechaBaja;
    }

    public void setSddFechaBaja(Date sddFechaBaja) {
        this.sddFechaBaja = sddFechaBaja;
    }

    public String getSddUsuarioBaja() {
        return sddUsuarioBaja;
    }

    public void setSddUsuarioBaja(String sddUsuarioBaja) {
        this.sddUsuarioBaja = sddUsuarioBaja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sddId != null ? sddId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesStock)) {
            return false;
        }
        DetallesStock other = (DetallesStock) object;
        if ((this.sddId == null && other.sddId != null) || (this.sddId != null && !this.sddId.equals(other.sddId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.WSRestEkommerce.modelo.DetallesStock[ sddId=" + sddId + " ]";
    }
    
}
