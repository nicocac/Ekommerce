/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ekeepoit.WSRestEkommerce.model;

import java.io.Serializable;
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
    @NamedQuery(name = "Proveedores.findAll", query = "SELECT p FROM Proveedores p")})
public class Proveedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PDR_ID")
    private Long pdrId;
    @Size(max = 13)
    @Column(name = "PDR_CUIT")
    private String pdrCuit;
    @Size(max = 30)
    @Column(name = "PDR_RAZON_SOCIAL")
    private String pdrRazonSocial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "PDR_CONDICION_IVA")
    private String pdrCondicionIva;
    @Size(max = 50)
    @Column(name = "PDR_CALLE")
    private String pdrCalle;
    @Column(name = "PDR_NUMERO")
    private BigInteger pdrNumero;
    @Size(max = 30)
    @Column(name = "PDR_BARRIO")
    private String pdrBarrio;
    @Size(max = 30)
    @Column(name = "PDR_LOCALIDAD")
    private String pdrLocalidad;
    @Size(max = 200)
    @Column(name = "PDR_OBSERVACIONES")
    private String pdrObservaciones;
    @Column(name = "PDR_PORC_OMISION")
    private BigInteger pdrPorcOmision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PDR_FECHA_ALTA")
    @Temporal(TemporalType.DATE)
    private Date pdrFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PDR_USUARIO_ALTA")
    private String pdrUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PDR_FECHA_ULT_MOD")
    @Temporal(TemporalType.DATE)
    private Date pdrFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PDR_USUARIO_ULT_MOD")
    private String pdrUsuarioUltMod;
    @Column(name = "PDR_FECHA_BAJA")
    @Temporal(TemporalType.DATE)
    private Date pdrFechaBaja;
    @Size(max = 20)
    @Column(name = "PDR_USUARIO_BAJA")
    private String pdrUsuarioBaja;

    public Proveedores() {
    }

    public Proveedores(Long pdrId) {
        this.pdrId = pdrId;
    }

    public Proveedores(Long pdrId, String pdrCondicionIva, Date pdrFechaAlta, String pdrUsuarioAlta, Date pdrFechaUltMod, String pdrUsuarioUltMod) {
        this.pdrId = pdrId;
        this.pdrCondicionIva = pdrCondicionIva;
        this.pdrFechaAlta = pdrFechaAlta;
        this.pdrUsuarioAlta = pdrUsuarioAlta;
        this.pdrFechaUltMod = pdrFechaUltMod;
        this.pdrUsuarioUltMod = pdrUsuarioUltMod;
    }

    public Long getPdrId() {
        return pdrId;
    }

    public void setPdrId(Long pdrId) {
        this.pdrId = pdrId;
    }

    public String getPdrCuit() {
        return pdrCuit;
    }

    public void setPdrCuit(String pdrCuit) {
        this.pdrCuit = pdrCuit;
    }

    public String getPdrRazonSocial() {
        return pdrRazonSocial;
    }

    public void setPdrRazonSocial(String pdrRazonSocial) {
        this.pdrRazonSocial = pdrRazonSocial;
    }

    public String getPdrCondicionIva() {
        return pdrCondicionIva;
    }

    public void setPdrCondicionIva(String pdrCondicionIva) {
        this.pdrCondicionIva = pdrCondicionIva;
    }

    public String getPdrCalle() {
        return pdrCalle;
    }

    public void setPdrCalle(String pdrCalle) {
        this.pdrCalle = pdrCalle;
    }

    public BigInteger getPdrNumero() {
        return pdrNumero;
    }

    public void setPdrNumero(BigInteger pdrNumero) {
        this.pdrNumero = pdrNumero;
    }

    public String getPdrBarrio() {
        return pdrBarrio;
    }

    public void setPdrBarrio(String pdrBarrio) {
        this.pdrBarrio = pdrBarrio;
    }

    public String getPdrLocalidad() {
        return pdrLocalidad;
    }

    public void setPdrLocalidad(String pdrLocalidad) {
        this.pdrLocalidad = pdrLocalidad;
    }

    public String getPdrObservaciones() {
        return pdrObservaciones;
    }

    public void setPdrObservaciones(String pdrObservaciones) {
        this.pdrObservaciones = pdrObservaciones;
    }

    public BigInteger getPdrPorcOmision() {
        return pdrPorcOmision;
    }

    public void setPdrPorcOmision(BigInteger pdrPorcOmision) {
        this.pdrPorcOmision = pdrPorcOmision;
    }

    public Date getPdrFechaAlta() {
        return pdrFechaAlta;
    }

    public void setPdrFechaAlta(Date pdrFechaAlta) {
        this.pdrFechaAlta = pdrFechaAlta;
    }

    public String getPdrUsuarioAlta() {
        return pdrUsuarioAlta;
    }

    public void setPdrUsuarioAlta(String pdrUsuarioAlta) {
        this.pdrUsuarioAlta = pdrUsuarioAlta;
    }

    public Date getPdrFechaUltMod() {
        return pdrFechaUltMod;
    }

    public void setPdrFechaUltMod(Date pdrFechaUltMod) {
        this.pdrFechaUltMod = pdrFechaUltMod;
    }

    public String getPdrUsuarioUltMod() {
        return pdrUsuarioUltMod;
    }

    public void setPdrUsuarioUltMod(String pdrUsuarioUltMod) {
        this.pdrUsuarioUltMod = pdrUsuarioUltMod;
    }

    public Date getPdrFechaBaja() {
        return pdrFechaBaja;
    }

    public void setPdrFechaBaja(Date pdrFechaBaja) {
        this.pdrFechaBaja = pdrFechaBaja;
    }

    public String getPdrUsuarioBaja() {
        return pdrUsuarioBaja;
    }

    public void setPdrUsuarioBaja(String pdrUsuarioBaja) {
        this.pdrUsuarioBaja = pdrUsuarioBaja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pdrId != null ? pdrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedores)) {
            return false;
        }
        Proveedores other = (Proveedores) object;
        if ((this.pdrId == null && other.pdrId != null) || (this.pdrId != null && !this.pdrId.equals(other.pdrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.WSRestEkommerce.modelo.Proveedores[ pdrId=" + pdrId + " ]";
    }
    
}
