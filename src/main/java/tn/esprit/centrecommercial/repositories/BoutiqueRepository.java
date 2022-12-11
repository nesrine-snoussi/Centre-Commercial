package tn.esprit.centrecommercial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.centrecommercial.entities.Boutique;
import tn.esprit.centrecommercial.entities.Categorie;
import tn.esprit.centrecommercial.entities.Client;

import java.util.List;

@Repository
public interface BoutiqueRepository extends JpaRepository<Boutique , Long> {
 List<Boutique> findBoutiqueByCategorie (Categorie categorie) ;

}
