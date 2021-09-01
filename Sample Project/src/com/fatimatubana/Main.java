package com.fatimatubana;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //prints Hello World
        System.out.println("Hello World");

        //get userInput
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}
