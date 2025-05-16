package com.Curd.Controller;

import com.Curd.entity.School;
import com.Curd.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchoolController {
    @Autowired
    SchoolService schoolService;
    @GetMapping("/School")
    public List<School> GetAllDetail(School school){
        return schoolService.getAllData(school);
    }
    @GetMapping("/School/{id}")
    public  School getStudentById(@PathVariable int id){
        return  schoolService.getStudentId(id);
    }

@PostMapping("/School")
    public void insertData(@RequestBody School school){
       schoolService.inserData(school);
}
@DeleteMapping("/School/{id}")
    public void UpdateValue(@PathVariable int id){
         schoolService.DeleteData(id);
}


}
