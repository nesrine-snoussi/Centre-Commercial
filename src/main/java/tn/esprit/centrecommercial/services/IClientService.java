package tn.esprit.centrecommercial.services;


import tn.esprit.centrecommercial.entities.Categorie;
import tn.esprit.centrecommercial.entities.CentreCommercial;
import tn.esprit.centrecommercial.entities.Client;

import java.util.List;

public interface IClientService {
 List<Client> listdeClients ( Long idBoutique) ;

 Client add (Client client) ;

 void ajouterEtAffecterClietBoutique (Client client, Long idBoutique);

 List<Client> listclientsParCategorie(Categorie categorie) ;

}
