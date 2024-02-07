package com.example.PrescriptionManagementSystem.models;

import java.util.ArrayList;

public class Patient {

    Long id;

    String firstName;

    String lastName;

    ArrayList<Prescription> prescribedMedications;

    String email;

    String password;

    public Patient(String firstName, String lastName, String email, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

//    default constructor

    public Patient(){}

//    getters and setters

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public ArrayList<Prescription> getPrescribedMedications(){
        return this.prescribedMedications;
    }

    public void setPrescribedMedications(ArrayList<Prescription> prescribedMedications){
        this.prescribedMedications = prescribedMedications;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
