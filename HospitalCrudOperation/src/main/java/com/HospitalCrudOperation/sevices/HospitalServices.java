package com.HospitalCrudOperation.sevices;

import com.HospitalCrudOperation.entity.HospitalInformation;
import com.HospitalCrudOperation.repository.HospitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class HospitalServices {
    @Autowired
    HospitalRepo hospitalRepo;
    public List<HospitalInformation>getAllData(HospitalInformation hospitalInformation){
        return hospitalRepo.findAll();
    }
    public HospitalInformation getPatientById(int id){
        return hospitalRepo.findById(id).get();
    }
    public void  insertData(@RequestBody HospitalInformation hospitalInformation){
        hospitalRepo.save(hospitalInformation);
    }
    public  void  DeleteData(int Pid){
        hospitalRepo.deleteById(Pid);
    }

}
