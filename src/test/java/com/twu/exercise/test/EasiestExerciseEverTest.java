package com.twu.exercise.test;

import com.twu.exercises.EasiestExerciseEver;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EasiestExerciseEverTest {

    private EasiestExerciseEver triangle = new EasiestExerciseEver();

    @Test
    public void should_return_a_asterisk() throws Exception {
        assertEquals("*", triangle.printAsterisks());
    }
}
