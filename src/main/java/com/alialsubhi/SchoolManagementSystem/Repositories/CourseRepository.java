package com.alialsubhi.SchoolManagementSystem.Repositories;

import com.alialsubhi.SchoolManagementSystem.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
