package com.thoughtworks.baseline;

//takes a pattern and gives the resultant pattern after one tick
public class Output {
    public String patternAfterOneTick(String input) {
        return input;
    }

    public boolean amIDead(String cell) {
        if(cell=="X")
            return false;
        return true;
    }

    public int numberOfNeighboursAlive(String s) {
        return 1;
    }
}
