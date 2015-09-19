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
        Output output= new Output(array,0,0,validator);
        assertEquals(output.patternAfterOneTick(array[0][0]),array1[0][0]);
    }

    @Test
    public void shouldReturnAValidOutputPatternInZerothRowAndFirstColumnAfterOneTickForABlockPattern() {
        String array[][] ={{"X","X"},{"X","X"}};
        String array1[][] ={{"X","X"},{"X","X"}};
        Validator validator = new Validator(array);
        Output output= new Output(array,0,1,validator);
        assertEquals(output.patternAfterOneTick(array[0][1]),array1[0][1]);
    }

    @Test
    public void shouldReturnAValidOutputPatternInFirstRowAndZerothColumnAfterOneTickForABlockPattern() {
        String array[][] ={{"X","X"},{"X","X"}};
        String array1[][] ={{"X","X"},{"X","X"}};
        Validator validator = new Validator(array);
        Output output= new Output(array,1,0,validator);
        assertEquals(output.patternAfterOneTick(array[1][0]),array1[1][0]);
    }

    @Test
    public void shouldReturnAValidOutputPatternInFirstRowAndFirstColumnAfterOneTickForABlockPattern() {
        String array[][] ={{"X","X"},{"X","X"}};
        String array1[][] ={{"X","X"},{"X","X"}};
        Validator validator = new Validator(array);
        Output output= new Output(array,1,1,validator);
        assertEquals(output.patternAfterOneTick(array[1][1]),array1[1][1]);
    }

    @Test
    public void shouldReturnAValidOutputPatternInZerothRowAndZerothColumnAfterOneTickForABoatPattern() {
        String array[][] ={{"X","X","-"},{"X","-","X"},{"-","X","-"}};
        String array1[][] ={{"X","X","-"},{"X","-","X"},{"-","X","-"}};
        Validator validator = new Validator(array);
        Output output= new Output(array,0,0,validator);
        assertEquals(output.patternAfterOneTick(array[0][0]),array1[0][0]);
    }

    @Test
    public void shouldReturnAValidOutputPatternInZerothRowAndZerothColumnAfterOneTickForABlinkerPattern() {
        String array[][] ={{"-","X","-"},{"-","X","-"},{"-","X","-"}};
        String outputArray[][] ={{"-","-","-"},{"X","X","X"},{"-","-","-"}};
        Validator validator = new Validator(array);
        Output output= new Output(array,0,0,validator);
        assertEquals(output.patternAfterOneTick(array[0][0]), outputArray[0][0]);
    }

    @Test
    public void shouldBeDeadIfItHasMinusSymbol() {
        String array[][] ={{"-","X","-"},{"-","X","-"},{"-","X","-"}};
        Validator validator = new Validator(array);
        Output output= new Output(array,0,0,validator);
        assertTrue(output.amIDead(array[0][0]));
    }

    @Test
    public void shouldBeAliveIfItHasCrossSymbol() {
        String array[][] ={{"-","X","-"},{"-","X","-"},{"-","X","-"}};
        Validator validator = new Validator(array);
        Output output= new Output(array,0,1,validator);
        assertFalse(output.amIDead(array[0][1]));
    }

    @Test
    public void shouldReturnOneIfTheFirstNeighbourIsAlive() {
        String array[][] ={{"-","-","-"},{"X","X","-"},{"-","-","-"}};
        Validator validator = new Validator(array);
        Output output= new Output(array,1,1,validator);
        assertEquals(output.numberOfNeighboursAlive(array, 1, 1), 1);
    }

    @Test
    public void shouldReturnTwoIfTwoNeighbourIsAlive() {
        String array[][] ={{"-","-","-"},{"X","X","X"},{"-","-","-"}};
        Validator validator = new Validator(array);
        Output output= new Output(array,1,1,validator);
        assertEquals(output.numberOfNeighboursAlive(array, 1, 1), 2);
    }

    @Test
    public void shouldReturnThreeIfThreeNeighboursAreAlive() {
        String array[][] ={{"-","-","-"},{"X","X","X"},{"X","-","-"}};
        Validator validator = new Validator(array);
        Output output= new Output(array,1,1,validator);
        assertEquals(output.numberOfNeighboursAlive(array,1,1),3);
    }

    @Test
    public void shouldReturnFourIfFourNeighboursAreAlive() {
        String array[][] ={{"-","-","-"},{"X","X","X"},{"X","X","-"}};
        Validator validator = new Validator(array);
        Output output= new Output(array,1,1,validator);
        assertEquals(output.numberOfNeighboursAlive(array,1,1),4);
    }

    @Test
    public void shouldReturnFiveIfFiveNeighboursAreAlive() {
        String array[][] ={{"-","-","-"},{"X","X","X"},{"X","X","X"}};
        Validator validator = new Validator(array);
        Output output= new Output(array,1,1,validator);
        assertEquals(output.numberOfNeighboursAlive(array,1,1),5);
    }

    @Test
    public void shouldReturnSixIfSixNeighboursAreAlive() {
        String array[][] ={{"X","-","-"},{"X","X","X"},{"X","X","X"}};
        Validator validator = new Validator(array);
        Output output= new Output(array,1,1,validator);
        assertEquals(output.numberOfNeighboursAlive(array,1,1),6);
    }

    @Test
    public void shouldReturnSevenIfSevenNeighboursAreAlive() {
        String array[][] ={{"X","X","-"},{"X","X","X"},{"X","X","X"}};
        Validator validator = new Validator(array);
        Output output= new Output(array,1,1,validator);
        assertEquals(output.numberOfNeighboursAlive(array,1,1),7);
    }

    @Test
    public void shouldReturnEightIfEightNeighboursAreAlive() {
        String array[][] ={{"X","X","X"},{"X","X","X"},{"X","X","X"}};
        Validator validator = new Validator(array);
        Output output= new Output(array,1,1,validator);
        assertEquals(output.numberOfNeighboursAlive(array,1,1),8);
    }

    @Test
    public void shouldHandleArrayOutOfBoundException() {
        String array[][] ={{"X","X","X"},{"X","X","X"},{"X","X","X"}};
        Validator validator = new Validator(array);
        Output output= new Output(array,1,0,validator);
        assertEquals(output.numberOfNeighboursAlive(array,1,0),5);
    }

    @Test
    public void shouldReturnAValidOutputPatternInZerothRowAndFirstColumnAfterOneTickForABlinkerPattern() {
        String array[][] ={{"-","X","-"},{"-","X","-"},{"-","X","-"}};
        String outputArray[][] ={{"-","-","-"},{"X","X","X"},{"-","-","-"}};
        Validator validator = new Validator(array);
        Output output= new Output(array,0,1,validator);
        assertEquals(output.patternAfterOneTick(array[0][1]), outputArray[0][1]);
    }


}
