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
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ventas.findAll", query = "SELECT v FROM Ventas v")})
public class Ventas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "VTA_ID")
    private Long vtaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VTA_FECHA")
    @Temporal(TemporalType.DATE)
    private Date vtaFecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "VTA_MONTO_TOTAL")
    private Double vtaMontoTotal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "VTA_FISCAL")
    private String vtaFiscal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VTA_CANT_ITEMS")
    private long vtaCantItems;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VTA_FECHA_ALTA")
    @Temporal(TemporalType.DATE)
    private Date vtaFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "VTA_USUARIO_ALTA")
    private String vtaUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VTA_FECHA_ULT_MOD")
    @Temporal(TemporalType.DATE)
    private Date vtaFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "VTA_USUARIO_ULT_MOD")
    private String vtaUsuarioUltMod;
    @Column(name = "VTA_FECHA_BAJA")
    @Temporal(TemporalType.DATE)
    private Date vtaFechaBaja;
    @Size(max = 20)
    @Column(name = "VTA_USUARIO_BAJA")
    private String vtaUsuarioBaja;
    @Column(name = "VTA_CTE_ID")
    private BigInteger vtaCteId;
    @Column(name = "VTA_PORC_DESCUENTO")
    private Double vtaPorcDescuento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "VTA_FORMA_PAGO")
    private String vtaFormaPago;
    @Column(name = "VTA_RECARGO")
    private Double vtaRecargo;

    public Ventas() {
    }

    public Ventas(Long vtaId) {
        this.vtaId = vtaId;
    }

    public Ventas(Long vtaId, Date vtaFecha, Double vtaMontoTotal, String vtaFiscal, long vtaCantItems, Date vtaFechaAlta, String vtaUsuarioAlta, Date vtaFechaUltMod, String vtaUsuarioUltMod, String vtaFormaPago) {
        this.vtaId = vtaId;
        this.vtaFecha = vtaFecha;
        this.vtaMontoTotal = vtaMontoTotal;
        this.vtaFiscal = vtaFiscal;
        this.vtaCantItems = vtaCantItems;
        this.vtaFechaAlta = vtaFechaAlta;
        this.vtaUsuarioAlta = vtaUsuarioAlta;
        this.vtaFechaUltMod = vtaFechaUltMod;
        this.vtaUsuarioUltMod = vtaUsuarioUltMod;
        this.vtaFormaPago = vtaFormaPago;
    }

    public Long getVtaId() {
        return vtaId;
    }

    public void setVtaId(Long vtaId) {
        this.vtaId = vtaId;
    }

    public Date getVtaFecha() {
        return vtaFecha;
    }

    public void setVtaFecha(Date vtaFecha) {
        this.vtaFecha = vtaFecha;
    }

    public Double getVtaMontoTotal() {
        return vtaMontoTotal;
    }

    public void setVtaMontoTotal(Double vtaMontoTotal) {
        this.vtaMontoTotal = vtaMontoTotal;
    }

    public String getVtaFiscal() {
        return vtaFiscal;
    }

    public void setVtaFiscal(String vtaFiscal) {
        this.vtaFiscal = vtaFiscal;
    }

    public long getVtaCantItems() {
        return vtaCantItems;
    }

    public void setVtaCantItems(long vtaCantItems) {
        this.vtaCantItems = vtaCantItems;
    }

    public Date getVtaFechaAlta() {
        return vtaFechaAlta;
    }

    public void setVtaFechaAlta(Date vtaFechaAlta) {
        this.vtaFechaAlta = vtaFechaAlta;
    }

    public String getVtaUsuarioAlta() {
        return vtaUsuarioAlta;
    }

    public void setVtaUsuarioAlta(String vtaUsuarioAlta) {
        this.vtaUsuarioAlta = vtaUsuarioAlta;
    }

    public Date getVtaFechaUltMod() {
        return vtaFechaUltMod;
    }

    public void setVtaFechaUltMod(Date vtaFechaUltMod) {
        this.vtaFechaUltMod = vtaFechaUltMod;
    }

    public String getVtaUsuarioUltMod() {
        return vtaUsuarioUltMod;
    }

    public void setVtaUsuarioUltMod(String vtaUsuarioUltMod) {
        this.vtaUsuarioUltMod = vtaUsuarioUltMod;
    }

    public Date getVtaFechaBaja() {
        return vtaFechaBaja;
    }

    public void setVtaFechaBaja(Date vtaFechaBaja) {
        this.vtaFechaBaja = vtaFechaBaja;
    }

    public String getVtaUsuarioBaja() {
        return vtaUsuarioBaja;
    }

    public void setVtaUsuarioBaja(String vtaUsuarioBaja) {
        this.vtaUsuarioBaja = vtaUsuarioBaja;
    }

    public BigInteger getVtaCteId() {
        return vtaCteId;
    }

    public void setVtaCteId(BigInteger vtaCteId) {
        this.vtaCteId = vtaCteId;
    }

    public Double getVtaPorcDescuento() {
        return vtaPorcDescuento;
    }

    public void setVtaPorcDescuento(Double vtaPorcDescuento) {
        this.vtaPorcDescuento = vtaPorcDescuento;
    }

    public String getVtaFormaPago() {
        return vtaFormaPago;
    }

    public void setVtaFormaPago(String vtaFormaPago) {
        this.vtaFormaPago = vtaFormaPago;
    }

    public Double getVtaRecargo() {
        return vtaRecargo;
    }

    public void setVtaRecargo(Double vtaRecargo) {
        this.vtaRecargo = vtaRecargo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vtaId != null ? vtaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ventas)) {
            return false;
        }
        Ventas other = (Ventas) object;
        if ((this.vtaId == null && other.vtaId != null) || (this.vtaId != null && !this.vtaId.equals(other.vtaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.WSRestEkommerce.modelo.Ventas[ vtaId=" + vtaId + " ]";
    }
    
}
