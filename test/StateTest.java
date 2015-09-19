import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StateTest {

    @Test
    public void shouldBeDeadIfALiveCellHasZeroNeighbours() {
        int neighbours=0;
        State state = new State(neighbours);
        assertEquals("dead",state.calculateMyState());

    }

    @Test
    public void shouldBeDeadIfALiveCellHasOneNeighbours() {
        int neighbours=1;
        State state = new State(neighbours);
        assertEquals("dead",state.calculateMyState());

    }

    @Test
    public void shouldBeDeadIfALiveCellHasMoreThanThreeNeighbours() {
        int neighbours=4;
        State state = new State(neighbours);
        assertEquals("dead",state.calculateMyState());

    }

}
