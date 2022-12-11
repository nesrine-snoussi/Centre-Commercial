package tn.esprit.centrecommercial.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CentreCommercial implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCentre;

    private String nom ;
    private String adresse ;
    private String password ;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "centreCommercial")
    List<Boutique> boutiques ;



}
