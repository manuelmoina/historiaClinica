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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author emoina
 */
@Entity
@Table(name = "datosidentificacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Datosidentificacion.findAll", query = "SELECT d FROM Datosidentificacion d"),
    @NamedQuery(name = "Datosidentificacion.findById", query = "SELECT d FROM Datosidentificacion d WHERE d.id = :id"),
    @NamedQuery(name = "Datosidentificacion.findByCi", query = "SELECT d FROM Datosidentificacion d WHERE d.ci = :ci"),
    @NamedQuery(name = "Datosidentificacion.findByNombres", query = "SELECT d FROM Datosidentificacion d WHERE d.nombres = :nombres"),
    @NamedQuery(name = "Datosidentificacion.findByApellidos", query = "SELECT d FROM Datosidentificacion d WHERE d.apellidos = :apellidos"),
    @NamedQuery(name = "Datosidentificacion.findByFecha", query = "SELECT d FROM Datosidentificacion d WHERE d.fecha = :fecha"),
    @NamedQuery(name = "Datosidentificacion.findByEdad", query = "SELECT d FROM Datosidentificacion d WHERE d.edad = :edad"),
    @NamedQuery(name = "Datosidentificacion.findByEstadocivil", query = "SELECT d FROM Datosidentificacion d WHERE d.estadocivil = :estadocivil"),
    @NamedQuery(name = "Datosidentificacion.findBySexo", query = "SELECT d FROM Datosidentificacion d WHERE d.sexo = :sexo"),
    @NamedQuery(name = "Datosidentificacion.findByProfesio", query = "SELECT d FROM Datosidentificacion d WHERE d.profesio = :profesio"),
    @NamedQuery(name = "Datosidentificacion.findByNiveleducativo", query = "SELECT d FROM Datosidentificacion d WHERE d.niveleducativo = :niveleducativo"),
    @NamedQuery(name = "Datosidentificacion.findByCargo", query = "SELECT d FROM Datosidentificacion d WHERE d.cargo = :cargo"),
    @NamedQuery(name = "Datosidentificacion.findByPais", query = "SELECT d FROM Datosidentificacion d WHERE d.pais = :pais")})
public class Datosidentificacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ci")
    private int ci;
    @Size(max = 250)
    @Column(name = "nombres")
    private String nombres;
    @Size(max = 250)
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "edad")
    private Integer edad;
    @Size(max = 250)
    @Column(name = "estadocivil")
    private String estadocivil;
    @Size(max = 2147483647)
    @Column(name = "sexo")
    private String sexo;
    @Size(max = 2147483647)
    @Column(name = "profesio")
    private String profesio;
    @Size(max = 2147483647)
    @Column(name = "niveleducativo")
    private String niveleducativo;
    @Size(max = 2147483647)
    @Column(name = "cargo")
    private String cargo;
    @Size(max = 2147483647)
    @Column(name = "pais")
    private String pais;
    @OneToMany(mappedBy = "datId")
    private List<Exposicionesimportantes> exposicionesimportantesList;
    @OneToMany(mappedBy = "datId")
    private List<Antecedentesfamiliares> antecedentesfamiliaresList;
    @OneToMany(mappedBy = "datId")
    private List<Antecedentespersonales> antecedentespersonalesList;
    @OneToMany(mappedBy = "datId")
    private List<Accidentes> accidentesList;
    @OneToMany(mappedBy = "datId")
    private List<Habitos> habitosList;
    @OneToMany(mappedBy = "datId")
    private List<Antecedenteslaborales> antecedenteslaboralesList;

    public Datosidentificacion() {
    }

    public Datosidentificacion(Integer id) {
        this.id = id;
    }

    public Datosidentificacion(Integer id, int ci) {
        this.id = id;
        this.ci = ci;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProfesio() {
        return profesio;
    }

    public void setProfesio(String profesio) {
        this.profesio = profesio;
    }

    public String getNiveleducativo() {
        return niveleducativo;
    }

    public void setNiveleducativo(String niveleducativo) {
        this.niveleducativo = niveleducativo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @XmlTransient
    public List<Exposicionesimportantes> getExposicionesimportantesList() {
        return exposicionesimportantesList;
    }

    public void setExposicionesimportantesList(List<Exposicionesimportantes> exposicionesimportantesList) {
        this.exposicionesimportantesList = exposicionesimportantesList;
    }

    @XmlTransient
    public List<Antecedentesfamiliares> getAntecedentesfamiliaresList() {
        return antecedentesfamiliaresList;
    }

    public void setAntecedentesfamiliaresList(List<Antecedentesfamiliares> antecedentesfamiliaresList) {
        this.antecedentesfamiliaresList = antecedentesfamiliaresList;
    }

    @XmlTransient
    public List<Antecedentespersonales> getAntecedentespersonalesList() {
        return antecedentespersonalesList;
    }

    public void setAntecedentespersonalesList(List<Antecedentespersonales> antecedentespersonalesList) {
        this.antecedentespersonalesList = antecedentespersonalesList;
    }

    @XmlTransient
    public List<Accidentes> getAccidentesList() {
        return accidentesList;
    }

    public void setAccidentesList(List<Accidentes> accidentesList) {
        this.accidentesList = accidentesList;
    }

    @XmlTransient
    public List<Habitos> getHabitosList() {
        return habitosList;
    }

    public void setHabitosList(List<Habitos> habitosList) {
        this.habitosList = habitosList;
    }

    @XmlTransient
    public List<Antecedenteslaborales> getAntecedenteslaboralesList() {
        return antecedenteslaboralesList;
    }

    public void setAntecedenteslaboralesList(List<Antecedenteslaborales> antecedenteslaboralesList) {
        this.antecedenteslaboralesList = antecedenteslaboralesList;
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
        if (!(object instanceof Datosidentificacion)) {
            return false;
        }
        Datosidentificacion other = (Datosidentificacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Datosidentificacion[ id=" + id + " ]";
    }
    
}
