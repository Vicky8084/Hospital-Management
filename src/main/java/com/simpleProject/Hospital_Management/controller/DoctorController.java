package com.simpleProject.Hospital_Management.controller;
import com.simpleProject.Hospital_Management.model.Doctor;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/doctor/apis")
public class DoctorController {
    Map<Integer,Doctor> doctorMapDB =new HashMap<>();
    @PostMapping("/save")
    public String saveDoctor(@RequestBody Doctor doctor){
        doctorMapDB.put(doctor.getId(),doctor);
        System.out.println("Doctor is saved :- "+doctor);
        return "Doctor Saved Successfully..!!!";
    }

    @PostMapping("/saveList")
    public String  saveDoctorList(@RequestBody List<Doctor> doctorList){
        for(Doctor doctor1:doctorList){
            doctorMapDB.put(doctor1.getId(),doctor1);
        }
        System.out.println("Doctors Saved is :- "+doctorMapDB);
        return"Doctor List is saved";
    }

    @GetMapping("/getAll")
    public Map<Integer,Doctor> getAllDoctors(){
        return doctorMapDB;
    }

    @GetMapping("/findById/{id}")
    public Doctor getDoctorById(@PathVariable int id){
        Doctor doctor=doctorMapDB.get(id);
        return doctor;
    }
    @DeleteMapping("/delete/{id}")
    public String deleteDoctorById(@PathVariable int id){
        doctorMapDB.remove(id);
        return"Doctor Deleted Successfully with ID :- "+id;
    }
}
