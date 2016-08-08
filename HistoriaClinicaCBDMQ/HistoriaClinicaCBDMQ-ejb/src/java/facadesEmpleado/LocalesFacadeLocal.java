/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facadesEmpleado;

import entidades.Locales;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author emoina
 */
@Local
public interface LocalesFacadeLocal {

    void create(Locales locales);

    void edit(Locales locales);

    void remove(Locales locales);

    Locales find(Object id);

    List<Locales> findAll();

    List<Locales> findRange(int[] range);

    int count();
    
}
