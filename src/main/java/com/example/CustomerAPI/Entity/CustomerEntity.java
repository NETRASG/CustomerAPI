package com.example.CustomerAPI.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CustomerEntity {
    @Id
    @Column
    private int id;
    @Column
    private String fname;
    @Column
    private  String lname;
    @Column
    private  String email;
    @Column
    private String gender;
    @Column
    private  long phone_num;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(long phone_num) {
        this.phone_num = phone_num;
    }
}
