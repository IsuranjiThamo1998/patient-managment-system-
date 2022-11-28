package com.example.myfirstproject.model;
import com.fasterxml.jackson.annotation.JsonAnyGetter;

import javax.persistence.*;

@Entity
@Table(name ="doctor_managment")
public class doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctor_id;

    @Column(name = "doctor_name")
    private String doctor_name;

    @Column(name = "registration_date")
    private String registration_date;

    @Column(name="doctor_address")
    private String doctor_address;

    @Column(name="doctor_email")
    private String doctor_email;

    @Column(name = "doctor_telephone")
    private int doctor_telephone;

    @Column(name = "qulification")
    private String qulification;

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(String registration_date) {
        this.registration_date = registration_date;
    }

    public String getDoctor_address() {
        return doctor_address;
    }

    public void setDoctor_address(String doctor_address) {
        this.doctor_address = doctor_address;
    }

    public String getDoctor_email() {
        return doctor_email;
    }

    public void setDoctor_email(String doctor_email) {
        this.doctor_email = doctor_email;
    }

    public int getDoctor_telephone() {
        return doctor_telephone;
    }

    public void setDoctor_telephone(int doctor_telephone) {
        this.doctor_telephone = doctor_telephone;
    }

    public String getQulification() {
        return qulification;
    }

    public void setQulification(String qulification) {
        this.qulification = qulification;
    }
}
