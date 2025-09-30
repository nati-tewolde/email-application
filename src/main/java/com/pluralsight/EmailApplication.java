package com.pluralsight;

import java.util.Scanner;

public class EmailApplication {
    public static void main(String[] args) {

        /*Instructions
        Create a new Java project named EmailApplication.Remember: always create your GitHub repository first, then create the IntelliJ project in your pluralsight/workbook-2 folder.
        Use a Git repository when creating the project.In the com.pluralsight package, create a new Java class named EmailApplication.Inside the main method, write code that does the following:
        Prompt the user to enter their email address.Store the value in a String variable. Trim the string to remove extra spaces. Extract just the username (the characters before the @).
        Convert the username to lowercase. Display the username and its length. Check whether the email ends with "@school.edu". If true, display "This is a school email."
        Otherwise, display "This is not a school email.".Run your program and verify that the output is correct.Commit and push your changes to GitHub.*/

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = input.nextLine();

        String trimmedEmail = email.trim();

        /*int atIndex = trimmedEmail.indexOf('c');
        String username = trimmedEmail.substring(0, usernameIndex);*/

        int atIndex = trimmedEmail.indexOf('@'); // Refactored using hints for real world applicability
        String username;
        if (atIndex != -1){
            username = trimmedEmail.substring(0, atIndex);
        } else {
            System.out.println("Error: no @ symbol found.");
            return;
        }

        username = username.toLowerCase();

        System.out.println("Username: " + username + "\nUsername length: " + username.length());

        if (trimmedEmail.toLowerCase().endsWith("@school.edu")) {
            System.out.println("This is a school email.");
        } else {
            System.out.println("This is not a school email.");
        }

        input.close();

    }
}
