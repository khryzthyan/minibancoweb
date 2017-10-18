/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.business;

import co.edu.intecap.model.Client;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Capacitaciones_pc32
 */
@Stateless
public class clientEJB implements clientEJBLocal {
    
    @PersistenceContext(unitName = "clients-pu")
    private EntityManager em;

    @Override
    public void createNewClient(Client c) {
        em.persist(c);
       
    }

    @Override
    public List<Client> getAlLClients() {
        Query q = em.createNamedQuery("Client.findAll");
        return q.getResultList();
        
    }

    @Override
    public void removeClient(Client c) {
        em.remove(c);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
