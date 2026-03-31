package com.iamonsters.iamonsters_1.__SNAPSHOT.controller; // Vérifie bien ton package

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TableController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 1. Garde celui-ci pour avoir la liste des noms (ton JSON actuel)
    @GetMapping("/tables")
    public List<Map<String, Object>> getTableNames() {
        String sql = "SELECT table_name FROM information_schema.tables " +
                "WHERE table_schema = 'public' AND table_type = 'BASE TABLE'";
        return jdbcTemplate.queryForList(sql);
    }

    // 2. Ajoute celui-ci pour voir le CONTENU d'une table spécifique
    // Exemple : http://localhost:8080/api/tables/players
    @GetMapping("/tables/{tableName}")
    public List<Map<String, Object>> getTableData(@PathVariable String tableName) {
        // Sécurité : On vérifie que le nom de la table ne contient que des lettres/chiffres/underscore
        if (!tableName.matches("^[a-zA-Z0-9_]+$")) {
            throw new IllegalArgumentException("Nom de table invalide");
        }

        String sql = "SELECT * FROM " + tableName;
        return jdbcTemplate.queryForList(sql);
    }
}
