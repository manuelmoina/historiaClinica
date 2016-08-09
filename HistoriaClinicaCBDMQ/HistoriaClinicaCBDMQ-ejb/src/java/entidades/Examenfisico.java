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
@Table(name = "examenfisico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Examenfisico.findAll", query = "SELECT e FROM Examenfisico e"),
    @NamedQuery(name = "Examenfisico.findById", query = "SELECT e FROM Examenfisico e WHERE e.id = :id"),
    @NamedQuery(name = "Examenfisico.findByCabeza", query = "SELECT e FROM Examenfisico e WHERE e.cabeza = :cabeza"),
    @NamedQuery(name = "Examenfisico.findByNariz", query = "SELECT e FROM Examenfisico e WHERE e.nariz = :nariz"),
    @NamedQuery(name = "Examenfisico.findByOidos", query = "SELECT e FROM Examenfisico e WHERE e.oidos = :oidos"),
    @NamedQuery(name = "Examenfisico.findByTorax", query = "SELECT e FROM Examenfisico e WHERE e.torax = :torax"),
    @NamedQuery(name = "Examenfisico.findByCorazon", query = "SELECT e FROM Examenfisico e WHERE e.corazon = :corazon"),
    @NamedQuery(name = "Examenfisico.findByAnillosinguine", query = "SELECT e FROM Examenfisico e WHERE e.anillosinguine = :anillosinguine"),
    @NamedQuery(name = "Examenfisico.findByColumna", query = "SELECT e FROM Examenfisico e WHERE e.columna = :columna"),
    @NamedQuery(name = "Examenfisico.findByOjos", query = "SELECT e FROM Examenfisico e WHERE e.ojos = :ojos"),
    @NamedQuery(name = "Examenfisico.findByBoca", query = "SELECT e FROM Examenfisico e WHERE e.boca = :boca"),
    @NamedQuery(name = "Examenfisico.findByCuello", query = "SELECT e FROM Examenfisico e WHERE e.cuello = :cuello"),
    @NamedQuery(name = "Examenfisico.findByPulmones", query = "SELECT e FROM Examenfisico e WHERE e.pulmones = :pulmones"),
    @NamedQuery(name = "Examenfisico.findByAbdomen", query = "SELECT e FROM Examenfisico e WHERE e.abdomen = :abdomen"),
    @NamedQuery(name = "Examenfisico.findByGenitales", query = "SELECT e FROM Examenfisico e WHERE e.genitales = :genitales"),
    @NamedQuery(name = "Examenfisico.findByDesviacioncolumna", query = "SELECT e FROM Examenfisico e WHERE e.desviacioncolumna = :desviacioncolumna"),
    @NamedQuery(name = "Examenfisico.findByMsuperiort", query = "SELECT e FROM Examenfisico e WHERE e.msuperiort = :msuperiort"),
    @NamedQuery(name = "Examenfisico.findByMsuperiorf", query = "SELECT e FROM Examenfisico e WHERE e.msuperiorf = :msuperiorf"),
    @NamedQuery(name = "Examenfisico.findByMsuperiors", query = "SELECT e FROM Examenfisico e WHERE e.msuperiors = :msuperiors"),
    @NamedQuery(name = "Examenfisico.findByMinferiort", query = "SELECT e FROM Examenfisico e WHERE e.minferiort = :minferiort"),
    @NamedQuery(name = "Examenfisico.findByMinferiorf", query = "SELECT e FROM Examenfisico e WHERE e.minferiorf = :minferiorf"),
    @NamedQuery(name = "Examenfisico.findByMinferiors", query = "SELECT e FROM Examenfisico e WHERE e.minferiors = :minferiors"),
    @NamedQuery(name = "Examenfisico.findByCirculacion", query = "SELECT e FROM Examenfisico e WHERE e.circulacion = :circulacion"),
    @NamedQuery(name = "Examenfisico.findByEquilibrio", query = "SELECT e FROM Examenfisico e WHERE e.equilibrio = :equilibrio"),
    @NamedQuery(name = "Examenfisico.findByCoordinacion", query = "SELECT e FROM Examenfisico e WHERE e.coordinacion = :coordinacion"),
    @NamedQuery(name = "Examenfisico.findByPielfaneras", query = "SELECT e FROM Examenfisico e WHERE e.pielfaneras = :pielfaneras"),
    @NamedQuery(name = "Examenfisico.findByMarcha", query = "SELECT e FROM Examenfisico e WHERE e.marcha = :marcha"),
    @NamedQuery(name = "Examenfisico.findByReflejos", query = "SELECT e FROM Examenfisico e WHERE e.reflejos = :reflejos"),
    @NamedQuery(name = "Examenfisico.findByMsuperior", query = "SELECT e FROM Examenfisico e WHERE e.msuperior = :msuperior"),
    @NamedQuery(name = "Examenfisico.findByMinferior", query = "SELECT e FROM Examenfisico e WHERE e.minferior = :minferior")})
