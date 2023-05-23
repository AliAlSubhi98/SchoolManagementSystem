package com.alialsubhi.SchoolManagementSystem.Services;

import com.alialsubhi.SchoolManagementSystem.Models.Student;
import com.alialsubhi.SchoolManagementSystem.Models.Teacher;
import com.alialsubhi.SchoolManagementSystem.Repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers(){
        return teacherRepository.findAll();
    }
}
