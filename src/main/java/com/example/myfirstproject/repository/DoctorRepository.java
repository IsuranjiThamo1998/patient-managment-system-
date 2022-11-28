package com.example.myfirstproject.repository;

import com.example.myfirstproject.model.doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<doctor,Integer>
{

}
