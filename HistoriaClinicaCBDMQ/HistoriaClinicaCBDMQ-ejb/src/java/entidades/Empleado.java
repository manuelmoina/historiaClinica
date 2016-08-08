/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author emoina
 */
@Entity
@Table(name = "empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e"),
    @NamedQuery(name = "Empleado.findById", query = "SELECT e FROM Empleado e WHERE e.id = :id"),
    @NamedQuery(name = "Empleado.findByUbicacion", query = "SELECT e FROM Empleado e WHERE e.ubicacion = :ubicacion"),
    @NamedQuery(name = "Empleado.findByEstadocontrato", query = "SELECT e FROM Empleado e WHERE e.estadocontrato = :estadocontrato"),
    @NamedQuery(name = "Empleado.findByDisponibilidad", query = "SELECT e FROM Empleado e WHERE e.disponibilidad = :disponibilidad"),
    @NamedQuery(name = "Empleado.findByDisponible", query = "SELECT e FROM Empleado e WHERE e.disponible = :disponible"),
    @NamedQuery(name = "Empleado.findByOperativo", query = "SELECT e FROM Empleado e WHERE e.operativo = :operativo"),
    @NamedQuery(name = "Empleado.findByPeloton", query = "SELECT e FROM Empleado e WHERE e.peloton = :peloton"),
    @NamedQuery(name = "Empleado.findByFechaingreso", query = "SELECT e FROM Empleado e WHERE e.fechaingreso = :fechaingreso"),
    @NamedQuery(name = "Empleado.findByPromocion", query = "SELECT e FROM Empleado e WHERE e.promocion = :promocion"),
    @NamedQuery(name = "Empleado.findByAntiguedad", query = "SELECT e FROM Empleado e WHERE e.antiguedad = :antiguedad"),
    @NamedQuery(name = "Empleado.findByFuncion", query = "SELECT e FROM Empleado e WHERE e.funcion = :funcion"),
    @NamedQuery(name = "Empleado.findByJefede", query = "SELECT e FROM Empleado e WHERE e.jefede = :jefede"),
    @NamedQuery(name = "Empleado.findByReten", query = "SELECT e FROM Empleado e WHERE e.reten = :reten"),
    @NamedQuery(name = "Empleado.findByOrden", query = "SELECT e FROM Empleado e WHERE e.orden = :orden"),
    @NamedQuery(name = "Empleado.findByJefedezona", query = "SELECT e FROM Empleado e WHERE e.jefedezona = :jefedezona"),
    @NamedQuery(name = "Empleado.findByJefepeloton", query = "SELECT e FROM Empleado e WHERE e.jefepeloton = :jefepeloton"),
    @NamedQuery(name = "Empleado.findByEspecial", query = "SELECT e FROM Empleado e WHERE e.especial = :especial"),
    @NamedQuery(name = "Empleado.findByIngreso", query = "SELECT e FROM Empleado e WHERE e.ingreso = :ingreso"),
    @NamedQuery(name = "Empleado.findBySalida", query = "SELECT e FROM Empleado e WHERE e.salida = :salida"),
    @NamedQuery(name = "Empleado.findByContrato", query = "SELECT e FROM Empleado e WHERE e.contrato = :contrato")})
