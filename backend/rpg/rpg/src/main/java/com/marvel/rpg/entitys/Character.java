package com.marvel.rpg.entitys;

import com.marvel.rpg.dtos.NewCharacterDTO;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String realName;
    private String identity;
    private String gender;
    private Integer age;
    private Double height;

    @OneToOne
    @Nullable
    private Attribute attributes;

    public Character() {
    }

    public Character(Long id, String realName, String identity, String gender, Integer age, Double height) {
        this.id = id;
        this.realName = realName;
        this.identity = identity;
        this.gender = gender;
        this.age = age;
        this.height = height;
    }

    public Character(NewCharacterDTO newCharacterDTO) {
        this.realName = newCharacterDTO.getRealName();
        this.identity = newCharacterDTO.getIdentity();
        this.gender = newCharacterDTO.getGender();
        this.age = newCharacterDTO.getAge();
        this.height = newCharacterDTO.getHeight();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Attribute getAttributes() {
        return attributes;
    }

    public void setAttributes(Attribute attributes) {
        this.attributes = attributes;
    }
}