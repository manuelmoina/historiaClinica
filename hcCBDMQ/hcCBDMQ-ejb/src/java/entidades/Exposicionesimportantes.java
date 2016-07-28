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
    @NamedQuery(name = "Exposicionesimportantes.findById", query = "SELECT e FROM Exposicionesimportantes e WHERE e.id = :id"),
    @NamedQuery(name = "Exposicionesimportantes.findByAgente0", query = "SELECT e FROM Exposicionesimportantes e WHERE e.agente0 = :agente0"),
    @NamedQuery(name = "Exposicionesimportantes.findByAgentedetalle0", query = "SELECT e FROM Exposicionesimportantes e WHERE e.agentedetalle0 = :agentedetalle0"),
    @NamedQuery(name = "Exposicionesimportantes.findByAgente1", query = "SELECT e FROM Exposicionesimportantes e WHERE e.agente1 = :agente1"),
    @NamedQuery(name = "Exposicionesimportantes.findByAgentedetalle1", query = "SELECT e FROM Exposicionesimportantes e WHERE e.agentedetalle1 = :agentedetalle1"),
    @NamedQuery(name = "Exposicionesimportantes.findByAgente2", query = "SELECT e FROM Exposicionesimportantes e WHERE e.agente2 = :agente2"),
    @NamedQuery(name = "Exposicionesimportantes.findByAgentedetalle2", query = "SELECT e FROM Exposicionesimportantes e WHERE e.agentedetalle2 = :agentedetalle2"),
    @NamedQuery(name = "Exposicionesimportantes.findByAgente3", query = "SELECT e FROM Exposicionesimportantes e WHERE e.agente3 = :agente3"),
    @NamedQuery(name = "Exposicionesimportantes.findByAgentedetalle3", query = "SELECT e FROM Exposicionesimportantes e WHERE e.agentedetalle3 = :agentedetalle3")})
public class Exposicionesimportantes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "agente0")
    private String agente0;
    @Size(max = 2147483647)
    @Column(name = "agentedetalle0")
    private String agentedetalle0;
    @Size(max = 2147483647)
    @Column(name = "agente1")
    private String agente1;
    @Size(max = 2147483647)
    @Column(name = "agentedetalle1")
    private String agentedetalle1;
    @Size(max = 2147483647)
    @Column(name = "agente2")
    private String agente2;
    @Size(max = 2147483647)
    @Column(name = "agentedetalle2")
    private String agentedetalle2;
    @Size(max = 2147483647)
    @Column(name = "agente3")
    private String agente3;
    @Size(max = 2147483647)
    @Column(name = "agentedetalle3")
    private String agentedetalle3;
    @JoinColumn(name = "dat_id", referencedColumnName = "id")
    @ManyToOne
    private Datosidentificacion datId;

    public Exposicionesimportantes() {
    }

    public Exposicionesimportantes(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAgente0() {
        return agente0;
    }

    public void setAgente0(String agente0) {
        this.agente0 = agente0;
    }

    public String getAgentedetalle0() {
        return agentedetalle0;
    }

    public void setAgentedetalle0(String agentedetalle0) {
        this.agentedetalle0 = agentedetalle0;
    }

    public String getAgente1() {
        return agente1;
    }

    public void setAgente1(String agente1) {
        this.agente1 = agente1;
    }

    public String getAgentedetalle1() {
        return agentedetalle1;
    }

    public void setAgentedetalle1(String agentedetalle1) {
        this.agentedetalle1 = agentedetalle1;
    }

    public String getAgente2() {
        return agente2;
    }

    public void setAgente2(String agente2) {
        this.agente2 = agente2;
    }

    public String getAgentedetalle2() {
        return agentedetalle2;
    }

    public void setAgentedetalle2(String agentedetalle2) {
        this.agentedetalle2 = agentedetalle2;
    }

    public String getAgente3() {
        return agente3;
    }

    public void setAgente3(String agente3) {
        this.agente3 = agente3;
    }

    public String getAgentedetalle3() {
        return agentedetalle3;
    }

    public void setAgentedetalle3(String agentedetalle3) {
        this.agentedetalle3 = agentedetalle3;
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
        if (!(object instanceof Exposicionesimportantes)) {
            return false;
        }
        Exposicionesimportantes other = (Exposicionesimportantes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Exposicionesimportantes[ id=" + id + " ]";
    }
    
}
