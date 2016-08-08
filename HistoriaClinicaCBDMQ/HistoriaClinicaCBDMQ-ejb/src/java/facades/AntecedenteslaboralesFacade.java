/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facades;

import entidades.Antecedenteslaborales;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author emoina
 */
@Stateless
public class AntecedenteslaboralesFacade extends AbstractFacade<Antecedenteslaborales> implements AntecedenteslaboralesFacadeLocal {
    @PersistenceContext(unitName = "HistoriaClinicaCBDMQ-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AntecedenteslaboralesFacade() {
        super(Antecedenteslaborales.class);
    }
    
}
