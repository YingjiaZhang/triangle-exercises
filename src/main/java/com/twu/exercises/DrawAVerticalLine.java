package com.twu.exercises;

public class DrawAVerticalLine {

    public String printAsterisksByNumber(int n) {
        String asterisks = "";
        for (int i = 0; i < n; i++) {
           asterisks += "*\n";
        }
        return asterisks;
    }
}
