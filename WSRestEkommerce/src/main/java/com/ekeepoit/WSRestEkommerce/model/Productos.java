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
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p")})
public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PDO_ID")
    private Long pdoId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PDO_NOMBRE")
    private String pdoNombre;
    @Size(max = 100)
    @Column(name = "PDO_DESCRIPCION")
    private String pdoDescripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "PDO_PRECIO_UNITARIO")
    private Double pdoPrecioUnitario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PDO_PRECIO_VENTA")
    private Double pdoPrecioVenta;
    @Column(name = "PDO_PRECIO_MAYORISTA")
    private Double pdoPrecioMayorista;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PDO_FECHA_ALTA")
    @Temporal(TemporalType.DATE)
    private Date pdoFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PDO_USUARIO_ALTA")
    private String pdoUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PDO_FECHA_ULT_MOD")
    @Temporal(TemporalType.DATE)
    private Date pdoFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PDO_USUARIO_ULT_MOD")
    private String pdoUsuarioUltMod;
    @Column(name = "PDO_FECHA_BAJA")
    @Temporal(TemporalType.DATE)
    private Date pdoFechaBaja;
    @Size(max = 20)
    @Column(name = "PDO_USUARIO_BAJA")
    private String pdoUsuarioBaja;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PDO_CODIGO_BARRA")
    private String pdoCodigoBarra;
    @Column(name = "PDO_STOCK_TOTAL")
    private BigInteger pdoStockTotal;
    @Column(name = "PDO_STOCK_DECLARADO")
    private BigInteger pdoStockDeclarado;
    @Column(name = "PDO_DESCUENTO")
    private Double pdoDescuento;

    public Productos() {
    }

    public Productos(Long pdoId) {
        this.pdoId = pdoId;
    }

    public Productos(Long pdoId, String pdoNombre, Double pdoPrecioUnitario, Double pdoPrecioVenta, Date pdoFechaAlta, String pdoUsuarioAlta, Date pdoFechaUltMod, String pdoUsuarioUltMod, String pdoCodigoBarra) {
        this.pdoId = pdoId;
        this.pdoNombre = pdoNombre;
        this.pdoPrecioUnitario = pdoPrecioUnitario;
        this.pdoPrecioVenta = pdoPrecioVenta;
        this.pdoFechaAlta = pdoFechaAlta;
        this.pdoUsuarioAlta = pdoUsuarioAlta;
        this.pdoFechaUltMod = pdoFechaUltMod;
        this.pdoUsuarioUltMod = pdoUsuarioUltMod;
        this.pdoCodigoBarra = pdoCodigoBarra;
    }

    public Long getPdoId() {
        return pdoId;
    }

    public void setPdoId(Long pdoId) {
        this.pdoId = pdoId;
    }

    public String getPdoNombre() {
        return pdoNombre;
    }

    public void setPdoNombre(String pdoNombre) {
        this.pdoNombre = pdoNombre;
    }

    public String getPdoDescripcion() {
        return pdoDescripcion;
    }

    public void setPdoDescripcion(String pdoDescripcion) {
        this.pdoDescripcion = pdoDescripcion;
    }

    public Double getPdoPrecioUnitario() {
        return pdoPrecioUnitario;
    }

    public void setPdoPrecioUnitario(Double pdoPrecioUnitario) {
        this.pdoPrecioUnitario = pdoPrecioUnitario;
    }

    public Double getPdoPrecioVenta() {
        return pdoPrecioVenta;
    }

    public void setPdoPrecioVenta(Double pdoPrecioVenta) {
        this.pdoPrecioVenta = pdoPrecioVenta;
    }

    public Double getPdoPrecioMayorista() {
        return pdoPrecioMayorista;
    }

    public void setPdoPrecioMayorista(Double pdoPrecioMayorista) {
        this.pdoPrecioMayorista = pdoPrecioMayorista;
    }

    public Date getPdoFechaAlta() {
        return pdoFechaAlta;
    }

    public void setPdoFechaAlta(Date pdoFechaAlta) {
        this.pdoFechaAlta = pdoFechaAlta;
    }

    public String getPdoUsuarioAlta() {
        return pdoUsuarioAlta;
    }

    public void setPdoUsuarioAlta(String pdoUsuarioAlta) {
        this.pdoUsuarioAlta = pdoUsuarioAlta;
    }

    public Date getPdoFechaUltMod() {
        return pdoFechaUltMod;
    }

    public void setPdoFechaUltMod(Date pdoFechaUltMod) {
        this.pdoFechaUltMod = pdoFechaUltMod;
    }

    public String getPdoUsuarioUltMod() {
        return pdoUsuarioUltMod;
    }

    public void setPdoUsuarioUltMod(String pdoUsuarioUltMod) {
        this.pdoUsuarioUltMod = pdoUsuarioUltMod;
    }

    public Date getPdoFechaBaja() {
        return pdoFechaBaja;
    }

    public void setPdoFechaBaja(Date pdoFechaBaja) {
        this.pdoFechaBaja = pdoFechaBaja;
    }

    public String getPdoUsuarioBaja() {
        return pdoUsuarioBaja;
    }

    public void setPdoUsuarioBaja(String pdoUsuarioBaja) {
        this.pdoUsuarioBaja = pdoUsuarioBaja;
    }

    public String getPdoCodigoBarra() {
        return pdoCodigoBarra;
    }

    public void setPdoCodigoBarra(String pdoCodigoBarra) {
        this.pdoCodigoBarra = pdoCodigoBarra;
    }

    public BigInteger getPdoStockTotal() {
        return pdoStockTotal;
    }

    public void setPdoStockTotal(BigInteger pdoStockTotal) {
        this.pdoStockTotal = pdoStockTotal;
    }

    public BigInteger getPdoStockDeclarado() {
        return pdoStockDeclarado;
    }

    public void setPdoStockDeclarado(BigInteger pdoStockDeclarado) {
        this.pdoStockDeclarado = pdoStockDeclarado;
    }

    public Double getPdoDescuento() {
        return pdoDescuento;
    }

    public void setPdoDescuento(Double pdoDescuento) {
        this.pdoDescuento = pdoDescuento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pdoId != null ? pdoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.pdoId == null && other.pdoId != null) || (this.pdoId != null && !this.pdoId.equals(other.pdoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.WSRestEkommerce.modelo.Productos[ pdoId=" + pdoId + " ]";
    }
    
}
