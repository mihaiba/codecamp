package com.cgm.doctor.model;

import com.google.gson.Gson;

import java.io.Serializable;

public class Doctor implements Serializable {

    private String id;
    private String name;
    private String specialization;

    public Doctor() {
    }

    public Doctor(String id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}
