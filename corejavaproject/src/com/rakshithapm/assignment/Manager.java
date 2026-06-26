package com.rakshithapm.assignment;

public class Manager extends employee {

    private String department;

    public Manager() {
    }

    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayManager() {
        displayEmployee();
        System.out.println("Department : " + department);
    }
}