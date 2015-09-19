package com.thoughtworks.baseline;

//checks if an array index is out of bound or not
public class Validator {

    private final String[][] input;

    public Validator(String[][] input) {
        this.input = input;
    }

    boolean validIndex(int firstIndex, int secondIndex) {
        try {
            String string = input[firstIndex][secondIndex];
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            return false;
        }
        return true;
    }
}