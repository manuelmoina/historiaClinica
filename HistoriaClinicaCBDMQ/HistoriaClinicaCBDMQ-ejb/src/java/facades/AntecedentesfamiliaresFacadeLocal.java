/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facades;

import entidades.Antecedentesfamiliares;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author emoina
 */
@Local
public interface AntecedentesfamiliaresFacadeLocal {

    void create(Antecedentesfamiliares antecedentesfamiliares);

    void edit(Antecedentesfamiliares antecedentesfamiliares);

    void remove(Antecedentesfamiliares antecedentesfamiliares);

    Antecedentesfamiliares find(Object id);

    List<Antecedentesfamiliares> findAll();

    List<Antecedentesfamiliares> findRange(int[] range);

    int count();
    
}
