/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TOSHIBA
 */
@Entity
@Table(name = "tipoantecedentes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoantecedentes.findAll", query = "SELECT t FROM Tipoantecedentes t"),
    @NamedQuery(name = "Tipoantecedentes.findByIdtipoantecedente", query = "SELECT t FROM Tipoantecedentes t WHERE t.idtipoantecedente = :idtipoantecedente"),
    @NamedQuery(name = "Tipoantecedentes.findByDescripcion", query = "SELECT t FROM Tipoantecedentes t WHERE t.descripcion = :descripcion")})
public class Tipoantecedentes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipoantecedente")
    private Integer idtipoantecedente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipoantecedente")
    private List<Antecedentespersonales> antecedentespersonalesList;

    public Tipoantecedentes() {
    }

    public Tipoantecedentes(Integer idtipoantecedente) {
        this.idtipoantecedente = idtipoantecedente;
    }

    public Tipoantecedentes(Integer idtipoantecedente, String descripcion) {
        this.idtipoantecedente = idtipoantecedente;
        this.descripcion = descripcion;
    }

    public Integer getIdtipoantecedente() {
        return idtipoantecedente;
    }

    public void setIdtipoantecedente(Integer idtipoantecedente) {
        this.idtipoantecedente = idtipoantecedente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Antecedentespersonales> getAntecedentespersonalesList() {
        return antecedentespersonalesList;
    }

    public void setAntecedentespersonalesList(List<Antecedentespersonales> antecedentespersonalesList) {
        this.antecedentespersonalesList = antecedentespersonalesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoantecedente != null ? idtipoantecedente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoantecedentes)) {
            return false;
        }
        Tipoantecedentes other = (Tipoantecedentes) object;
        if ((this.idtipoantecedente == null && other.idtipoantecedente != null) || (this.idtipoantecedente != null && !this.idtipoantecedente.equals(other.idtipoantecedente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Tipoantecedentes[ idtipoantecedente=" + idtipoantecedente + " ]";
    }
    
}
