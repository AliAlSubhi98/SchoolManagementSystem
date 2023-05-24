package com.alialsubhi.SchoolManagementSystem.Controllers;

import com.alialsubhi.SchoolManagementSystem.Models.Student;
import com.alialsubhi.SchoolManagementSystem.Models.Teacher;
import com.alialsubhi.SchoolManagementSystem.Services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/teachers")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Teacher> getAllTeachers(){
        return teacherService.getAllTeachers();
    }//http://localhost:8080/api/teachers/getAll

    @GetMapping("/{id}")
    public Teacher getTeacher(@PathVariable("id") Long id) {
        Teacher teacher = teacherService.getTeacherById(id);
        return teacher;
    }//http://localhost:8080/api/teachers/1

    @PostMapping("/create")
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherService.createTeacher(teacher);
    }

}
