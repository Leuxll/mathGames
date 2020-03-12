package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class UserMethods {

    public static void Init()throws IOException {

        for (int i = 0; i < Main.userDatabase.length; i++) {
            Main.userDatabase[i] = new User();
        }

    }

    public static void DisplayUser() {

        for (int i = 0; i < Main.userDatabase.length; i++) {

            if (Main.userDatabase[i].getUserName().equals("-") == false) {
                System.out.println(Main.userDatabase[i].getUserName());
                System.out.println(Arrays.toString(Main.userDatabase[i].getScore()));
            }
            else {
                break;
            }

        }

    }

    public static String AddUser() {

        boolean added = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Username: ");
        String name = scanner.next();

        int score [] = new int [10];
        for (int i = 0; i < Main.userDatabase.length; i++) {

            if (Main.userDatabase[i].getUserName() != "-") {
                Main.userDatabase[i] = new User(name, score);
                added = true;
                break;
            }

        }
        if (added = true) {

            return("User was added");

        }
        else {

            return("User not added, database full");

        }



    }

}
