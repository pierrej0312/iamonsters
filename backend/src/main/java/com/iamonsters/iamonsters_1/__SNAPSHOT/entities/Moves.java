package com.iamonsters.iamonsters_1.__SNAPSHOT.entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class Moves {
    private Integer id;
    private String name;
    private Integer typeId;
    private Integer categoryId;
    private Integer power;
    private Integer accuracy;
    private Integer pp;
    private Integer priority;
    private String description;
    private Integer effectChance;
    private String effectDescription;
    private Boolean isContact;
    private String target;
    private LocalDateTime createdAt;

    public Moves() {
    }

    public Moves(Integer id, String name, Integer typeId, Integer categoryId, Integer power, Integer accuracy, Integer pp, Integer priority, String description, Integer effectChance, String effectDescription, Boolean isContact, String target, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.typeId = typeId;
        this.categoryId = categoryId;
        this.power = power;
        this.accuracy = accuracy;
        this.pp = pp;
        this.priority = priority;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    public Integer getPp() {
        return pp;
    }

    public void setPp(Integer pp) {
        this.pp = pp;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getEffectChance() {
        return effectChance;
    }

    public void setEffectChance(Integer effectChance) {
        this.effectChance = effectChance;
    }

    public String getEffectDescription() {
        return effectDescription;
    }

    public void setEffectDescription(String effectDescription) {
        this.effectDescription = effectDescription;
    }

    public Boolean getContact() {
        return isContact;
    }

    public void setContact(Boolean contact) {
        isContact = contact;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Moves moves = (Moves) o;
        return Objects.equals(id, moves.id) && Objects.equals(name, moves.name) && Objects.equals(typeId, moves.typeId) && Objects.equals(categoryId, moves.categoryId) && Objects.equals(power, moves.power) && Objects.equals(accuracy, moves.accuracy) && Objects.equals(pp, moves.pp) && Objects.equals(priority, moves.priority) && Objects.equals(description, moves.description) && Objects.equals(effectChance, moves.effectChance) && Objects.equals(effectDescription, moves.effectDescription) && Objects.equals(isContact, moves.isContact) && Objects.equals(target, moves.target) && Objects.equals(createdAt, moves.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, typeId, categoryId, power, accuracy, pp, priority, description, effectChance, effectDescription, isContact, target, createdAt);
    }

    @Override
    public String toString() {
        return "Moves{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", typeId=" + typeId +
                ", categoryId=" + categoryId +
                ", power=" + power +
                ", accuracy=" + accuracy +
                ", pp=" + pp +
                ", priority=" + priority +
                ", description='" + description + '\'' +
                ", effectChance=" + effectChance +
                ", effectDescription='" + effectDescription + '\'' +
                ", isContact=" + isContact +
                ", target='" + target + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
