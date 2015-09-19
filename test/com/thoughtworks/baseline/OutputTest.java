package com.thoughtworks.baseline;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;


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

    @Test
    public void shouldReturnAValidOutputPatternInFirstRowAndZerothColumnAfterOneTickForABlockPattern() {
        Output output= new Output();
        String array[][] ={{"X","X"},{"X","X"}};
        String array1[][] ={{"X","X"},{"X","X"}};
        assertEquals(output.patternAfterOneTick(array[1][0]),array1[1][0]);
    }

    @Test
    public void shouldReturnAValidOutputPatternInFirstRowAndFirstColumnAfterOneTickForABlockPattern() {
        Output output= new Output();
        String array[][] ={{"X","X"},{"X","X"}};
        String array1[][] ={{"X","X"},{"X","X"}};
        assertEquals(output.patternAfterOneTick(array[1][1]),array1[1][1]);
    }

    @Test
    public void shouldReturnAValidOutputPatternInZerothRowAndZerothColumnAfterOneTickForABoatPattern() {
        Output output= new Output();
        String array[][] ={{"X","X","-"},{"X","-","X"},{"-","X","-"}};
        String array1[][] ={{"X","X","-"},{"X","-","X"},{"-","X","-"}};
        assertEquals(output.patternAfterOneTick(array[0][0]),array1[0][0]);
    }

    @Test
    public void shouldReturnAValidOutputPatternInZerothRowAndZerothColumnAfterOneTickForABlinkerPattern() {
        Output output= new Output();
        String array[][] ={{"-","X","-"},{"-","X","-"},{"-","X","-"}};
        String outputArray[][] ={{"-","-","-"},{"X","X","X"},{"-","-","-"}};
        assertEquals(output.patternAfterOneTick(array[0][0]), outputArray[0][0]);
    }

    @Test
    public void shouldBeDeadIfItHasMinusSymbol() {
        Output output= new Output();
        String array[][] ={{"-","X","-"},{"-","X","-"},{"-","X","-"}};
        assertTrue(output.amIDead(array[0][0]));
    }

    @Test
    public void shouldBeAliveIfItHasCrossSymbol() {
        Output output= new Output();
        String array[][] ={{"-","X","-"},{"-","X","-"},{"-","X","-"}};
        assertFalse(output.amIDead(array[0][1]));
    }

    @Test
    public void shouldReturnOneIfTheFirstNeighbourIsAlive() {
        Output output= new Output();
        String array[][] ={{"X","X","-"},{"-","-","-"},{"-","-","-"}};
        assertEquals(output.numberOfNeighboursAlive(array,0,1),1);
    }

    @Test
    public void shouldReturnTwoIfTwoNeighbourIsAlive() {
        Output output= new Output();
        String array[][] ={{"X","X","X"},{"-","-","-"},{"-","-","-"}};
        assertEquals(output.numberOfNeighboursAlive(array,0,1),2);
    }

    @Test
    public void shouldReturnThreeIfThreeNeighboursAreAlive() {
        Output output= new Output();
        String array[][] ={{"X","X","X"},{"X","-","-"},{"-","-","-"}};
        assertEquals(output.numberOfNeighboursAlive(array,0,1),3);
    }



}
