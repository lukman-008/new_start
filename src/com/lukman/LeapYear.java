package com.lukman;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int Year = s.nextInt();
        if(Year%4==0)
        {
            System.out.println("It is Leap Year");
        }
        else
            System.out.println("It is not a Leap year");
    }
}
