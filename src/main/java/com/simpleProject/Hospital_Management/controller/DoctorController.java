package com.simpleProject.Hospital_Management.controller;
import com.simpleProject.Hospital_Management.model.Doctor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/doctor/apis")
public class DoctorController {
    Map<Integer,Doctor> doctorMapDB =new HashMap<>();
    @PostMapping("/save")
    public String saveDoctor(@RequestBody Doctor doctor){
        doctorMapDB.put(doctor.getId(),doctor);
        return "Doctor Saved Successfully..!!!";
    }
}
