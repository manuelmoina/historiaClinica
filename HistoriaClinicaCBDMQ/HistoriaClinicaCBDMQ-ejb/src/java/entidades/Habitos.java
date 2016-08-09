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
 * @author TOSHIBA
 */
@Entity
@Table(name = "habitos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Habitos.findAll", query = "SELECT h FROM Habitos h"),
    @NamedQuery(name = "Habitos.findById", query = "SELECT h FROM Habitos h WHERE h.id = :id"),
    @NamedQuery(name = "Habitos.findByCigarrillohz", query = "SELECT h FROM Habitos h WHERE h.cigarrillohz = :cigarrillohz"),
    @NamedQuery(name = "Habitos.findByCigarrilloinicio", query = "SELECT h FROM Habitos h WHERE h.cigarrilloinicio = :cigarrilloinicio"),
    @NamedQuery(name = "Habitos.findByCigarrillofin", query = "SELECT h FROM Habitos h WHERE h.cigarrillofin = :cigarrillofin"),
    @NamedQuery(name = "Habitos.findByCigarrillodetalle", query = "SELECT h FROM Habitos h WHERE h.cigarrillodetalle = :cigarrillodetalle"),
    @NamedQuery(name = "Habitos.findByAlcoholhz", query = "SELECT h FROM Habitos h WHERE h.alcoholhz = :alcoholhz"),
    @NamedQuery(name = "Habitos.findByAlcoholinicio", query = "SELECT h FROM Habitos h WHERE h.alcoholinicio = :alcoholinicio"),
    @NamedQuery(name = "Habitos.findByAlcoholfin", query = "SELECT h FROM Habitos h WHERE h.alcoholfin = :alcoholfin"),
    @NamedQuery(name = "Habitos.findByAlcoholdetalle", query = "SELECT h FROM Habitos h WHERE h.alcoholdetalle = :alcoholdetalle"),
    @NamedQuery(name = "Habitos.findByDroganombre0", query = "SELECT h FROM Habitos h WHERE h.droganombre0 = :droganombre0"),
    @NamedQuery(name = "Habitos.findByDrogainicio0", query = "SELECT h FROM Habitos h WHERE h.drogainicio0 = :drogainicio0"),
    @NamedQuery(name = "Habitos.findByDrogafin0", query = "SELECT h FROM Habitos h WHERE h.drogafin0 = :drogafin0"),
    @NamedQuery(name = "Habitos.findByDrogadetalle0", query = "SELECT h FROM Habitos h WHERE h.drogadetalle0 = :drogadetalle0"),
    @NamedQuery(name = "Habitos.findByDroganombre1", query = "SELECT h FROM Habitos h WHERE h.droganombre1 = :droganombre1"),
    @NamedQuery(name = "Habitos.findByDrogainicio1", query = "SELECT h FROM Habitos h WHERE h.drogainicio1 = :drogainicio1"),
    @NamedQuery(name = "Habitos.findByDrogafin1", query = "SELECT h FROM Habitos h WHERE h.drogafin1 = :drogafin1"),
    @NamedQuery(name = "Habitos.findByDrogadetalle1", query = "SELECT h FROM Habitos h WHERE h.drogadetalle1 = :drogadetalle1"),
    @NamedQuery(name = "Habitos.findByDroganombre2", query = "SELECT h FROM Habitos h WHERE h.droganombre2 = :droganombre2"),
    @NamedQuery(name = "Habitos.findByDrogainicio2", query = "SELECT h FROM Habitos h WHERE h.drogainicio2 = :drogainicio2"),
    @NamedQuery(name = "Habitos.findByDrogafin2", query = "SELECT h FROM Habitos h WHERE h.drogafin2 = :drogafin2"),
    @NamedQuery(name = "Habitos.findByDrogadetalle2", query = "SELECT h FROM Habitos h WHERE h.drogadetalle2 = :drogadetalle2")})
