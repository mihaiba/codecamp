package com.cgm.patient;

import com.cgm.patient.model.Patient;

import java.util.concurrent.ConcurrentHashMap;

public class PatientFunction {

    private static final ConcurrentHashMap<String, Patient> patientStore = new ConcurrentHashMap<>();

    public Patient create(Patient input) {
        patientStore.put(input.getId(), input);
        return patientStore.get(input.getId());
    }

}