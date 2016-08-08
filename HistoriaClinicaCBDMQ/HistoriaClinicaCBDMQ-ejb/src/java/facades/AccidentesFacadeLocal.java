/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facades;

import entidades.Accidentes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author emoina
 */
@Local
public interface AccidentesFacadeLocal {

    void create(Accidentes accidentes);

    void edit(Accidentes accidentes);

    void remove(Accidentes accidentes);

    Accidentes find(Object id);

    List<Accidentes> findAll();

    List<Accidentes> findRange(int[] range);

    int count();
    
}
