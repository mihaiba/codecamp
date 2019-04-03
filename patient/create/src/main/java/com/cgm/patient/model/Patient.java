package com.cgm.patient.model;

import com.google.gson.Gson;

public class Patient {

    private String id;
    private String name;

    public Patient() {
    }

    public Patient(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}
