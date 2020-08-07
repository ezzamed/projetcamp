package org.sid.campagnevac.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Enfant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int tranche_age;
    @ManyToOne
    private Vaccination vaccination;
}
