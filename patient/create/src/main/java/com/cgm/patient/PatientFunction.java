package com.cgm.patient;

import com.cgm.patient.model.Patient;

import java.util.concurrent.ConcurrentHashMap;

public class PatientFunction {

    private static final ConcurrentHashMap<Patient, Patient> patientStore = new ConcurrentHashMap<>();

    public Patient create(Patient input) {
        return patientStore.computeIfAbsent(input, this::computeKey);
    }

    private Patient computeKey(Patient input) {
        return new Patient(String.valueOf(patientStore.size() + 1), input.getName());
    }

}