package com.spartaglobal.fizz;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestingFizz
{ FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();

    @Test
    public void testingIfTheValueAtThe2ndIndexIsFizz_From1To15(){
        Assertions.assertEquals("Fizz", fizzBuzzGenerator.FizzBuzz(1, 15).get(2));
    }


    @Test
    public void testingIfTheValueAtThe4thIndexIsNotFizz_From1To15(){
        Assertions.assertNotEquals("Fizz", fizzBuzzGenerator.FizzBuzz(1, 15).get(4));
    }

    @Test
    public void testingIfTheValueAtThe53rdIndexIsFizz_From1To90(){
        Assertions.assertEquals("Fizz", fizzBuzzGenerator.FizzBuzz(1, 90).get(53));
    }


    @Test
    public void testingIfTheValueAtThe60thIndexIsNotFizz_From1To90(){
        Assertions.assertNotEquals("Fizz", fizzBuzzGenerator.FizzBuzz(1, 90).get(60));
    }

    @Test
    public void testingIfTheValueAtThe16thIndexIsFizz_From20To40(){
        Assertions.assertEquals("Fizz", fizzBuzzGenerator.FizzBuzz(20, 40).get(16));
    }


    @Test
    public void testingIfTheValueAtThe20thIndexIsNotFizz_From20To40(){
        Assertions.assertNotEquals("Fizz", fizzBuzzGenerator.FizzBuzz(20, 40).get(20));
    }

    @Test
    public void testingIfTheValueAtThe6thIndexIsFizz_From150To180(){
        Assertions.assertEquals("Fizz", fizzBuzzGenerator.FizzBuzz(150, 180).get(6));
    }


    @Test
    public void testingIfTheValueAtThe11thIndexIsNotFizz_From150To180(){
        Assertions.assertNotEquals("Fizz", fizzBuzzGenerator.FizzBuzz(150, 180).get(11));
    }


    }
