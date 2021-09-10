package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
public class App {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("What is the input string? " );
        String name= sc.nextLine();
        int nameLength = name.length();
        System.out.println(name + " has " + nameLength + " characters");
    }
}

