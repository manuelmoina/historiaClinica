/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facades;

import entidades.Datosidentificacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author emoina
 */
@Local
public interface DatosidentificacionFacadeLocal {

    void create(Datosidentificacion datosidentificacion);

    void edit(Datosidentificacion datosidentificacion);

    void remove(Datosidentificacion datosidentificacion);

    Datosidentificacion find(Object id);

    List<Datosidentificacion> findAll();

    List<Datosidentificacion> findRange(int[] range);

    int count();
    
}
