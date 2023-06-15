package com.regex;

import java.util.Scanner;

public class Regex {
    static String VALID_PATTERN = "^[A-Z][a-z]{2,}$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name :");
        String name = sc.next();
        boolean valid = name.matches(VALID_PATTERN);
        if (valid) {
            System.out.println("Valid First Name! ");
        } else {
            System.out.println("Not valid first name. First letter should " +
                    "Capital rest all small and more then two letters. ");
        }
    }
}