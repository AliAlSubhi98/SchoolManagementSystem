package com.alialsubhi.SchoolManagementSystem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<Class,Long> {
}