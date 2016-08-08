/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facades;

import entidades.Tipoantecedentes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author emoina
 */
@Local
public interface TipoantecedentesFacadeLocal {

    void create(Tipoantecedentes tipoantecedentes);

    void edit(Tipoantecedentes tipoantecedentes);

    void remove(Tipoantecedentes tipoantecedentes);

    Tipoantecedentes find(Object id);

    List<Tipoantecedentes> findAll();

    List<Tipoantecedentes> findRange(int[] range);

    int count();
    
}
