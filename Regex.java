package com.regex;

import java.util.Scanner;

public class Regex {
    static String VALID_EMAIL_ID = "^([a-zA-Z]{3,}([.]?[A-Za-z0-9]+)?[@][a-zA-Z]+[.][a-zA-Z]{2}([.][a-zA-Z]{2})?)$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter valid email id :");
        String name = sc.next();
        boolean valid = name.matches(VALID_EMAIL_ID);

        if (valid == true) {
            System.out.println("Valid Email Id! ");
        } else {
            System.out.println("Not valid email id.Enter Valid Email Id");
        }
    }
}
