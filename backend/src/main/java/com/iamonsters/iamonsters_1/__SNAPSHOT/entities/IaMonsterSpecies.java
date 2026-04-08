package com.iamonsters.iamonsters_1.__SNAPSHOT.entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class IaMonsterSpecies {
    Integer id;
    Integer playerId;
    Integer speciesId;
    String nickname;
    Integer level;
    Integer currentHp;
    Integer experience;
    Integer ivHp;
    Integer ivAttack;
    Integer ivDefense;
    Integer ivSpAttack;
    Integer ivSpDefense;
    Integer ivSpeed;
    Integer evHp;
    Integer evAttack;
    Integer evDefense;
    Integer evSpAttack;
    Integer evSpDefense;
    Integer evSpeed;
    Integer natureId;
    Integer abilityId;
    Boolean isShiny;
    Integer friendship;
    String statusCondition;
    Integer originalTrainerId;
    java.time.LocalDateTime caughtAt;
    String caughtLocation;
    Boolean inTeam;
    Integer teamSlot;
    Integer pcBox;
    Integer pcSlot;

    public IaMonsterSpecies() {
    }

    public IaMonsterSpecies(Integer id, Integer playerId, Integer speciesId, String nickname, Integer level, Integer currentHp, Integer experience, Integer ivHp, Integer ivAttack, Integer ivDefense, Integer ivSpAttack, Integer ivSpDefense, Integer ivSpeed, Integer evHp, Integer evAttack, Integer evDefense, Integer evSpAttack, Integer evSpDefense, Integer evSpeed, Integer natureId, Integer abilityId, Boolean isShiny, Integer friendship, String statusCondition, Integer originalTrainerId, LocalDateTime caughtAt, String caughtLocation, Boolean inTeam, Integer teamSlot, Integer pcBox, Integer pcSlot) {
        this.id = id;
        this.playerId = playerId;
        this.speciesId = speciesId;
        this.nickname = nickname;
        this.level = level;
        this.currentHp = currentHp;
        this.experience = experience;
        this.ivHp = ivHp;
        this.ivAttack = ivAttack;
        this.ivDefense = ivDefense;
        this.ivSpAttack = ivSpAttack;
        this.ivSpDefense = ivSpDefense;
        this.ivSpeed = ivSpeed;
        this.evHp = evHp;
        this.evAttack = evAttack;
        this.evDefense = evDefense;
        this.evSpAttack = evSpAttack;
        this.evSpDefense = evSpDefense;
        this.evSpeed = evSpeed;
        this.natureId = natureId;
        this.abilityId = abilityId;
        this.isShiny = isShiny;
        this.friendship = friendship;
        this.statusCondition = statusCondition;
        this.originalTrainerId = originalTrainerId;
        this.caughtAt = caughtAt;
        this.caughtLocation = caughtLocation;
        this.inTeam = inTeam;
        this.teamSlot = teamSlot;
        this.pcBox = pcBox;
        this.pcSlot = pcSlot;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Integer getSpeciesId() {
        return speciesId;
    }

    public void setSpeciesId(Integer speciesId) {
        this.speciesId = speciesId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(Integer currentHp) {
        this.currentHp = currentHp;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getIvHp() {
        return ivHp;
    }

    public void setIvHp(Integer ivHp) {
        this.ivHp = ivHp;
    }

    public Integer getIvAttack() {
        return ivAttack;
    }

    public void setIvAttack(Integer ivAttack) {
        this.ivAttack = ivAttack;
    }

    public Integer getIvDefense() {
        return ivDefense;
    }

    public void setIvDefense(Integer ivDefense) {
        this.ivDefense = ivDefense;
    }

    public Integer getIvSpAttack() {
        return ivSpAttack;
    }

    public void setIvSpAttack(Integer ivSpAttack) {
        this.ivSpAttack = ivSpAttack;
    }

    public Integer getIvSpDefense() {
        return ivSpDefense;
    }

    public void setIvSpDefense(Integer ivSpDefense) {
        this.ivSpDefense = ivSpDefense;
    }

    public Integer getIvSpeed() {
        return ivSpeed;
    }

    public void setIvSpeed(Integer ivSpeed) {
        this.ivSpeed = ivSpeed;
    }

    public Integer getEvHp() {
        return evHp;
    }

    public void setEvHp(Integer evHp) {
        this.evHp = evHp;
    }

    public Integer getEvAttack() {
        return evAttack;
    }

    public void setEvAttack(Integer evAttack) {
        this.evAttack = evAttack;
    }

    public Integer getEvDefense() {
        return evDefense;
    }

    public void setEvDefense(Integer evDefense) {
        this.evDefense = evDefense;
    }

    public Integer getEvSpAttack() {
        return evSpAttack;
    }

    public void setEvSpAttack(Integer evSpAttack) {
        this.evSpAttack = evSpAttack;
    }

    public Integer getEvSpDefense() {
        return evSpDefense;
    }

    public void setEvSpDefense(Integer evSpDefense) {
        this.evSpDefense = evSpDefense;
    }

    public Integer getEvSpeed() {
        return evSpeed;
    }

    public void setEvSpeed(Integer evSpeed) {
        this.evSpeed = evSpeed;
    }

    public Integer getNatureId() {
        return natureId;
    }

    public void setNatureId(Integer natureId) {
        this.natureId = natureId;
    }

    public Integer getAbilityId() {
        return abilityId;
    }

    public void setAbilityId(Integer abilityId) {
        this.abilityId = abilityId;
    }

    public Boolean getShiny() {
        return isShiny;
    }

    public void setShiny(Boolean shiny) {
        isShiny = shiny;
    }

    public Integer getFriendship() {
        return friendship;
    }

    public void setFriendship(Integer friendship) {
        this.friendship = friendship;
    }

    public String getStatusCondition() {
        return statusCondition;
    }

    public void setStatusCondition(String statusCondition) {
        this.statusCondition = statusCondition;
    }

    public Integer getOriginalTrainerId() {
        return originalTrainerId;
    }

    public void setOriginalTrainerId(Integer originalTrainerId) {
        this.originalTrainerId = originalTrainerId;
    }

    public LocalDateTime getCaughtAt() {
        return caughtAt;
    }

    public void setCaughtAt(LocalDateTime caughtAt) {
        this.caughtAt = caughtAt;
    }

    public String getCaughtLocation() {
        return caughtLocation;
    }

    public void setCaughtLocation(String caughtLocation) {
        this.caughtLocation = caughtLocation;
    }

    public Boolean getInTeam() {
        return inTeam;
    }

    public void setInTeam(Boolean inTeam) {
        this.inTeam = inTeam;
    }

    public Integer getTeamSlot() {
        return teamSlot;
    }

    public void setTeamSlot(Integer teamSlot) {
        this.teamSlot = teamSlot;
    }

    public Integer getPcBox() {
        return pcBox;
    }

    public void setPcBox(Integer pcBox) {
        this.pcBox = pcBox;
    }

    public Integer getPcSlot() {
        return pcSlot;
    }

    public void setPcSlot(Integer pcSlot) {
        this.pcSlot = pcSlot;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        IaMonsterSpecies that = (IaMonsterSpecies) o;
        return Objects.equals(id, that.id) && Objects.equals(playerId, that.playerId) && Objects.equals(speciesId, that.speciesId) && Objects.equals(nickname, that.nickname) && Objects.equals(level, that.level) && Objects.equals(currentHp, that.currentHp) && Objects.equals(experience, that.experience) && Objects.equals(ivHp, that.ivHp) && Objects.equals(ivAttack, that.ivAttack) && Objects.equals(ivDefense, that.ivDefense) && Objects.equals(ivSpAttack, that.ivSpAttack) && Objects.equals(ivSpDefense, that.ivSpDefense) && Objects.equals(ivSpeed, that.ivSpeed) && Objects.equals(evHp, that.evHp) && Objects.equals(evAttack, that.evAttack) && Objects.equals(evDefense, that.evDefense) && Objects.equals(evSpAttack, that.evSpAttack) && Objects.equals(evSpDefense, that.evSpDefense) && Objects.equals(evSpeed, that.evSpeed) && Objects.equals(natureId, that.natureId) && Objects.equals(abilityId, that.abilityId) && Objects.equals(isShiny, that.isShiny) && Objects.equals(friendship, that.friendship) && Objects.equals(statusCondition, that.statusCondition) && Objects.equals(originalTrainerId, that.originalTrainerId) && Objects.equals(caughtAt, that.caughtAt) && Objects.equals(caughtLocation, that.caughtLocation) && Objects.equals(inTeam, that.inTeam) && Objects.equals(teamSlot, that.teamSlot) && Objects.equals(pcBox, that.pcBox) && Objects.equals(pcSlot, that.pcSlot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, playerId, speciesId, nickname, level, currentHp, experience, ivHp, ivAttack, ivDefense, ivSpAttack, ivSpDefense, ivSpeed, evHp, evAttack, evDefense, evSpAttack, evSpDefense, evSpeed, natureId, abilityId, isShiny, friendship, statusCondition, originalTrainerId, caughtAt, caughtLocation, inTeam, teamSlot, pcBox, pcSlot);
    }

    @Override
    public String toString() {
        return "IaMonsterSpecies{" +
                "id=" + id +
                ", playerId=" + playerId +
                ", speciesId=" + speciesId +
                ", nickname='" + nickname + '\'' +
                ", level=" + level +
                ", currentHp=" + currentHp +
                ", experience=" + experience +
                ", ivHp=" + ivHp +
                ", ivAttack=" + ivAttack +
                ", ivDefense=" + ivDefense +
                ", ivSpAttack=" + ivSpAttack +
                ", ivSpDefense=" + ivSpDefense +
                ", ivSpeed=" + ivSpeed +
                ", evHp=" + evHp +
                ", evAttack=" + evAttack +
                ", evDefense=" + evDefense +
                ", evSpAttack=" + evSpAttack +
                ", evSpDefense=" + evSpDefense +
                ", evSpeed=" + evSpeed +
                ", natureId=" + natureId +
                ", abilityId=" + abilityId +
                ", isShiny=" + isShiny +
                ", friendship=" + friendship +
                ", statusCondition='" + statusCondition + '\'' +
                ", originalTrainerId=" + originalTrainerId +
                ", caughtAt=" + caughtAt +
                ", caughtLocation='" + caughtLocation + '\'' +
                ", inTeam=" + inTeam +
                ", teamSlot=" + teamSlot +
                ", pcBox=" + pcBox +
                ", pcSlot=" + pcSlot +
                '}';
    }
}
