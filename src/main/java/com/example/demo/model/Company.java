package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long nit;
    @Column(name = "companyName",nullable=false)
    private String companyName;
    @Column(name = "adress",nullable=false)
    private String adress;
    @Column(name = "phone",nullable=false)
    private long phone;

    public Company(){}

    public Company(long nit, String companyName, String adress, long phone) {
        super();
        this.nit = nit;
        this.companyName = companyName;
        this.adress = adress;
        this.phone = phone;
    }

    public long getNit() {
        return nit;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

}
