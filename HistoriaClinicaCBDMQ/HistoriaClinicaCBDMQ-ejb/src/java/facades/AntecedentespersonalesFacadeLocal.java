/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facades;

import entidades.Antecedentespersonales;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author emoina
 */
@Local
public interface AntecedentespersonalesFacadeLocal {

    void create(Antecedentespersonales antecedentespersonales);

    void edit(Antecedentespersonales antecedentespersonales);

    void remove(Antecedentespersonales antecedentespersonales);

    Antecedentespersonales find(Object id);

    List<Antecedentespersonales> findAll();

    List<Antecedentespersonales> findRange(int[] range);

    int count();
    
}
