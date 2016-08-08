/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facades;

import entidades.Exposicionesimportantes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author emoina
 */
@Local
public interface ExposicionesimportantesFacadeLocal {

    void create(Exposicionesimportantes exposicionesimportantes);

    void edit(Exposicionesimportantes exposicionesimportantes);

    void remove(Exposicionesimportantes exposicionesimportantes);

    Exposicionesimportantes find(Object id);

    List<Exposicionesimportantes> findAll();

    List<Exposicionesimportantes> findRange(int[] range);

    int count();
    
}
