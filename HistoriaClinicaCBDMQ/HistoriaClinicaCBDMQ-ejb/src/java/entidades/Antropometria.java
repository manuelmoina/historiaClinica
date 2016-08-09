/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "antropometria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Antropometria.findAll", query = "SELECT a FROM Antropometria a"),
    @NamedQuery(name = "Antropometria.findById", query = "SELECT a FROM Antropometria a WHERE a.id = :id"),
    @NamedQuery(name = "Antropometria.findByTalla", query = "SELECT a FROM Antropometria a WHERE a.talla = :talla"),
    @NamedQuery(name = "Antropometria.findByPeso", query = "SELECT a FROM Antropometria a WHERE a.peso = :peso"),
    @NamedQuery(name = "Antropometria.findByImc", query = "SELECT a FROM Antropometria a WHERE a.imc = :imc"),
    @NamedQuery(name = "Antropometria.findByDbiacromial", query = "SELECT a FROM Antropometria a WHERE a.dbiacromial = :dbiacromial"),
    @NamedQuery(name = "Antropometria.findByDbiacromialp", query = "SELECT a FROM Antropometria a WHERE a.dbiacromialp = :dbiacromialp"),
    @NamedQuery(name = "Antropometria.findByOjosuelo", query = "SELECT a FROM Antropometria a WHERE a.ojosuelo = :ojosuelo"),
    @NamedQuery(name = "Antropometria.findByOjosuelop", query = "SELECT a FROM Antropometria a WHERE a.ojosuelop = :ojosuelop"),
    @NamedQuery(name = "Antropometria.findByCodosuelo", query = "SELECT a FROM Antropometria a WHERE a.codosuelo = :codosuelo"),
    @NamedQuery(name = "Antropometria.findByCodosuelop", query = "SELECT a FROM Antropometria a WHERE a.codosuelop = :codosuelop"),
    @NamedQuery(name = "Antropometria.findByHombropunocerrado", query = "SELECT a FROM Antropometria a WHERE a.hombropunocerrado = :hombropunocerrado"),
    @NamedQuery(name = "Antropometria.findByHombropunocerradop", query = "SELECT a FROM Antropometria a WHERE a.hombropunocerradop = :hombropunocerradop"),
    @NamedQuery(name = "Antropometria.findByHombromano", query = "SELECT a FROM Antropometria a WHERE a.hombromano = :hombromano"),
    @NamedQuery(name = "Antropometria.findByHombromanop", query = "SELECT a FROM Antropometria a WHERE a.hombromanop = :hombromanop"),
    @NamedQuery(name = "Antropometria.findByCaderasuelo", query = "SELECT a FROM Antropometria a WHERE a.caderasuelo = :caderasuelo"),
    @NamedQuery(name = "Antropometria.findByCaderasuelop", query = "SELECT a FROM Antropometria a WHERE a.caderasuelop = :caderasuelop"),
    @NamedQuery(name = "Antropometria.findByCodopunocerrado", query = "SELECT a FROM Antropometria a WHERE a.codopunocerrado = :codopunocerrado"),
    @NamedQuery(name = "Antropometria.findByCodopunocerradop", query = "SELECT a FROM Antropometria a WHERE a.codopunocerradop = :codopunocerradop"),
    @NamedQuery(name = "Antropometria.findByCodomanoestendida", query = "SELECT a FROM Antropometria a WHERE a.codomanoestendida = :codomanoestendida"),
    @NamedQuery(name = "Antropometria.findByCodomanoestendidap", query = "SELECT a FROM Antropometria a WHERE a.codomanoestendidap = :codomanoestendidap"),
    @NamedQuery(name = "Antropometria.findByMano", query = "SELECT a FROM Antropometria a WHERE a.mano = :mano"),
    @NamedQuery(name = "Antropometria.findByImcnivel", query = "SELECT a FROM Antropometria a WHERE a.imcnivel = :imcnivel")})
