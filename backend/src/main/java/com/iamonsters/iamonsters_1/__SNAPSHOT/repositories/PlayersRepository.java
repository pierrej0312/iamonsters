package com.iamonsters.iamonsters_1.__SNAPSHOT.repositories;

import com.iamonsters.iamonsters_1.__SNAPSHOT.entities.Players;
import org.jspecify.annotations.NonNull;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import static com.iamonsters.iamonsters_1.__SNAPSHOT.utils.ConnectionUtils.getConnection;

public class PlayersRepository {

    public List<Players> findPlayerByIdAndUsername() {
        System.out.println( "Enter the id and the username of the player you want to retrieve : ");

        try (Connection connection = getConnection()){

            String query = "SELECT * FROM players where id = ? and username = ?";

            PreparedStatement pstmp = connection.prepareStatement(query);

            pstmp.setInt(1, new Scanner(System.in).nextInt());
            pstmp.setString(2, new Scanner(System.in).nextLine());

            ResultSet rs = pstmp.executeQuery();

            List<Players> players = new ArrayList<>();

            while (rs.next()) {
                Players player = convertResultSetToPlayer(rs);

                players.add(player);
            }

            return players;
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public Optional<Players> findPlayerById(Integer id) {

        try(Connection conn = getConnection()) {

            PreparedStatement pstmp = conn.prepareStatement("SELECT * FROM players WHERE id = ?");
            pstmp.setInt(1, id);
            ResultSet rs = pstmp.executeQuery();

            Players player = null;
            if (rs.next()) {
                player = convertResultSetToPlayer(rs);
            }
            return Optional.ofNullable(player);

        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public int save(Players player){

        try(Connection conn = getConnection()){

            String query = "INSERT INTO players (id, username, gender, badge_count, money, playtime_seconds, avatar_url, current_location, rival_name, starter_species_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement pstmp = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);


            pstmp.setInt(1, player.getId());
            pstmp.setString(2, player.getUsername());
            pstmp.setString(3, player.getGender());
            pstmp.setInt(4, player.getBadgeCount());
            pstmp.setInt(5, player.getMoney());
            pstmp.setInt(6, player.getPlaytimeSeconds());
            pstmp.setString(7, player.getAvatarUrl());
            pstmp.setString(8, player.getCurrentLocation());
            pstmp.setString(9, player.getRivalName());
            if (player.getStarterSpeciesId() != null) {
                pstmp.setInt(10, player.getStarterSpeciesId());
            } else {
                pstmp.setNull(10, Types.INTEGER);
            }

            pstmp.executeUpdate();

            ResultSet rs = pstmp.getGeneratedKeys();

            if(!rs.next()){
                throw new RuntimeException("Failed to insert player");
            }

            return rs.getInt(1);

        }catch(Exception e){
            throw new RuntimeException(e);
        }

    }

    public boolean update(Integer id, Players player){
        try(Connection conn = getConnection()){
            String query = "UPDATE players SET username = ?, gender = ?, badge_count = ?, money = ?, playtime_seconds = ?, avatar_url = ?, current_location = ?, rival_name = ?, starter_species_id = ? WHERE id = ?";
            PreparedStatement pstmp = conn.prepareStatement(query);
            pstmp.setString(1, player.getUsername());
            pstmp.setString(2, player.getGender());
            pstmp.setInt(3, player.getBadgeCount());
            pstmp.setInt(4, player.getMoney());
            pstmp.setInt(5, player.getPlaytimeSeconds());
            pstmp.setString(6, player.getAvatarUrl());
            pstmp.setString(7, player.getCurrentLocation());
            pstmp.setString(8, player.getRivalName());
            if (player.getStarterSpeciesId() != null) {
                pstmp.setInt(9, player.getStarterSpeciesId());
            } else {
                pstmp.setNull(9, Types.INTEGER);
            }
            pstmp.setInt(10, id);

            return pstmp.executeUpdate() == 1;

        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public boolean delete(Integer id){
        try(Connection conn = getConnection()){
            String query = "DELETE FROM players WHERE id = ?";
            PreparedStatement pstmp = conn.prepareStatement(query);
            pstmp.setInt(1, id);
            return pstmp.executeUpdate() == 1;
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    private Players convertResultSetToPlayer(ResultSet rs) throws SQLException {
        Integer id = rs.getInt("id");
        String username = rs.getString("username");
        String gender = rs.getString("gender");
        Integer badgeCount = rs.getInt("badge_count");
        Integer money = rs.getInt("money");
        Integer playtimeSeconds = rs.getInt("playtime_seconds");
        String avatarUrl = rs.getString("avatar_url");
        String currentLocation = rs.getString("current_location");
        LocalDateTime createdAt = rs.getTimestamp("created_at").toLocalDateTime();
        //LocalDateTime lastLogin = rs.getTimestamp("last_login").toLocalDateTime();
        String rivalName = rs.getString("rival_name");
        Integer starterSpeciesId = rs.getInt("starter_species_id");

        return new Players(id, username, gender, badgeCount, money, playtimeSeconds, avatarUrl, currentLocation, rivalName, starterSpeciesId);
    }

    public List<Players> findAll() {
        try(Connection conn = getConnection()){
            String query = "SELECT * FROM players";
            PreparedStatement pstmp = conn.prepareStatement(query);
            ResultSet rs = pstmp.executeQuery();
            List<Players> players = new ArrayList<>();
            while(rs.next()){
                players.add(convertResultSetToPlayer(rs));
            }
            return players;
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
