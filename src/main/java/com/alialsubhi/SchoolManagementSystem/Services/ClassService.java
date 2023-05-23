package com.alialsubhi.SchoolManagementSystem.Services;

import com.alialsubhi.SchoolManagementSystem.Repositories.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {
    @Autowired
    ClassRepository classRepository;

    public List<Class> getAllClasses(){
        return classRepository.findAll();
    }

}
