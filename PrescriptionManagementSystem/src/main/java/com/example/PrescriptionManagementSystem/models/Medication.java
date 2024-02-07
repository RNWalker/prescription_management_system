package com.example.PrescriptionManagementSystem.models;

public class Medication {

    Long id;
    String name;

    String drugType;

    String indications;

    String adverseEffects;

    String storageInfo;

    public Medication(String name, String drugType, String indications, String adverseEffects, String storageInfo){
        this.name = name;
        this.drugType = drugType;
        this.indications = indications;
        this.adverseEffects = adverseEffects;
        this.storageInfo = storageInfo;
    }

//    default constructor
    public Medication(){}

//    getters and setters
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getIndications(){
        return this.indications;
    }

    public void setIndications(String indications){
        this.indications = indications;
    }

    public String getDrugType(){
        return this.drugType;
    }

    public void setDrugType(String drugType){
        this.drugType = drugType;
    }

    public String getAdverseEffects(){
        return this.adverseEffects;
    }

    public void setAdverseEffects(String adverseEffects){
        this.adverseEffects = adverseEffects;
    }

    public String getStorageInfo(){
        return this.storageInfo;
    }

    public void setStorageInfo(String storageInfo){
        this.storageInfo = storageInfo;
    }


}
