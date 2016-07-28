/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sesiones;

import entidades.Exposicionesimportantes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author emoina
 */
@Stateless
public class ExposicionesimportantesFacade extends AbstractFacade<Exposicionesimportantes> {
    @PersistenceContext(unitName = "hcCBDMQ-warPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ExposicionesimportantesFacade() {
        super(Exposicionesimportantes.class);
    }
    
}
