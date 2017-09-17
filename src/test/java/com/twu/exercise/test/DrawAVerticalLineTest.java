package com.twu.exercise.test;

import com.twu.exercises.DrawAVerticalLine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrawAVerticalLineTest {

    private DrawAVerticalLine drawAVerticalLine = new DrawAVerticalLine();

    @Test
    public void should_return_vertical_line_asterisks_by_number() throws Exception {
        assertEquals("*\n*\n*\n*\n*\n*\n*\n*\n",drawAVerticalLine.printAsterisksByNumber(8));
    }
}
