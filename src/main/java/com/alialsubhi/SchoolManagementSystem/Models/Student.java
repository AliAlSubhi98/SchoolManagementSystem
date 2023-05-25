package com.alialsubhi.SchoolManagementSystem.Models;

import lombok.*;

import javax.persistence.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String age;
    private String gender;
    private String email;
    @OneToMany(mappedBy = "student")
    List<StudentCourse> studentCourses = new ArrayList<>();

}
