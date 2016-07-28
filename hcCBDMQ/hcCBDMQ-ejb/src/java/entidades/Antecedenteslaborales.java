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
@Table(name = "antecedenteslaborales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Antecedenteslaborales.findAll", query = "SELECT a FROM Antecedenteslaborales a"),
    @NamedQuery(name = "Antecedenteslaborales.findById", query = "SELECT a FROM Antecedenteslaborales a WHERE a.id = :id"),
    @NamedQuery(name = "Antecedenteslaborales.findByTrabajoanterior0", query = "SELECT a FROM Antecedenteslaborales a WHERE a.trabajoanterior0 = :trabajoanterior0"),
    @NamedQuery(name = "Antecedenteslaborales.findByTinicio0", query = "SELECT a FROM Antecedenteslaborales a WHERE a.tinicio0 = :tinicio0"),
    @NamedQuery(name = "Antecedenteslaborales.findByTfin0", query = "SELECT a FROM Antecedenteslaborales a WHERE a.tfin0 = :tfin0"),
    @NamedQuery(name = "Antecedenteslaborales.findByTriesgo0", query = "SELECT a FROM Antecedenteslaborales a WHERE a.triesgo0 = :triesgo0"),
    @NamedQuery(name = "Antecedenteslaborales.findByTepp0", query = "SELECT a FROM Antecedenteslaborales a WHERE a.tepp0 = :tepp0"),
    @NamedQuery(name = "Antecedenteslaborales.findByTrabajoanterior1", query = "SELECT a FROM Antecedenteslaborales a WHERE a.trabajoanterior1 = :trabajoanterior1"),
    @NamedQuery(name = "Antecedenteslaborales.findByTinicio1", query = "SELECT a FROM Antecedenteslaborales a WHERE a.tinicio1 = :tinicio1"),
    @NamedQuery(name = "Antecedenteslaborales.findByTfin1", query = "SELECT a FROM Antecedenteslaborales a WHERE a.tfin1 = :tfin1"),
    @NamedQuery(name = "Antecedenteslaborales.findByTriesgo1", query = "SELECT a FROM Antecedenteslaborales a WHERE a.triesgo1 = :triesgo1"),
    @NamedQuery(name = "Antecedenteslaborales.findByTepp1", query = "SELECT a FROM Antecedenteslaborales a WHERE a.tepp1 = :tepp1"),
    @NamedQuery(name = "Antecedenteslaborales.findByTrabajoanterior2", query = "SELECT a FROM Antecedenteslaborales a WHERE a.trabajoanterior2 = :trabajoanterior2"),
    @NamedQuery(name = "Antecedenteslaborales.findByTinicio2", query = "SELECT a FROM Antecedenteslaborales a WHERE a.tinicio2 = :tinicio2"),
    @NamedQuery(name = "Antecedenteslaborales.findByTfin2", query = "SELECT a FROM Antecedenteslaborales a WHERE a.tfin2 = :tfin2"),
    @NamedQuery(name = "Antecedenteslaborales.findByTriesgo2", query = "SELECT a FROM Antecedenteslaborales a WHERE a.triesgo2 = :triesgo2"),
    @NamedQuery(name = "Antecedenteslaborales.findByTepp2", query = "SELECT a FROM Antecedenteslaborales a WHERE a.tepp2 = :tepp2"),
    @NamedQuery(name = "Antecedenteslaborales.findByTrabajoanterior3", query = "SELECT a FROM Antecedenteslaborales a WHERE a.trabajoanterior3 = :trabajoanterior3"),
    @NamedQuery(name = "Antecedenteslaborales.findByTinicio3", query = "SELECT a FROM Antecedenteslaborales a WHERE a.tinicio3 = :tinicio3"),
    @NamedQuery(name = "Antecedenteslaborales.findByTfin3", query = "SELECT a FROM Antecedenteslaborales a WHERE a.tfin3 = :tfin3"),
    @NamedQuery(name = "Antecedenteslaborales.findByTriesgo3", query = "SELECT a FROM Antecedenteslaborales a WHERE a.triesgo3 = :triesgo3"),
    @NamedQuery(name = "Antecedenteslaborales.findByTepp3", query = "SELECT a FROM Antecedenteslaborales a WHERE a.tepp3 = :tepp3")})
