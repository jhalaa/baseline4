package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NextStateTest {

    @Test
    public void shouldBeDeadIfALiveCellHasZeroNeighbours() {
        int neighbours=0;
        NextState nextState = new NextState(neighbours);
        assertEquals("dead", nextState.calculateStateOfAliveCell());

    }

    @Test
    public void shouldBeDeadIfALiveCellHasOneNeighbours() {
        int neighbours=1;
        NextState nextState = new NextState(neighbours);
        assertEquals("dead", nextState.calculateStateOfAliveCell());

    }

    @Test
    public void shouldBeDeadIfALiveCellHasMoreThanThreeNeighbours() {
        int neighbours=4;
        NextState nextState = new NextState(neighbours);
        assertEquals("dead", nextState.calculateStateOfAliveCell());

    }

    @Test
    public void shouldBeAliveIfALiveCellHasTwoNeighbours() {
        int neighbours=2;
        NextState nextState = new NextState(neighbours);
        assertEquals("alive", nextState.calculateStateOfAliveCell());

    }

    @Test
    public void shouldBeAliveIfALiveCellHasThreeNeighbours() {
        int neighbours=3;
        NextState nextState = new NextState(neighbours);
        assertEquals("alive", nextState.calculateStateOfAliveCell());

    }

    @Test
    public void shouldBeDeadForDeadCellWithAnyNeighbours() {
        int neighbours=1;
        NextState nextState = new NextState(neighbours);
        assertEquals("dead", nextState.calculateStateOfDeadCell());

    }

    @Test
    public void shouldBeAliveForDeadCellWithThreeNeighboursOnly() {
        int neighbours=3;
        NextState nextState = new NextState(neighbours);
        assertEquals("alive", nextState.calculateStateOfDeadCell());

    }

}
