package com.thoughtworks.baseline;

import com.thoughtworks.baseline.State;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StateTest {

    @Test
    public void shouldBeDeadIfALiveCellHasZeroNeighbours() {
        int neighbours=0;
        State state = new State(neighbours);
        assertEquals("dead",state.calculateStateOfAliveCell());

    }

    @Test
    public void shouldBeDeadIfALiveCellHasOneNeighbours() {
        int neighbours=1;
        State state = new State(neighbours);
        assertEquals("dead",state.calculateStateOfAliveCell());

    }

    @Test
    public void shouldBeDeadIfALiveCellHasMoreThanThreeNeighbours() {
        int neighbours=4;
        State state = new State(neighbours);
        assertEquals("dead",state.calculateStateOfAliveCell());

    }

    @Test
    public void shouldBeAliveIfALiveCellHasTwoNeighbours() {
        int neighbours=2;
        State state = new State(neighbours);
        assertEquals("alive",state.calculateStateOfAliveCell());

    }

    @Test
    public void shouldBeAliveIfALiveCellHasThreeNeighbours() {
        int neighbours=3;
        State state = new State(neighbours);
        assertEquals("alive",state.calculateStateOfAliveCell());

    }

    @Test
    public void shouldBeDeadForDeadCellWithAnyNeighbours() {
        int neighbours=1;
        State state = new State(neighbours);
        assertEquals("dead",state.calculateStateOfDeadCell());

    }

    @Test
    public void shouldBeAliveForDeadCellWithThreeNeighboursOnly() {
        int neighbours=3;
        State state = new State(neighbours);
        assertEquals("alive",state.calculateStateOfDeadCell());

    }

}
