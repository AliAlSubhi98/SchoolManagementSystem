package com.alialsubhi.SchoolManagementSystem.Models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String code;

    @ManyToOne
    @JoinColumn(name = "class_id")
    Classroom classroom;

    @OneToOne
    //@JoinColumn(name = "teacher_id")
    Teacher teacher;
    @OneToMany(mappedBy = "course")
    List<StudentCourse> studentsCourses = new ArrayList<>();


}
