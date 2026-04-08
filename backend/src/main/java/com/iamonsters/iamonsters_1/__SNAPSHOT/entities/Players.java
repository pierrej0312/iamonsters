package com.iamonsters.iamonsters_1.__SNAPSHOT.entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class Players {
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
    private Integer starterSpeciesId;

    public Players() {
    }

    public Players(LocalDateTime createdAt, Integer id, String username, String gender, Integer badgeCount, Integer money, Integer playtimeSeconds, String avatarUrl, String currentLocation, LocalDateTime lastLogin, String rivalName, Integer starterSpeciesId) {
        this.createdAt = createdAt;
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.badgeCount = badgeCount;
        this.money = money;
        this.playtimeSeconds = playtimeSeconds;
        this.avatarUrl = avatarUrl;
        this.currentLocation = currentLocation;
        this.lastLogin = lastLogin;
        this.rivalName = rivalName;
        this.starterSpeciesId = starterSpeciesId;
    }

    public Players(Integer id, String username, String gender, Integer badgeCount, Integer money, Integer playtimeSeconds, String avatarUrl, String currentLocation, String rivalName, Integer starterSpeciesId) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.badgeCount = badgeCount;
        this.money = money;
        this.playtimeSeconds = playtimeSeconds;
        this.avatarUrl = avatarUrl;
        this.currentLocation = currentLocation;
    }


    public Integer getPlaytimeSeconds() {
        return playtimeSeconds;
    }

    public void setPlaytimeSeconds(Integer playtimeSeconds) {
        this.playtimeSeconds = playtimeSeconds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getBadgeCount() {
        return badgeCount;
    }

    public void setBadgeCount(Integer badgeCount) {
        this.badgeCount = badgeCount;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getRivalName() {
        return rivalName;
    }

    public void setRivalName(String rivalName) {
        this.rivalName = rivalName;
    }

    public Integer getStarterSpeciesId() {
        return starterSpeciesId;
    }

    public void setStarterSpeciesId(Integer starterSpeciesId) {
        this.starterSpeciesId = starterSpeciesId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Players players = (Players) o;
        return Objects.equals(id, players.id) && Objects.equals(username, players.username) && Objects.equals(gender, players.gender) && Objects.equals(badgeCount, players.badgeCount) && Objects.equals(money, players.money) && Objects.equals(playtimeSeconds, players.playtimeSeconds) && Objects.equals(avatarUrl, players.avatarUrl) && Objects.equals(currentLocation, players.currentLocation) && Objects.equals(createdAt, players.createdAt) && Objects.equals(lastLogin, players.lastLogin) && Objects.equals(rivalName, players.rivalName) && Objects.equals(starterSpeciesId, players.starterSpeciesId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, gender, badgeCount, money, playtimeSeconds, avatarUrl, currentLocation, createdAt, lastLogin, rivalName, starterSpeciesId);
    }

    @Override
    public String toString() {
        return "Players{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", badge_count=" + badgeCount +
                ", money=" + money +
                ", playtimeSeconds=" + playtimeSeconds +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", currentLocation='" + currentLocation + '\'' +
                ", createdAt=" + createdAt +
                ", lastLogin=" + lastLogin +
                ", rivalName='" + rivalName + '\'' +
                ", starterSpeciesId=" + starterSpeciesId +
                '}';
    }
}
