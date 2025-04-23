package com.simpleProject.Hospital_Management.controller;


import com.simpleProject.Hospital_Management.model.Doctor;
import com.simpleProject.Hospital_Management.model.Patient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/doctor/apis")
public class PatientController {
    Map<Integer, Patient> patientMapDB=new HashMap<>();
    @PostMapping("/save")
    public String savePatient(Patient patient){
        patientMapDB.put(patient.getId(),patient);
        return"Patient Data Saved Successfully";
    }
}
