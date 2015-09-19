
//tells us if a cell is dead or alive
public class State {

    private int neighbours;

    public State(int neighbours) {
        this.neighbours = neighbours;
    }

    public String calculateMyState() {
        return "dead";
    }
}
