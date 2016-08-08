/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "v_distributivo_acutal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VDistributivoAcutal.findAll", query = "SELECT v FROM VDistributivoAcutal v"),
    @NamedQuery(name = "VDistributivoAcutal.findByMes", query = "SELECT v FROM VDistributivoAcutal v WHERE v.mes = :mes"),
    @NamedQuery(name = "VDistributivoAcutal.findByAnio", query = "SELECT v FROM VDistributivoAcutal v WHERE v.anio = :anio"),
    @NamedQuery(name = "VDistributivoAcutal.findByCodigo", query = "SELECT v FROM VDistributivoAcutal v WHERE v.codigo = :codigo"),
    @NamedQuery(name = "VDistributivoAcutal.findByPersona", query = "SELECT v FROM VDistributivoAcutal v WHERE v.persona = :persona"),
    @NamedQuery(name = "VDistributivoAcutal.findByCedula", query = "SELECT v FROM VDistributivoAcutal v WHERE v.cedula = :cedula"),
    @NamedQuery(name = "VDistributivoAcutal.findByUbicacion", query = "SELECT v FROM VDistributivoAcutal v WHERE v.ubicacion = :ubicacion"),
    @NamedQuery(name = "VDistributivoAcutal.findBySuperior", query = "SELECT v FROM VDistributivoAcutal v WHERE v.superior = :superior"),
    @NamedQuery(name = "VDistributivoAcutal.findByAuxiliar", query = "SELECT v FROM VDistributivoAcutal v WHERE v.auxiliar = :auxiliar")})
public class VDistributivoAcutal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "mes")
    private Integer mes;
    @Column(name = "anio")
    private Integer anio;
    @Size(max = 2147483647)
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 2147483647)
    @Column(name = "persona")
    private String persona;
    @Size(max = 2147483647)
    @Column(name = "cedula")
    @Id
    private String cedula;
    @Size(max = 2147483647)
    @Column(name = "ubicacion")
    private String ubicacion;
    @Size(max = 2147483647)
    @Column(name = "superior")
    private String superior;
    @Size(max = 2147483647)
    @Column(name = "auxiliar")
    private String auxiliar;

    public VDistributivoAcutal() {
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getSuperior() {
        return superior;
    }

    public void setSuperior(String superior) {
        this.superior = superior;
    }

    public String getAuxiliar() {
        return auxiliar;
    }

    public void setAuxiliar(String auxiliar) {
        this.auxiliar = auxiliar;
    }
    
}
