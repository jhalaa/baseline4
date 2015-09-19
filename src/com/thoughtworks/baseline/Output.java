package com.thoughtworks.baseline;

//takes a pattern and gives the resultant pattern after one tick
public class Output {


    private NextState nextState;
    private Validator validator;
    private String[][] input;
    private int firstIndex;
    private int secondIndex;


    public Output(String[][] input, int firstIndex, int secondIndex,Validator validator) {
        this.input = input;
        this.firstIndex = firstIndex;
        this.secondIndex = secondIndex;
        this.validator = validator;
    }

    public String patternAfterOneTick(String cell) {
        int numberOfNeighbours = numberOfNeighboursAlive(input, firstIndex, secondIndex);
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

    public int numberOfNeighboursAlive(String[][] array, int firstIndex, int secondIndex) {
        int count = 0;
        if (validator.validIndex(firstIndex, secondIndex - 1)) {
            if (!(array[firstIndex][secondIndex - 1].equals("-"))) {
                count++;
            }
        }
        if (validator.validIndex(firstIndex, secondIndex + 1)) {
            if (!(array[firstIndex][secondIndex + 1].equals("-"))) {
                count++;
            }
        }
        if (validator.validIndex(firstIndex + 1, secondIndex - 1)) {
            if (!(array[firstIndex + 1][secondIndex - 1].equals("-"))) {
                count++;
            }
        }
        if (validator.validIndex(firstIndex + 1, secondIndex)) {
            if (!(array[firstIndex + 1][secondIndex].equals("-"))) {
                count++;
            }
        }
        if (validator.validIndex(firstIndex + 1, secondIndex + 1)) {
            if (!(array[firstIndex + 1][secondIndex + 1].equals("-"))) {
                count++;
            }
        }
        if (validator.validIndex(firstIndex - 1, secondIndex - 1)) {
            if (!(array[firstIndex - 1][secondIndex - 1].equals("-"))) {
                count++;
            }
        }
        if (validator.validIndex(firstIndex - 1, secondIndex)) {
            if (!(array[firstIndex - 1][secondIndex].equals("-"))) {
                count++;
            }
        }
        if (validator.validIndex(firstIndex - 1, secondIndex + 1)) {
            if (!(array[firstIndex - 1][secondIndex + 1].equals("-"))) {
                count++;
            }
        }
        return count;
    }
}
