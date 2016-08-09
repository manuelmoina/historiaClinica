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
@Table(name = "examenvisual")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Examenvisual.findAll", query = "SELECT e FROM Examenvisual e"),
    @NamedQuery(name = "Examenvisual.findById", query = "SELECT e FROM Examenvisual e WHERE e.id = :id"),
    @NamedQuery(name = "Examenvisual.findByOptoderecho", query = "SELECT e FROM Examenvisual e WHERE e.optoderecho = :optoderecho"),
    @NamedQuery(name = "Examenvisual.findByOptoizquierdo", query = "SELECT e FROM Examenvisual e WHERE e.optoizquierdo = :optoizquierdo"),
    @NamedQuery(name = "Examenvisual.findByCampimetriad", query = "SELECT e FROM Examenvisual e WHERE e.campimetriad = :campimetriad"),
    @NamedQuery(name = "Examenvisual.findByCampimetriai", query = "SELECT e FROM Examenvisual e WHERE e.campimetriai = :campimetriai"),
    @NamedQuery(name = "Examenvisual.findByColores", query = "SELECT e FROM Examenvisual e WHERE e.colores = :colores"),
    @NamedQuery(name = "Examenvisual.findByObservaciones", query = "SELECT e FROM Examenvisual e WHERE e.observaciones = :observaciones")})
public class Examenvisual implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "optoderecho")
    private String optoderecho;
    @Size(max = 2147483647)
    @Column(name = "optoizquierdo")
    private String optoizquierdo;
    @Size(max = 2147483647)
    @Column(name = "campimetriad")
    private String campimetriad;
    @Size(max = 2147483647)
    @Column(name = "campimetriai")
    private String campimetriai;
    @Column(name = "colores")
    private Boolean colores;
    @Size(max = 2147483647)
    @Column(name = "observaciones")
    private String observaciones;
    @JoinColumn(name = "iddatosidentificacion", referencedColumnName = "iddatosidentificacion")
    @ManyToOne
    private Datosidentificacion iddatosidentificacion;

    public Examenvisual() {
    }

    public Examenvisual(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOptoderecho() {
        return optoderecho;
    }

    public void setOptoderecho(String optoderecho) {
        this.optoderecho = optoderecho;
    }

    public String getOptoizquierdo() {
        return optoizquierdo;
    }

    public void setOptoizquierdo(String optoizquierdo) {
        this.optoizquierdo = optoizquierdo;
    }

    public String getCampimetriad() {
        return campimetriad;
    }

    public void setCampimetriad(String campimetriad) {
        this.campimetriad = campimetriad;
    }

    public String getCampimetriai() {
        return campimetriai;
    }

    public void setCampimetriai(String campimetriai) {
        this.campimetriai = campimetriai;
    }

    public Boolean getColores() {
        return colores;
    }

    public void setColores(Boolean colores) {
        this.colores = colores;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
        if (!(object instanceof Examenvisual)) {
            return false;
        }
        Examenvisual other = (Examenvisual) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Examenvisual[ id=" + id + " ]";
    }
    
}
