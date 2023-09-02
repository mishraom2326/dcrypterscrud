package com.springcrud.student.service;

import com.springcrud.student.model.Student;
import com.springcrud.student.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StudentRepoImpl {

    @Autowired
    StudentRepo studentRepo;

    public void saveEntity(Student student) {

        studentRepo.save(student);


    }

    public List<Student> getEntity() {
        return studentRepo.findAll();
    }
}
