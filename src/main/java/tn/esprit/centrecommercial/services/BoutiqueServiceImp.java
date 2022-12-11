package tn.esprit.centrecommercial.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.centrecommercial.entities.Boutique;

import tn.esprit.centrecommercial.entities.Client;
import tn.esprit.centrecommercial.repositories.BoutiqueRepository;
import tn.esprit.centrecommercial.repositories.CentreCommercialRepository;
import tn.esprit.centrecommercial.repositories.ClientRepository;

import java.util.List;

@Service
public class BoutiqueServiceImp implements IBoutiqueService {

    @Autowired
    BoutiqueRepository boutiqueRepository;

    @Autowired
    CentreCommercialRepository centreRepository ;

    @Autowired
    ClientRepository clientRepository;
    @Override
    public void ajouBoutique(Boutique boutique) {
        boutiqueRepository.save(boutique);

    }

//    @Override
//    public void ajouterEtAffecterListClient(Long idClient, List<Long> idBoutique) {
//
//    }

//    @Override
//    public void ajouterEtaffecterListClient(List<Client> lc, Long idBoutique) {
//        Boutique boutique = boutiqueRepository.findById(idBoutique).orElse(null) ;
//        for (Client client : lc) {
//
//            client.getBoutiqueList().add(boutique);
//
//           clientRepository.save(client);
//       }
//    }

//    @Override
//    public void ajouterEtaffecterListClient(List<Client> lc, Long idBoutique) {
//        Boutique boutique = boutiqueRepository.findById(idBoutique).orElse(null) ;
//        for (Client client : lc) {
//
//            client.setBoutique(boutique)
//            clientRepository.save(client);
//        }
//    }
}
