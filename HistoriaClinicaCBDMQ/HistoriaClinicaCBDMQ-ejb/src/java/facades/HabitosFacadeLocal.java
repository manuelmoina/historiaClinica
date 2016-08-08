/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facades;

import entidades.Habitos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author emoina
 */
@Local
public interface HabitosFacadeLocal {

    void create(Habitos habitos);

    void edit(Habitos habitos);

    void remove(Habitos habitos);

    Habitos find(Object id);

    List<Habitos> findAll();

    List<Habitos> findRange(int[] range);

    int count();
    
}
