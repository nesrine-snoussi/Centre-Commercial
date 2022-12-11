package tn.esprit.centrecommercial.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.centrecommercial.entities.Client;
import tn.esprit.centrecommercial.services.IClientService;

import java.util.List;

@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    IClientService clientService ;

    @GetMapping("listeDesClients/{idBoutique}")
    List<Client> listeDesClients (@PathVariable Long idBoutique ) {
      return clientService.listdeClients(idBoutique)  ;
    }

    @PostMapping("ajou-client-boutique/{idBoutique}")
    public void ajouterEtAffecterClietBoutique(@RequestBody Client client , @PathVariable Long idBoutique) {
         clientService.ajouterEtAffecterClietBoutique(client, idBoutique)  ;
    }
}
