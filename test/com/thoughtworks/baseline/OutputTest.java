package com.thoughtworks.baseline;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class OutputTest {

    @Test
    public void shouldReturnAValidOutputPatternAfterOneTickForABlockPattern() {
        Output output= new Output();
        String array[][] ={{"X","X"},{"X","X"}};
        assertEquals(output.patternAfterOneTick(array),array);
    }

    @Test
    public void shouldReturnAValidOutputPatternAfterOneTickForABoatPattern() {
        Output output= new Output();
        String array[][] ={{"X","X","-"},{"X","-","X"},{"-","X","-"}};
        assertEquals(output.patternAfterOneTick(array),array);
    }
}
