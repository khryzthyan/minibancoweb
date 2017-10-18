/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.mb;

import co.edu.intecap.model.Client;
import java.awt.event.ActionEvent;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Capacitaciones_pc32
 */
@Named(value = "clientsMB")
@SessionScoped
public class ClientsMB implements Serializable {

    @EJB
    private co.edu.intecap.business.ClientEJBLocal clientEJB;
    
    private List<Client> clients;
    
    private Client newClient;

  

    public ClientsMB() {
        newClient = new Client();
    }

    public List<Client> getClients() {
        this.clients = clientEJB.getAlLClients();
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
    
      public Client getNewClient() {
        return newClient;
    }

    public void setNewClient(Client newClient) {
        this.newClient = newClient;
    }
    
    
    public void addClient(ActionEvent event){
        clientEJB.createNewClient(newClient);
    }
    
}
