package com.osn.dbservice.mysql.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

            @Id
            @GeneratedValue(strategy = GenerationType.SEQUENCE)
            private Long id;
            private String firstName;
            private String lastName;
            private String dateOfBirth;
            private List<String> destinationsOfInterest;
            private String applicationStatus;
            private String enrollmentSeason;
            private String location;
            private LocalTime createDateTime;
            private LocalTime updateDateTime;
}
