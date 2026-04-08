package com.iamonsters.iamonsters_1.__SNAPSHOT.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "player_badges")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerBadge {

    @EmbeddedId
    private PlayerBadgeId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("playerId")
    private Player player;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("badgeId")
    private Badge badge;

    private LocalDateTime earnedAt;

    @Embeddable
    @Data
    public static class PlayerBadgeId implements Serializable {
        private Integer playerId;
        private Integer badgeId;
    }
}
