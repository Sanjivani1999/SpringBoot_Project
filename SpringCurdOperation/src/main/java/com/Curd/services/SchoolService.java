package com.Curd.services;

import com.Curd.entity.School;
import com.Curd.repository.SchoolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Service
public class SchoolService {
@Autowired
    SchoolRepo schoolRepo;
public List<School>getAllData(School school){
    return schoolRepo.findAll();

}
public School getStudentId(int id){
    return  schoolRepo.findById(id).get();
}
public  void  inserData (@RequestBody School school){
    schoolRepo.save(school);
}
public void DeleteData(int id){
    schoolRepo.deleteById(id);
}
}
