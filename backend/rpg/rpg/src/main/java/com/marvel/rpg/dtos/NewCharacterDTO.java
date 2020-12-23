package com.marvel.rpg.dtos;

import com.marvel.rpg.entitys.Attribute;

public class NewCharacterDTO {

    private String realName;
    private String identity;
    private String gender;
    private Integer age;
    private Double height;

    public NewCharacterDTO(String realName, String identity, String gender, Integer age, Double height) {
        this.realName = realName;
        this.identity = identity;
        this.gender = gender;
        this.age = age;
        this.height = height;
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

}
