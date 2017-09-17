package com.twu.exercises;

public class DrawAHorizontalLine {

    public String printAsterisksByNumber(int n) {
        String asterisks = "";
        for (int i = 0; i < n ; i++) {
            asterisks += "*";
        }
        return asterisks;
    }
}
