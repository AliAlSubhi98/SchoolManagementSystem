package com.alialsubhi.SchoolManagementSystem.Repositories;

import com.alialsubhi.SchoolManagementSystem.Models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
