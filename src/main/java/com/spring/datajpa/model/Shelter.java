package com.spring.datajpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shelters")
public class Shelter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    @Column(name = "home_address")
    private String homeAddress;
    @Column(name = "work_number")
    private int workerNumber;
    @Column(name = "animal_number")
    private int animalNumber;
    @Column(name = "phone_number")
    private String phoneNumber;

    public int getId() {
        return id;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public int getWorkerNumber() {
        return workerNumber;
    }

    public int getAnimalNumber() {
        return animalNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
