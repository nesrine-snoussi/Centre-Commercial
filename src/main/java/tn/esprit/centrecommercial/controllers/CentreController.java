package tn.esprit.centrecommercial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.centrecommercial.entities.Boutique;
import tn.esprit.centrecommercial.entities.CentreCommercial;
import tn.esprit.centrecommercial.services.ICentreService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("centre")
public class CentreController {

    @Autowired
    ICentreService centreService ;

    @PostMapping("/ajouCentre")
    void ajouCentre (@RequestBody CentreCommercial centre ) {
        centreService.ajouCentre(centre);

    }

    @PostMapping("/add-boutique-cnetre/{idCentre}")
    void ajouBoutiqueCentre (@RequestBody List<Boutique> lb , @PathVariable Long idCentre) {
        centreService.ajouterEtaffecterBoutiqueToCentre(lb , idCentre);

    }

//    @PostMapping("/add-contrats/{id-etudiant}")
//    public void ajouterEtaffecterListeContrats(@RequestBody List<Contrat> lc, @PathVariable("id-etudiant") Long idEtudiant){
//        etudiantService.addEtudiantContrats(lc, idEtudiant);
//    }


}
