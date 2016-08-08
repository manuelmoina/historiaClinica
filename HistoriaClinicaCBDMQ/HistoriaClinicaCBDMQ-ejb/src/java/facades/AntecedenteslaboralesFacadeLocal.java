/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facades;

import entidades.Antecedenteslaborales;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author emoina
 */
@Local
public interface AntecedenteslaboralesFacadeLocal {

    void create(Antecedenteslaborales antecedenteslaborales);

    void edit(Antecedenteslaborales antecedenteslaborales);

    void remove(Antecedenteslaborales antecedenteslaborales);

    Antecedenteslaborales find(Object id);

    List<Antecedenteslaborales> findAll();

    List<Antecedenteslaborales> findRange(int[] range);

    int count();
    
}
