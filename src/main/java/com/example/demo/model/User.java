package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idUser;
    @Column(name = "email",nullable=false)
    private String email;
    @Column(name = "password",nullable=false)
    private String password;
    @Column(name = "userType",nullable=false)
    private String userType;

    public User(){}

    public User(long idUser, String email, String password, String userType) {
        super();
        this.idUser = idUser;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String typeUser) {
        this.userType = typeUser;
    }
}
