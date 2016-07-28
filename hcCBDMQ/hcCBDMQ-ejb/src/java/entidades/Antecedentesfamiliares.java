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
@Table(name = "antecedentesfamiliares")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Antecedentesfamiliares.findAll", query = "SELECT a FROM Antecedentesfamiliares a"),
    @NamedQuery(name = "Antecedentesfamiliares.findById", query = "SELECT a FROM Antecedentesfamiliares a WHERE a.id = :id"),
    @NamedQuery(name = "Antecedentesfamiliares.findByPariente0", query = "SELECT a FROM Antecedentesfamiliares a WHERE a.pariente0 = :pariente0"),
    @NamedQuery(name = "Antecedentesfamiliares.findByPenfermedad0", query = "SELECT a FROM Antecedentesfamiliares a WHERE a.penfermedad0 = :penfermedad0"),
    @NamedQuery(name = "Antecedentesfamiliares.findByPdetalle0", query = "SELECT a FROM Antecedentesfamiliares a WHERE a.pdetalle0 = :pdetalle0"),
    @NamedQuery(name = "Antecedentesfamiliares.findByPariente1", query = "SELECT a FROM Antecedentesfamiliares a WHERE a.pariente1 = :pariente1"),
    @NamedQuery(name = "Antecedentesfamiliares.findByPenfermedad1", query = "SELECT a FROM Antecedentesfamiliares a WHERE a.penfermedad1 = :penfermedad1"),
    @NamedQuery(name = "Antecedentesfamiliares.findByPdetalle1", query = "SELECT a FROM Antecedentesfamiliares a WHERE a.pdetalle1 = :pdetalle1"),
    @NamedQuery(name = "Antecedentesfamiliares.findByPariente2", query = "SELECT a FROM Antecedentesfamiliares a WHERE a.pariente2 = :pariente2"),
    @NamedQuery(name = "Antecedentesfamiliares.findByPenfermedad2", query = "SELECT a FROM Antecedentesfamiliares a WHERE a.penfermedad2 = :penfermedad2"),
    @NamedQuery(name = "Antecedentesfamiliares.findByPdetalle2", query = "SELECT a FROM Antecedentesfamiliares a WHERE a.pdetalle2 = :pdetalle2"),
    @NamedQuery(name = "Antecedentesfamiliares.findByPariente3", query = "SELECT a FROM Antecedentesfamiliares a WHERE a.pariente3 = :pariente3"),
    @NamedQuery(name = "Antecedentesfamiliares.findByPenfermedad3", query = "SELECT a FROM Antecedentesfamiliares a WHERE a.penfermedad3 = :penfermedad3"),
    @NamedQuery(name = "Antecedentesfamiliares.findByPdetalle3", query = "SELECT a FROM Antecedentesfamiliares a WHERE a.pdetalle3 = :pdetalle3")})
public class Antecedentesfamiliares implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "pariente0")
    private String pariente0;
    @Size(max = 2147483647)
    @Column(name = "penfermedad0")
    private String penfermedad0;
    @Size(max = 2147483647)
    @Column(name = "pdetalle0")
    private String pdetalle0;
    @Size(max = 2147483647)
    @Column(name = "pariente1")
    private String pariente1;
    @Size(max = 2147483647)
    @Column(name = "penfermedad1")
    private String penfermedad1;
    @Size(max = 2147483647)
    @Column(name = "pdetalle1")
    private String pdetalle1;
    @Size(max = 2147483647)
    @Column(name = "pariente2")
    private String pariente2;
    @Size(max = 2147483647)
    @Column(name = "penfermedad2")
    private String penfermedad2;
    @Size(max = 2147483647)
    @Column(name = "pdetalle2")
    private String pdetalle2;
    @Size(max = 2147483647)
    @Column(name = "pariente3")
    private String pariente3;
    @Size(max = 2147483647)
    @Column(name = "penfermedad3")
    private String penfermedad3;
    @Size(max = 2147483647)
    @Column(name = "pdetalle3")
    private String pdetalle3;
    @JoinColumn(name = "dat_id", referencedColumnName = "id")
    @ManyToOne
    private Datosidentificacion datId;

    public Antecedentesfamiliares() {
    }

    public Antecedentesfamiliares(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPariente0() {
        return pariente0;
    }

    public void setPariente0(String pariente0) {
        this.pariente0 = pariente0;
    }

    public String getPenfermedad0() {
        return penfermedad0;
    }

    public void setPenfermedad0(String penfermedad0) {
        this.penfermedad0 = penfermedad0;
    }

    public String getPdetalle0() {
        return pdetalle0;
    }

    public void setPdetalle0(String pdetalle0) {
        this.pdetalle0 = pdetalle0;
    }

    public String getPariente1() {
        return pariente1;
    }

    public void setPariente1(String pariente1) {
        this.pariente1 = pariente1;
    }

    public String getPenfermedad1() {
        return penfermedad1;
    }

    public void setPenfermedad1(String penfermedad1) {
        this.penfermedad1 = penfermedad1;
    }

    public String getPdetalle1() {
        return pdetalle1;
    }

    public void setPdetalle1(String pdetalle1) {
        this.pdetalle1 = pdetalle1;
    }

    public String getPariente2() {
        return pariente2;
    }

    public void setPariente2(String pariente2) {
        this.pariente2 = pariente2;
    }

    public String getPenfermedad2() {
        return penfermedad2;
    }

    public void setPenfermedad2(String penfermedad2) {
        this.penfermedad2 = penfermedad2;
    }

    public String getPdetalle2() {
        return pdetalle2;
    }

    public void setPdetalle2(String pdetalle2) {
        this.pdetalle2 = pdetalle2;
    }

    public String getPariente3() {
        return pariente3;
    }

    public void setPariente3(String pariente3) {
        this.pariente3 = pariente3;
    }

    public String getPenfermedad3() {
        return penfermedad3;
    }

    public void setPenfermedad3(String penfermedad3) {
        this.penfermedad3 = penfermedad3;
    }

    public String getPdetalle3() {
        return pdetalle3;
    }

    public void setPdetalle3(String pdetalle3) {
        this.pdetalle3 = pdetalle3;
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
        if (!(object instanceof Antecedentesfamiliares)) {
            return false;
        }
        Antecedentesfamiliares other = (Antecedentesfamiliares) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Antecedentesfamiliares[ id=" + id + " ]";
    }
    
}
