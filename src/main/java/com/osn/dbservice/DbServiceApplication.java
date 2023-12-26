package com.osn.dbservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.osn.dbservice.mysql.entity.Student;
import com.osn.dbservice.mysql.service.StudentService;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableJpaRepositories
public class DbServiceApplication {


	private static final Logger log = LoggerFactory.getLogger(DbServiceApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(DbServiceApplication.class, args);
		/*ApplicationContext applicationContext=SpringApplication.run(DbServiceApplication.class, args);
		StudentService service = applicationContext.getBean(StudentService.class);

		Student student=new Student();
		student.setFirstName("Vicky");
		student.setLastName("Kaushal");
		student.setDateOfBirth("19/12/1985");
		student.setEnrollmentSeason("Fall");
		student.setLocation("Bengaluru");
		List<String> destinations=new ArrayList<>();
		destinations.add("USA");
		destinations.add("UK");


		student.setDestinationsOfInterest(destinations);
		student.setApplicationStatus(
				"NEW"
		);
		student.setCreateDateTime(LocalTime.now());
		student.setUpdateDateTime(LocalTime.now());
		service.save(student);


		List<Student> students=service.findAll();
		for(Student stu: students){
			System.out.println(stu);
		}*/
	}

}
