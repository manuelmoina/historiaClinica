/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facades;

import entidades.Examenvisual;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author emoina
 */
@Local
public interface ExamenvisualFacadeLocal {

    void create(Examenvisual examenvisual);

    void edit(Examenvisual examenvisual);

    void remove(Examenvisual examenvisual);

    Examenvisual find(Object id);

    List<Examenvisual> findAll();

    List<Examenvisual> findRange(int[] range);

    int count();
    
}
