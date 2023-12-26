package com.osn.dbservice.mysql.service;


import com.osn.dbservice.mysql.entity.Student;
import com.osn.dbservice.mysql.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    public StudentRepository studentRepository;

    public List<Student> findAll(){
        return  studentRepository.findAll();
    }

    public void save(Student student){
        studentRepository.save(student);
    }

}
