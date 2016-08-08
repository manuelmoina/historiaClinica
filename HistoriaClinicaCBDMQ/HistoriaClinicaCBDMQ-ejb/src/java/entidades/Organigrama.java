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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author emoina
 */
@Entity
@Table(name = "organigrama")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Organigrama.findAll", query = "SELECT o FROM Organigrama o"),
    @NamedQuery(name = "Organigrama.findById", query = "SELECT o FROM Organigrama o WHERE o.id = :id"),
    @NamedQuery(name = "Organigrama.findByCodigo", query = "SELECT o FROM Organigrama o WHERE o.codigo = :codigo"),
    @NamedQuery(name = "Organigrama.findByNombre", query = "SELECT o FROM Organigrama o WHERE o.nombre = :nombre"),
    @NamedQuery(name = "Organigrama.findByActivo", query = "SELECT o FROM Organigrama o WHERE o.activo = :activo"),
    @NamedQuery(name = "Organigrama.findByTitulo", query = "SELECT o FROM Organigrama o WHERE o.titulo = :titulo"),
    @NamedQuery(name = "Organigrama.findByOperativo", query = "SELECT o FROM Organigrama o WHERE o.operativo = :operativo"),
    @NamedQuery(name = "Organigrama.findByOrdinal", query = "SELECT o FROM Organigrama o WHERE o.ordinal = :ordinal"),
    @NamedQuery(name = "Organigrama.findByAuxiliar", query = "SELECT o FROM Organigrama o WHERE o.auxiliar = :auxiliar")})
public class Organigrama implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "titulo")
    private Boolean titulo;
    @Column(name = "operativo")
    private Boolean operativo;
    @Column(name = "ordinal")
    private Integer ordinal;
    @Size(max = 2147483647)
    @Column(name = "auxiliar")
    private String auxiliar;
    @JoinColumn(name = "localidad", referencedColumnName = "id")
    @ManyToOne
    private Locales localidad;
    @OneToMany(mappedBy = "superior")
    private List<Organigrama> organigramaList;
    @JoinColumn(name = "superior", referencedColumnName = "id")
    @ManyToOne
    private Organigrama superior;
    @OneToMany(mappedBy = "administra")
    private List<Empleado> empleadoList;
    @OneToMany(mappedBy = "organigrama")
    private List<Empleado> empleadoList1;

    public Organigrama() {
    }

    public Organigrama(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Boolean getTitulo() {
        return titulo;
    }

    public void setTitulo(Boolean titulo) {
        this.titulo = titulo;
    }

    public Boolean getOperativo() {
        return operativo;
    }

    public void setOperativo(Boolean operativo) {
        this.operativo = operativo;
    }

    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public String getAuxiliar() {
        return auxiliar;
    }

    public void setAuxiliar(String auxiliar) {
        this.auxiliar = auxiliar;
    }

    public Locales getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Locales localidad) {
        this.localidad = localidad;
    }

    @XmlTransient
    public List<Organigrama> getOrganigramaList() {
        return organigramaList;
    }

    public void setOrganigramaList(List<Organigrama> organigramaList) {
        this.organigramaList = organigramaList;
    }

    public Organigrama getSuperior() {
        return superior;
    }

    public void setSuperior(Organigrama superior) {
        this.superior = superior;
    }

    @XmlTransient
    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    @XmlTransient
    public List<Empleado> getEmpleadoList1() {
        return empleadoList1;
    }

    public void setEmpleadoList1(List<Empleado> empleadoList1) {
        this.empleadoList1 = empleadoList1;
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
        if (!(object instanceof Organigrama)) {
            return false;
        }
        Organigrama other = (Organigrama) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Organigrama[ id=" + id + " ]";
    }
    
}
