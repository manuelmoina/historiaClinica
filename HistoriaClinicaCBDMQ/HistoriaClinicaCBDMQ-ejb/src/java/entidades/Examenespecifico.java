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
@Table(name = "examenespecifico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Examenespecifico.findAll", query = "SELECT e FROM Examenespecifico e"),
    @NamedQuery(name = "Examenespecifico.findById", query = "SELECT e FROM Examenespecifico e WHERE e.id = :id"),
    @NamedQuery(name = "Examenespecifico.findByFnmexp", query = "SELECT e FROM Examenespecifico e WHERE e.fnmexp = :fnmexp"),
    @NamedQuery(name = "Examenespecifico.findByFnmexamen", query = "SELECT e FROM Examenespecifico e WHERE e.fnmexamen = :fnmexamen"),
    @NamedQuery(name = "Examenespecifico.findByFnmresultado", query = "SELECT e FROM Examenespecifico e WHERE e.fnmresultado = :fnmresultado"),
    @NamedQuery(name = "Examenespecifico.findByFnmobserv", query = "SELECT e FROM Examenespecifico e WHERE e.fnmobserv = :fnmobserv"),
    @NamedQuery(name = "Examenespecifico.findByFmexp", query = "SELECT e FROM Examenespecifico e WHERE e.fmexp = :fmexp"),
    @NamedQuery(name = "Examenespecifico.findByFmexamen", query = "SELECT e FROM Examenespecifico e WHERE e.fmexamen = :fmexamen"),
    @NamedQuery(name = "Examenespecifico.findByFmresultado", query = "SELECT e FROM Examenespecifico e WHERE e.fmresultado = :fmresultado"),
    @NamedQuery(name = "Examenespecifico.findByFmobserv", query = "SELECT e FROM Examenespecifico e WHERE e.fmobserv = :fmobserv"),
    @NamedQuery(name = "Examenespecifico.findByQexp", query = "SELECT e FROM Examenespecifico e WHERE e.qexp = :qexp"),
    @NamedQuery(name = "Examenespecifico.findByQexamen", query = "SELECT e FROM Examenespecifico e WHERE e.qexamen = :qexamen"),
    @NamedQuery(name = "Examenespecifico.findByQresultado", query = "SELECT e FROM Examenespecifico e WHERE e.qresultado = :qresultado"),
    @NamedQuery(name = "Examenespecifico.findByQobserv", query = "SELECT e FROM Examenespecifico e WHERE e.qobserv = :qobserv"),
    @NamedQuery(name = "Examenespecifico.findByBexp", query = "SELECT e FROM Examenespecifico e WHERE e.bexp = :bexp"),
    @NamedQuery(name = "Examenespecifico.findByBexamen", query = "SELECT e FROM Examenespecifico e WHERE e.bexamen = :bexamen"),
    @NamedQuery(name = "Examenespecifico.findByBresultado", query = "SELECT e FROM Examenespecifico e WHERE e.bresultado = :bresultado"),
    @NamedQuery(name = "Examenespecifico.findByBobserv", query = "SELECT e FROM Examenespecifico e WHERE e.bobserv = :bobserv"),
    @NamedQuery(name = "Examenespecifico.findByErgoexo", query = "SELECT e FROM Examenespecifico e WHERE e.ergoexo = :ergoexo"),
    @NamedQuery(name = "Examenespecifico.findByErgoexamen", query = "SELECT e FROM Examenespecifico e WHERE e.ergoexamen = :ergoexamen"),
    @NamedQuery(name = "Examenespecifico.findByErgoresultado", query = "SELECT e FROM Examenespecifico e WHERE e.ergoresultado = :ergoresultado"),
    @NamedQuery(name = "Examenespecifico.findBySicoexp", query = "SELECT e FROM Examenespecifico e WHERE e.sicoexp = :sicoexp"),
    @NamedQuery(name = "Examenespecifico.findBySicoexamen", query = "SELECT e FROM Examenespecifico e WHERE e.sicoexamen = :sicoexamen"),
    @NamedQuery(name = "Examenespecifico.findBySicoresultado", query = "SELECT e FROM Examenespecifico e WHERE e.sicoresultado = :sicoresultado"),
    @NamedQuery(name = "Examenespecifico.findBySicoobserv", query = "SELECT e FROM Examenespecifico e WHERE e.sicoobserv = :sicoobserv")})
