package com.example;

import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Richard Nham
 */

public class Main {

    public static void main(String[] args) {
        Scanner scannerUserInput= new Scanner(System.in);
        int l;
        int b;
        final double conversion_factor = 0.09290304;

        System.out.println("What is the length of the room in feet?");
        l =  scannerUserInput.nextInt();

        System.out.println("What is the breadth of the room in feet?");
        b =  scannerUserInput.nextInt();

        System.out.println("The area is");
        int area = l * b;
        double metric_area = area * conversion_factor;
        System.out.println(area +" square feet");
        System.out.println(metric_area +" square meters");

        scannerUserInput.close();
    }

}
