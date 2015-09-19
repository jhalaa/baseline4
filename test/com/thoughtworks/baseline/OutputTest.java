package com.thoughtworks.baseline;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class OutputTest {

    @Test
    public void shouldReturnAValidOutputPatternInZerothRowAndZerothColumnAfterOneTickForABlockPattern() {
        Output output= new Output();
        String array[][] ={{"X","X"},{"X","X"}};
        String array1[][] ={{"X","X"},{"X","X"}};
        assertEquals(output.patternAfterOneTick(array[0][0]),array1[0][0]);
    }

    @Test
    public void shouldReturnAValidOutputPatternInZerothRowAndFirstColumnAfterOneTickForABlockPattern() {
        Output output= new Output();
        String array[][] ={{"X","X"},{"X","X"}};
        String array1[][] ={{"X","X"},{"X","X"}};
        assertEquals(output.patternAfterOneTick(array[0][1]),array1[0][1]);
    }



}
