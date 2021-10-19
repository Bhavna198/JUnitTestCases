package com.bridgelabz;

/**
 * Evaluating the first name by using JUnit
 */

public class JUnitSourceFile {
    static String FIRST_NAME = "^[A-Z][a-z]{2,}$";

    public static boolean validName(String inputName) {
        return inputName.matches(FIRST_NAME);
    }

    public static void main(String[] args) {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(" Welcome to User registration ");
    }

}


