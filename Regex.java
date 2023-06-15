package com.regex;

import java.util.Scanner;

public class Regex {
    static String VALID_MOBILE_NUMBER = "^([0-9]{2}[ ]?[6-9]?[0-9]{9})$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mobile number :");
        String name = sc.nextLine();
        boolean valid = name.matches(VALID_MOBILE_NUMBER);
        System.out.println(valid);
        if (valid) {
            System.out.println("Valid Mobile Number! ");
        } else {
            System.out.println("Not valid number.Enter valid mobile number ");
        }
    }
}
