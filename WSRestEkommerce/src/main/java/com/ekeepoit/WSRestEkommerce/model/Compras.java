/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ekeepoit.WSRestEkommerce.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "compras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compras.findAll", query = "SELECT c FROM Compras c")})
public class Compras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CPA_ID")
    private Long cpaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CPA_FECHA")
    @Temporal(TemporalType.DATE)
    private Date cpaFecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "CPA_MONTO_TOTAL")
    private Double cpaMontoTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CPA_MONTO_DECLARADO")
    private Double cpaMontoDeclarado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CPA_CANTIDAD_ITEMS_TOTAL")
    private long cpaCantidadItemsTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CPA_CANT_ITEMS_DECLARADO")
    private long cpaCantItemsDeclarado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CPA_PDR_ID")
    private long cpaPdrId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CPA_FECHA_ALTA")
    @Temporal(TemporalType.DATE)
    private Date cpaFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CPA_USUARIO_ALTA")
    private String cpaUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CPA_FECHA_ULT_MOD")
    @Temporal(TemporalType.DATE)
    private Date cpaFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CPA_USUARIO_ULT_MOD")
    private String cpaUsuarioUltMod;
    @Column(name = "CPA_FECHA_BAJA")
    @Temporal(TemporalType.DATE)
    private Date cpaFechaBaja;
    @Size(max = 20)
    @Column(name = "CPA_USUARIO_BAJA")
    private String cpaUsuarioBaja;
    @Size(max = 2)
    @Column(name = "CPA_IVA")
    private String cpaIva;
    @Column(name = "CPA_NRO_FACT")
    private BigInteger cpaNroFact;

    public Compras() {
    }

    public Compras(Long cpaId) {
        this.cpaId = cpaId;
    }

    public Compras(Long cpaId, Date cpaFecha, Double cpaMontoTotal, Double cpaMontoDeclarado, long cpaCantidadItemsTotal, long cpaCantItemsDeclarado, long cpaPdrId, Date cpaFechaAlta, String cpaUsuarioAlta, Date cpaFechaUltMod, String cpaUsuarioUltMod) {
        this.cpaId = cpaId;
        this.cpaFecha = cpaFecha;
        this.cpaMontoTotal = cpaMontoTotal;
        this.cpaMontoDeclarado = cpaMontoDeclarado;
        this.cpaCantidadItemsTotal = cpaCantidadItemsTotal;
        this.cpaCantItemsDeclarado = cpaCantItemsDeclarado;
        this.cpaPdrId = cpaPdrId;
        this.cpaFechaAlta = cpaFechaAlta;
        this.cpaUsuarioAlta = cpaUsuarioAlta;
        this.cpaFechaUltMod = cpaFechaUltMod;
        this.cpaUsuarioUltMod = cpaUsuarioUltMod;
    }

    public Long getCpaId() {
        return cpaId;
    }

    public void setCpaId(Long cpaId) {
        this.cpaId = cpaId;
    }

    public Date getCpaFecha() {
        return cpaFecha;
    }

    public void setCpaFecha(Date cpaFecha) {
        this.cpaFecha = cpaFecha;
    }

    public Double getCpaMontoTotal() {
        return cpaMontoTotal;
    }

    public void setCpaMontoTotal(Double cpaMontoTotal) {
        this.cpaMontoTotal = cpaMontoTotal;
    }

    public Double getCpaMontoDeclarado() {
        return cpaMontoDeclarado;
    }

    public void setCpaMontoDeclarado(Double cpaMontoDeclarado) {
        this.cpaMontoDeclarado = cpaMontoDeclarado;
    }

    public long getCpaCantidadItemsTotal() {
        return cpaCantidadItemsTotal;
    }

    public void setCpaCantidadItemsTotal(long cpaCantidadItemsTotal) {
        this.cpaCantidadItemsTotal = cpaCantidadItemsTotal;
    }

    public long getCpaCantItemsDeclarado() {
        return cpaCantItemsDeclarado;
    }

    public void setCpaCantItemsDeclarado(long cpaCantItemsDeclarado) {
        this.cpaCantItemsDeclarado = cpaCantItemsDeclarado;
    }

    public long getCpaPdrId() {
        return cpaPdrId;
    }

    public void setCpaPdrId(long cpaPdrId) {
        this.cpaPdrId = cpaPdrId;
    }

    public Date getCpaFechaAlta() {
        return cpaFechaAlta;
    }

    public void setCpaFechaAlta(Date cpaFechaAlta) {
        this.cpaFechaAlta = cpaFechaAlta;
    }

    public String getCpaUsuarioAlta() {
        return cpaUsuarioAlta;
    }

    public void setCpaUsuarioAlta(String cpaUsuarioAlta) {
        this.cpaUsuarioAlta = cpaUsuarioAlta;
    }

    public Date getCpaFechaUltMod() {
        return cpaFechaUltMod;
    }

    public void setCpaFechaUltMod(Date cpaFechaUltMod) {
        this.cpaFechaUltMod = cpaFechaUltMod;
    }

    public String getCpaUsuarioUltMod() {
        return cpaUsuarioUltMod;
    }

    public void setCpaUsuarioUltMod(String cpaUsuarioUltMod) {
        this.cpaUsuarioUltMod = cpaUsuarioUltMod;
    }

    public Date getCpaFechaBaja() {
        return cpaFechaBaja;
    }

    public void setCpaFechaBaja(Date cpaFechaBaja) {
        this.cpaFechaBaja = cpaFechaBaja;
    }

    public String getCpaUsuarioBaja() {
        return cpaUsuarioBaja;
    }

    public void setCpaUsuarioBaja(String cpaUsuarioBaja) {
        this.cpaUsuarioBaja = cpaUsuarioBaja;
    }

    public String getCpaIva() {
        return cpaIva;
    }

    public void setCpaIva(String cpaIva) {
        this.cpaIva = cpaIva;
    }

    public BigInteger getCpaNroFact() {
        return cpaNroFact;
    }

    public void setCpaNroFact(BigInteger cpaNroFact) {
        this.cpaNroFact = cpaNroFact;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpaId != null ? cpaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compras)) {
            return false;
        }
        Compras other = (Compras) object;
        if ((this.cpaId == null && other.cpaId != null) || (this.cpaId != null && !this.cpaId.equals(other.cpaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.WSRestEkommerce.modelo.Compras[ cpaId=" + cpaId + " ]";
    }
    
}
