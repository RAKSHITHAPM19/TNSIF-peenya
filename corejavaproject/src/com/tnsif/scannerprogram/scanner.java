package com.tnsif.scannerprogram;

import java.util.Scanner;

// Demo for Scanner class

public class scanner{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the ID:");
        int id = sc.nextInt();

        sc.nextLine(); // Consume the leftover newline

        System.out.println("Enter the Address:");
        String address = sc.nextLine();

        System.out.println("ID: " + id);
        System.out.println("Address: " + address);

        sc.close();
    }
}