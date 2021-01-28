package com.ironhack.relationshipex.model;

import javax.persistence.*;

@Entity
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String department;
    private boolean ternure;
    @OneToOne
    @JoinColumn(name = "office_id")
    private Office office;

    public Faculty() {
    }

    public Faculty(String firstName, String lastName, String department, boolean ternure, Office office) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.ternure = ternure;
        this.office = office;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isTernure() {
        return ternure;
    }

    public void setTernure(boolean ternure) {
        this.ternure = ternure;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }
}
