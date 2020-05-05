package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static String Game(char Input){

        int points = 0;
        Random rand = new Random();

        for(int i = 0; i <= 5; i++){

            int randPlusOrMinus = rand.nextInt(2);
            int randNumber = -50 + rand.nextInt(100);
            int randNumber2 = -50 + rand.nextInt(100);

            if (randPlusOrMinus == 0) {

                int sum = randNumber + randNumber2;

                System.out.println("What is " + randNumber + " + " + randNumber2 + " ?");
                Scanner scanner = new Scanner(System.in);
                int answer = scanner.nextInt();
                if (answer == sum) {
                    System.out.println("You got it correct");
                    points = points + 1;
                    System.out.println("Your score is: " + points);

                }

                else {
                    System.out.println("You got it wrong, the correct answer is " + sum);
                    points = points - 1;
                    System.out.println("Your score is: " + points);
                }

            }
            else {
                int sum = randNumber - randNumber2;

                System.out.println("What is " + randNumber + " - " + randNumber2 + " ?");
                Scanner scanner = new Scanner(System.in);
                int answer = scanner.nextInt();
                if (answer == sum) {
                    System.out.println("You got it correct");
                    points = points + 2;
                    System.out.println("Your score is: " + points);
                }

                else {
                    System.out.println("You got it wrong, the correct answer is " + sum);
                    points = points - 1;
                    System.out.println("Your score is: " + points);
                }
            }
        }

        for(int i = 0; i <= 5; i++){

            int randMultipleOrDivide = rand.nextInt(2);

            if (randMultipleOrDivide == 0) {

                int randNumber = -50 + rand.nextInt(100);
                int randNumber2 = -50 + rand.nextInt(100);

                int product = randNumber * randNumber2;

                System.out.println("What is " + randNumber + " * " + randNumber2 + " ?");
                Scanner scanner = new Scanner(System.in);
                int answer = scanner.nextInt();
                if (answer == product) {
                    System.out.println("You got it correct");
                    points = points + 3;
                    System.out.println("Your score is: " + points);


                }

                else {
                    System.out.println("You got it wrong, the correct answer is " + product);
                    points = points - 1;
                    System.out.println("Your score is: " + points);
                }

            }
            else {
                int randNumber = -50 + rand.nextInt(100);
                int randNumber2 = -50 + rand.nextInt(100);

                while (randNumber % randNumber2 == 0) {
                    int product = randNumber / randNumber2;

                    System.out.println("What is " + randNumber + " / " + randNumber2 + " ?");
                    Scanner scanner = new Scanner(System.in);
                    int answer = scanner.nextInt();
                    if (answer == product) {
                        System.out.println("You got it correct");
                        points = points + 4;
                        System.out.println("Your score is: " + points);
                    } else {
                        System.out.println("You got it wrong, the correct answer is " + product);
                        points = points - 1;
                        System.out.println("Your score is: " + points);
                    }
                }
            }
        }

        return("Your score is: " + points);

    }
}
