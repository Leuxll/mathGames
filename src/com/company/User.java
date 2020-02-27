package com.company;

public class User {

    private String userName;
    private int score[];

    public User(){

        userName = "-";

    }

    public User (String userName, int []score) {

        this.userName = userName;
        this.score = score;

    }

    String getUserName() {

        return this.userName;

    }

    int [] getScore() {

        return this.score;

    }

    void setUserName(String name) {
        this.userName = name;
    }

    void setScore(int[] score) {
        this.score = score;
    }

    int[] sortedScore() {

        for (int i = 0; i < score.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < score.length; j++) {
                if (score[j] < score[index]) {
                    index = j;
                }
            }

            if (index != 1) {
                int smallestNumber = score[index];
                score[index] = score[i];
                score[i] = smallestNumber;
            }

        }

        return score;

    }

}
