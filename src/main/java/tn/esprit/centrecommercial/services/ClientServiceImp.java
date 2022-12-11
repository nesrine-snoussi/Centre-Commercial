package tn.esprit.centrecommercial.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.centrecommercial.entities.Boutique;
import tn.esprit.centrecommercial.entities.CentreCommercial;
import tn.esprit.centrecommercial.entities.Client;
import tn.esprit.centrecommercial.repositories.BoutiqueRepository;
import tn.esprit.centrecommercial.repositories.ClientRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientServiceImp implements IClientService{
    @Autowired
    ClientRepository clientRepository ;
    @Autowired
    BoutiqueRepository boutiqueRepository ;


    @Override
    public List<Client> listdeClients(Long idBoutique) {
        return clientRepository.findClientsByBoutiqueList(idBoutique);
    }

    @Override
    public Client add(Client client) {
        return clientRepository.save(client) ;
    }

    @Override
    public void ajouterEtAffecterClietBoutique(Client client, Long idBoutique) {

      Boutique boutique =  boutiqueRepository.findById(idBoutique).orElse(null) ;
       if (boutique != null) {
           Client cl = this.add(client) ;
           List<Client> clients = new ArrayList<Client>();
           clients.add(cl) ;

           boutique.setClients(clients);

           boutiqueRepository.save(boutique) ;


       }

    }
}
