package com.regex;

import java.util.Scanner;

public class Regex {
    static String VALID_LAST_NAME = "^[A-Z][a-z]{2,}$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Last Name :");
        String name = sc.next();
        boolean valid = name.matches(VALID_LAST_NAME);
        if (valid) {
            System.out.println("Valid Last Name! ");
        } else {
            System.out.println("Not valid Last name. First letter should " +
                    "Capital rest all small and more then two letters. ");
        }
    }
}
