package com.thoughtworks.baseline;

//returns the number of neighbours of a cell
public class Neighbour {
    private Validator validator;

    public Neighbour(Validator validator) {
        this.validator = validator;
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