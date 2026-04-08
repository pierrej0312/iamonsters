package com.iamonsters.iamonsters_1.__SNAPSHOT.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "evolutions")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Evolution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "from_species_id")
    private MonsterSpecies from;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "to_species_id")
    private MonsterSpecies to;

    private String evolutionMethod;
    private Integer requiredLevel;
    private String requiredItem;
}
