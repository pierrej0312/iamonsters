package com.iamonsters.iamonsters_1.__SNAPSHOT.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "type_effectiveness")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeEffectiveness {

    @EmbeddedId
    private Id id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("attackerTypeId")
    private Type attackerType;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("defenderTypeId")
    private Type defenderType;

    private BigDecimal multiplier;

    @Embeddable
    @Data
    public static class Id implements Serializable {
        private Integer attackerTypeId;
        private Integer defenderTypeId;
    }
}
