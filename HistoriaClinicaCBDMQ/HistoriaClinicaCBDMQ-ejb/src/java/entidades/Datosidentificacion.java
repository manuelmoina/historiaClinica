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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * @author TOSHIBA
 */
@Entity
@Table(name = "datosidentificacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Datosidentificacion.findAll", query = "SELECT d FROM Datosidentificacion d"),
    @NamedQuery(name = "Datosidentificacion.findByIddatosidentificacion", query = "SELECT d FROM Datosidentificacion d WHERE d.iddatosidentificacion = :iddatosidentificacion"),
    @NamedQuery(name = "Datosidentificacion.findByFecha", query = "SELECT d FROM Datosidentificacion d WHERE d.fecha = :fecha"),
    @NamedQuery(name = "Datosidentificacion.findByEstadocivil", query = "SELECT d FROM Datosidentificacion d WHERE d.estadocivil = :estadocivil"),
    @NamedQuery(name = "Datosidentificacion.findByProfesion", query = "SELECT d FROM Datosidentificacion d WHERE d.profesion = :profesion"),
    @NamedQuery(name = "Datosidentificacion.findByNiveleducativo", query = "SELECT d FROM Datosidentificacion d WHERE d.niveleducativo = :niveleducativo"),
    @NamedQuery(name = "Datosidentificacion.findByCargo", query = "SELECT d FROM Datosidentificacion d WHERE d.cargo = :cargo"),
    @NamedQuery(name = "Datosidentificacion.findByPais", query = "SELECT d FROM Datosidentificacion d WHERE d.pais = :pais"),
    @NamedQuery(name = "Datosidentificacion.findByIdoneo", query = "SELECT d FROM Datosidentificacion d WHERE d.idoneo = :idoneo"),
    @NamedQuery(name = "Datosidentificacion.findByAlegias1", query = "SELECT d FROM Datosidentificacion d WHERE d.alegias1 = :alegias1"),
    @NamedQuery(name = "Datosidentificacion.findByAlergias2", query = "SELECT d FROM Datosidentificacion d WHERE d.alergias2 = :alergias2"),
    @NamedQuery(name = "Datosidentificacion.findByUsodemedicinadiaria1", query = "SELECT d FROM Datosidentificacion d WHERE d.usodemedicinadiaria1 = :usodemedicinadiaria1"),
    @NamedQuery(name = "Datosidentificacion.findByUsodemedicinadiaria2", query = "SELECT d FROM Datosidentificacion d WHERE d.usodemedicinadiaria2 = :usodemedicinadiaria2"),
    @NamedQuery(name = "Datosidentificacion.findByPresenciaefermedadprofesionalac", query = "SELECT d FROM Datosidentificacion d WHERE d.presenciaefermedadprofesionalac = :presenciaefermedadprofesionalac"),
    @NamedQuery(name = "Datosidentificacion.findByEdadprofesionalactual2", query = "SELECT d FROM Datosidentificacion d WHERE d.edadprofesionalactual2 = :edadprofesionalactual2"),
    @NamedQuery(name = "Datosidentificacion.findByDetalle", query = "SELECT d FROM Datosidentificacion d WHERE d.detalle = :detalle")})
