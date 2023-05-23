package com.alialsubhi.SchoolManagementSystem.Models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    private Teacher teacher;

    @ManyToOne
    private Course course;
}
