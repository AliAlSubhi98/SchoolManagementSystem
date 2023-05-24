package com.alialsubhi.SchoolManagementSystem.Controllers;

import com.alialsubhi.SchoolManagementSystem.Models.Classroom;
import com.alialsubhi.SchoolManagementSystem.Models.Teacher;
import com.alialsubhi.SchoolManagementSystem.Services.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/classrooms")
public class ClassroomController {

    @Autowired
    ClassroomService classroomService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Classroom> getAllTeachers(){
        return classroomService.getAllClassrooms();
    }//http://localhost:8080/api/classrooms/getAll

    @GetMapping("/{id}")
    public Classroom getClassroom(@PathVariable("id") Long id) {
        Classroom classroom = classroomService.getClassroomById(id);
        return classroom;
    }//http://localhost:8080/api/classrooms/1


    @PostMapping("/create")
    public Classroom createaClassroom(@RequestBody Classroom classroom) {
        return classroomService.createClassroom(classroom);
    }

}
