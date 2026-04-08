package com.iamonsters.iamonsters_1.__SNAPSHOT.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "regions")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    private String name;
    private String description;
    private String mapUrl;
}