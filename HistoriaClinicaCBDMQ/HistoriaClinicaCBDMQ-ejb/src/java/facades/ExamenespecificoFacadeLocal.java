/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facades;

import entidades.Examenespecifico;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author emoina
 */
@Local
public interface ExamenespecificoFacadeLocal {

    void create(Examenespecifico examenespecifico);

    void edit(Examenespecifico examenespecifico);

    void remove(Examenespecifico examenespecifico);

    Examenespecifico find(Object id);

    List<Examenespecifico> findAll();

    List<Examenespecifico> findRange(int[] range);

    int count();
    
}
