package com.codecool.library.model;

public class Writer {
    private String name;
    private String birthPlace;

    public Writer(String name, String birthPlace) {
        this.name = name;
        this.birthPlace = birthPlace;
    }

    public Writer() {}

    public String getName() {
        return name;
    }

    public String getBirthPlace() {
        return birthPlace;
    }
}
