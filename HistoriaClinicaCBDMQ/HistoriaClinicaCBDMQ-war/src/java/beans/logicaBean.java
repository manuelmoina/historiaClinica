/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import entidades.Antecedentespersonales;
import entidades.Antropometria;
import entidades.Datosidentificacion;
import entidades.Empleado;
import entidades.Entidades;
import entidades.Examenfisico;
import entidades.Examenvisual;
import entidades.Habitos;
import entidades.Signosvitales;
import entidades.VDistributivoAcutal;
import facades.EmpleadoFacadeLocal;
import facades.EntidadesFacadeLocal;
import facades.VDistributivoAcutalFacadeLocal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author emoina
 */
@ManagedBean
@SessionScoped
public class logicaBean {
    @EJB
    private VDistributivoAcutalFacadeLocal vDistributivoAcutalFacade;
    @EJB
    private EmpleadoFacadeLocal empleadoFacade;
    @EJB
    private EntidadesFacadeLocal entidadesFacade;
    
    private String edad ;
    private String sexo ="";

    private Datosidentificacion datosActual;
    private String cedula;
    private Date fechaActual;
    private String cargo;
    private String area;
    
    private Antecedentespersonales ap ;
    private Signosvitales sv ;
    private Habitos habitos;
    private Antropometria antropometría;
    private Examenfisico ef;
    private Examenvisual ev;

    public Antropometria getAntropometría() {
       /* 
        * Modigicado prueba calculo percentil (peso/altura^2)*1000
        if(antropometría == null){
            antropometría.setIddatosidentificacion(datosActual);
        }*/
        return antropometría;
    }

    public void setAntropometría(Antropometria antropometría) {
        this.antropometría = antropometría;
    }
    
    

    public Habitos getHabitos() {
        if(habitos == null){
            habitos = new Habitos();
            habitos.setDatId(datosActual);
            
        }
        return habitos;
    }

    public void setHabitos(Habitos habitos) {
        this.habitos = habitos;
    }
    

    public Antecedentespersonales getAp() {
        if(ap == null){
            ap = new Antecedentespersonales();
            ap.setIddatosidentificacion(datosActual);
            
        }
        return ap;
    }

    public void setAp(Antecedentespersonales ap) {
        this.ap = ap;
    }

    public Signosvitales getSv() {
        return sv;
    }

    public void setSv(Signosvitales sv) {
        this.sv = sv;
    }

    public Examenfisico getEf() {
        return ef;
    }

    public void setEf(Examenfisico ef) {
        this.ef = ef;
    }

    public Examenvisual getEv() {
        return ev;
    }

    public void setEv(Examenvisual ev) {
        this.ev = ev;
    }
    
    

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    

    public Date getFechaActual() {
        if(fechaActual==null){
            fechaActual = new Date();
        }
        return fechaActual;
    }

    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;
    }
    
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Datosidentificacion getDatosActual() {
        if(datosActual== null){
            datosActual = new Datosidentificacion();
            datosActual.setEntidad(new Entidades());
        }
        return datosActual;
    }

    public void setDatosActual(Datosidentificacion datosActual) {
        this.datosActual = datosActual;
    }
    
    public logicaBean() {
    }
    
    public String  autentificacion(){
    
        return "";
    }
    public String logout(){
    
        return "";
    }
    
    public void buscarPersonal(String cedula){
        
        Entidades entidad = entidadesFacade.getEntidades(cedula);
        if(entidad != null){
            datosActual.setFecha(new Date());
            datosActual.setEntidad(entidad);
            VDistributivoAcutal distributivo = vDistributivoAcutalFacade.getDistributivo(cedula);
            Empleado empleado = empleadoFacade.getEmpleado(cedula);
            if(empleado != null)
                cargo = empleado.getCargo().getNombre();
            if(distributivo != null)
                area = distributivo.getUbicacion();
                
            Date n1 = datosActual.getEntidad().getFecha();
            Calendar cl1 = Calendar.getInstance();
            Calendar cl2 = Calendar.getInstance();
            cl1.setTime(n1);
            cl2.setTime(new Date());
            
            int anios = cl2.get(Calendar.YEAR) - cl1.get(Calendar.YEAR);
            int mes = cl2.get(Calendar.MONTH) - cl1.get(Calendar.MONTH);
            int dias = cl2.get(Calendar.DAY_OF_YEAR) - cl1.get(Calendar.DAY_OF_YEAR);
            if(dias < 0){
                anios-=1;
            mes =-1;
            dias+=cl1.get(Calendar.DAY_OF_MONTH)-1;
            }
            if(mes<0)
                mes+=12;
                        
            edad = anios+" años, "+mes+" meses, "+dias+" dias";
            if(datosActual.getEntidad().getSexo()){
                sexo = "Masculino";
            }
            if(!datosActual.getEntidad().getSexo()){
                sexo = "Femenino";
            }
            System.out.println("entidad encontrada: "+datosActual.getEntidad().getApellidos());
        }else{
            System.out.println("entidad No se encontrada");
            datosActual = new Datosidentificacion();
            datosActual.setEntidad(new Entidades());
            edad = "";
            sexo = "";
        }
        
        
        
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    
    
    
}
