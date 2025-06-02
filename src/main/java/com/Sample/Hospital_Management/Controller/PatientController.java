package com.Sample.Hospital_Management.Controller;

import com.Sample.Hospital_Management.model.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/patient/apis")
public class PatientController {
    HashMap<Integer,Patient> patientMapdb=new HashMap<>();
    @PostMapping("/save")
    public String savePatient(@RequestBody Patient patient){
        patientMapdb.put(patient.getId(),patient);
        return "Patient Saved Successfully";
    }
    @PostMapping("/saveList")
    public String savePatientList(@RequestBody List<Patient> patientList){
        for(Patient p1:patientList){
            patientMapdb.put(p1.getId(),p1);
        }
        System.out.println("Patient List is :- "+patientMapdb);
        return "PatientList saved Successfully";
    }
    @GetMapping("/findAll")
    public HashMap<Integer, Patient> findAllPatient(){
        return patientMapdb;
    }

    @GetMapping("/findById/{id}")
    public Patient findByIdPatient(int id){
        Patient patient=patientMapdb.get(id);
        return patient;
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteByIdPatient(@PathVariable int id){
        patientMapdb.remove(id);
        System.out.println("After Deleted :- "+patientMapdb);
        return "Patient Deleted Successfully";
    }
}
