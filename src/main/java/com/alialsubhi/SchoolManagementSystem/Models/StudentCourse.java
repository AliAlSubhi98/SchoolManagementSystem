package com.alialsubhi.SchoolManagementSystem.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Data
public class StudentCourse extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Integer grade;
    @ManyToOne
    Course course;
    @ManyToOne
    Student student;
}
