package com.cgm.doctor;

import com.cgm.doctor.model.Doctor;

import java.util.concurrent.ConcurrentHashMap;

public class DoctorFunction {

    private static final ConcurrentHashMap<Doctor, Doctor> doctorStore = new ConcurrentHashMap<>();

    public Doctor create(Doctor input) {
        return doctorStore.computeIfAbsent(input, this::computeKey);
    }

    private Doctor computeKey(Doctor input) {
        return new Doctor(String.valueOf(doctorStore.size() + 1), input.getName(), input.getSpecialization());
    }

}