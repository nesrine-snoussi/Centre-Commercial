package tn.esprit.centrecommercial.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.centrecommercial.entities.CentreCommercial;
import tn.esprit.centrecommercial.repositories.ClientRepository;

@Service
public class ClientServiceImp implements IClientService{
    @Autowired
    ClientRepository clientRepository ;


}
