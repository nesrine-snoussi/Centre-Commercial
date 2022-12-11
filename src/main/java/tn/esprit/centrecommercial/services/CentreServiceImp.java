package tn.esprit.centrecommercial.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.centrecommercial.entities.Boutique;
import tn.esprit.centrecommercial.entities.CentreCommercial;
import tn.esprit.centrecommercial.repositories.BoutiqueRepository;
import tn.esprit.centrecommercial.repositories.CentreCommercialRepository;


import java.util.ArrayList;
import java.util.List;

@Service
public class CentreServiceImp implements ICentreService{

    @Autowired
    CentreCommercialRepository centreRepository ;

    @Autowired
    BoutiqueRepository boutiqueRepository ;

    @Override
    public void ajouCentre(CentreCommercial centre) {
        centreRepository.save(centre);

    }

    @Override
    public void ajouterEtaffecterBoutiqueToCentre(List<Boutique> lb, Long idCentre) {
        CentreCommercial centre = centreRepository.findById(idCentre).orElse(null) ;
        for (Boutique boutique : lb ) {
            boutique.setCentreCommercial(centre);
            boutiqueRepository.save(boutique);
        }
    }


}









