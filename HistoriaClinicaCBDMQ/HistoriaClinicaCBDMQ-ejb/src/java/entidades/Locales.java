/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "locales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Locales.findAll", query = "SELECT l FROM Locales l"),
    @NamedQuery(name = "Locales.findById", query = "SELECT l FROM Locales l WHERE l.id = :id"),
    @NamedQuery(name = "Locales.findByNombre", query = "SELECT l FROM Locales l WHERE l.nombre = :nombre"),
    @NamedQuery(name = "Locales.findByOperativo", query = "SELECT l FROM Locales l WHERE l.operativo = :operativo"),
    @NamedQuery(name = "Locales.findByCodigo", query = "SELECT l FROM Locales l WHERE l.codigo = :codigo"),
    @NamedQuery(name = "Locales.findByZona", query = "SELECT l FROM Locales l WHERE l.zona = :zona"),
    @NamedQuery(name = "Locales.findByLatitud", query = "SELECT l FROM Locales l WHERE l.latitud = :latitud"),
    @NamedQuery(name = "Locales.findByLongitud", query = "SELECT l FROM Locales l WHERE l.longitud = :longitud"),
    @NamedQuery(name = "Locales.findByAlarma", query = "SELECT l FROM Locales l WHERE l.alarma = :alarma")})
public class Locales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "operativo")
    private Boolean operativo;
    @Size(max = 2147483647)
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 2147483647)
    @Column(name = "zona")
    private String zona;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "latitud")
    private BigDecimal latitud;
    @Column(name = "longitud")
    private BigDecimal longitud;
    @Column(name = "alarma")
    private Boolean alarma;
    @OneToMany(mappedBy = "localidad")
    private List<Organigrama> organigramaList;
    @JoinColumn(name = "direccion", referencedColumnName = "id")
    @ManyToOne
    private Direcciones direccion;
    @JoinColumn(name = "telefono1", referencedColumnName = "id")
    @ManyToOne
    private Telefonos telefono1;
    @JoinColumn(name = "telefono", referencedColumnName = "id")
    @ManyToOne
    private Telefonos telefono;

    public Locales() {
    }

    public Locales(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getOperativo() {
        return operativo;
    }

    public void setOperativo(Boolean operativo) {
        this.operativo = operativo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public BigDecimal getLatitud() {
        return latitud;
    }

    public void setLatitud(BigDecimal latitud) {
        this.latitud = latitud;
    }

    public BigDecimal getLongitud() {
        return longitud;
    }

    public void setLongitud(BigDecimal longitud) {
        this.longitud = longitud;
    }

    public Boolean getAlarma() {
        return alarma;
    }

    public void setAlarma(Boolean alarma) {
        this.alarma = alarma;
    }

    @XmlTransient
    public List<Organigrama> getOrganigramaList() {
        return organigramaList;
    }

    public void setOrganigramaList(List<Organigrama> organigramaList) {
        this.organigramaList = organigramaList;
    }

    public Direcciones getDireccion() {
        return direccion;
    }

    public void setDireccion(Direcciones direccion) {
        this.direccion = direccion;
    }

    public Telefonos getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(Telefonos telefono1) {
        this.telefono1 = telefono1;
    }

    public Telefonos getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefonos telefono) {
        this.telefono = telefono;
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
        if (!(object instanceof Locales)) {
            return false;
        }
        Locales other = (Locales) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Locales[ id=" + id + " ]";
    }
    
}
