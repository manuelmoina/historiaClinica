/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facades;

import entidades.VDistributivoAcutal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author emoina
 */
@Local
public interface VDistributivoAcutalFacadeLocal {

    void create(VDistributivoAcutal vDistributivoAcutal);

    void edit(VDistributivoAcutal vDistributivoAcutal);

    void remove(VDistributivoAcutal vDistributivoAcutal);

    VDistributivoAcutal find(Object id);

    List<VDistributivoAcutal> findAll();

    List<VDistributivoAcutal> findRange(int[] range);

    int count();
    
    public VDistributivoAcutal getDistributivo (String cedula);

}
