/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author emoina
 */
@Entity
@Table(name = "parentesco")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parentesco.findAll", query = "SELECT p FROM Parentesco p"),
    @NamedQuery(name = "Parentesco.findByIdparentesco", query = "SELECT p FROM Parentesco p WHERE p.idparentesco = :idparentesco"),
    @NamedQuery(name = "Parentesco.findByDescripcion", query = "SELECT p FROM Parentesco p WHERE p.descripcion = :descripcion")})
public class Parentesco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idparentesco")
    private Integer idparentesco;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idparentesco")
    private List<Antecedentesfamiliares> antecedentesfamiliaresList;

    public Parentesco() {
    }

    public Parentesco(Integer idparentesco) {
        this.idparentesco = idparentesco;
    }

    public Parentesco(Integer idparentesco, String descripcion) {
        this.idparentesco = idparentesco;
        this.descripcion = descripcion;
    }

    public Integer getIdparentesco() {
        return idparentesco;
    }

    public void setIdparentesco(Integer idparentesco) {
        this.idparentesco = idparentesco;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Antecedentesfamiliares> getAntecedentesfamiliaresList() {
        return antecedentesfamiliaresList;
    }

    public void setAntecedentesfamiliaresList(List<Antecedentesfamiliares> antecedentesfamiliaresList) {
        this.antecedentesfamiliaresList = antecedentesfamiliaresList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idparentesco != null ? idparentesco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parentesco)) {
            return false;
        }
        Parentesco other = (Parentesco) object;
        if ((this.idparentesco == null && other.idparentesco != null) || (this.idparentesco != null && !this.idparentesco.equals(other.idparentesco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Parentesco[ idparentesco=" + idparentesco + " ]";
    }
    
}
