package com.company.user;

public class Transport {
    //Šie laukai dažniausiai reikalaujami:
    private String make;
    private String model;
    private String type;
    private String vinNo;
    private String fuelType;

    //Konstruktorius iš privalomų laukų:
    public Transport(String make, String model, String type) {
        this.make = make;
        this.model = model;
        this.type = type;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVinNo(String vinNo) {
        this.vinNo = vinNo;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getVinNo() {
        return vinNo;
    }

    public String getFuelType() {
        return fuelType;
    }
}
