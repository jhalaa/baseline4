
//tells us if a cell is dead or alive
public class State {

    private int neighbours;

    public State(int neighbours) {
        this.neighbours = neighbours;
    }

    public String calculateMyState() {
        if(neighbours==2 || neighbours==3)
            return "alive";
        return "dead";
    }
}
