package org.app.implementations;

import org.app.interfaces.AdminInterface;

import java.util.Objects;


public class Admin implements AdminInterface {
    private int id;
    private String username;
    private Double beenz;

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setBeenz(Double beenz) {
        this.beenz = beenz;
    }


    // EmployeeInterface Methods Getters

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public double getBeenz() {
        return this.beenz;
    }

    // AdminInterface Methods

    @Override
    public void accessTrainingSystem() {
        System.out.println("Accessed The System");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Admin user = (Admin) obj;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
