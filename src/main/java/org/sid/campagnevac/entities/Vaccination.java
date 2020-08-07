package org.sid.campagnevac.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Vaccination implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date_vaccination;
    private double longiude,latitude;
    private Integer nombre;
    @ManyToOne
    private Campagne campagne;
    @OneToMany(mappedBy = "vaccination")
    private Collection<Enfant> enfants;
    @ManyToOne
    private Moughataa moughataa;
    @ManyToOne
    private AppUser user;
}

