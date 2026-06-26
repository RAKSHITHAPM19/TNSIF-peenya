package com.rakshithapm.assignment.utilites;

import com.rakshithapm.assignment.Manager;
import com.rakshithapm.assignment.Developer;

public class main {

    public static void main(String[] args) {

        Manager manager = new Manager(
                "Rakshitha",
                101,
                80000,
                "Human Resources");

        Developer developer = new Developer(
                "amayra",
                102,
                65000,
                "Java");

        System.out.println("===== Manager Details =====");
        manager.displayManager();

        System.out.println();

        System.out.println("===== Developer Details =====");
        developer.displayDeveloper();
    }
}