package com.alialsubhi.SchoolManagementSystem.Controllers;

import com.alialsubhi.SchoolManagementSystem.Models.Course;
import com.alialsubhi.SchoolManagementSystem.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/courses")
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @PostMapping("/create")
    public Course createCourse(@RequestBody Course course){
        return courseService.createCourse(course);
    }
}
