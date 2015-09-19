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

    public int numberOfNeighboursAlive(String[][] array, int firstIndex, int secondIndex) {
        int count =0;
        if(!(amIDead(array[firstIndex][secondIndex-1]))) {
            count++;
        }
        if(!(amIDead(array[firstIndex][secondIndex+1]))) {
            count++;
        }
        if(!(amIDead(array[firstIndex+1][secondIndex-1]))) {
            count++;
        }
        if(!(amIDead(array[firstIndex+1][secondIndex]))) {
            count++;
        }
        if(!(amIDead(array[firstIndex+1][secondIndex+1]))) {
            count++;
        }
        if(!(amIDead(array[firstIndex-1][secondIndex-1]))) {
            count++;
        }
        if(!(amIDead(array[firstIndex-1][secondIndex]))) {
            count++;
        }
        return count;
    }
}
