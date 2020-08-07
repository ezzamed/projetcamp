package org.sid.campagnevac.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor @ToString

public class Moughataa {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(length = 75)
    private String moughataaname;
    @OneToMany(mappedBy = "moughataa")
    private Collection<Enquete> enquetes;
    @ManyToOne
    private Wilaya wilaya;
    @OneToMany(mappedBy = "moughataa")
    private Collection<Vaccination> vaccinations;
}
