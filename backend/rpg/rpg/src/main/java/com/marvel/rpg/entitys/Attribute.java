package com.marvel.rpg.entitys;

import javax.persistence.*;

@Entity
public class Attribute {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double healthPoints;
    private Double vigor;
    private Double strength;
    private Double intelligence;
    private Double agility;
    private Double resistence;
    private Double charisma;
    private Double perception;

    public Attribute() {
    }

    public Attribute(Long id, Double healthPoints, Double vigor, Double strength, Double intelligence, Double agility,
                     Double resistence, Double charisma, Double perception) {
        this.id = id;
        this.healthPoints = healthPoints;
        this.vigor = healthPoints * 200.0;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        this.resistence = resistence;
        this.charisma = charisma;
        this.perception = perception;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
