/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facades;

import entidades.Antecedentespersonales;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author emoina
 */
@Stateless
public class AntecedentespersonalesFacade extends AbstractFacade<Antecedentespersonales> implements AntecedentespersonalesFacadeLocal {
    @PersistenceContext(unitName = "HistoriaClinicaCBDMQ-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AntecedentespersonalesFacade() {
        super(Antecedentespersonales.class);
    }
    
}
