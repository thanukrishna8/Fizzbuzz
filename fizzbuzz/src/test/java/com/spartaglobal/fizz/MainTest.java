package com.spartaglobal.fizz;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Unit test for simple App.
 */
public class MainTest
{ FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();


    /**
     * Rigorous Test :-)
     */
    /*@Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
*/
    @Test
    public void fulltest(){
    
        Assertions.assertEquals("[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]", fizzBuzzGenerator.FizzBuzz(1, 15).toString());


    }
    @Test
    public void fizzatThird(){
        Assertions.assertEquals("Fizz", fizzBuzzGenerator.FizzBuzz(1, 15).get(2));
    }

    @Test
    public void buzzatten(){
        Assertions.assertEquals("Buzz", fizzBuzzGenerator.FizzBuzz(1, 15).get(9));
    }

    @Test
    public void fizznotatfive(){
        Assertions.assertNotEquals("Fizz", fizzBuzzGenerator.FizzBuzz(1, 15).get(4));
    }
    @Test
    public void fizzatnine(){
        Assertions.assertEquals("Fizz", fizzBuzzGenerator.FizzBuzz(1, 15).get(8));
    }

    }
