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
@Table(name = "antecedentesfamiliares")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Antecedentesfamiliares.findAll", query = "SELECT a FROM Antecedentesfamiliares a"),
    @NamedQuery(name = "Antecedentesfamiliares.findByIdantecedentesfamililares", query = "SELECT a FROM Antecedentesfamiliares a WHERE a.idantecedentesfamililares = :idantecedentesfamililares"),
    @NamedQuery(name = "Antecedentesfamiliares.findByEnfermedad", query = "SELECT a FROM Antecedentesfamiliares a WHERE a.enfermedad = :enfermedad"),
    @NamedQuery(name = "Antecedentesfamiliares.findByObservacion", query = "SELECT a FROM Antecedentesfamiliares a WHERE a.observacion = :observacion")})
public class Antecedentesfamiliares implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idantecedentesfamililares")
    private Integer idantecedentesfamililares;
    @Size(max = 2147483647)
    @Column(name = "enfermedad")
    private String enfermedad;
    @Size(max = 2147483647)
    @Column(name = "observacion")
    private String observacion;
    @JoinColumn(name = "iddatosidentificacion", referencedColumnName = "iddatosidentificacion")
    @ManyToOne(optional = false)
    private Datosidentificacion iddatosidentificacion;
    @JoinColumn(name = "idparentesco", referencedColumnName = "idparentesco")
    @ManyToOne
    private Parentesco idparentesco;

    public Antecedentesfamiliares() {
    }

    public Antecedentesfamiliares(Integer idantecedentesfamililares) {
        this.idantecedentesfamililares = idantecedentesfamililares;
    }

    public Integer getIdantecedentesfamililares() {
        return idantecedentesfamililares;
    }

    public void setIdantecedentesfamililares(Integer idantecedentesfamililares) {
        this.idantecedentesfamililares = idantecedentesfamililares;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Datosidentificacion getIddatosidentificacion() {
        return iddatosidentificacion;
    }

    public void setIddatosidentificacion(Datosidentificacion iddatosidentificacion) {
        this.iddatosidentificacion = iddatosidentificacion;
    }

    public Parentesco getIdparentesco() {
        return idparentesco;
    }

    public void setIdparentesco(Parentesco idparentesco) {
        this.idparentesco = idparentesco;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idantecedentesfamililares != null ? idantecedentesfamililares.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Antecedentesfamiliares)) {
            return false;
        }
        Antecedentesfamiliares other = (Antecedentesfamiliares) object;
        if ((this.idantecedentesfamililares == null && other.idantecedentesfamililares != null) || (this.idantecedentesfamililares != null && !this.idantecedentesfamililares.equals(other.idantecedentesfamililares))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Antecedentesfamiliares[ idantecedentesfamililares=" + idantecedentesfamililares + " ]";
    }
    
}
