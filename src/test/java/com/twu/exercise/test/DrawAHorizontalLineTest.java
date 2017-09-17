package com.twu.exercise.test;

import com.twu.exercises.DrawAHorizontalLine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrawAHorizontalLineTest {

    private DrawAHorizontalLine drawAHorizontalLine = new DrawAHorizontalLine();

    @Test
    public void should_return_asterisks_on_one_line_by_input_number() throws Exception {
        assertEquals("********", drawAHorizontalLine.printAsterisksByNumber(8));
    }
}
