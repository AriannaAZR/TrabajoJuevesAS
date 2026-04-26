package cesde.domain;

import java.util.Scanner;

public class Classroom {

    Scanner sc = new Scanner(System.in);

    // Attributes

    private int id;
    private String name;
    private String building;
    private int capacity;
    private boolean status;

    // Constructors

    public Classroom() {

    }

    public Classroom(int id) {
        this.id = id;
    }

    public Classroom(int id, String name, String building, int capacity, boolean status) {
        this.id = id;
        this.name = name;
        this.building = building;
        this.capacity = capacity;
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

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Methods

}
