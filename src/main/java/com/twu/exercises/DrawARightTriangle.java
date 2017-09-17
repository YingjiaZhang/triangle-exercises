package com.twu.exercises;

public class DrawARightTriangle {

    public String printTriangleByNumber(int n) {
        String triangle = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                triangle += "*";
            }
            triangle += "\n";
        }
        System.out.println(triangle);
        return triangle;
    }
}
