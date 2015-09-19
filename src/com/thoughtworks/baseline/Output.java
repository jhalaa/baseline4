package com.thoughtworks.baseline;

//takes a pattern and gives the resultant pattern after one tick
public class Output {

    State state;
    String[][] input;
    int firstIndex;
    int secondIndex;

    public Output(String[][] input, int firstIndex, int secondIndex) {
        this.input = input;
        this.firstIndex = firstIndex;
        this.secondIndex = secondIndex;
    }

    public String patternAfterOneTick(String input) {
        boolean isDead = amIDead(input);
        int numberOfNeighbours = numberOfNeighboursAlive(this.input, firstIndex, secondIndex);
        if (isDead) {
            state = new State(numberOfNeighbours);
            if (state.calculateStateOfDeadCell().equals("alive"))
                return "X";
        } else {
            state = new State(numberOfNeighbours);
            if (state.calculateStateOfAliveCell().equals("alive"))
                return "X";
        }
        return "-";
    }

    public boolean amIDead(String cell) {
        if (cell == "X")
            return false;
        return true;
    }

    public int numberOfNeighboursAlive(String[][] array, int firstIndex, int secondIndex) {
        int count = 0;
        if (validIndex(array, firstIndex, secondIndex - 1)) {
            if (!(amIDead(array[firstIndex][secondIndex - 1]))) {
                count++;
            }
        }
        if (validIndex(array, firstIndex, secondIndex + 1)) {
            if (!(amIDead(array[firstIndex][secondIndex + 1]))) {
                count++;
            }
        }
        if (validIndex(array, firstIndex + 1, secondIndex - 1)) {
            if (!(amIDead(array[firstIndex + 1][secondIndex - 1]))) {
                count++;
            }
        }
        if (validIndex(array, firstIndex + 1, secondIndex)) {
            if (!(amIDead(array[firstIndex + 1][secondIndex]))) {
                count++;
            }
        }
        if (validIndex(array, firstIndex + 1, secondIndex + 1)) {
            if (!(amIDead(array[firstIndex + 1][secondIndex + 1]))) {
                count++;
            }
        }
        if (validIndex(array, firstIndex - 1, secondIndex - 1)) {
            if (!(amIDead(array[firstIndex - 1][secondIndex - 1]))) {
                count++;
            }
        }
        if (validIndex(array, firstIndex - 1, secondIndex)) {
            if (!(amIDead(array[firstIndex - 1][secondIndex]))) {
                count++;
            }
        }
        if (validIndex(array, firstIndex - 1, secondIndex + 1)) {
            if (!(amIDead(array[firstIndex - 1][secondIndex + 1]))) {
                count++;
            }
        }
        return count;
    }

    private boolean validIndex(String[][] array, int firstIndex, int secondIndex) {
        try {
            String string = array[firstIndex][secondIndex];
        } catch (ArrayIndexOutOfBoundsException exception) {
            return false;
        }
        return true;
    }
}
