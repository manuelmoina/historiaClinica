/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facades;

import entidades.VDistributivoAcutal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author emoina
 */
@Stateless
public class VDistributivoAcutalFacade extends AbstractFacade<VDistributivoAcutal> implements VDistributivoAcutalFacadeLocal {
    @PersistenceContext(unitName = "HistoriaClinicaCBDMQ-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VDistributivoAcutalFacade() {
        super(VDistributivoAcutal.class);
    }

    @Override
    public VDistributivoAcutal getDistributivo(String cedula) {
        try {
            return (VDistributivoAcutal)em.createQuery("Select d from VDistributivoAcutal d where d.cedula=:cedula")
                    .setParameter("cedula", cedula)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println("Error al buscar distributivo: "+e.getMessage());
            return null;
        }
    }
    
}
