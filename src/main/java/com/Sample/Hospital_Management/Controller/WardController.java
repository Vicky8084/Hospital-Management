package com.Sample.Hospital_Management.Controller;

import com.Sample.Hospital_Management.model.Ward;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/ward/apis")
public class WardController {
    HashMap<Integer,Ward> wardMapdb=new HashMap<>();
    @PostMapping("/save")
    public String saveWard(@RequestBody Ward ward){
        wardMapdb.put(ward.getId(),ward);
        System.out.println("The Ward is : -"+wardMapdb);
        return "Ward Saved Successfully";
    }
    @PostMapping("/saveList")
    public String saveWardList(@RequestBody List<Ward> wardList){
        for(Ward w1:wardList){
            wardMapdb.put(w1.getId(),w1);
        }
        System.out.println("WardList is :- "+wardMapdb);
        return "WardList Saved Successfully";
    }
    @GetMapping("/findAll")
    public HashMap<Integer, Ward> findAllWard(){
        return wardMapdb;
    }

    @GetMapping("/findById/{id}")
    public Ward findByIdWard(int id){
        Ward ward=wardMapdb.get(id);
        return ward;
    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteByIdWard(@PathVariable int id){
        wardMapdb.remove(id);
        System.out.println("After Deleted :- "+wardMapdb);
        return "Ward Deleted Successfully";
    }
}
