/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TOSHIBA
 */
@Entity
@Table(name = "antecedenteslaborales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Antecedenteslaborales.findAll", query = "SELECT a FROM Antecedenteslaborales a"),
    @NamedQuery(name = "Antecedenteslaborales.findById", query = "SELECT a FROM Antecedenteslaborales a WHERE a.id = :id"),
    @NamedQuery(name = "Antecedenteslaborales.findByEmpresatrabajo", query = "SELECT a FROM Antecedenteslaborales a WHERE a.empresatrabajo = :empresatrabajo"),
    @NamedQuery(name = "Antecedenteslaborales.findByIngreso", query = "SELECT a FROM Antecedenteslaborales a WHERE a.ingreso = :ingreso"),
    @NamedQuery(name = "Antecedenteslaborales.findBySalida", query = "SELECT a FROM Antecedenteslaborales a WHERE a.salida = :salida"),
    @NamedQuery(name = "Antecedenteslaborales.findByRiesgoalqueseexpuso", query = "SELECT a FROM Antecedenteslaborales a WHERE a.riesgoalqueseexpuso = :riesgoalqueseexpuso"),
    @NamedQuery(name = "Antecedenteslaborales.findByTiempodeexposicion", query = "SELECT a FROM Antecedenteslaborales a WHERE a.tiempodeexposicion = :tiempodeexposicion"),
    @NamedQuery(name = "Antecedenteslaborales.findByEpp", query = "SELECT a FROM Antecedenteslaborales a WHERE a.epp = :epp")})
public class Antecedenteslaborales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "empresatrabajo")
    private String empresatrabajo;
    @Column(name = "ingreso")
    @Temporal(TemporalType.DATE)
    private Date ingreso;
    @Column(name = "salida")
    @Temporal(TemporalType.DATE)
    private Date salida;
    @Size(max = 2147483647)
    @Column(name = "riesgoalqueseexpuso")
    private String riesgoalqueseexpuso;
    @Column(name = "tiempodeexposicion")
    private Integer tiempodeexposicion;
    @Size(max = 2147483647)
    @Column(name = "epp")
    private String epp;
    @JoinColumn(name = "iddatosidentificacion", referencedColumnName = "iddatosidentificacion")
    @ManyToOne(optional = false)
    private Datosidentificacion iddatosidentificacion;

    public Antecedenteslaborales() {
    }

    public Antecedenteslaborales(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpresatrabajo() {
        return empresatrabajo;
    }

    public void setEmpresatrabajo(String empresatrabajo) {
        this.empresatrabajo = empresatrabajo;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public String getRiesgoalqueseexpuso() {
        return riesgoalqueseexpuso;
    }

    public void setRiesgoalqueseexpuso(String riesgoalqueseexpuso) {
        this.riesgoalqueseexpuso = riesgoalqueseexpuso;
    }

    public Integer getTiempodeexposicion() {
        return tiempodeexposicion;
    }

    public void setTiempodeexposicion(Integer tiempodeexposicion) {
        this.tiempodeexposicion = tiempodeexposicion;
    }

    public String getEpp() {
        return epp;
    }

    public void setEpp(String epp) {
        this.epp = epp;
    }

    public Datosidentificacion getIddatosidentificacion() {
        return iddatosidentificacion;
    }

    public void setIddatosidentificacion(Datosidentificacion iddatosidentificacion) {
        this.iddatosidentificacion = iddatosidentificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Antecedenteslaborales)) {
            return false;
        }
        Antecedenteslaborales other = (Antecedenteslaborales) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Antecedenteslaborales[ id=" + id + " ]";
    }
    
}
