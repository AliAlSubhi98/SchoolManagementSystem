package com.alialsubhi.SchoolManagementSystem.Controllers;

import com.alialsubhi.SchoolManagementSystem.Models.Student;
import com.alialsubhi.SchoolManagementSystem.Repositories.StudentRepository;
import com.alialsubhi.SchoolManagementSystem.ResponseObject.AddStudentResponse;
import com.alialsubhi.SchoolManagementSystem.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//git config --global user.name "AliAlSubhi98"
//--global user.email "alialsubhi1998@gmail.com"
@RestController
@RequestMapping(value = "/api/students")
public class StudentController {

    @Autowired
    StudentService studentService;


/*    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Student> getAllStudents() {
        List<Student> allStudents = studentService.getAllStudents();
        List<Student> activeStudents = new ArrayList<>();

        for (Student student : allStudents) {
            if (student.isActive()) {
                activeStudents.add(student);
            }
        }

        return activeStudents;
    }*/
//http://localhost:8080/api/students/getAll

    @RequestMapping(value = "/getAllRequest", method = RequestMethod.GET)
    public List<AddStudentResponse> getAllStudentRequest() {
        List<Student> students = studentService.getAllStudents();
        List<AddStudentResponse> studentResponses = new ArrayList<>();

        for (Student student : students) {
            var studentsResponse = new AddStudentResponse(
                    student.getId(),
                    student.getName(),
                    student.getAge(),
                    student.getGender()
            );
            studentResponses.add(studentsResponse);
        }
        return studentResponses;
    }


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
    }//http://localhost:8080/api/students/2
*/


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


    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id,
                                 @RequestBody Student updatedStudent) {
        Student student = studentService.updateStudent(id, updatedStudent);
        return student;
    }
}
