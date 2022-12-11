package tn.esprit.centrecommercial.services;

import tn.esprit.centrecommercial.entities.Boutique;
import tn.esprit.centrecommercial.entities.CentreCommercial;

import java.util.ArrayList;
import java.util.List;

public interface ICentreService {
    void ajouCentre(CentreCommercial centre) ;

    void ajouterEtaffecterBoutiqueToCentre(List<Boutique> lb  , Long idCentre) ;
}
