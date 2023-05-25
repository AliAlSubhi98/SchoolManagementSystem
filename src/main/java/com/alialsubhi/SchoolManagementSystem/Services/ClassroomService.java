package com.alialsubhi.SchoolManagementSystem.Services;

import com.alialsubhi.SchoolManagementSystem.Models.Classroom;
import com.alialsubhi.SchoolManagementSystem.Repositories.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService {
    @Autowired
    ClassRepository classRepository;
   public List<Classroom> getAllClassrooms(){
        return classRepository.findAll();
    }

    public Classroom createClassroom(Classroom classroom) {
        return classRepository.save(classroom);
    }

    public Classroom getClassroomById(Long id) {
        return classRepository.findById(id).get();
    }

    public void deleteClassroom(Long id){
       classRepository.deleteById(id);
    }

    public Classroom updateClassroom(Long id , Classroom updatedClassroom){
       Classroom classroom = classRepository.findById(id).get();

       classroom.setCourse(updatedClassroom.getCourse());
       classroom.setSize(updatedClassroom.getSize());

       return classroom;

    }
}
