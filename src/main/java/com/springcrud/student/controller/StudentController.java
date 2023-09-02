package com.springcrud.student.controller;

import com.springcrud.student.model.Student;
import com.springcrud.student.service.StudentRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RestController
public class StudentController {
    @Autowired
    StudentRepoImpl studentRepo;
    @PostMapping("/saveStudent")
    public String createResource(@RequestBody Student student){
        studentRepo.saveEntity(student);
        return "saved";
    }

    @GetMapping("/getStudent")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public List<Student> getResource(){
        return studentRepo.getEntity();
    }



}
