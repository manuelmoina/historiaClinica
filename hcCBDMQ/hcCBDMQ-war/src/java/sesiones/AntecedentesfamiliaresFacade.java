/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sesiones;

import entidades.Antecedentesfamiliares;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author emoina
 */
@Stateless
public class AntecedentesfamiliaresFacade extends AbstractFacade<Antecedentesfamiliares> {
    @PersistenceContext(unitName = "hcCBDMQ-warPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AntecedentesfamiliaresFacade() {
        super(Antecedentesfamiliares.class);
    }
    
}
