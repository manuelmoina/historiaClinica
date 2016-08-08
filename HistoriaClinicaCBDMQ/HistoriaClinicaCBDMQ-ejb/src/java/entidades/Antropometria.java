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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author emoina
 */
@Entity
@Table(name = "antropometria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Antropometria.findAll", query = "SELECT a FROM Antropometria a"),
    @NamedQuery(name = "Antropometria.findById", query = "SELECT a FROM Antropometria a WHERE a.id = :id"),
    @NamedQuery(name = "Antropometria.findByTalla", query = "SELECT a FROM Antropometria a WHERE a.talla = :talla"),
    @NamedQuery(name = "Antropometria.findByPeso", query = "SELECT a FROM Antropometria a WHERE a.peso = :peso"),
    @NamedQuery(name = "Antropometria.findByImc", query = "SELECT a FROM Antropometria a WHERE a.imc = :imc"),
    @NamedQuery(name = "Antropometria.findByDbiacromial", query = "SELECT a FROM Antropometria a WHERE a.dbiacromial = :dbiacromial"),
    @NamedQuery(name = "Antropometria.findByOjosuelo", query = "SELECT a FROM Antropometria a WHERE a.ojosuelo = :ojosuelo"),
    @NamedQuery(name = "Antropometria.findByCodosuelo", query = "SELECT a FROM Antropometria a WHERE a.codosuelo = :codosuelo"),
    @NamedQuery(name = "Antropometria.findByHombropunocerrado", query = "SELECT a FROM Antropometria a WHERE a.hombropunocerrado = :hombropunocerrado"),
    @NamedQuery(name = "Antropometria.findByHombromano", query = "SELECT a FROM Antropometria a WHERE a.hombromano = :hombromano"),
    @NamedQuery(name = "Antropometria.findByCaderasuelo", query = "SELECT a FROM Antropometria a WHERE a.caderasuelo = :caderasuelo"),
    @NamedQuery(name = "Antropometria.findByCodopunocerrado", query = "SELECT a FROM Antropometria a WHERE a.codopunocerrado = :codopunocerrado"),
    @NamedQuery(name = "Antropometria.findByCodomanoestendida", query = "SELECT a FROM Antropometria a WHERE a.codomanoestendida = :codomanoestendida"),
    @NamedQuery(name = "Antropometria.findByMano", query = "SELECT a FROM Antropometria a WHERE a.mano = :mano")})
public class Antropometria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "talla")
    private Float talla;
    @Column(name = "peso")
    private Float peso;
    @Column(name = "imc")
    private Float imc;
    @Column(name = "dbiacromial")
    private Float dbiacromial;
    @Column(name = "ojosuelo")
    private Float ojosuelo;
    @Column(name = "codosuelo")
    private Float codosuelo;
    @Column(name = "hombropunocerrado")
    private Float hombropunocerrado;
    @Column(name = "hombromano")
    private Float hombromano;
    @Column(name = "caderasuelo")
    private Float caderasuelo;
    @Column(name = "codopunocerrado")
    private Float codopunocerrado;
    @Column(name = "codomanoestendida")
    private Float codomanoestendida;
    @Column(name = "mano")
    private Boolean mano;
    @JoinColumn(name = "iddatosidentificacion", referencedColumnName = "iddatosidentificacion")
    @ManyToOne
    private Datosidentificacion iddatosidentificacion;

    public Antropometria() {
    }

    public Antropometria(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getTalla() {
        return talla;
    }

    public void setTalla(Float talla) {
        this.talla = talla;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getImc() {
        return imc;
    }

    public void setImc(Float imc) {
        this.imc = imc;
    }

    public Float getDbiacromial() {
        return dbiacromial;
    }

    public void setDbiacromial(Float dbiacromial) {
        this.dbiacromial = dbiacromial;
    }

    public Float getOjosuelo() {
        return ojosuelo;
    }

    public void setOjosuelo(Float ojosuelo) {
        this.ojosuelo = ojosuelo;
    }

    public Float getCodosuelo() {
        return codosuelo;
    }

    public void setCodosuelo(Float codosuelo) {
        this.codosuelo = codosuelo;
    }

    public Float getHombropunocerrado() {
        return hombropunocerrado;
    }

    public void setHombropunocerrado(Float hombropunocerrado) {
        this.hombropunocerrado = hombropunocerrado;
    }

    public Float getHombromano() {
        return hombromano;
    }

    public void setHombromano(Float hombromano) {
        this.hombromano = hombromano;
    }

    public Float getCaderasuelo() {
        return caderasuelo;
    }

    public void setCaderasuelo(Float caderasuelo) {
        this.caderasuelo = caderasuelo;
    }

    public Float getCodopunocerrado() {
        return codopunocerrado;
    }

    public void setCodopunocerrado(Float codopunocerrado) {
        this.codopunocerrado = codopunocerrado;
    }

    public Float getCodomanoestendida() {
        return codomanoestendida;
    }

    public void setCodomanoestendida(Float codomanoestendida) {
        this.codomanoestendida = codomanoestendida;
    }

    public Boolean getMano() {
        return mano;
    }

    public void setMano(Boolean mano) {
        this.mano = mano;
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
        if (!(object instanceof Antropometria)) {
            return false;
        }
        Antropometria other = (Antropometria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Antropometria[ id=" + id + " ]";
    }
    
}
