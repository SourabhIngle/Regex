package com.regex;

import java.util.Scanner;

public class Regex {
    static String VALID_EMAIL_ID ="^[a-zA-Z]{3,}(([+]|[-]|[.])?[a-zA-Z0-9]+)?@[a-zA-Z0-9]{1,}+[.][a-zA-Z]{3}([.]|[,])?([a-zA-Z]?)*$";

    public static void main(String[] args) {

//THIS IS THE LIST OF VALID EMAILS.
        String VALID_1 = "abc@yahoo.com,";
        String VALID_2 = "abc-100@yahoo.com,";
        String VALID_3 = "abc.100@yahoo.com";
        String VALID_4 = "abc111@abc.com,";
        String VALID_5 = "abc-100@abc.net,";
        String VALID_6 = "abc.100@abc.com.au";
        String VALID_7 = "abc@1.com,";
        String VALID_8 = "abc@gmail.com.com";
        String VALID_9 = "abc+100@gmail.com";


//THIS IS THE LIST OF N0T-VALID EMAILS.
        String NOT_VALID_1 = "abc – must contains “@” symbol";
        String NOT_VALID_2 = "2. abc@.com.my – tld can not start with dot “.”";
        String NOT_VALID_3 = "abc123@gmail.a – “.a” is not a valid tld, last tld must " +
                "\ncontains at least two characters";
        String NOT_VALID_4 = "abc123@.com – tld can not start with dot “.”";
        String NOT_VALID_5 = "abc123@.com.com – tld can not start with dot “.”";
        String NOT_VALID_6 = ".abc@abc.com – email’s 1st character can not start with “.”";
        String NOT_VALID_7 = "abc()*@gmail.com – email’s is only allow character, digit, underscore and dash";
        String NOT_VALID_8 = "abc@%*.com – email’s tld is only allow character and digit";
        String NOT_VALID_9 = "abc..2002@gmail.com – double dots “.” are not allow";
        String NOT_VALID_10 = "abc.@gmail.com – email’s last character can not end with dot “.”";
        String NOT_VALID_11 = "abc@abc@gmail.com – double “@” is not allow";
        String NOT_VALID_12 = "abc@gmail.com.1a -email’s tld which has two characters can not contains digit";
        String NOT_VALID_13 = "abc@gmail.com.aa.au - cannot have multiple email’s tld";

        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("[CHECKING VALID EMAILS]");
        System.out.println("If true, that means all emails are valid :: ");
        System.out.println();
        String[] validEmails = {VALID_1, VALID_2, VALID_3, VALID_4, VALID_5, VALID_6, VALID_7, VALID_8, VALID_9};
        for (int i =0; i<validEmails.length; i++) {
            int serialNumber =i+1;
            checkValidEmails(validEmails[i],serialNumber);
        }

        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("[CHECKING INVALID EMAILS]");
        System.out.println("If false, that means all emails are invalid :: ");
        System.out.println();
        String[] NotValidEmails = {NOT_VALID_1, NOT_VALID_2, NOT_VALID_3, NOT_VALID_4, NOT_VALID_5, NOT_VALID_6, NOT_VALID_7,
                NOT_VALID_8, NOT_VALID_9, NOT_VALID_10, NOT_VALID_11, NOT_VALID_12, NOT_VALID_13};
        for (int i =0; i<NotValidEmails.length; i++) {
            int serialNumber =i+1;
            checkValidEmails(NotValidEmails[i],serialNumber);
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------");
    }
    private static void checkValidEmails(String name,int number) {
        boolean valid = name.matches(VALID_EMAIL_ID);
        System.out.println(number +".)["+name + "] email is ------------->" + valid);
    }
}
