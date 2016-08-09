/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facades;

import entidades.Empleado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author emoina
 */
@Stateless
public class EmpleadoFacade extends AbstractFacade<Empleado> implements EmpleadoFacadeLocal {
    @PersistenceContext(unitName = "HistoriaClinicaCBDMQ-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmpleadoFacade() {
        super(Empleado.class);
    }

    @Override
    public Empleado getEmpleado(String cedula) {
        try {
            return (Empleado) em.createQuery("Select e from Empleado e where e.entidad.pin=:cedula")
                    .setParameter("cedula", cedula)
                    .getSingleResult();
                    
        } catch (Exception e) {
            System.out.println("Error al buscar empleado: "+e.getMessage());
            return null;
        }
    }
    
}
