/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facades;

import entidades.Organigrama;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author emoina
 */
@Local
public interface OrganigramaFacadeLocal {

    void create(Organigrama organigrama);

    void edit(Organigrama organigrama);

    void remove(Organigrama organigrama);

    Organigrama find(Object id);

    List<Organigrama> findAll();

    List<Organigrama> findRange(int[] range);

    int count();
    
}
