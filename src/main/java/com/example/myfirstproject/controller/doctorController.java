package com.example.myfirstproject.controller;

import com.example.myfirstproject.model.doctor;
import com.example.myfirstproject.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.source.InvalidConfigurationPropertyValueException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.*;


@RestController

@RequestMapping("/api/")
public class doctorController {
    @Autowired
    private DoctorRepository doctorRepository;


    @GetMapping(path = "/doctors")
    public List<doctor> getAllDetails() {

        return  doctorRepository.findAll();

        //http://localhost:8080/api/all
    }

    //insert
    @PostMapping(path = "/doctors")
    void insertDetails(@RequestBody doctor doctor_managment)
    {
        doctorRepository.save(doctor_managment);

    }

    // delete student rest api
    @DeleteMapping("/doctors/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable int id){
        doctor  doctor_managment= doctorRepository.findById(id)
                .orElseThrow(() -> {
                    return new InvalidConfigurationPropertyValueException("Doctor not exist " , doctorRepository,"");
                });

        doctorRepository.delete(doctor_managment );
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    // get student by id rest api
    @GetMapping("/doctors/{id}")
    public ResponseEntity<doctor> getEmployeeById(@PathVariable int id) {
        doctor  doctor_managment = doctorRepository.findById(id)
                .orElseThrow(() -> new InvalidConfigurationPropertyValueException("Doctor not exist " , doctorRepository,""));
        return ResponseEntity.ok(doctor_managment );
    }

    // update student by id rest api
    @PutMapping("/doctors/{id}")
    public ResponseEntity<doctor> updateEmployee(@PathVariable int id, @RequestBody doctor employeeObject){
        doctor doctor_managment = doctorRepository.findById(id)
                .orElseThrow(() -> new InvalidConfigurationPropertyValueException("Doctor not exist " , doctorRepository,""));


        doctor_managment.setDoctor_name(employeeObject.getDoctor_name());
        doctor_managment.setRegistration_date(employeeObject.getRegistration_date());
        doctor_managment.setDoctor_address(employeeObject.getDoctor_address());
        doctor_managment.setDoctor_email(employeeObject.getDoctor_email());
        doctor_managment.setDoctor_telephone(employeeObject.getDoctor_telephone());
        doctor_managment.setQulification(employeeObject.getQulification());

        doctor updatedDoctor = doctorRepository.save(doctor_managment);
        return ResponseEntity.ok(updatedDoctor);
    }

}
