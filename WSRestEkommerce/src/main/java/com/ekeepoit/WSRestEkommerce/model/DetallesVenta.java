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
@Table(name = "detalles_venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetallesVenta.findAll", query = "SELECT d FROM DetallesVenta d")})
public class DetallesVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "VTD_ID")
    private Long vtdId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VTD_VTA_ID")
    private long vtdVtaId;
    @Column(name = "VTD_PDO_ID")
    private BigInteger vtdPdoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VTD_CANTIDAD")
    private long vtdCantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VTD_PRECIO")
    private Double vtdPrecio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VTD_FECHA_ALTA")
    @Temporal(TemporalType.DATE)
    private Date vtdFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "VTD_USUARIO_ALTA")
    private String vtdUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VTD_FECHA_ULT_MOD")
    @Temporal(TemporalType.DATE)
    private Date vtdFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "VTD_USUARIO_ULT_MOD")
    private String vtdUsuarioUltMod;
    @Column(name = "VTD_FECHA_BAJA")
    @Temporal(TemporalType.DATE)
    private Date vtdFechaBaja;
    @Size(max = 20)
    @Column(name = "VTD_USUARIO_BAJA")
    private String vtdUsuarioBaja;
    @Column(name = "VTD_RECARGO")
    private Double vtdRecargo;

    public DetallesVenta() {
    }

    public DetallesVenta(Long vtdId) {
        this.vtdId = vtdId;
    }

    public DetallesVenta(Long vtdId, long vtdVtaId, long vtdCantidad, Date vtdFechaAlta, String vtdUsuarioAlta, Date vtdFechaUltMod, String vtdUsuarioUltMod) {
        this.vtdId = vtdId;
        this.vtdVtaId = vtdVtaId;
        this.vtdCantidad = vtdCantidad;
        this.vtdFechaAlta = vtdFechaAlta;
        this.vtdUsuarioAlta = vtdUsuarioAlta;
        this.vtdFechaUltMod = vtdFechaUltMod;
        this.vtdUsuarioUltMod = vtdUsuarioUltMod;
    }

    public Long getVtdId() {
        return vtdId;
    }

    public void setVtdId(Long vtdId) {
        this.vtdId = vtdId;
    }

    public long getVtdVtaId() {
        return vtdVtaId;
    }

    public void setVtdVtaId(long vtdVtaId) {
        this.vtdVtaId = vtdVtaId;
    }

    public BigInteger getVtdPdoId() {
        return vtdPdoId;
    }

    public void setVtdPdoId(BigInteger vtdPdoId) {
        this.vtdPdoId = vtdPdoId;
    }

    public long getVtdCantidad() {
        return vtdCantidad;
    }

    public void setVtdCantidad(long vtdCantidad) {
        this.vtdCantidad = vtdCantidad;
    }

    public Double getVtdPrecio() {
        return vtdPrecio;
    }

    public void setVtdPrecio(Double vtdPrecio) {
        this.vtdPrecio = vtdPrecio;
    }

    public Date getVtdFechaAlta() {
        return vtdFechaAlta;
    }

    public void setVtdFechaAlta(Date vtdFechaAlta) {
        this.vtdFechaAlta = vtdFechaAlta;
    }

    public String getVtdUsuarioAlta() {
        return vtdUsuarioAlta;
    }

    public void setVtdUsuarioAlta(String vtdUsuarioAlta) {
        this.vtdUsuarioAlta = vtdUsuarioAlta;
    }

    public Date getVtdFechaUltMod() {
        return vtdFechaUltMod;
    }

    public void setVtdFechaUltMod(Date vtdFechaUltMod) {
        this.vtdFechaUltMod = vtdFechaUltMod;
    }

    public String getVtdUsuarioUltMod() {
        return vtdUsuarioUltMod;
    }

    public void setVtdUsuarioUltMod(String vtdUsuarioUltMod) {
        this.vtdUsuarioUltMod = vtdUsuarioUltMod;
    }

    public Date getVtdFechaBaja() {
        return vtdFechaBaja;
    }

    public void setVtdFechaBaja(Date vtdFechaBaja) {
        this.vtdFechaBaja = vtdFechaBaja;
    }

    public String getVtdUsuarioBaja() {
        return vtdUsuarioBaja;
    }

    public void setVtdUsuarioBaja(String vtdUsuarioBaja) {
        this.vtdUsuarioBaja = vtdUsuarioBaja;
    }

    public Double getVtdRecargo() {
        return vtdRecargo;
    }

    public void setVtdRecargo(Double vtdRecargo) {
        this.vtdRecargo = vtdRecargo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vtdId != null ? vtdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesVenta)) {
            return false;
        }
        DetallesVenta other = (DetallesVenta) object;
        if ((this.vtdId == null && other.vtdId != null) || (this.vtdId != null && !this.vtdId.equals(other.vtdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.WSRestEkommerce.modelo.DetallesVenta[ vtdId=" + vtdId + " ]";
    }
    
}
