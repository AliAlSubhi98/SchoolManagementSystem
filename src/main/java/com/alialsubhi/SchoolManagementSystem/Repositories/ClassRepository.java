package com.alialsubhi.SchoolManagementSystem.Repositories;

import com.alialsubhi.SchoolManagementSystem.Models.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<Class,Long> {
}
