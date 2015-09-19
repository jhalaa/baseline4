package com.thoughtworks.baseline;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NeighbourTest {

    @Test
    public void shouldReturnOneIfTheFirstNeighbourIsAlive() {
        String array[][] ={{"-","-","-"},{"X","X","-"},{"-","-","-"}};
        Validator validator = new Validator(array);
        Neighbour neighbour = new Neighbour(validator);
        assertEquals(neighbour.numberOfNeighboursAlive(array, 1, 1), 1);
    }

    @Test
    public void shouldReturnTwoIfTwoNeighbourIsAlive() {
        String array[][] ={{"-","-","-"},{"X","X","X"},{"-","-","-"}};
        Validator validator = new Validator(array);
        Neighbour neighbour = new Neighbour(validator);
        assertEquals(neighbour.numberOfNeighboursAlive(array, 1, 1), 2);
    }

    @Test
    public void shouldReturnThreeIfThreeNeighboursAreAlive() {
        String array[][] ={{"-","-","-"},{"X","X","X"},{"X","-","-"}};
        Validator validator = new Validator(array);
        Neighbour neighbour = new Neighbour(validator);
        assertEquals(neighbour.numberOfNeighboursAlive(array,1,1),3);
    }

    @Test
    public void shouldReturnFourIfFourNeighboursAreAlive() {
        String array[][] ={{"-","-","-"},{"X","X","X"},{"X","X","-"}};
        Validator validator = new Validator(array);
        Neighbour neighbour = new Neighbour(validator);
        assertEquals(neighbour.numberOfNeighboursAlive(array,1,1),4);
    }

    @Test
    public void shouldReturnFiveIfFiveNeighboursAreAlive() {
        String array[][] ={{"-","-","-"},{"X","X","X"},{"X","X","X"}};
        Validator validator = new Validator(array);
        Neighbour neighbour = new Neighbour(validator);
        assertEquals(neighbour.numberOfNeighboursAlive(array,1,1),5);
    }

    @Test
    public void shouldReturnSixIfSixNeighboursAreAlive() {
        String array[][] ={{"X","-","-"},{"X","X","X"},{"X","X","X"}};
        Validator validator = new Validator(array);
        Neighbour neighbour = new Neighbour(validator);
        assertEquals(neighbour.numberOfNeighboursAlive(array,1,1),6);
    }

    @Test
    public void shouldReturnSevenIfSevenNeighboursAreAlive() {
        String array[][] ={{"X","X","-"},{"X","X","X"},{"X","X","X"}};
        Validator validator = new Validator(array);
        Neighbour neighbour = new Neighbour(validator);
        assertEquals(neighbour.numberOfNeighboursAlive(array, 1, 1),7);
    }

    @Test
    public void shouldReturnEightIfEightNeighboursAreAlive() {
        String array[][] ={{"X","X","X"},{"X","X","X"},{"X","X","X"}};
        Validator validator = new Validator(array);
        Neighbour neighbour = new Neighbour(validator);
        assertEquals(neighbour.numberOfNeighboursAlive(array,1,1),8);
    }

    @Test
    public void shouldHandleArrayOutOfBoundException() {
        String array[][] ={{"X","X","X"},{"X","X","X"},{"X","X","X"}};
        Validator validator = new Validator(array);
        Neighbour neighbour = new Neighbour(validator);
        assertEquals(neighbour.numberOfNeighboursAlive(array,1,0),5);
    }
}
