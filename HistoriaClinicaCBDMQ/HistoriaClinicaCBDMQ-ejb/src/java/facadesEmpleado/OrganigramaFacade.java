/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facadesEmpleado;

import entidades.Organigrama;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author emoina
 */
@Stateless
public class OrganigramaFacade extends AbstractFacade<Organigrama> implements OrganigramaFacadeLocal {
    @PersistenceContext(unitName = "HistoriaClinicaCBDMQ-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrganigramaFacade() {
        super(Organigrama.class);
    }
    
}