public class Datosidentificacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddatosidentificacion")
    private Integer iddatosidentificacion;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max = 250)
    @Column(name = "estadocivil")
    private String estadocivil;
    @Size(max = 2147483647)
    @Column(name = "profesion")
    private String profesion;
    @Size(max = 2147483647)
    @Column(name = "niveleducativo")
    private String niveleducativo;
    @Size(max = 2147483647)
    @Column(name = "cargo")
    private String cargo;
    @Size(max = 2147483647)
    @Column(name = "pais")
    private String pais;
    @Column(name = "idoneo")
    private Boolean idoneo;
    @Column(name = "alegias1")
    private Boolean alegias1;
    @Size(max = 2147483647)
    @Column(name = "alergias2")
    private String alergias2;
    @Column(name = "usodemedicinadiaria1")
    private Boolean usodemedicinadiaria1;
    @Size(max = 2147483647)
    @Column(name = "usodemedicinadiaria2")
    private String usodemedicinadiaria2;
    @Column(name = "presenciaefermedadprofesionalac")
    private Boolean presenciaefermedadprofesionalac;
    @Size(max = 2147483647)
    @Column(name = "edadprofesionalactual2")
    private String edadprofesionalactual2;
    @Size(max = 2147483647)
    @Column(name = "detalle")
    private String detalle;
    @OneToMany(mappedBy = "iddatosidentificacion")
    private List<Signosvitales> signosvitalesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddatosidentificacion")
    private List<Antecedentesfamiliares> antecedentesfamiliaresList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddatosidentificacion")
    private List<Antecedentespersonales> antecedentespersonalesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddatosidentificacion")
    private List<Accidentes> accidentesList;
    @OneToMany(mappedBy = "iddatosidentificacion")
    private List<Antropometria> antropometriaList;
    @JoinColumn(name = "entidad", referencedColumnName = "id")
    @ManyToOne
    private Entidades entidad;
    @OneToMany(mappedBy = "iddatosidentificacion")
    private List<Examenespecifico> examenespecificoList;
    @OneToMany(mappedBy = "iddatosidentificacion")
    private List<Examenvisual> examenvisualList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddatosidentificacion")
    private List<Examenfisico> examenfisicoList;
    @OneToMany(mappedBy = "datId")
    private List<Habitos> habitosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddatosidentificacion")
    private List<Antecedenteslaborales> antecedenteslaboralesList;

    public Datosidentificacion() {
    }

    public Datosidentificacion(Integer iddatosidentificacion) {
        this.iddatosidentificacion = iddatosidentificacion;
    }

    public Integer getIddatosidentificacion() {
        return iddatosidentificacion;
    }

    public void setIddatosidentificacion(Integer iddatosidentificacion) {
        this.iddatosidentificacion = iddatosidentificacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
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

    public Boolean getIdoneo() {
        return idoneo;
    }

    public void setIdoneo(Boolean idoneo) {
        this.idoneo = idoneo;
    }

    public Boolean getAlegias1() {
        return alegias1;
    }

    public void setAlegias1(Boolean alegias1) {
        this.alegias1 = alegias1;
    }

    public String getAlergias2() {
        return alergias2;
    }

    public void setAlergias2(String alergias2) {
        this.alergias2 = alergias2;
    }

    public Boolean getUsodemedicinadiaria1() {
        return usodemedicinadiaria1;
    }

    public void setUsodemedicinadiaria1(Boolean usodemedicinadiaria1) {
        this.usodemedicinadiaria1 = usodemedicinadiaria1;
    }

    public String getUsodemedicinadiaria2() {
        return usodemedicinadiaria2;
    }

    public void setUsodemedicinadiaria2(String usodemedicinadiaria2) {
        this.usodemedicinadiaria2 = usodemedicinadiaria2;
    }

    public Boolean getPresenciaefermedadprofesionalac() {
        return presenciaefermedadprofesionalac;
    }

    public void setPresenciaefermedadprofesionalac(Boolean presenciaefermedadprofesionalac) {
        this.presenciaefermedadprofesionalac = presenciaefermedadprofesionalac;
    }

    public String getEdadprofesionalactual2() {
        return edadprofesionalactual2;
    }

    public void setEdadprofesionalactual2(String edadprofesionalactual2) {
        this.edadprofesionalactual2 = edadprofesionalactual2;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @XmlTransient
    public List<Signosvitales> getSignosvitalesList() {
        return signosvitalesList;
    }

    public void setSignosvitalesList(List<Signosvitales> signosvitalesList) {
        this.signosvitalesList = signosvitalesList;
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
    public List<Antropometria> getAntropometriaList() {
        return antropometriaList;
    }

    public void setAntropometriaList(List<Antropometria> antropometriaList) {
        this.antropometriaList = antropometriaList;
    }

    public Entidades getEntidad() {
        return entidad;
    }

    public void setEntidad(Entidades entidad) {
        this.entidad = entidad;
    }

    @XmlTransient
    public List<Examenespecifico> getExamenespecificoList() {
        return examenespecificoList;
    }

    public void setExamenespecificoList(List<Examenespecifico> examenespecificoList) {
        this.examenespecificoList = examenespecificoList;
    }

    @XmlTransient
    public List<Examenvisual> getExamenvisualList() {
        return examenvisualList;
    }

    public void setExamenvisualList(List<Examenvisual> examenvisualList) {
        this.examenvisualList = examenvisualList;
    }

    @XmlTransient
    public List<Examenfisico> getExamenfisicoList() {
        return examenfisicoList;
    }

    public void setExamenfisicoList(List<Examenfisico> examenfisicoList) {
        this.examenfisicoList = examenfisicoList;
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
        hash += (iddatosidentificacion != null ? iddatosidentificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Datosidentificacion)) {
            return false;
        }
        Datosidentificacion other = (Datosidentificacion) object;
        if ((this.iddatosidentificacion == null && other.iddatosidentificacion != null) || (this.iddatosidentificacion != null && !this.iddatosidentificacion.equals(other.iddatosidentificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Datosidentificacion[ iddatosidentificacion=" + iddatosidentificacion + " ]";
    }
    
}
