package tn.esprit.centrecommercial.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient ;
    private String nom ;

    @Enumerated(EnumType.STRING)
    private Genre genre ;

    @ManyToMany (cascade = CascadeType.ALL , mappedBy = "clients" )
            @JsonIgnore
    List<Boutique> boutiqueList;
}
