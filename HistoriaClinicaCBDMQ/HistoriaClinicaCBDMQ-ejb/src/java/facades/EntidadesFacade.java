/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facades;

import entidades.Entidades;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author emoina
 */
@Stateless
public class EntidadesFacade extends AbstractFacade<Entidades> implements EntidadesFacadeLocal {
    @PersistenceContext(unitName = "HistoriaClinicaCBDMQ-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EntidadesFacade() {
        super(Entidades.class);
    }

    @Override
    public Entidades getEntidades(String cedula) {
        try {
            return (Entidades)em.createQuery("Select e from Entidades e where e.pin =:cedula")
                    .setParameter("cedula", cedula)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println("Error al buscar empleado: "+e.getMessage());
            return null;
        }
    }
    
}
