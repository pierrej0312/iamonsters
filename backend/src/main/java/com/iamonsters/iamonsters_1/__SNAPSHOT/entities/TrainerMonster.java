package com.iamonsters.iamonsters_1.__SNAPSHOT.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "trainer_monsters")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class TrainerMonster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trainer_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Trainer trainer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "species_id")
    private MonsterSpecies species;

    private Integer level;
    private Integer currentHp;
    private Integer experience;

    @Embedded
    private PlayerMonster.IV iv;

    @Embedded
    private PlayerMonster.EV ev;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nature_id")
    private Nature nature;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ability_id")
    private Ability ability;

    private Boolean isShiny;
    private Integer teamSlot;

    @OneToMany(mappedBy = "trainerMonster", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<TrainerMonsterMove> moves;
}