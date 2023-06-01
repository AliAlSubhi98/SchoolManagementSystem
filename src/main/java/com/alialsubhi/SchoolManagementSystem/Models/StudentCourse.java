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
    private Integer id;
    private Float grade;
    @ManyToOne
    private Course course;
    @ManyToOne
    private Student student;
}
