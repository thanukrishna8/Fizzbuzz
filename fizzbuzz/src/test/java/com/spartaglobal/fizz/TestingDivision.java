package com.spartaglobal.fizz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestingDivision {
    FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();

    @Test
    public void testingIf3DividedBy3HasNoReminder(){
        Assertions.assertEquals(true, fizzBuzzGenerator.divisibleBy(3, 3));
    }

    @Test
    public void testingIf5DividedBy3HasAReminder(){
        Assertions.assertNotEquals(true, fizzBuzzGenerator.divisibleBy(5, 3));
    }

    @Test
    public void testingIf9DividedBy3HasNoReminder(){
        Assertions.assertEquals(true, fizzBuzzGenerator.divisibleBy(9, 3));
    }

    @Test
    public void testingIf14DividedBy3HasAReminder(){
        Assertions.assertEquals(false, fizzBuzzGenerator.divisibleBy(14, 3));
    }
    @Test
    public void testingIf90DividedBy3HasNoReminder(){
        Assertions.assertEquals(true, fizzBuzzGenerator.divisibleBy(90, 3));
    }

    @Test
    public void testingIf94DividedBy3HasAReminder(){
        Assertions.assertNotEquals(true, fizzBuzzGenerator.divisibleBy(94, 3));
    }


    @Test
    public void testingIf5DividedBy5HasNoReminder(){
    Assertions.assertEquals(true, fizzBuzzGenerator.divisibleBy(5, 5));
    }

    @Test
    public void testingIf18DividedBy5HasAReminder(){
        Assertions.assertNotEquals(true, fizzBuzzGenerator.divisibleBy(18, 5));
    }

    @Test
    public void testingIf25DividedBy5HasNoReminder(){
        Assertions.assertEquals(true, fizzBuzzGenerator.divisibleBy(25, 5));
    }

    @Test
    public void testingIf89DividedBy5HasAReminder(){
        Assertions.assertEquals(false, fizzBuzzGenerator.divisibleBy(89, 5));
    }
    @Test
    public void testingIf95DividedBy5HasNoReminder(){
        Assertions.assertEquals(true, fizzBuzzGenerator.divisibleBy(95, 5));
    }

    @Test
    public void testingIf99DividedBy5HasAReminder(){
        Assertions.assertNotEquals(true, fizzBuzzGenerator.divisibleBy(99, 5));
    }

}
