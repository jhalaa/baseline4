package com.thoughtworks.baseline;

//takes a pattern and gives the resultant pattern after one tick
public class Output {


    private final Neighbour neighbour;
    private NextState nextState;
    private Validator validator;
    private String[][] input;
    private int firstIndex;
    private int secondIndex;


    public Output(String[][] input, int firstIndex, int secondIndex,Validator validator,Neighbour neighbour) {
        this.input = input;
        this.firstIndex = firstIndex;
        this.secondIndex = secondIndex;
        this.validator = validator;
        this.neighbour = neighbour;
    }

    public String patternAfterOneTick(String cell) {
        int numberOfNeighbours = neighbour.numberOfNeighboursAlive(input, firstIndex, secondIndex);
        if (cell.equals("-")) {
            nextState = new NextState(numberOfNeighbours);
            if (nextState.calculateStateOfDeadCell().equals("alive"))
                return "X";
        } else {
            nextState = new NextState(numberOfNeighbours);
            if (nextState.calculateStateOfAliveCell().equals("alive"))
                return "X";
        }
        return "-";
    }
}
