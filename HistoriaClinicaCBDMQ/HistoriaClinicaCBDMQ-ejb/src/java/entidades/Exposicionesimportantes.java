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
@Table(name = "exposicionesimportantes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Exposicionesimportantes.findAll", query = "SELECT e FROM Exposicionesimportantes e"),
    @NamedQuery(name = "Exposicionesimportantes.findByIdexposicionesimportantes", query = "SELECT e FROM Exposicionesimportantes e WHERE e.idexposicionesimportantes = :idexposicionesimportantes"),
    @NamedQuery(name = "Exposicionesimportantes.findByAgente", query = "SELECT e FROM Exposicionesimportantes e WHERE e.agente = :agente"),
    @NamedQuery(name = "Exposicionesimportantes.findByAgentedetalle", query = "SELECT e FROM Exposicionesimportantes e WHERE e.agentedetalle = :agentedetalle")})
public class Exposicionesimportantes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idexposicionesimportantes")
    private Integer idexposicionesimportantes;
    @Size(max = 2147483647)
    @Column(name = "agente")
    private String agente;
    @Size(max = 2147483647)
    @Column(name = "agentedetalle")
    private String agentedetalle;
    @JoinColumn(name = "iddatosidentificacion", referencedColumnName = "iddatosidentificacion")
    @ManyToOne
    private Datosidentificacion iddatosidentificacion;

    public Exposicionesimportantes() {
    }

    public Exposicionesimportantes(Integer idexposicionesimportantes) {
        this.idexposicionesimportantes = idexposicionesimportantes;
    }

    public Integer getIdexposicionesimportantes() {
        return idexposicionesimportantes;
    }

    public void setIdexposicionesimportantes(Integer idexposicionesimportantes) {
        this.idexposicionesimportantes = idexposicionesimportantes;
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public String getAgentedetalle() {
        return agentedetalle;
    }

    public void setAgentedetalle(String agentedetalle) {
        this.agentedetalle = agentedetalle;
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
        hash += (idexposicionesimportantes != null ? idexposicionesimportantes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Exposicionesimportantes)) {
            return false;
        }
        Exposicionesimportantes other = (Exposicionesimportantes) object;
        if ((this.idexposicionesimportantes == null && other.idexposicionesimportantes != null) || (this.idexposicionesimportantes != null && !this.idexposicionesimportantes.equals(other.idexposicionesimportantes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Exposicionesimportantes[ idexposicionesimportantes=" + idexposicionesimportantes + " ]";
    }
    
}
