package com.alialsubhi.SchoolManagementSystem.Services;

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

    public Teacher createTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }

    public Teacher getTeacherById(Long id){
        return teacherRepository.findById(id).get();
    }


    public void deleteTeacher(Long id){
        teacherRepository.deleteById(id);
    }

    public Teacher updateTeacher(Long id, Teacher updatedTeacher) {
        Teacher teacher = teacherRepository.findById(id).orElse(null);
        if (teacher != null) {
            teacher.setName(updatedTeacher.getName());
            teacher.setPhone(updatedTeacher.getPhone());
            teacher.setSpecialization(updatedTeacher.getSpecialization());
            teacher.setAge(updatedTeacher.getAge());
            // Set other properties you want to update

            return teacherRepository.save(teacher);
        }

        return null ;
    }
}
