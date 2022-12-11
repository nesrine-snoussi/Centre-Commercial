package tn.esprit.centrecommercial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.centrecommercial.entities.Boutique;

@Repository
public interface BoutiqueRepository extends JpaRepository<Boutique , Long> {
}
