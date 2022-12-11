package tn.esprit.centrecommercial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.centrecommercial.entities.Boutique;
import tn.esprit.centrecommercial.entities.Client;
import tn.esprit.centrecommercial.services.IBoutiqueService;

import java.util.List;

@RestController
@RequestMapping("boutique")
public class BoutiqueController {
    @Autowired
    IBoutiqueService boutiqueService;

    @PostMapping("/ajouBoutique")

    void ajouBoutique (@RequestBody Boutique boutique) {
        boutiqueService.ajouBoutique(boutique);
    }


    @PostMapping ("/ajouter-client-boutique/{idBoutique}")
    void ajouterEtaffecterListeClient(@RequestBody List<Client> lc, @PathVariable Long idBoutique) {
        boutiqueService.ajouterEtaffecterListClient(lc, idBoutique);

    }
}
