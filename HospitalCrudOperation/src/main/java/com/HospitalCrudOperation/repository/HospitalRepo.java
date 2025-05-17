package com.HospitalCrudOperation.repository;

import com.HospitalCrudOperation.entity.HospitalInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepo extends JpaRepository<HospitalInformation, Integer> {
}
