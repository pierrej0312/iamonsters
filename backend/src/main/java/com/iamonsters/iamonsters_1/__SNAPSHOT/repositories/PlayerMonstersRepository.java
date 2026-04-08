package com.iamonsters.iamonsters_1.__SNAPSHOT.repositories;

import com.iamonsters.iamonsters_1.__SNAPSHOT.entities.PlayerMonsters;
import com.iamonsters.iamonsters_1.__SNAPSHOT.entities.Players;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;

import static com.iamonsters.iamonsters_1.__SNAPSHOT.utils.ConnectionUtils.getConnection;

public class PlayerMonstersRepository {
    public Optional<PlayerMonsters> findById(Integer id){
        try (Connection conn = getConnection()){
            String query = "SELECT ims.name, pm.player_id " +
                    "FROM player_monsters pm " +
                    "INNER JOIN ia_monster_species ims ON ims.id = pm.species_id " +
                    "WHERE pm.id = ?";

            PreparedStatement pstmp = conn.prepareStatement(query);
            pstmp.setInt(1, id);
            ResultSet rs = pstmp.executeQuery();
            PlayerMonsters playerMonsters = null;
            if (rs.next()) {
                playerMonsters = convert(rs);
            }
            return Optional.ofNullable(playerMonsters);

        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public PlayerMonsters convert(ResultSet rs) throws Exception{
        String name = rs.getString("name");
        Integer playerId = rs.getInt("player_id");
        return new PlayerMonsters(name, playerId);
    }
}
