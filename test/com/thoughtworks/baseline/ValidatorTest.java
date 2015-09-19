package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ValidatorTest {

    @Test
    public void shouldReturnTrueIfArrayElementCanbeAccessed(){
        String array[][] ={{"X","X","X"},{"X","X","X"},{"X","X","X"}};
        Validator validator = new Validator(array);
        assertTrue(validator.validIndex(0,1));
    }
}
