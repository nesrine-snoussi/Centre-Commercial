package tn.esprit.centrecommercial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.centrecommercial.entities.CentreCommercial;

@Repository
public interface CentreCommercialRepository extends JpaRepository<CentreCommercial, Long> {


}
