package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner options = new Scanner(System.in);
        char userInput = ' ';
        String output = "";

        do {
            System.out.println("Welcome to the Math Game");
            System.out.println("========================");
            System.out.println("1. Start a new game\n2. Display single highest and lowest scores\n3. Display scores sorted from highest to lowest\n4. Display scores sorted from lower to highest\n5. Quit");

            userInput = options.next().charAt(0);

            if (userInput == '1'){
                output = Game.Game(userInput);
            }
            else if (userInput == '2'){
                System.out.println("Display single highest and lowest scores");
                output = Scores.Scores(userInput, 10);
            }
            else if (userInput == '3'){
                System.out.println("Display scores sorted from highest to lowest");
            }
            else if (userInput == '4'){
                System.out.println("Display scores sorted from lowest to highest");
            }

        } while (userInput != '5');
        System.out.println("Thank you for for playing the game!");

    }
}
