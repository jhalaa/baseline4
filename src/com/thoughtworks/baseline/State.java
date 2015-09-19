package com.thoughtworks.baseline;

//tells us if a cell is dead or alive
public class State {

    private int neighbours;

    public State(int neighbours) {
        this.neighbours = neighbours;
    }

    public String calculateStateOfAliveCell() {
        if(neighbours==2 || neighbours==3)
            return "alive";
        return "dead";
    }

    public String calculateStateOfDeadCell() {
        if(neighbours==3)
            return "alive";
        return "dead";
    }
}
