package cesde.domain;

import java.util.Scanner;

public class School {

    Scanner sc = new Scanner(System.in);

    // Attributes

    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private boolean status;

    // Constructors

    public School() {

    }

    public School(int id) {
        this.id = id;
    }

    public School(int id, String name, String address, String phone, String email, boolean status) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Methods

}
