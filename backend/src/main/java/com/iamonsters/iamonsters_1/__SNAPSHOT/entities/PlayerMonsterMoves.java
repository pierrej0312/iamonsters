package com.iamonsters.iamonsters_1.__SNAPSHOT.entities;

import java.util.Objects;

public class PlayerMonsterMoves {
    private Integer id;
    private Integer playerMonsterId;
    private Integer moveId;
    private Integer slot;
    private Integer currentPp;

    public PlayerMonsterMoves() {
    }

    public PlayerMonsterMoves(Integer id, Integer playerMonsterId, Integer moveId, Integer slot, Integer currentPp) {
        this.id = id;
        this.playerMonsterId = playerMonsterId;
        this.moveId = moveId;
        this.slot = slot;
        this.currentPp = currentPp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlayerMonsterId() {
        return playerMonsterId;
    }

    public void setPlayerMonsterId(Integer playerMonsterId) {
        this.playerMonsterId = playerMonsterId;
    }

    public Integer getMoveId() {
        return moveId;
    }

    public void setMoveId(Integer moveId) {
        this.moveId = moveId;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public Integer getCurrentPp() {
        return currentPp;
    }

    public void setCurrentPp(Integer currentPp) {
        this.currentPp = currentPp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PlayerMonsterMoves that = (PlayerMonsterMoves) o;
        return Objects.equals(id, that.id) && Objects.equals(playerMonsterId, that.playerMonsterId) && Objects.equals(moveId, that.moveId) && Objects.equals(slot, that.slot) && Objects.equals(currentPp, that.currentPp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, playerMonsterId, moveId, slot, currentPp);
    }

    @Override
    public String toString() {
        return "PlayerMonsterMoves{" +
                "id=" + id +
                ", playerMonsterId=" + playerMonsterId +
                ", moveId=" + moveId +
                ", slot=" + slot +
                ", currentPp=" + currentPp +
                '}';
    }
}
