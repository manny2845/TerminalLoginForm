package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/loginForm.txt");

        Scanner data = new Scanner(file); // scans the txt file
        Scanner input = new Scanner(System.in);// scans for user input

        String storedUser = data.nextLine();
        String storedPass = data.nextLine();//stores both lines of the txt file to string variables

        System.out.println("Enter user name: ");
        String user = input.nextLine();
        System.out.println("Enter password");
        String pass = input.nextLine();        //stores user input into string variables


        if(user.equals(storedUser)&&storedPass.equals(pass)) {    //checks to see if the user input matches whats on file
            System.out.printf("your user %s is correct and your pass %s is correct", user,pass);
        }else{
            System.out.println("that is incorrect");
        }


    }

}


