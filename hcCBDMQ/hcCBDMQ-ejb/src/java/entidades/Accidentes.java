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
 * @author emoina
 */
@Entity
@Table(name = "accidentes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accidentes.findAll", query = "SELECT a FROM Accidentes a"),
    @NamedQuery(name = "Accidentes.findById", query = "SELECT a FROM Accidentes a WHERE a.id = :id"),
    @NamedQuery(name = "Accidentes.findByAccidentefecha0", query = "SELECT a FROM Accidentes a WHERE a.accidentefecha0 = :accidentefecha0"),
    @NamedQuery(name = "Accidentes.findByAccidente0", query = "SELECT a FROM Accidentes a WHERE a.accidente0 = :accidente0"),
    @NamedQuery(name = "Accidentes.findByAccidentefecha1", query = "SELECT a FROM Accidentes a WHERE a.accidentefecha1 = :accidentefecha1"),
    @NamedQuery(name = "Accidentes.findByAccidente1", query = "SELECT a FROM Accidentes a WHERE a.accidente1 = :accidente1"),
    @NamedQuery(name = "Accidentes.findByAccidentefecha2", query = "SELECT a FROM Accidentes a WHERE a.accidentefecha2 = :accidentefecha2"),
    @NamedQuery(name = "Accidentes.findByAccidente2", query = "SELECT a FROM Accidentes a WHERE a.accidente2 = :accidente2"),
    @NamedQuery(name = "Accidentes.findByAccidentefecha3", query = "SELECT a FROM Accidentes a WHERE a.accidentefecha3 = :accidentefecha3"),
    @NamedQuery(name = "Accidentes.findByAccidente3", query = "SELECT a FROM Accidentes a WHERE a.accidente3 = :accidente3"),
    @NamedQuery(name = "Accidentes.findByEnfermedadactual", query = "SELECT a FROM Accidentes a WHERE a.enfermedadactual = :enfermedadactual"),
    @NamedQuery(name = "Accidentes.findByEnfermedadetalle", query = "SELECT a FROM Accidentes a WHERE a.enfermedadetalle = :enfermedadetalle")})
public class Accidentes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "accidentefecha0")
    @Temporal(TemporalType.DATE)
    private Date accidentefecha0;
    @Size(max = 2147483647)
    @Column(name = "accidente0")
    private String accidente0;
    @Column(name = "accidentefecha1")
    @Temporal(TemporalType.DATE)
    private Date accidentefecha1;
    @Size(max = 2147483647)
    @Column(name = "accidente1")
    private String accidente1;
    @Column(name = "accidentefecha2")
    @Temporal(TemporalType.DATE)
    private Date accidentefecha2;
    @Size(max = 2147483647)
    @Column(name = "accidente2")
    private String accidente2;
    @Column(name = "accidentefecha3")
    @Temporal(TemporalType.DATE)
    private Date accidentefecha3;
    @Size(max = 2147483647)
    @Column(name = "accidente3")
    private String accidente3;
    @Column(name = "enfermedadactual")
    private Boolean enfermedadactual;
    @Size(max = 2147483647)
    @Column(name = "enfermedadetalle")
    private String enfermedadetalle;
    @JoinColumn(name = "dat_id", referencedColumnName = "id")
    @ManyToOne
    private Datosidentificacion datId;

    public Accidentes() {
    }

    public Accidentes(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAccidentefecha0() {
        return accidentefecha0;
    }

    public void setAccidentefecha0(Date accidentefecha0) {
        this.accidentefecha0 = accidentefecha0;
    }

    public String getAccidente0() {
        return accidente0;
    }

    public void setAccidente0(String accidente0) {
        this.accidente0 = accidente0;
    }

    public Date getAccidentefecha1() {
        return accidentefecha1;
    }

    public void setAccidentefecha1(Date accidentefecha1) {
        this.accidentefecha1 = accidentefecha1;
    }

    public String getAccidente1() {
        return accidente1;
    }

    public void setAccidente1(String accidente1) {
        this.accidente1 = accidente1;
    }

    public Date getAccidentefecha2() {
        return accidentefecha2;
    }

    public void setAccidentefecha2(Date accidentefecha2) {
        this.accidentefecha2 = accidentefecha2;
    }

    public String getAccidente2() {
        return accidente2;
    }

    public void setAccidente2(String accidente2) {
        this.accidente2 = accidente2;
    }

    public Date getAccidentefecha3() {
        return accidentefecha3;
    }

    public void setAccidentefecha3(Date accidentefecha3) {
        this.accidentefecha3 = accidentefecha3;
    }

    public String getAccidente3() {
        return accidente3;
    }

    public void setAccidente3(String accidente3) {
        this.accidente3 = accidente3;
    }

    public Boolean getEnfermedadactual() {
        return enfermedadactual;
    }

    public void setEnfermedadactual(Boolean enfermedadactual) {
        this.enfermedadactual = enfermedadactual;
    }

    public String getEnfermedadetalle() {
        return enfermedadetalle;
    }

    public void setEnfermedadetalle(String enfermedadetalle) {
        this.enfermedadetalle = enfermedadetalle;
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
        if (!(object instanceof Accidentes)) {
            return false;
        }
        Accidentes other = (Accidentes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Accidentes[ id=" + id + " ]";
    }
    
}
