package cesde.domain;

import java.util.Scanner;

public class Teacher {

    Scanner sc = new Scanner(System.in);

    // Attributes

    private int id;
    private String name;
    private String lastName;
    private String email;
    private String specialty;
    private boolean status;

    // Constructors

    public Teacher() {

    }

    public Teacher(String email) {
        this.email = email;
    }

    public Teacher(int id, String name, String lastName, String email, String specialty, boolean status) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.specialty = specialty;
        this.status = status;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Methods

}
