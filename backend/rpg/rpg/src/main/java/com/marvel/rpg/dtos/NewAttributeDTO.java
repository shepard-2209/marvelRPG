package com.marvel.rpg.dtos;

public class NewAttributeDTO {

    private Double healthPoints;
    private Double vigor;
    private Double strength;
    private Double intelligence;
    private Double agility;
    private Double resistence;
    private Double charisma;
    private Double perception;

    public NewAttributeDTO(Double healthPoints, Double vigor, Double strength, Double intelligence,
                           Double agility, Double resistence, Double charisma, Double perception) {
        this.healthPoints = healthPoints;
        this.vigor = vigor;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        this.resistence = resistence;
        this.charisma = charisma;
        this.perception = perception;
    }

    public Double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(Double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Double getVigor() {
        return vigor;
    }

    public void setVigor(Double vigor) {
        this.vigor = vigor;
    }

    public Double getStrength() {
        return strength;
    }

    public void setStrength(Double strength) {
        this.strength = strength;
    }

    public Double getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Double intelligence) {
        this.intelligence = intelligence;
    }

    public Double getAgility() {
        return agility;
    }

    public void setAgility(Double agility) {
        this.agility = agility;
    }

    public Double getResistence() {
        return resistence;
    }

    public void setResistence(Double resistence) {
        this.resistence = resistence;
    }

    public Double getCharisma() {
        return charisma;
    }

    public void setCharisma(Double charisma) {
        this.charisma = charisma;
    }

    public Double getPerception() {
        return perception;
    }

    public void setPerception(Double perception) {
        this.perception = perception;
    }
}
