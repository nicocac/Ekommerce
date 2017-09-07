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
@Table(name = "stock_productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StockProductos.findAll", query = "SELECT s FROM StockProductos s")})
public class StockProductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SPD_ID")
    private Long spdId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SPD_PDO_ID")
    private long spdPdoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SPD_CANTIDAD_TOTAL")
    private long spdCantidadTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SPD_CANTIDAD_DECLARADA")
    private long spdCantidadDeclarada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SPD_FECHA_ALTA")
    @Temporal(TemporalType.DATE)
    private Date spdFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SPD_USUARIO_ALTA")
    private String spdUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SPD_FECHA_ULT_MOD")
    @Temporal(TemporalType.DATE)
    private Date spdFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SPD_USUARIO_ULT_MOD")
    private String spdUsuarioUltMod;
    @Column(name = "SPD_FECHA_BAJA")
    @Temporal(TemporalType.DATE)
    private Date spdFechaBaja;
    @Size(max = 20)
    @Column(name = "SPD_USUARIO_BAJA")
    private String spdUsuarioBaja;

    public StockProductos() {
    }

    public StockProductos(Long spdId) {
        this.spdId = spdId;
    }

    public StockProductos(Long spdId, long spdPdoId, long spdCantidadTotal, long spdCantidadDeclarada, Date spdFechaAlta, String spdUsuarioAlta, Date spdFechaUltMod, String spdUsuarioUltMod) {
        this.spdId = spdId;
        this.spdPdoId = spdPdoId;
        this.spdCantidadTotal = spdCantidadTotal;
        this.spdCantidadDeclarada = spdCantidadDeclarada;
        this.spdFechaAlta = spdFechaAlta;
        this.spdUsuarioAlta = spdUsuarioAlta;
        this.spdFechaUltMod = spdFechaUltMod;
        this.spdUsuarioUltMod = spdUsuarioUltMod;
    }

    public Long getSpdId() {
        return spdId;
    }

    public void setSpdId(Long spdId) {
        this.spdId = spdId;
    }

    public long getSpdPdoId() {
        return spdPdoId;
    }

    public void setSpdPdoId(long spdPdoId) {
        this.spdPdoId = spdPdoId;
    }

    public long getSpdCantidadTotal() {
        return spdCantidadTotal;
    }

    public void setSpdCantidadTotal(long spdCantidadTotal) {
        this.spdCantidadTotal = spdCantidadTotal;
    }

    public long getSpdCantidadDeclarada() {
        return spdCantidadDeclarada;
    }

    public void setSpdCantidadDeclarada(long spdCantidadDeclarada) {
        this.spdCantidadDeclarada = spdCantidadDeclarada;
    }

    public Date getSpdFechaAlta() {
        return spdFechaAlta;
    }

    public void setSpdFechaAlta(Date spdFechaAlta) {
        this.spdFechaAlta = spdFechaAlta;
    }

    public String getSpdUsuarioAlta() {
        return spdUsuarioAlta;
    }

    public void setSpdUsuarioAlta(String spdUsuarioAlta) {
        this.spdUsuarioAlta = spdUsuarioAlta;
    }

    public Date getSpdFechaUltMod() {
        return spdFechaUltMod;
    }

    public void setSpdFechaUltMod(Date spdFechaUltMod) {
        this.spdFechaUltMod = spdFechaUltMod;
    }

    public String getSpdUsuarioUltMod() {
        return spdUsuarioUltMod;
    }

    public void setSpdUsuarioUltMod(String spdUsuarioUltMod) {
        this.spdUsuarioUltMod = spdUsuarioUltMod;
    }

    public Date getSpdFechaBaja() {
        return spdFechaBaja;
    }

    public void setSpdFechaBaja(Date spdFechaBaja) {
        this.spdFechaBaja = spdFechaBaja;
    }

    public String getSpdUsuarioBaja() {
        return spdUsuarioBaja;
    }

    public void setSpdUsuarioBaja(String spdUsuarioBaja) {
        this.spdUsuarioBaja = spdUsuarioBaja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (spdId != null ? spdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StockProductos)) {
            return false;
        }
        StockProductos other = (StockProductos) object;
        if ((this.spdId == null && other.spdId != null) || (this.spdId != null && !this.spdId.equals(other.spdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.WSRestEkommerce.modelo.StockProductos[ spdId=" + spdId + " ]";
    }
    
}
