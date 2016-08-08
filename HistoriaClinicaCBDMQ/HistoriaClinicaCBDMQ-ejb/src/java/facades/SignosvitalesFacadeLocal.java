/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facades;

import entidades.Signosvitales;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author emoina
 */
@Local
public interface SignosvitalesFacadeLocal {

    void create(Signosvitales signosvitales);

    void edit(Signosvitales signosvitales);

    void remove(Signosvitales signosvitales);

    Signosvitales find(Object id);

    List<Signosvitales> findAll();

    List<Signosvitales> findRange(int[] range);

    int count();
    
}
