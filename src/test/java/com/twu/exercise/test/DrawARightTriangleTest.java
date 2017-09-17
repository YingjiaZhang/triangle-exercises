package com.twu.exercise.test;

import com.twu.exercises.DrawARightTriangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrawARightTriangleTest {

    private DrawARightTriangle drawARightTriangle = new DrawARightTriangle();

    @Test
    public void should_draw_a_right_triangle_by_number() throws Exception {
        assertEquals("*\n**\n***\n", drawARightTriangle.printTriangleByNumber(3));
    }
}
