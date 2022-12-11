package tn.esprit.centrecommercial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.centrecommercial.entities.Categorie;
import tn.esprit.centrecommercial.entities.Client;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findClientsByBoutiqueList(Long idBoutique) ;


}
