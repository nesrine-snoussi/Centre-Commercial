package tn.esprit.centrecommercial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.centrecommercial.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
