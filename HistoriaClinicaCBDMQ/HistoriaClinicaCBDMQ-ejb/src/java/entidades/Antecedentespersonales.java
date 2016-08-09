/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TOSHIBA
 */
@Entity
@Table(name = "antecedentespersonales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Antecedentespersonales.findAll", query = "SELECT a FROM Antecedentespersonales a"),
    @NamedQuery(name = "Antecedentespersonales.findByIdantecedentespersonales", query = "SELECT a FROM Antecedentespersonales a WHERE a.idantecedentespersonales = :idantecedentespersonales"),
    @NamedQuery(name = "Antecedentespersonales.findByDescripcion", query = "SELECT a FROM Antecedentespersonales a WHERE a.descripcion = :descripcion")})
public class Antecedentespersonales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idantecedentespersonales")
    private Integer idantecedentespersonales;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "iddatosidentificacion", referencedColumnName = "iddatosidentificacion")
    @ManyToOne(optional = false)
    private Datosidentificacion iddatosidentificacion;
    @JoinColumn(name = "idtipoantecedente", referencedColumnName = "idtipoantecedente")
    @ManyToOne(optional = false)
    private Tipoantecedentes idtipoantecedente;

    public Antecedentespersonales() {
    }

    public Antecedentespersonales(Integer idantecedentespersonales) {
        this.idantecedentespersonales = idantecedentespersonales;
    }

    public Antecedentespersonales(Integer idantecedentespersonales, String descripcion) {
        this.idantecedentespersonales = idantecedentespersonales;
        this.descripcion = descripcion;
    }

    public Integer getIdantecedentespersonales() {
        return idantecedentespersonales;
    }

    public void setIdantecedentespersonales(Integer idantecedentespersonales) {
        this.idantecedentespersonales = idantecedentespersonales;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Datosidentificacion getIddatosidentificacion() {
        return iddatosidentificacion;
    }

    public void setIddatosidentificacion(Datosidentificacion iddatosidentificacion) {
        this.iddatosidentificacion = iddatosidentificacion;
    }

    public Tipoantecedentes getIdtipoantecedente() {
        return idtipoantecedente;
    }

    public void setIdtipoantecedente(Tipoantecedentes idtipoantecedente) {
        this.idtipoantecedente = idtipoantecedente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idantecedentespersonales != null ? idantecedentespersonales.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Antecedentespersonales)) {
            return false;
        }
        Antecedentespersonales other = (Antecedentespersonales) object;
        if ((this.idantecedentespersonales == null && other.idantecedentespersonales != null) || (this.idantecedentespersonales != null && !this.idantecedentespersonales.equals(other.idantecedentespersonales))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Antecedentespersonales[ idantecedentespersonales=" + idantecedentespersonales + " ]";
    }
    
}
