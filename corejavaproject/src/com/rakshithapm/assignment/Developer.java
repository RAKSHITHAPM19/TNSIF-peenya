package com.rakshithapm.assignment;

public class Developer extends employee {

    private String programmingLanguage;

    public Developer() {
    }

    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDeveloper() {
        displayEmployee();
        System.out.println("Programming Language : " + programmingLanguage);
    }
}