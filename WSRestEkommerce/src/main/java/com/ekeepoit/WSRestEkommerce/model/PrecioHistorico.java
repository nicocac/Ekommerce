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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nico
 */
@Entity
@Table(name = "precio_historico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PrecioHistorico.findAll", query = "SELECT p FROM PrecioHistorico p")})
public class PrecioHistorico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PTH_ID")
    private Long pthId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PTH_PDO_ID")
    private long pthPdoId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "PTH_PRECIO_UNITARIO")
    private Double pthPrecioUnitario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PTH_PRECIO_VENTA")
    private Double pthPrecioVenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PTH_PRECIO_MAYORISTA")
    private Double pthPrecioMayorista;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PTH_FECHA_INICIO")
    @Temporal(TemporalType.DATE)
    private Date pthFechaInicio;
    @Column(name = "PTH_FECHA_FIN")
    @Temporal(TemporalType.DATE)
    private Date pthFechaFin;

    public PrecioHistorico() {
    }

    public PrecioHistorico(Long pthId) {
        this.pthId = pthId;
    }

    public PrecioHistorico(Long pthId, long pthPdoId, Double pthPrecioUnitario, Double pthPrecioVenta, Double pthPrecioMayorista, Date pthFechaInicio) {
        this.pthId = pthId;
        this.pthPdoId = pthPdoId;
        this.pthPrecioUnitario = pthPrecioUnitario;
        this.pthPrecioVenta = pthPrecioVenta;
        this.pthPrecioMayorista = pthPrecioMayorista;
        this.pthFechaInicio = pthFechaInicio;
    }

    public Long getPthId() {
        return pthId;
    }

    public void setPthId(Long pthId) {
        this.pthId = pthId;
    }

    public long getPthPdoId() {
        return pthPdoId;
    }

    public void setPthPdoId(long pthPdoId) {
        this.pthPdoId = pthPdoId;
    }

    public Double getPthPrecioUnitario() {
        return pthPrecioUnitario;
    }

    public void setPthPrecioUnitario(Double pthPrecioUnitario) {
        this.pthPrecioUnitario = pthPrecioUnitario;
    }

    public Double getPthPrecioVenta() {
        return pthPrecioVenta;
    }

    public void setPthPrecioVenta(Double pthPrecioVenta) {
        this.pthPrecioVenta = pthPrecioVenta;
    }

    public Double getPthPrecioMayorista() {
        return pthPrecioMayorista;
    }

    public void setPthPrecioMayorista(Double pthPrecioMayorista) {
        this.pthPrecioMayorista = pthPrecioMayorista;
    }

    public Date getPthFechaInicio() {
        return pthFechaInicio;
    }

    public void setPthFechaInicio(Date pthFechaInicio) {
        this.pthFechaInicio = pthFechaInicio;
    }

    public Date getPthFechaFin() {
        return pthFechaFin;
    }

    public void setPthFechaFin(Date pthFechaFin) {
        this.pthFechaFin = pthFechaFin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pthId != null ? pthId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrecioHistorico)) {
            return false;
        }
        PrecioHistorico other = (PrecioHistorico) object;
        if ((this.pthId == null && other.pthId != null) || (this.pthId != null && !this.pthId.equals(other.pthId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.WSRestEkommerce.modelo.PrecioHistorico[ pthId=" + pthId + " ]";
    }
    
}
