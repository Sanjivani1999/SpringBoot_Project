package com.HospitalCrudOperation.controller;

import com.HospitalCrudOperation.entity.HospitalInformation;
import com.HospitalCrudOperation.sevices.HospitalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class HospitalController {
    @Autowired
    HospitalServices hospitalServices;
    @GetMapping("/HospitalInformation")
    public List<HospitalInformation>GetAllInfo(HospitalInformation hospitalInformation){
        return hospitalServices.getAllData(hospitalInformation);
    }
        @GetMapping("/HosptalInformation/{Pid}")
        public HospitalInformation getPaitentById(@PathVariable int Pid){
            return  hospitalServices.getPatientById(Pid);

        }
        @PostMapping("/HospitalInformation")
    public  void  inserData (@RequestBody HospitalInformation hospitalInformation){
        hospitalServices.insertData(hospitalInformation);
        }
    @DeleteMapping("/HospitalInformation{Pid}")
    public void  updateData(@PathVariable int Pid){
        hospitalServices.DeleteData(Pid);
    }


    }

