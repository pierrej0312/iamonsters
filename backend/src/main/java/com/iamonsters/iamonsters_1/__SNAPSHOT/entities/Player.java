package com.iamonsters.iamonsters_1.__SNAPSHOT.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "players")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    private String username;
    private String gender;

    private Integer badgeCount;
    private Integer money;
    private Integer playtimeSeconds;

    private String avatarUrl;
    private String currentLocation;

    private LocalDateTime createdAt;
    private LocalDateTime lastLogin;

    private String rivalName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "starter_species_id")
    private MonsterSpecies starterSpecies;

    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<PlayerMonster> monsters;
}