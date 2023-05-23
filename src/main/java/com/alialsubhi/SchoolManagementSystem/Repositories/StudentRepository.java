package com.alialsubhi.SchoolManagementSystem.Repositories;

import com.alialsubhi.SchoolManagementSystem.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
