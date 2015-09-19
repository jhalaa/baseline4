import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StateTest {

    @Test
    public void shouldBeDeadIfALiveCellHasZeroNeighbours() {
        int neighbours=0;
        State state = new State(neighbours);
        assertEquals("dead",state.calculateMyState());

    }

}