public class Examenespecifico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "fnmexp")
    private String fnmexp;
    @Size(max = 2147483647)
    @Column(name = "fnmexamen")
    private String fnmexamen;
    @Size(max = 2147483647)
    @Column(name = "fnmresultado")
    private String fnmresultado;
    @Size(max = 2147483647)
    @Column(name = "fnmobserv")
    private String fnmobserv;
    @Size(max = 2147483647)
    @Column(name = "fmexp")
    private String fmexp;
    @Size(max = 2147483647)
    @Column(name = "fmexamen")
    private String fmexamen;
    @Size(max = 2147483647)
    @Column(name = "fmresultado")
    private String fmresultado;
    @Size(max = 2147483647)
    @Column(name = "fmobserv")
    private String fmobserv;
    @Size(max = 2147483647)
    @Column(name = "qexp")
    private String qexp;
    @Size(max = 2147483647)
    @Column(name = "qexamen")
    private String qexamen;
    @Size(max = 2147483647)
    @Column(name = "qresultado")
    private String qresultado;
    @Size(max = 2147483647)
    @Column(name = "qobserv")
    private String qobserv;
    @Size(max = 2147483647)
    @Column(name = "bexp")
    private String bexp;
    @Size(max = 2147483647)
    @Column(name = "bexamen")
    private String bexamen;
    @Size(max = 2147483647)
    @Column(name = "bresultado")
    private String bresultado;
    @Size(max = 2147483647)
    @Column(name = "bobserv")
    private String bobserv;
    @Size(max = 2147483647)
    @Column(name = "ergoexo")
    private String ergoexo;
    @Size(max = 2147483647)
    @Column(name = "ergoexamen")
    private String ergoexamen;
    @Size(max = 2147483647)
    @Column(name = "ergoresultado")
    private String ergoresultado;
    @Size(max = 2147483647)
    @Column(name = "sicoexp")
    private String sicoexp;
    @Size(max = 2147483647)
    @Column(name = "sicoexamen")
    private String sicoexamen;
    @Size(max = 2147483647)
    @Column(name = "sicoresultado")
    private String sicoresultado;
    @Size(max = 2147483647)
    @Column(name = "sicoobserv")
    private String sicoobserv;
    @JoinColumn(name = "iddatosidentificacion", referencedColumnName = "iddatosidentificacion")
    @ManyToOne
    private Datosidentificacion iddatosidentificacion;

    public Examenespecifico() {
    }

    public Examenespecifico(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFnmexp() {
        return fnmexp;
    }

    public void setFnmexp(String fnmexp) {
        this.fnmexp = fnmexp;
    }

    public String getFnmexamen() {
        return fnmexamen;
    }

    public void setFnmexamen(String fnmexamen) {
        this.fnmexamen = fnmexamen;
    }

    public String getFnmresultado() {
        return fnmresultado;
    }

    public void setFnmresultado(String fnmresultado) {
        this.fnmresultado = fnmresultado;
    }

    public String getFnmobserv() {
        return fnmobserv;
    }

    public void setFnmobserv(String fnmobserv) {
        this.fnmobserv = fnmobserv;
    }

    public String getFmexp() {
        return fmexp;
    }

    public void setFmexp(String fmexp) {
        this.fmexp = fmexp;
    }

    public String getFmexamen() {
        return fmexamen;
    }

    public void setFmexamen(String fmexamen) {
        this.fmexamen = fmexamen;
    }

    public String getFmresultado() {
        return fmresultado;
    }

    public void setFmresultado(String fmresultado) {
        this.fmresultado = fmresultado;
    }

    public String getFmobserv() {
        return fmobserv;
    }

    public void setFmobserv(String fmobserv) {
        this.fmobserv = fmobserv;
    }

    public String getQexp() {
        return qexp;
    }

    public void setQexp(String qexp) {
        this.qexp = qexp;
    }

    public String getQexamen() {
        return qexamen;
    }

    public void setQexamen(String qexamen) {
        this.qexamen = qexamen;
    }

    public String getQresultado() {
        return qresultado;
    }

    public void setQresultado(String qresultado) {
        this.qresultado = qresultado;
    }

    public String getQobserv() {
        return qobserv;
    }

    public void setQobserv(String qobserv) {
        this.qobserv = qobserv;
    }

    public String getBexp() {
        return bexp;
    }

    public void setBexp(String bexp) {
        this.bexp = bexp;
    }

    public String getBexamen() {
        return bexamen;
    }

    public void setBexamen(String bexamen) {
        this.bexamen = bexamen;
    }

    public String getBresultado() {
        return bresultado;
    }

    public void setBresultado(String bresultado) {
        this.bresultado = bresultado;
    }

    public String getBobserv() {
        return bobserv;
    }

    public void setBobserv(String bobserv) {
        this.bobserv = bobserv;
    }

    public String getErgoexo() {
        return ergoexo;
    }

    public void setErgoexo(String ergoexo) {
        this.ergoexo = ergoexo;
    }

    public String getErgoexamen() {
        return ergoexamen;
    }

    public void setErgoexamen(String ergoexamen) {
        this.ergoexamen = ergoexamen;
    }

    public String getErgoresultado() {
        return ergoresultado;
    }

    public void setErgoresultado(String ergoresultado) {
        this.ergoresultado = ergoresultado;
    }

    public String getSicoexp() {
        return sicoexp;
    }

    public void setSicoexp(String sicoexp) {
        this.sicoexp = sicoexp;
    }

    public String getSicoexamen() {
        return sicoexamen;
    }

    public void setSicoexamen(String sicoexamen) {
        this.sicoexamen = sicoexamen;
    }

    public String getSicoresultado() {
        return sicoresultado;
    }

    public void setSicoresultado(String sicoresultado) {
        this.sicoresultado = sicoresultado;
    }

    public String getSicoobserv() {
        return sicoobserv;
    }

    public void setSicoobserv(String sicoobserv) {
        this.sicoobserv = sicoobserv;
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
        if (!(object instanceof Examenespecifico)) {
            return false;
        }
        Examenespecifico other = (Examenespecifico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Examenespecifico[ id=" + id + " ]";
    }
    
}
