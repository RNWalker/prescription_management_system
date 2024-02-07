package com.example.PrescriptionManagementSystem.models;

import java.util.ArrayList;
import java.util.Date;

public class Prescription {

    Long id;

    String dose;

    String frequency;

    Date startDate;

    Date endDate;

    Medication medication;

    public Prescription(Medication medication, String dose, String frequency, Date startDate, Date endDate){
        this.medication = medication;
        this.dose = dose;
        this.frequency = frequency;
        this.startDate = startDate;
        this.endDate = endDate;

    }

//    default constructor
    public Prescription(){}

//    getters and setters

    public Medication getMedication(){
        return this.medication;
    }

    public void setMedication(Medication medication){
        this.medication = medication;
    }

    public String getDose(){
        return this.dose;
    }

    public void setDose(String dose){
        this.dose = dose;
    }

    public String getFrequency(){
        return this.frequency;
    }

    public void setFrequency(String frequency){
        this.frequency = frequency;
    }

    public Date getStartDate(){
        return this.startDate;
    }

    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }

    public Date getEndDate(){
        return this.endDate;
    }

    public void setEndDate(Date endDate){
        this.endDate = endDate;
    }


}
