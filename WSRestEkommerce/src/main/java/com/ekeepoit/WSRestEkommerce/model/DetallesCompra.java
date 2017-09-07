/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ekeepoit.WSRestEkommerce.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "detalles_compra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetallesCompra.findAll", query = "SELECT d FROM DetallesCompra d")})
public class DetallesCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CPD_ID")
    private Long cpdId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CPD_CPA_ID")
    private long cpdCpaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CPD_PDO_ID")
    private long cpdPdoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CPD_CANTIDAD_TOTAL")
    private long cpdCantidadTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CPD_CANTIDAD_DECLARADA")
    private long cpdCantidadDeclarada;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "CPD_PRECIO_UNITARIO")
    private Double cpdPrecioUnitario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CPD_MONTO_IVA")
    private Double cpdMontoIva;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CPD_FECHA_ALTA")
    @Temporal(TemporalType.DATE)
    private Date cpdFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CPD_USUARIO_ALTA")
    private String cpdUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CPD_FECHA_ULT_MOD")
    @Temporal(TemporalType.DATE)
    private Date cpdFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CPD_USUARIO_ULT_MOD")
    private String cpdUsuarioUltMod;
    @Column(name = "CPD_FECHA_BAJA")
    @Temporal(TemporalType.DATE)
    private Date cpdFechaBaja;
    @Size(max = 20)
    @Column(name = "CPD_USUARIO_BAJA")
    private String cpdUsuarioBaja;

    public DetallesCompra() {
    }

    public DetallesCompra(Long cpdId) {
        this.cpdId = cpdId;
    }

    public DetallesCompra(Long cpdId, long cpdCpaId, long cpdPdoId, long cpdCantidadTotal, long cpdCantidadDeclarada, Double cpdPrecioUnitario, Double cpdMontoIva, Date cpdFechaAlta, String cpdUsuarioAlta, Date cpdFechaUltMod, String cpdUsuarioUltMod) {
        this.cpdId = cpdId;
        this.cpdCpaId = cpdCpaId;
        this.cpdPdoId = cpdPdoId;
        this.cpdCantidadTotal = cpdCantidadTotal;
        this.cpdCantidadDeclarada = cpdCantidadDeclarada;
        this.cpdPrecioUnitario = cpdPrecioUnitario;
        this.cpdMontoIva = cpdMontoIva;
        this.cpdFechaAlta = cpdFechaAlta;
        this.cpdUsuarioAlta = cpdUsuarioAlta;
        this.cpdFechaUltMod = cpdFechaUltMod;
        this.cpdUsuarioUltMod = cpdUsuarioUltMod;
    }

    public Long getCpdId() {
        return cpdId;
    }

    public void setCpdId(Long cpdId) {
        this.cpdId = cpdId;
    }

    public long getCpdCpaId() {
        return cpdCpaId;
    }

    public void setCpdCpaId(long cpdCpaId) {
        this.cpdCpaId = cpdCpaId;
    }

    public long getCpdPdoId() {
        return cpdPdoId;
    }

    public void setCpdPdoId(long cpdPdoId) {
        this.cpdPdoId = cpdPdoId;
    }

    public long getCpdCantidadTotal() {
        return cpdCantidadTotal;
    }

    public void setCpdCantidadTotal(long cpdCantidadTotal) {
        this.cpdCantidadTotal = cpdCantidadTotal;
    }

    public long getCpdCantidadDeclarada() {
        return cpdCantidadDeclarada;
    }

    public void setCpdCantidadDeclarada(long cpdCantidadDeclarada) {
        this.cpdCantidadDeclarada = cpdCantidadDeclarada;
    }

    public Double getCpdPrecioUnitario() {
        return cpdPrecioUnitario;
    }

    public void setCpdPrecioUnitario(Double cpdPrecioUnitario) {
        this.cpdPrecioUnitario = cpdPrecioUnitario;
    }

    public Double getCpdMontoIva() {
        return cpdMontoIva;
    }

    public void setCpdMontoIva(Double cpdMontoIva) {
        this.cpdMontoIva = cpdMontoIva;
    }

    public Date getCpdFechaAlta() {
        return cpdFechaAlta;
    }

    public void setCpdFechaAlta(Date cpdFechaAlta) {
        this.cpdFechaAlta = cpdFechaAlta;
    }

    public String getCpdUsuarioAlta() {
        return cpdUsuarioAlta;
    }

    public void setCpdUsuarioAlta(String cpdUsuarioAlta) {
        this.cpdUsuarioAlta = cpdUsuarioAlta;
    }

    public Date getCpdFechaUltMod() {
        return cpdFechaUltMod;
    }

    public void setCpdFechaUltMod(Date cpdFechaUltMod) {
        this.cpdFechaUltMod = cpdFechaUltMod;
    }

    public String getCpdUsuarioUltMod() {
        return cpdUsuarioUltMod;
    }

    public void setCpdUsuarioUltMod(String cpdUsuarioUltMod) {
        this.cpdUsuarioUltMod = cpdUsuarioUltMod;
    }

    public Date getCpdFechaBaja() {
        return cpdFechaBaja;
    }

    public void setCpdFechaBaja(Date cpdFechaBaja) {
        this.cpdFechaBaja = cpdFechaBaja;
    }

    public String getCpdUsuarioBaja() {
        return cpdUsuarioBaja;
    }

    public void setCpdUsuarioBaja(String cpdUsuarioBaja) {
        this.cpdUsuarioBaja = cpdUsuarioBaja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpdId != null ? cpdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesCompra)) {
            return false;
        }
        DetallesCompra other = (DetallesCompra) object;
        if ((this.cpdId == null && other.cpdId != null) || (this.cpdId != null && !this.cpdId.equals(other.cpdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.WSRestEkommerce.modelo.DetallesCompra[ cpdId=" + cpdId + " ]";
    }
    
}