public class Empleado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "ubicacion")
    private String ubicacion;
    @Size(max = 2147483647)
    @Column(name = "estadocontrato")
    private String estadocontrato;
    @Size(max = 2147483647)
    @Column(name = "disponibilidad")
    private String disponibilidad;
    @Column(name = "disponible")
    private Boolean disponible;
    @Column(name = "operativo")
    private Boolean operativo;
    @Column(name = "peloton")
    private Integer peloton;
    @Column(name = "fechaingreso")
    @Temporal(TemporalType.DATE)
    private Date fechaingreso;
    @Size(max = 2147483647)
    @Column(name = "promocion")
    private String promocion;
    @Column(name = "antiguedad")
    private Integer antiguedad;
    @Size(max = 2147483647)
    @Column(name = "funcion")
    private String funcion;
    @Column(name = "jefede")
    private Integer jefede;
    @Column(name = "reten")
    private Boolean reten;
    @Column(name = "orden")
    private Integer orden;
    @Column(name = "jefedezona")
    private Boolean jefedezona;
    @Column(name = "jefepeloton")
    private Boolean jefepeloton;
    @Column(name = "especial")
    private Boolean especial;
    @Column(name = "ingreso")
    @Temporal(TemporalType.DATE)
    private Date ingreso;
    @Column(name = "salida")
    @Temporal(TemporalType.DATE)
    private Date salida;
    @Size(max = 4)
    @Column(name = "contrato")
    private String contrato;
    @JoinColumn(name = "cargo", referencedColumnName = "id")
    @ManyToOne
    private Cargos cargo;
    @JoinColumn(name = "gradocarrera", referencedColumnName = "id")
    @ManyToOne
    private Carrera gradocarrera;
    @OneToMany(mappedBy = "superior")
    private List<Empleado> empleadoList;
    @JoinColumn(name = "superior", referencedColumnName = "id")
    @ManyToOne
    private Empleado superior;
    @JoinColumn(name = "entidad", referencedColumnName = "id")
    @OneToOne
    private Entidades entidad;
    @JoinColumn(name = "administra", referencedColumnName = "id")
    @ManyToOne
    private Organigrama administra;
    @JoinColumn(name = "organigrama", referencedColumnName = "id")
    @ManyToOne
    private Organigrama organigrama;

    public Empleado() {
    }

    public Empleado(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstadocontrato() {
        return estadocontrato;
    }

    public void setEstadocontrato(String estadocontrato) {
        this.estadocontrato = estadocontrato;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public Boolean getOperativo() {
        return operativo;
    }

    public void setOperativo(Boolean operativo) {
        this.operativo = operativo;
    }

    public Integer getPeloton() {
        return peloton;
    }

    public void setPeloton(Integer peloton) {
        this.peloton = peloton;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public String getPromocion() {
        return promocion;
    }

    public void setPromocion(String promocion) {
        this.promocion = promocion;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public Integer getJefede() {
        return jefede;
    }

    public void setJefede(Integer jefede) {
        this.jefede = jefede;
    }

    public Boolean getReten() {
        return reten;
    }

    public void setReten(Boolean reten) {
        this.reten = reten;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public Boolean getJefedezona() {
        return jefedezona;
    }

    public void setJefedezona(Boolean jefedezona) {
        this.jefedezona = jefedezona;
    }

    public Boolean getJefepeloton() {
        return jefepeloton;
    }

    public void setJefepeloton(Boolean jefepeloton) {
        this.jefepeloton = jefepeloton;
    }

    public Boolean getEspecial() {
        return especial;
    }

    public void setEspecial(Boolean especial) {
        this.especial = especial;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public Cargos getCargo() {
        return cargo;
    }

    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }

    public Carrera getGradocarrera() {
        return gradocarrera;
    }

    public void setGradocarrera(Carrera gradocarrera) {
        this.gradocarrera = gradocarrera;
    }

    @XmlTransient
    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    public Empleado getSuperior() {
        return superior;
    }

    public void setSuperior(Empleado superior) {
        this.superior = superior;
    }

    public Entidades getEntidad() {
        return entidad;
    }

    public void setEntidad(Entidades entidad) {
        this.entidad = entidad;
    }

    public Organigrama getAdministra() {
        return administra;
    }

    public void setAdministra(Organigrama administra) {
        this.administra = administra;
    }

    public Organigrama getOrganigrama() {
        return organigrama;
    }

    public void setOrganigrama(Organigrama organigrama) {
        this.organigrama = organigrama;
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
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Empleado[ id=" + id + " ]";
    }
    
}