public class Examenfisico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "cabeza")
    private String cabeza;
    @Size(max = 2147483647)
    @Column(name = "nariz")
    private String nariz;
    @Size(max = 2147483647)
    @Column(name = "oidos")
    private String oidos;
    @Size(max = 2147483647)
    @Column(name = "torax")
    private String torax;
    @Size(max = 2147483647)
    @Column(name = "corazon")
    private String corazon;
    @Size(max = 2147483647)
    @Column(name = "anillosinguine")
    private String anillosinguine;
    @Size(max = 2147483647)
    @Column(name = "columna")
    private String columna;
    @Size(max = 2147483647)
    @Column(name = "ojos")
    private String ojos;
    @Size(max = 2147483647)
    @Column(name = "boca")
    private String boca;
    @Size(max = 2147483647)
    @Column(name = "cuello")
    private String cuello;
    @Size(max = 2147483647)
    @Column(name = "pulmones")
    private String pulmones;
    @Size(max = 2147483647)
    @Column(name = "abdomen")
    private String abdomen;
    @Size(max = 2147483647)
    @Column(name = "genitales")
    private String genitales;
    @Size(max = 2147483647)
    @Column(name = "desviacioncolumna")
    private String desviacioncolumna;
    @Size(max = 2147483647)
    @Column(name = "msuperiort")
    private String msuperiort;
    @Size(max = 2147483647)
    @Column(name = "msuperiorf")
    private String msuperiorf;
    @Size(max = 2147483647)
    @Column(name = "msuperiors")
    private String msuperiors;
    @Size(max = 2147483647)
    @Column(name = "minferiort")
    private String minferiort;
    @Size(max = 2147483647)
    @Column(name = "minferiorf")
    private String minferiorf;
    @Size(max = 2147483647)
    @Column(name = "minferiors")
    private String minferiors;
    @Size(max = 2147483647)
    @Column(name = "circulacion")
    private String circulacion;
    @Size(max = 2147483647)
    @Column(name = "equilibrio")
    private String equilibrio;
    @Size(max = 2147483647)
    @Column(name = "coordinacion")
    private String coordinacion;
    @Size(max = 2147483647)
    @Column(name = "pielfaneras")
    private String pielfaneras;
    @Size(max = 2147483647)
    @Column(name = "marcha")
    private String marcha;
    @Size(max = 2147483647)
    @Column(name = "reflejos")
    private String reflejos;
    @Size(max = 2147483647)
    @Column(name = "msuperior")
    private String msuperior;
    @Size(max = 2147483647)
    @Column(name = "minferior")
    private String minferior;
    @JoinColumn(name = "iddatosidentificacion", referencedColumnName = "iddatosidentificacion")
    @ManyToOne(optional = false)
    private Datosidentificacion iddatosidentificacion;

    public Examenfisico() {
    }

    public Examenfisico(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCabeza() {
        return cabeza;
    }

    public void setCabeza(String cabeza) {
        this.cabeza = cabeza;
    }

    public String getNariz() {
        return nariz;
    }

    public void setNariz(String nariz) {
        this.nariz = nariz;
    }

    public String getOidos() {
        return oidos;
    }

    public void setOidos(String oidos) {
        this.oidos = oidos;
    }

    public String getTorax() {
        return torax;
    }

    public void setTorax(String torax) {
        this.torax = torax;
    }

    public String getCorazon() {
        return corazon;
    }

    public void setCorazon(String corazon) {
        this.corazon = corazon;
    }

    public String getAnillosinguine() {
        return anillosinguine;
    }

    public void setAnillosinguine(String anillosinguine) {
        this.anillosinguine = anillosinguine;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public String getOjos() {
        return ojos;
    }

    public void setOjos(String ojos) {
        this.ojos = ojos;
    }

    public String getBoca() {
        return boca;
    }

    public void setBoca(String boca) {
        this.boca = boca;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    public String getPulmones() {
        return pulmones;
    }

    public void setPulmones(String pulmones) {
        this.pulmones = pulmones;
    }

    public String getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(String abdomen) {
        this.abdomen = abdomen;
    }

    public String getGenitales() {
        return genitales;
    }

    public void setGenitales(String genitales) {
        this.genitales = genitales;
    }

    public String getDesviacioncolumna() {
        return desviacioncolumna;
    }

    public void setDesviacioncolumna(String desviacioncolumna) {
        this.desviacioncolumna = desviacioncolumna;
    }

    public String getMsuperiort() {
        return msuperiort;
    }

    public void setMsuperiort(String msuperiort) {
        this.msuperiort = msuperiort;
    }

    public String getMsuperiorf() {
        return msuperiorf;
    }

    public void setMsuperiorf(String msuperiorf) {
        this.msuperiorf = msuperiorf;
    }

    public String getMsuperiors() {
        return msuperiors;
    }

    public void setMsuperiors(String msuperiors) {
        this.msuperiors = msuperiors;
    }

    public String getMinferiort() {
        return minferiort;
    }

    public void setMinferiort(String minferiort) {
        this.minferiort = minferiort;
    }

    public String getMinferiorf() {
        return minferiorf;
    }

    public void setMinferiorf(String minferiorf) {
        this.minferiorf = minferiorf;
    }

    public String getMinferiors() {
        return minferiors;
    }

    public void setMinferiors(String minferiors) {
        this.minferiors = minferiors;
    }

    public String getCirculacion() {
        return circulacion;
    }

    public void setCirculacion(String circulacion) {
        this.circulacion = circulacion;
    }

    public String getEquilibrio() {
        return equilibrio;
    }

    public void setEquilibrio(String equilibrio) {
        this.equilibrio = equilibrio;
    }

    public String getCoordinacion() {
        return coordinacion;
    }

    public void setCoordinacion(String coordinacion) {
        this.coordinacion = coordinacion;
    }

    public String getPielfaneras() {
        return pielfaneras;
    }

    public void setPielfaneras(String pielfaneras) {
        this.pielfaneras = pielfaneras;
    }

    public String getMarcha() {
        return marcha;
    }

    public void setMarcha(String marcha) {
        this.marcha = marcha;
    }

    public String getReflejos() {
        return reflejos;
    }

    public void setReflejos(String reflejos) {
        this.reflejos = reflejos;
    }

    public String getMsuperior() {
        return msuperior;
    }

    public void setMsuperior(String msuperior) {
        this.msuperior = msuperior;
    }

    public String getMinferior() {
        return minferior;
    }

    public void setMinferior(String minferior) {
        this.minferior = minferior;
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
        if (!(object instanceof Examenfisico)) {
            return false;
        }
        Examenfisico other = (Examenfisico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Examenfisico[ id=" + id + " ]";
    }
    
}
