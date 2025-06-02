package com.Sample.Hospital_Management.Controller;

import com.Sample.Hospital_Management.model.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/doctor/apis")
public class DoctorController {

    HashMap<Integer, Doctor> doctorMapdb=new HashMap<>();
    @PostMapping("/save")
    public String saveDoctor(@RequestBody Doctor doctor){
        doctorMapdb.put(doctor.getId(),doctor);
        return "Doctor Saved Successfully";
    }
    @PostMapping("/saveList")
    public String saveDoctorList(@RequestBody List<Doctor> doctorList){
        for(Doctor d1:doctorList){
            doctorMapdb.put(d1.getId(),d1);
        }
        System.out.println("Doctor is Saved :- "+doctorMapdb);
        return "DoctorList Saved Successfully";
    }

    @GetMapping("/findAll")
    public HashMap<Integer, Doctor> findAllDoctor(){
        return doctorMapdb;
    }

    @GetMapping("/findById/{id}")
    public Doctor findByIdDoctor(@PathVariable int id){
        Doctor doctor=doctorMapdb.get(id);
        return doctor;
    }
    @DeleteMapping("deleteById/{id}")
    public String deleteByIdDoctor(@PathVariable int id){
        doctorMapdb.remove(id);
        System.out.println("After Deleted :- "+doctorMapdb);
        return "Doctor Deleted Successfully";
    }
}
