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
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c")})
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CTE_ID")
    private Long cteId;
    @Size(max = 13)
    @Column(name = "CTE_CUIT")
    private String cteCuit;
    @Size(max = 30)
    @Column(name = "CTE_APELLIDO_NOMBRE")
    private String cteApellidoNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "CTE_CONDICION_IVA")
    private String cteCondicionIva;
    @Size(max = 50)
    @Column(name = "CTE_CALLE")
    private String cteCalle;
    @Column(name = "CTE_NUMERO")
    private BigInteger cteNumero;
    @Size(max = 30)
    @Column(name = "CTE_BARRIO")
    private String cteBarrio;
    @Size(max = 30)
    @Column(name = "CTE_LOCALIDAD")
    private String cteLocalidad;
    @Size(max = 200)
    @Column(name = "CTE_OBSERVACIONES")
    private String cteObservaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CTE_FECHA_ALTA")
    @Temporal(TemporalType.DATE)
    private Date cteFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CTE_USUARIO_ALTA")
    private String cteUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CTE_FECHA_ULT_MOD")
    @Temporal(TemporalType.DATE)
    private Date cteFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CTE_USUARIO_ULT_MOD")
    private String cteUsuarioUltMod;
    @Column(name = "CTE_FECHA_BAJA")
    @Temporal(TemporalType.DATE)
    private Date cteFechaBaja;
    @Size(max = 20)
    @Column(name = "CTE_USUARIO_BAJA")
    private String cteUsuarioBaja;

    public Clientes() {
    }

    public Clientes(Long cteId) {
        this.cteId = cteId;
    }

    public Clientes(Long cteId, String cteCondicionIva, Date cteFechaAlta, String cteUsuarioAlta, Date cteFechaUltMod, String cteUsuarioUltMod) {
        this.cteId = cteId;
        this.cteCondicionIva = cteCondicionIva;
        this.cteFechaAlta = cteFechaAlta;
        this.cteUsuarioAlta = cteUsuarioAlta;
        this.cteFechaUltMod = cteFechaUltMod;
        this.cteUsuarioUltMod = cteUsuarioUltMod;
    }

    public Long getCteId() {
        return cteId;
    }

    public void setCteId(Long cteId) {
        this.cteId = cteId;
    }

    public String getCteCuit() {
        return cteCuit;
    }

    public void setCteCuit(String cteCuit) {
        this.cteCuit = cteCuit;
    }

    public String getCteApellidoNombre() {
        return cteApellidoNombre;
    }

    public void setCteApellidoNombre(String cteApellidoNombre) {
        this.cteApellidoNombre = cteApellidoNombre;
    }

    public String getCteCondicionIva() {
        return cteCondicionIva;
    }

    public void setCteCondicionIva(String cteCondicionIva) {
        this.cteCondicionIva = cteCondicionIva;
    }

    public String getCteCalle() {
        return cteCalle;
    }

    public void setCteCalle(String cteCalle) {
        this.cteCalle = cteCalle;
    }

    public BigInteger getCteNumero() {
        return cteNumero;
    }

    public void setCteNumero(BigInteger cteNumero) {
        this.cteNumero = cteNumero;
    }

    public String getCteBarrio() {
        return cteBarrio;
    }

    public void setCteBarrio(String cteBarrio) {
        this.cteBarrio = cteBarrio;
    }

    public String getCteLocalidad() {
        return cteLocalidad;
    }

    public void setCteLocalidad(String cteLocalidad) {
        this.cteLocalidad = cteLocalidad;
    }

    public String getCteObservaciones() {
        return cteObservaciones;
    }

    public void setCteObservaciones(String cteObservaciones) {
        this.cteObservaciones = cteObservaciones;
    }

    public Date getCteFechaAlta() {
        return cteFechaAlta;
    }

    public void setCteFechaAlta(Date cteFechaAlta) {
        this.cteFechaAlta = cteFechaAlta;
    }

    public String getCteUsuarioAlta() {
        return cteUsuarioAlta;
    }

    public void setCteUsuarioAlta(String cteUsuarioAlta) {
        this.cteUsuarioAlta = cteUsuarioAlta;
    }

    public Date getCteFechaUltMod() {
        return cteFechaUltMod;
    }

    public void setCteFechaUltMod(Date cteFechaUltMod) {
        this.cteFechaUltMod = cteFechaUltMod;
    }

    public String getCteUsuarioUltMod() {
        return cteUsuarioUltMod;
    }

    public void setCteUsuarioUltMod(String cteUsuarioUltMod) {
        this.cteUsuarioUltMod = cteUsuarioUltMod;
    }

    public Date getCteFechaBaja() {
        return cteFechaBaja;
    }

    public void setCteFechaBaja(Date cteFechaBaja) {
        this.cteFechaBaja = cteFechaBaja;
    }

    public String getCteUsuarioBaja() {
        return cteUsuarioBaja;
    }

    public void setCteUsuarioBaja(String cteUsuarioBaja) {
        this.cteUsuarioBaja = cteUsuarioBaja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cteId != null ? cteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.cteId == null && other.cteId != null) || (this.cteId != null && !this.cteId.equals(other.cteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.WSRestEkommerce.modelo.Clientes[ cteId=" + cteId + " ]";
    }
    
}
