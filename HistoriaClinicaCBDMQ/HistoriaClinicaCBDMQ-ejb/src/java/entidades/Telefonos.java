/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.io.Serializable;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author emoina
 */
@Entity
@Table(name = "telefonos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telefonos.findAll", query = "SELECT t FROM Telefonos t"),
    @NamedQuery(name = "Telefonos.findById", query = "SELECT t FROM Telefonos t WHERE t.id = :id"),
    @NamedQuery(name = "Telefonos.findByTipo", query = "SELECT t FROM Telefonos t WHERE t.tipo = :tipo"),
    @NamedQuery(name = "Telefonos.findByNumero", query = "SELECT t FROM Telefonos t WHERE t.numero = :numero"),
    @NamedQuery(name = "Telefonos.findByExtencion", query = "SELECT t FROM Telefonos t WHERE t.extencion = :extencion"),
    @NamedQuery(name = "Telefonos.findByOperadora", query = "SELECT t FROM Telefonos t WHERE t.operadora = :operadora")})
public class Telefonos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 10)
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 2147483647)
    @Column(name = "numero")
    private String numero;
    @Size(max = 2147483647)
    @Column(name = "extencion")
    private String extencion;
    @Size(max = 10)
    @Column(name = "operadora")
    private String operadora;
    @OneToMany(mappedBy = "telefono1")
    private List<Locales> localesList;
    @OneToMany(mappedBy = "telefono")
    private List<Locales> localesList1;
    @JoinColumn(name = "entidad", referencedColumnName = "id")
    @ManyToOne
    private Entidades entidad;

    public Telefonos() {
    }

    public Telefonos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getExtencion() {
        return extencion;
    }

    public void setExtencion(String extencion) {
        this.extencion = extencion;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    @XmlTransient
    public List<Locales> getLocalesList() {
        return localesList;
    }

    public void setLocalesList(List<Locales> localesList) {
        this.localesList = localesList;
    }

    @XmlTransient
    public List<Locales> getLocalesList1() {
        return localesList1;
    }

    public void setLocalesList1(List<Locales> localesList1) {
        this.localesList1 = localesList1;
    }

    public Entidades getEntidad() {
        return entidad;
    }

    public void setEntidad(Entidades entidad) {
        this.entidad = entidad;
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
        if (!(object instanceof Telefonos)) {
            return false;
        }
        Telefonos other = (Telefonos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Telefonos[ id=" + id + " ]";
    }
    
}
