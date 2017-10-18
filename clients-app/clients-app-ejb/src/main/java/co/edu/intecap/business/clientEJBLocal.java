/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.business;

import co.edu.intecap.model.Client;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Capacitaciones_pc32
 */
@Local
public interface clientEJBLocal {
    void createNewClient(Client c);
    
    List<Client> getAlLClients();
    
    void removeClient(Client c);
    
    
    
    
}