public class Antropometria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "talla")
    private Integer talla;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "peso")
    private BigDecimal peso;
    @Column(name = "imc")
    private BigDecimal imc;
    @Column(name = "dbiacromial")
    private Integer dbiacromial;
    @Column(name = "dbiacromialp")
    private BigDecimal dbiacromialp;
    @Column(name = "ojosuelo")
    private Integer ojosuelo;
    @Column(name = "ojosuelop")
    private BigDecimal ojosuelop;
    @Column(name = "codosuelo")
    private Integer codosuelo;
    @Column(name = "codosuelop")
    private BigDecimal codosuelop;
    @Column(name = "hombropunocerrado")
    private Integer hombropunocerrado;
    @Column(name = "hombropunocerradop")
    private BigDecimal hombropunocerradop;
    @Column(name = "hombromano")
    private Integer hombromano;
    @Column(name = "hombromanop")
    private BigDecimal hombromanop;
    @Column(name = "caderasuelo")
    private Integer caderasuelo;
    @Column(name = "caderasuelop")
    private BigDecimal caderasuelop;
    @Column(name = "codopunocerrado")
    private Integer codopunocerrado;
    @Column(name = "codopunocerradop")
    private BigDecimal codopunocerradop;
    @Column(name = "codomanoestendida")
    private Integer codomanoestendida;
    @Column(name = "codomanoestendidap")
    private BigDecimal codomanoestendidap;
    @Column(name = "mano")
    private Boolean mano;
    @Size(max = 2147483647)
    @Column(name = "imcnivel")
    private String imcnivel;
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

    public Integer getTalla() {
        return talla;
    }

    public void setTalla(Integer talla) {
        this.talla = talla;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getImc() {
        return imc;
    }

    public void setImc(BigDecimal imc) {
        this.imc = imc;
    }

    public Integer getDbiacromial() {
        return dbiacromial;
    }

    public void setDbiacromial(Integer dbiacromial) {
        this.dbiacromial = dbiacromial;
    }

    public BigDecimal getDbiacromialp() {
        return dbiacromialp;
    }

    public void setDbiacromialp(BigDecimal dbiacromialp) {
        this.dbiacromialp = dbiacromialp;
    }

    public Integer getOjosuelo() {
        return ojosuelo;
    }

    public void setOjosuelo(Integer ojosuelo) {
        this.ojosuelo = ojosuelo;
    }

    public BigDecimal getOjosuelop() {
        return ojosuelop;
    }

    public void setOjosuelop(BigDecimal ojosuelop) {
        this.ojosuelop = ojosuelop;
    }

    public Integer getCodosuelo() {
        return codosuelo;
    }

    public void setCodosuelo(Integer codosuelo) {
        this.codosuelo = codosuelo;
    }

    public BigDecimal getCodosuelop() {
        return codosuelop;
    }

    public void setCodosuelop(BigDecimal codosuelop) {
        this.codosuelop = codosuelop;
    }

    public Integer getHombropunocerrado() {
        return hombropunocerrado;
    }

    public void setHombropunocerrado(Integer hombropunocerrado) {
        this.hombropunocerrado = hombropunocerrado;
    }

    public BigDecimal getHombropunocerradop() {
        return hombropunocerradop;
    }

    public void setHombropunocerradop(BigDecimal hombropunocerradop) {
        this.hombropunocerradop = hombropunocerradop;
    }

    public Integer getHombromano() {
        return hombromano;
    }

    public void setHombromano(Integer hombromano) {
        this.hombromano = hombromano;
    }

    public BigDecimal getHombromanop() {
        return hombromanop;
    }

    public void setHombromanop(BigDecimal hombromanop) {
        this.hombromanop = hombromanop;
    }

    public Integer getCaderasuelo() {
        return caderasuelo;
    }

    public void setCaderasuelo(Integer caderasuelo) {
        this.caderasuelo = caderasuelo;
    }

    public BigDecimal getCaderasuelop() {
        return caderasuelop;
    }

    public void setCaderasuelop(BigDecimal caderasuelop) {
        this.caderasuelop = caderasuelop;
    }

    public Integer getCodopunocerrado() {
        return codopunocerrado;
    }

    public void setCodopunocerrado(Integer codopunocerrado) {
        this.codopunocerrado = codopunocerrado;
    }

    public BigDecimal getCodopunocerradop() {
        return codopunocerradop;
    }

    public void setCodopunocerradop(BigDecimal codopunocerradop) {
        this.codopunocerradop = codopunocerradop;
    }

    public Integer getCodomanoestendida() {
        return codomanoestendida;
    }

    public void setCodomanoestendida(Integer codomanoestendida) {
        this.codomanoestendida = codomanoestendida;
    }

    public BigDecimal getCodomanoestendidap() {
        return codomanoestendidap;
    }

    public void setCodomanoestendidap(BigDecimal codomanoestendidap) {
        this.codomanoestendidap = codomanoestendidap;
    }

    public Boolean getMano() {
        return mano;
    }

    public void setMano(Boolean mano) {
        this.mano = mano;
    }

    public String getImcnivel() {
        return imcnivel;
    }

    public void setImcnivel(String imcnivel) {
        this.imcnivel = imcnivel;
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
