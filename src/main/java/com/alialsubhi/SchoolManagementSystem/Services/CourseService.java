package com.alialsubhi.SchoolManagementSystem.Services;

import com.alialsubhi.SchoolManagementSystem.Models.Course;
import com.alialsubhi.SchoolManagementSystem.Models.Student;
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

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course getCourseById(Long id) {
        return courseRepository.findById(id).get();
    }

    public void deleteCourse(Long id){
        courseRepository.deleteById(id);
    }

    public Course updateCourse(Long id , Course updateCourse){
        Course course = courseRepository.findById(id).get();
        course.setName(updateCourse.getName());
        course.setDescription(updateCourse.getDescription());
        course.setClassroom(updateCourse.getClassroom());

        return courseRepository.save(course);
    }
}
