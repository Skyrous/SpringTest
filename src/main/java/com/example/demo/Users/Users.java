package com.example.demo.Users;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;

@Entity
@Table
public class Users {
    @Id
    @SequenceGenerator(
            name = "users_sequence",
            sequenceName = "users_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "users_sequence"
    )
    private Long id;
    @Value("$name: N/a")
    private String name;
    @Value("$email: N/a")
    private String email;
    @Value("$adress: N/a")
    private String adress;
    @Value("$phoneNumber: N/a")
    private String phoneNumber;
    public Users() {
    }

    public Users(Long id, String name, String email, String adress, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public Users(String name, String email, String adress, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
