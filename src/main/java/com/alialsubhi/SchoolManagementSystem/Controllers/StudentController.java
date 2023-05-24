package com.alialsubhi.SchoolManagementSystem.Controllers;

import com.alialsubhi.SchoolManagementSystem.Models.Student;
import com.alialsubhi.SchoolManagementSystem.Repositories.StudentRepository;
import com.alialsubhi.SchoolManagementSystem.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//git config --global user.name "AliAlSubhi98"
//--global user.email "alialsubhi1998@gmail.com"
@RestController
@RequestMapping(value = "/api/students")
public class StudentController {

    @Autowired
    StudentService studentService;


    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }//http://localhost:8080/api/students/getAll



    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable("id") Long id) {
        Student student = studentService.getStudentById(id);
        if (student == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(student);
    }//http://localhost:8080/api/students/2

/*
    this work
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable("id") Long id) {
        Student student = studentService.getStudentById(id);
        return student;
    }//http://localhost:8080/api/students/2*/


    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }
/*
    http://localhost:8080/api/students/create
    {
        "name": "moha",
            "age": "56"
    }
*/

}
