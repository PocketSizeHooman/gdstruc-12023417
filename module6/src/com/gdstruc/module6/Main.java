package com.gdstruc.module6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] arrayNames = new String[6];
        arrayNames[0] = "Ella";
        arrayNames[1] = "Patricia";
        arrayNames[2] = "Marliya";
        arrayNames[3] = "Cian";
        arrayNames[4] = "Mary";
        arrayNames[5] = "Flora";


        System.out.println("Enter the length of name that you want to find: ");
        Scanner size = new Scanner(System.in);
        int num = size.nextInt();
        for(int i = 0; i < arrayNames.length; i++){
            char[] cArray = arrayNames[i].toCharArray();
            if(cArray.length > num) {
                System.out.println("Name contains " + num + " letter = " + arrayNames[i]);
            }else {
                System.out.println("Name Doesnt contains " + num + " letter = " + arrayNames[i]);
            };
        }

    }
}
