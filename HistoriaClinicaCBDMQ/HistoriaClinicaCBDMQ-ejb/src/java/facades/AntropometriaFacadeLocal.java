/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facades;

import entidades.Antropometria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author emoina
 */
@Local
public interface AntropometriaFacadeLocal {

    void create(Antropometria antropometria);

    void edit(Antropometria antropometria);

    void remove(Antropometria antropometria);

    Antropometria find(Object id);

    List<Antropometria> findAll();

    List<Antropometria> findRange(int[] range);

    int count();
    
}
