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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author emoina
 */
@Entity
@Table(name = "signosvitales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Signosvitales.findAll", query = "SELECT s FROM Signosvitales s"),
    @NamedQuery(name = "Signosvitales.findById", query = "SELECT s FROM Signosvitales s WHERE s.id = :id"),
    @NamedQuery(name = "Signosvitales.findByTa", query = "SELECT s FROM Signosvitales s WHERE s.ta = :ta"),
    @NamedQuery(name = "Signosvitales.findByTc", query = "SELECT s FROM Signosvitales s WHERE s.tc = :tc"),
    @NamedQuery(name = "Signosvitales.findByFc", query = "SELECT s FROM Signosvitales s WHERE s.fc = :fc"),
    @NamedQuery(name = "Signosvitales.findByFr", query = "SELECT s FROM Signosvitales s WHERE s.fr = :fr")})
public class Signosvitales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "ta")
    private String ta;
    @Size(max = 2147483647)
    @Column(name = "tc")
    private String tc;
    @Size(max = 2147483647)
    @Column(name = "fc")
    private String fc;
    @Size(max = 2147483647)
    @Column(name = "fr")
    private String fr;
    @JoinColumn(name = "iddatosidentificacion", referencedColumnName = "iddatosidentificacion")
    @ManyToOne
    private Datosidentificacion iddatosidentificacion;

    public Signosvitales() {
    }

    public Signosvitales(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTa() {
        return ta;
    }

    public void setTa(String ta) {
        this.ta = ta;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getFc() {
        return fc;
    }

    public void setFc(String fc) {
        this.fc = fc;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
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
        if (!(object instanceof Signosvitales)) {
            return false;
        }
        Signosvitales other = (Signosvitales) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Signosvitales[ id=" + id + " ]";
    }
    
}
