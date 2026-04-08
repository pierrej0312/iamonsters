package com.iamonsters.iamonsters_1.__SNAPSHOT.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "player_monster_moves")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PlayerMonsterMove {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_monster_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PlayerMonster playerMonster;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "move_id")
    private Move move;

    private Integer slot;
    private Integer currentPp;
}