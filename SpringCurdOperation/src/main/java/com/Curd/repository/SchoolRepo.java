package com.Curd.repository;

import com.Curd.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepo extends JpaRepository<School,Integer> {
}
