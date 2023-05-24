package com.alialsubhi.SchoolManagementSystem.Repositories;

import com.alialsubhi.SchoolManagementSystem.Models.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<Classroom,Long> {
}
