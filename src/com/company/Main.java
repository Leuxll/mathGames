package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static User [] userDatabase = new User[10];

//    public static void main(String[] args) throws IOException {
//
//        Scanner options = new Scanner(System.in);
//        char userInput = ' ';
//        String output = "";
//
//        do {
//            System.out.println("Welcome to the Math Game");
//            System.out.println("========================");
//            System.out.println("1. Start a new game\n2. Display single highest and lowest scores\n3. Display scores sorted from highest to lowest\n4. Display scores sorted from lower to highest\n5. Quit");
//
//            userInput = options.next().charAt(0);
//
//            if (userInput == '1') {
//                output = Game.Game(userInput);
//            } else if (userInput == '2') {
//                System.out.println("Display single highest and lowest scores");
//                //output = Scores.Scores(userInput, 10);
//            } else if (userInput == '3') {
//                System.out.println("Display scores sorted from highest to lowest");
//            } else if (userInput == '4') {
//                System.out.println("Display scores sorted from lowest to highest");
//            }
//
//        } while (userInput != '5');
//        System.out.println("Thank you for for playing the game!");
//
//    }

    public static void main(String[] args) throws IOException{

        Scanner scanner = new Scanner(System.in);
        UserMethods.Init();
        char choice = '1';

        while (choice != '3') {
            System.out.println("Welcome to the Math Game");
            System.out.println("========================");
            System.out.println("Enter a choice: \n\n1. Existing User\n2. New User\n3. Quit");
            choice = scanner.nextLine().charAt(0);

            if (choice == '1') {
                UserMethods.DisplayUser();
            }
            else if (choice == '2') {
                System.out.println(UserMethods.AddUser());
            }
        }

    }
}
