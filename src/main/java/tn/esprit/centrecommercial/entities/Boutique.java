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
public class Boutique implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBoutique ;

    private String nom ;

    @Enumerated(EnumType.STRING)
    private Categorie categorie;

    @ManyToOne
    CentreCommercial centreCommercial ;

    @ManyToMany (cascade = CascadeType.ALL )
    List<Client> clients ;

}
