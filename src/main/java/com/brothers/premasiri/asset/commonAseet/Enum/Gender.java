package com.brothers.premasiri.asset.commonAseet.Enum;

public enum Gender {
    MALE("Male"),
    FEMALE("Female");

    private final String gender;

    Gender(String gender) {
        this.gender = gender;
    }


    public String getGender() {
        return gender;
    }
}
