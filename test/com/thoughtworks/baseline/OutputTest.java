package com.thoughtworks.baseline;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;


public class OutputTest {

    @Test
    public void shouldReturnAValidOutputPatternInZerothRowAndZerothColumnAfterOneTickForABlockPattern() {
        String array[][] ={{"X","X"},{"X","X"}};
        String array1[][] ={{"X","X"},{"X","X"}};
        Validator validator = new Validator(array);
        Neighbour neighbour = new Neighbour(validator);
        Output output= new Output(array,0,0,validator,neighbour);
        assertEquals(output.patternAfterOneTick(array[0][0]),array1[0][0]);
    }

    @Test
    public void shouldReturnAValidOutputPatternInZerothRowAndFirstColumnAfterOneTickForABlockPattern() {
        String array[][] ={{"X","X"},{"X","X"}};
        String array1[][] ={{"X","X"},{"X","X"}};
        Validator validator = new Validator(array);
        Neighbour neighbour = new Neighbour(validator);
        Output output= new Output(array,0,1,validator,neighbour);
        assertEquals(output.patternAfterOneTick(array[0][1]),array1[0][1]);
    }

    @Test
    public void shouldReturnAValidOutputPatternInFirstRowAndZerothColumnAfterOneTickForABlockPattern() {
        String array[][] ={{"X","X"},{"X","X"}};
        String array1[][] ={{"X","X"},{"X","X"}};
        Validator validator = new Validator(array);
        Neighbour neighbour = new Neighbour(validator);
        Output output= new Output(array,1,0,validator,neighbour);
        assertEquals(output.patternAfterOneTick(array[1][0]),array1[1][0]);
    }

    @Test
    public void shouldReturnAValidOutputPatternInFirstRowAndFirstColumnAfterOneTickForABlockPattern() {
        String array[][] ={{"X","X"},{"X","X"}};
        String array1[][] ={{"X","X"},{"X","X"}};
        Validator validator = new Validator(array);
        Neighbour neighbour = new Neighbour(validator);
        Output output= new Output(array,1,1,validator,neighbour);
        assertEquals(output.patternAfterOneTick(array[1][1]),array1[1][1]);
    }

    @Test
    public void shouldReturnAValidOutputPatternInZerothRowAndZerothColumnAfterOneTickForABoatPattern() {
        String array[][] ={{"X","X","-"},{"X","-","X"},{"-","X","-"}};
        String array1[][] ={{"X","X","-"},{"X","-","X"},{"-","X","-"}};
        Validator validator = new Validator(array);
        Neighbour neighbour = new Neighbour(validator);
        Output output= new Output(array,0,0,validator,neighbour);
        assertEquals(output.patternAfterOneTick(array[0][0]), array1[0][0]);
    }

    @Test
    public void shouldReturnAValidOutputPatternInZerothRowAndZerothColumnAfterOneTickForABlinkerPattern() {
        String array[][] ={{"-","X","-"},{"-","X","-"},{"-","X","-"}};
        String outputArray[][] ={{"-","-","-"},{"X","X","X"},{"-","-","-"}};
        Validator validator = new Validator(array);
        Neighbour neighbour = new Neighbour(validator);
        Output output= new Output(array,0,0,validator,neighbour);
        assertEquals(output.patternAfterOneTick(array[0][0]), outputArray[0][0]);
    }

    @Test
    public void shouldReturnAValidOutputPatternInZerothRowAndFirstColumnAfterOneTickForABlinkerPattern() {
        String array[][] ={{"-","X","-"},{"-","X","-"},{"-","X","-"}};
        String outputArray[][] ={{"-","-","-"},{"X","X","X"},{"-","-","-"}};
        Validator validator = new Validator(array);
        Neighbour neighbour = new Neighbour(validator);
        Output output= new Output(array,0,1,validator,neighbour);
        assertEquals(output.patternAfterOneTick(array[0][1]), outputArray[0][1]);
    }

    @Test
    public void shouldReturnAValidOutputPatternInFirstRowAndzerothColumnAfterOneTickForABlinkerPattern() {
        String array[][] ={{"-","X","-"},{"-","X","-"},{"-","X","-"}};
        String outputArray[][] ={{"-","-","-"},{"X","X","X"},{"-","-","-"}};
        Validator validator = new Validator(array);
        Neighbour neighbour = new Neighbour(validator);
        Output output= new Output(array,1,0,validator,neighbour);
        assertEquals(output.patternAfterOneTick(array[1][0]), outputArray[1][0]);
    }


}
