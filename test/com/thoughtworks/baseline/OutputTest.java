package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OutputTest {

    @Test
    public void shouldReturnAValidOutputPatternAfterOneTickForABlockPattern() {
        Output output= new Output();
        assertEquals(output.patternAfterOneTick("XX\nXX"),"XX\nXX");
    }
}
