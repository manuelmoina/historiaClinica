/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facades;

import entidades.Datosidentificacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author emoina
 */
@Stateless
public class DatosidentificacionFacade extends AbstractFacade<Datosidentificacion> implements DatosidentificacionFacadeLocal {
    @PersistenceContext(unitName = "HistoriaClinicaCBDMQ-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DatosidentificacionFacade() {
        super(Datosidentificacion.class);
    }
    
}