public class Antecedenteslaborales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "trabajoanterior0")
    private String trabajoanterior0;
    @Column(name = "tinicio0")
    @Temporal(TemporalType.DATE)
    private Date tinicio0;
    @Column(name = "tfin0")
    @Temporal(TemporalType.DATE)
    private Date tfin0;
    @Size(max = 2147483647)
    @Column(name = "triesgo0")
    private String triesgo0;
    @Size(max = 2147483647)
    @Column(name = "tepp0")
    private String tepp0;
    @Size(max = 2147483647)
    @Column(name = "trabajoanterior1")
    private String trabajoanterior1;
    @Column(name = "tinicio1")
    @Temporal(TemporalType.DATE)
    private Date tinicio1;
    @Column(name = "tfin1")
    @Temporal(TemporalType.DATE)
    private Date tfin1;
    @Size(max = 2147483647)
    @Column(name = "triesgo1")
    private String triesgo1;
    @Size(max = 2147483647)
    @Column(name = "tepp1")
    private String tepp1;
    @Size(max = 2147483647)
    @Column(name = "trabajoanterior2")
    private String trabajoanterior2;
    @Column(name = "tinicio2")
    @Temporal(TemporalType.DATE)
    private Date tinicio2;
    @Column(name = "tfin2")
    @Temporal(TemporalType.DATE)
    private Date tfin2;
    @Size(max = 2147483647)
    @Column(name = "triesgo2")
    private String triesgo2;
    @Size(max = 2147483647)
    @Column(name = "tepp2")
    private String tepp2;
    @Size(max = 2147483647)
    @Column(name = "trabajoanterior3")
    private String trabajoanterior3;
    @Column(name = "tinicio3")
    @Temporal(TemporalType.DATE)
    private Date tinicio3;
    @Column(name = "tfin3")
    @Temporal(TemporalType.DATE)
    private Date tfin3;
    @Size(max = 2147483647)
    @Column(name = "triesgo3")
    private String triesgo3;
    @Size(max = 2147483647)
    @Column(name = "tepp3")
    private String tepp3;
    @JoinColumn(name = "dat_id", referencedColumnName = "id")
    @ManyToOne
    private Datosidentificacion datId;

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

    public String getTrabajoanterior0() {
        return trabajoanterior0;
    }

    public void setTrabajoanterior0(String trabajoanterior0) {
        this.trabajoanterior0 = trabajoanterior0;
    }

    public Date getTinicio0() {
        return tinicio0;
    }

    public void setTinicio0(Date tinicio0) {
        this.tinicio0 = tinicio0;
    }

    public Date getTfin0() {
        return tfin0;
    }

    public void setTfin0(Date tfin0) {
        this.tfin0 = tfin0;
    }

    public String getTriesgo0() {
        return triesgo0;
    }

    public void setTriesgo0(String triesgo0) {
        this.triesgo0 = triesgo0;
    }

    public String getTepp0() {
        return tepp0;
    }

    public void setTepp0(String tepp0) {
        this.tepp0 = tepp0;
    }

    public String getTrabajoanterior1() {
        return trabajoanterior1;
    }

    public void setTrabajoanterior1(String trabajoanterior1) {
        this.trabajoanterior1 = trabajoanterior1;
    }

    public Date getTinicio1() {
        return tinicio1;
    }

    public void setTinicio1(Date tinicio1) {
        this.tinicio1 = tinicio1;
    }

    public Date getTfin1() {
        return tfin1;
    }

    public void setTfin1(Date tfin1) {
        this.tfin1 = tfin1;
    }

    public String getTriesgo1() {
        return triesgo1;
    }

    public void setTriesgo1(String triesgo1) {
        this.triesgo1 = triesgo1;
    }

    public String getTepp1() {
        return tepp1;
    }

    public void setTepp1(String tepp1) {
        this.tepp1 = tepp1;
    }

    public String getTrabajoanterior2() {
        return trabajoanterior2;
    }

    public void setTrabajoanterior2(String trabajoanterior2) {
        this.trabajoanterior2 = trabajoanterior2;
    }

    public Date getTinicio2() {
        return tinicio2;
    }

    public void setTinicio2(Date tinicio2) {
        this.tinicio2 = tinicio2;
    }

    public Date getTfin2() {
        return tfin2;
    }

    public void setTfin2(Date tfin2) {
        this.tfin2 = tfin2;
    }

    public String getTriesgo2() {
        return triesgo2;
    }

    public void setTriesgo2(String triesgo2) {
        this.triesgo2 = triesgo2;
    }

    public String getTepp2() {
        return tepp2;
    }

    public void setTepp2(String tepp2) {
        this.tepp2 = tepp2;
    }

    public String getTrabajoanterior3() {
        return trabajoanterior3;
    }

    public void setTrabajoanterior3(String trabajoanterior3) {
        this.trabajoanterior3 = trabajoanterior3;
    }

    public Date getTinicio3() {
        return tinicio3;
    }

    public void setTinicio3(Date tinicio3) {
        this.tinicio3 = tinicio3;
    }

    public Date getTfin3() {
        return tfin3;
    }

    public void setTfin3(Date tfin3) {
        this.tfin3 = tfin3;
    }

    public String getTriesgo3() {
        return triesgo3;
    }

    public void setTriesgo3(String triesgo3) {
        this.triesgo3 = triesgo3;
    }

    public String getTepp3() {
        return tepp3;
    }

    public void setTepp3(String tepp3) {
        this.tepp3 = tepp3;
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
