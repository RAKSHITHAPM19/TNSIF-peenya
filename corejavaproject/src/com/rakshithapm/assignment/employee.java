package com.rakshithapm.assignment;

public class employee {

    
    private String name;
    private int employeeId;
    private double salary;

    public employee() {
    }

    
    public employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

   
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

  
    public void displayEmployee() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Salary        : " + salary);
    }
}