public class Habitos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "cigarrillohz")
    private String cigarrillohz;
    @Size(max = 2147483647)
    @Column(name = "cigarrilloinicio")
    private String cigarrilloinicio;
    @Size(max = 2147483647)
    @Column(name = "cigarrillofin")
    private String cigarrillofin;
    @Size(max = 2147483647)
    @Column(name = "cigarrillodetalle")
    private String cigarrillodetalle;
    @Size(max = 2147483647)
    @Column(name = "alcoholhz")
    private String alcoholhz;
    @Size(max = 2147483647)
    @Column(name = "alcoholinicio")
    private String alcoholinicio;
    @Size(max = 2147483647)
    @Column(name = "alcoholfin")
    private String alcoholfin;
    @Size(max = 2147483647)
    @Column(name = "alcoholdetalle")
    private String alcoholdetalle;
    @Size(max = 2147483647)
    @Column(name = "droganombre0")
    private String droganombre0;
    @Size(max = 2147483647)
    @Column(name = "drogainicio0")
    private String drogainicio0;
    @Size(max = 2147483647)
    @Column(name = "drogafin0")
    private String drogafin0;
    @Size(max = 2147483647)
    @Column(name = "drogadetalle0")
    private String drogadetalle0;
    @Size(max = 2147483647)
    @Column(name = "droganombre1")
    private String droganombre1;
    @Size(max = 2147483647)
    @Column(name = "drogainicio1")
    private String drogainicio1;
    @Size(max = 2147483647)
    @Column(name = "drogafin1")
    private String drogafin1;
    @Size(max = 2147483647)
    @Column(name = "drogadetalle1")
    private String drogadetalle1;
    @Size(max = 2147483647)
    @Column(name = "droganombre2")
    private String droganombre2;
    @Size(max = 2147483647)
    @Column(name = "drogainicio2")
    private String drogainicio2;
    @Size(max = 2147483647)
    @Column(name = "drogafin2")
    private String drogafin2;
    @Size(max = 2147483647)
    @Column(name = "drogadetalle2")
    private String drogadetalle2;
    @JoinColumn(name = "dat_id", referencedColumnName = "iddatosidentificacion")
    @ManyToOne
    private Datosidentificacion datId;

    public Habitos() {
    }

    public Habitos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCigarrillohz() {
        return cigarrillohz;
    }

    public void setCigarrillohz(String cigarrillohz) {
        this.cigarrillohz = cigarrillohz;
    }

    public String getCigarrilloinicio() {
        return cigarrilloinicio;
    }

    public void setCigarrilloinicio(String cigarrilloinicio) {
        this.cigarrilloinicio = cigarrilloinicio;
    }

    public String getCigarrillofin() {
        return cigarrillofin;
    }

    public void setCigarrillofin(String cigarrillofin) {
        this.cigarrillofin = cigarrillofin;
    }

    public String getCigarrillodetalle() {
        return cigarrillodetalle;
    }

    public void setCigarrillodetalle(String cigarrillodetalle) {
        this.cigarrillodetalle = cigarrillodetalle;
    }

    public String getAlcoholhz() {
        return alcoholhz;
    }

    public void setAlcoholhz(String alcoholhz) {
        this.alcoholhz = alcoholhz;
    }

    public String getAlcoholinicio() {
        return alcoholinicio;
    }

    public void setAlcoholinicio(String alcoholinicio) {
        this.alcoholinicio = alcoholinicio;
    }

    public String getAlcoholfin() {
        return alcoholfin;
    }

    public void setAlcoholfin(String alcoholfin) {
        this.alcoholfin = alcoholfin;
    }

    public String getAlcoholdetalle() {
        return alcoholdetalle;
    }

    public void setAlcoholdetalle(String alcoholdetalle) {
        this.alcoholdetalle = alcoholdetalle;
    }

    public String getDroganombre0() {
        return droganombre0;
    }

    public void setDroganombre0(String droganombre0) {
        this.droganombre0 = droganombre0;
    }

    public String getDrogainicio0() {
        return drogainicio0;
    }

    public void setDrogainicio0(String drogainicio0) {
        this.drogainicio0 = drogainicio0;
    }

    public String getDrogafin0() {
        return drogafin0;
    }

    public void setDrogafin0(String drogafin0) {
        this.drogafin0 = drogafin0;
    }

    public String getDrogadetalle0() {
        return drogadetalle0;
    }

    public void setDrogadetalle0(String drogadetalle0) {
        this.drogadetalle0 = drogadetalle0;
    }

    public String getDroganombre1() {
        return droganombre1;
    }

    public void setDroganombre1(String droganombre1) {
        this.droganombre1 = droganombre1;
    }

    public String getDrogainicio1() {
        return drogainicio1;
    }

    public void setDrogainicio1(String drogainicio1) {
        this.drogainicio1 = drogainicio1;
    }

    public String getDrogafin1() {
        return drogafin1;
    }

    public void setDrogafin1(String drogafin1) {
        this.drogafin1 = drogafin1;
    }

    public String getDrogadetalle1() {
        return drogadetalle1;
    }

    public void setDrogadetalle1(String drogadetalle1) {
        this.drogadetalle1 = drogadetalle1;
    }

    public String getDroganombre2() {
        return droganombre2;
    }

    public void setDroganombre2(String droganombre2) {
        this.droganombre2 = droganombre2;
    }

    public String getDrogainicio2() {
        return drogainicio2;
    }

    public void setDrogainicio2(String drogainicio2) {
        this.drogainicio2 = drogainicio2;
    }

    public String getDrogafin2() {
        return drogafin2;
    }

    public void setDrogafin2(String drogafin2) {
        this.drogafin2 = drogafin2;
    }

    public String getDrogadetalle2() {
        return drogadetalle2;
    }

    public void setDrogadetalle2(String drogadetalle2) {
        this.drogadetalle2 = drogadetalle2;
    }

    public Datosidentificacion getDatId() {
        return datId;
    }

    public void setDatId(Datosidentificacion datId) {
        this.datId = datId;
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
        if (!(object instanceof Habitos)) {
            return false;
        }
        Habitos other = (Habitos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Habitos[ id=" + id + " ]";
    }
    
}
