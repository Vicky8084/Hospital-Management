package com.simpleProject.Hospital_Management.controller;


import com.simpleProject.Hospital_Management.model.Ward;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/ward/apis")
public class WardController {
    Map<Integer, Ward> wardMapDB=new HashMap<>();

    @PostMapping("/save")
    public String saveWard(@RequestBody Ward ward){
        wardMapDB.put(ward.getWardId(), ward);
        return "Ward Data Saved Successfully..!!";
    }
}
