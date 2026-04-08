package com.iamonsters.iamonsters_1.__SNAPSHOT.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "player_monsters")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PlayerMonster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Player player;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "species_id")
    private MonsterSpecies species;

    private String nickname;
    private Integer level;
    private Integer currentHp;
    private Integer experience;

    @Embedded
    private IV iv;

    @Embedded
    private EV ev;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nature_id")
    private Nature nature;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ability_id")
    private Ability ability;

    private Boolean isShiny;
    private Integer friendship;
    private String statusCondition;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "original_trainer_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Player originalTrainer;

    private LocalDateTime caughtAt;
    private String caughtLocation;

    private Boolean inTeam;
    private Integer teamSlot;
    private Integer pcBox;
    private Integer pcSlot;

    @OneToMany(mappedBy = "playerMonster", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<PlayerMonsterMove> moves;

    // ===== IV =====
    @Embeddable
    @Data
    public static class IV {
        private Integer ivHp;
        private Integer ivAttack;
        private Integer ivDefense;
        private Integer ivSpAttack;
        private Integer ivSpDefense;
        private Integer ivSpeed;
    }

    // ===== EV =====
    @Embeddable
    @Data
    public static class EV {
        private Integer evHp;
        private Integer evAttack;
        private Integer evDefense;
        private Integer evSpAttack;
        private Integer evSpDefense;
        private Integer evSpeed;
    }
}