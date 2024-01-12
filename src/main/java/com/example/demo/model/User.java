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
    @Column(name = "typeUser",nullable=false)
    private String typeUser;

    public User(){}

    public User(long idUser, String email, String password, String typeUser) {
        super();
        this.idUser = idUser;
        this.email = email;
        this.password = password;
        this.typeUser = typeUser;
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

    public String getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(String typeUser) {
        this.typeUser = typeUser;
    }
}
