package com.thoughtworks.baseline;

import java.io.IOException;

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

    public int numberOfNeighboursAlive(String[][] array, int firstIndex, int secondIndex) {
        int count=0;
        if(validIndex(array, firstIndex, secondIndex-1)) {
            if (!(amIDead(array[firstIndex][secondIndex - 1]))) {
                count++;
            }
        }
        if(validIndex(array, firstIndex, secondIndex+1)) {
            if (!(amIDead(array[firstIndex][secondIndex + 1]))) {
                count++;
            }
        }
        if(validIndex(array, firstIndex+1, secondIndex-1)) {
            if (!(amIDead(array[firstIndex + 1][secondIndex - 1]))) {
                count++;
            }
        }
        if(validIndex(array, firstIndex+1, secondIndex)) {
            if (!(amIDead(array[firstIndex + 1][secondIndex]))) {
                count++;
            }
        }
        if(validIndex(array, firstIndex+1, secondIndex+1)) {
            if (!(amIDead(array[firstIndex + 1][secondIndex + 1]))) {
                count++;
            }
        }
        if(validIndex(array, firstIndex-1, secondIndex-1)) {
            if (!(amIDead(array[firstIndex - 1][secondIndex - 1]))) {
                count++;
            }
        }
        if(validIndex(array, firstIndex-1, secondIndex)) {
            if (!(amIDead(array[firstIndex - 1][secondIndex]))) {
                count++;
            }
        }
        if(validIndex(array, firstIndex-1, secondIndex+1)) {
            if (!(amIDead(array[firstIndex - 1][secondIndex + 1]))) {
                count++;
            }
        }
        return count;
    }

    private boolean validIndex(String[][] array, int firstIndex, int secondIndex) {
        try
        {
           String string = array[firstIndex][secondIndex];
        }
        catch(ArrayIndexOutOfBoundsException exception) {
            return false;
        }
        return true;
    }
}
