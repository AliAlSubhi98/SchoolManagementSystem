package com.alialsubhi.SchoolManagementSystem.Services;

import com.alialsubhi.SchoolManagementSystem.Models.Course;
import com.alialsubhi.SchoolManagementSystem.Repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

}