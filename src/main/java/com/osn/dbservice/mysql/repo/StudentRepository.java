package com.osn.dbservice.mysql.repo;


import com.osn.dbservice.mysql.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {




}
