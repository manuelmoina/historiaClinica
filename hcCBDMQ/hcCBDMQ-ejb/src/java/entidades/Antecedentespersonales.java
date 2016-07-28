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
@Table(name = "antecedentespersonales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Antecedentespersonales.findAll", query = "SELECT a FROM Antecedentespersonales a"),
    @NamedQuery(name = "Antecedentespersonales.findById", query = "SELECT a FROM Antecedentespersonales a WHERE a.id = :id"),
    @NamedQuery(name = "Antecedentespersonales.findByAmedico0", query = "SELECT a FROM Antecedentespersonales a WHERE a.amedico0 = :amedico0"),
    @NamedQuery(name = "Antecedentespersonales.findByAmedico1", query = "SELECT a FROM Antecedentespersonales a WHERE a.amedico1 = :amedico1"),
    @NamedQuery(name = "Antecedentespersonales.findByAmedico2", query = "SELECT a FROM Antecedentespersonales a WHERE a.amedico2 = :amedico2"),
    @NamedQuery(name = "Antecedentespersonales.findByAmedico3", query = "SELECT a FROM Antecedentespersonales a WHERE a.amedico3 = :amedico3"),
    @NamedQuery(name = "Antecedentespersonales.findByAquirurgico0", query = "SELECT a FROM Antecedentespersonales a WHERE a.aquirurgico0 = :aquirurgico0"),
    @NamedQuery(name = "Antecedentespersonales.findByAquirurgico1", query = "SELECT a FROM Antecedentespersonales a WHERE a.aquirurgico1 = :aquirurgico1"),
    @NamedQuery(name = "Antecedentespersonales.findByAquirurgico2", query = "SELECT a FROM Antecedentespersonales a WHERE a.aquirurgico2 = :aquirurgico2"),
    @NamedQuery(name = "Antecedentespersonales.findByAquirurgico3", query = "SELECT a FROM Antecedentespersonales a WHERE a.aquirurgico3 = :aquirurgico3"),
    @NamedQuery(name = "Antecedentespersonales.findByAlergico", query = "SELECT a FROM Antecedentespersonales a WHERE a.alergico = :alergico"),
    @NamedQuery(name = "Antecedentespersonales.findByAlergias", query = "SELECT a FROM Antecedentespersonales a WHERE a.alergias = :alergias"),
    @NamedQuery(name = "Antecedentespersonales.findByUsomedicinadiaria", query = "SELECT a FROM Antecedentespersonales a WHERE a.usomedicinadiaria = :usomedicinadiaria"),
    @NamedQuery(name = "Antecedentespersonales.findByNombremedicina", query = "SELECT a FROM Antecedentespersonales a WHERE a.nombremedicina = :nombremedicina")})
public class Antecedentespersonales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "amedico0")
    private String amedico0;
    @Size(max = 2147483647)
    @Column(name = "amedico1")
    private String amedico1;
    @Size(max = 2147483647)
    @Column(name = "amedico2")
    private String amedico2;
    @Size(max = 2147483647)
    @Column(name = "amedico3")
    private String amedico3;
    @Size(max = 2147483647)
    @Column(name = "aquirurgico0")
    private String aquirurgico0;
    @Size(max = 2147483647)
    @Column(name = "aquirurgico1")
    private String aquirurgico1;
    @Size(max = 2147483647)
    @Column(name = "aquirurgico2")
    private String aquirurgico2;
    @Size(max = 2147483647)
    @Column(name = "aquirurgico3")
    private String aquirurgico3;
    @Column(name = "alergico")
    private Boolean alergico;
    @Size(max = 2147483647)
    @Column(name = "alergias")
    private String alergias;
    @Column(name = "usomedicinadiaria")
    private Boolean usomedicinadiaria;
    @Size(max = 2147483647)
    @Column(name = "nombremedicina")
    private String nombremedicina;
    @JoinColumn(name = "dat_id", referencedColumnName = "id")
    @ManyToOne
    private Datosidentificacion datId;

    public Antecedentespersonales() {
    }

    public Antecedentespersonales(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAmedico0() {
        return amedico0;
    }

    public void setAmedico0(String amedico0) {
        this.amedico0 = amedico0;
    }

    public String getAmedico1() {
        return amedico1;
    }

    public void setAmedico1(String amedico1) {
        this.amedico1 = amedico1;
    }

    public String getAmedico2() {
        return amedico2;
    }

    public void setAmedico2(String amedico2) {
        this.amedico2 = amedico2;
    }

    public String getAmedico3() {
        return amedico3;
    }

    public void setAmedico3(String amedico3) {
        this.amedico3 = amedico3;
    }

    public String getAquirurgico0() {
        return aquirurgico0;
    }

    public void setAquirurgico0(String aquirurgico0) {
        this.aquirurgico0 = aquirurgico0;
    }

    public String getAquirurgico1() {
        return aquirurgico1;
    }

    public void setAquirurgico1(String aquirurgico1) {
        this.aquirurgico1 = aquirurgico1;
    }

    public String getAquirurgico2() {
        return aquirurgico2;
    }

    public void setAquirurgico2(String aquirurgico2) {
        this.aquirurgico2 = aquirurgico2;
    }

    public String getAquirurgico3() {
        return aquirurgico3;
    }

    public void setAquirurgico3(String aquirurgico3) {
        this.aquirurgico3 = aquirurgico3;
    }

    public Boolean getAlergico() {
        return alergico;
    }

    public void setAlergico(Boolean alergico) {
        this.alergico = alergico;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public Boolean getUsomedicinadiaria() {
        return usomedicinadiaria;
    }

    public void setUsomedicinadiaria(Boolean usomedicinadiaria) {
        this.usomedicinadiaria = usomedicinadiaria;
    }

    public String getNombremedicina() {
        return nombremedicina;
    }

    public void setNombremedicina(String nombremedicina) {
        this.nombremedicina = nombremedicina;
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
        if (!(object instanceof Antecedentespersonales)) {
            return false;
        }
        Antecedentespersonales other = (Antecedentespersonales) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Antecedentespersonales[ id=" + id + " ]";
    }
    
}
