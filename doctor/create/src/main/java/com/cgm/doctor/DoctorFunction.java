package com.cgm.doctor;

import com.cgm.doctor.model.Doctor;

import java.util.concurrent.ConcurrentHashMap;

public class DoctorFunction {

    private static final ConcurrentHashMap<String, Doctor> doctorStore = new ConcurrentHashMap<>();

    public Doctor create(Doctor input) {
        doctorStore.put(input.getId(), input);
        return doctorStore.get(input.getId());
    }

}