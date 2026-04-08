package com.iamonsters.iamonsters_1.__SNAPSHOT.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "ia_monster_species")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class MonsterSpecies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type1_id")
    private Type type1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type2_id")
    private Type type2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rarity_id")
    private Rarity rarity;

    @OneToMany(mappedBy = "species")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<SpeciesAbility> abilities;

    @OneToMany(mappedBy = "species")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<SpeciesLearnset> learnset;

    private Integer baseHp;
    private Integer baseAttack;
    private Integer baseDefense;
    private Integer baseSpAttack;
    private Integer baseSpDefense;
    private Integer baseSpeed;

    private String frontSpriteUrl;
    private String backSpriteUrl;
    private String iconSpriteUrl;

    private String description;

    private BigDecimal heightM;
    private BigDecimal weightKg;

    private Integer catchRate;
    private Integer baseExperience;

    private Boolean isLegendary;
    private Boolean isMythical;

    @OneToMany(mappedBy = "species")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<PlayerMonster> playerMonsters;
}