package com.fatimatubana;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float[] numbers = new float[20];

        numbers[0] = 1.1f;
        numbers[1] = 1.3f;
        numbers[2] = 1.2f;
        numbers[3] = 1.9f;
        numbers[4] = 1.5f;
        numbers[5] = 1.7f;
        numbers[6] = 1.4f;
        numbers[7] = 1.8f;
        numbers[8] = 1.6f;
        numbers[9] = 2.0f;
        numbers[10] = 2.1f;
        numbers[11] = 2.5f;
        numbers[12] = 2.2f;
        numbers[13] = 2.6f;
        numbers[14] = 2.3f;
        numbers[15] = 2.7f;
        numbers[16] = 2.4f;
        numbers[17] = 2.8f;
        numbers[18] = 2.9f;
        numbers[19] = 3.0f;

        for(int i = 0; i<numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }

        System.out.println("New array:");

        float[] number = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for(int i = 0; i<number.length; i++)
        {
            System.out.println(number[i]);
        }
    }
}
