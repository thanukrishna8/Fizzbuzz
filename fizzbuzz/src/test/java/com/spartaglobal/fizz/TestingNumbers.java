package com.spartaglobal.fizz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestingNumbers {
    FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();


    @Test
    public void testingIfTheValueAtThe3rdIndexIs4_From1To15(){
        Assertions.assertEquals("4", fizzBuzzGenerator.FizzBuzz(1, 15).get(3));
    }

    @Test
    public void testingIfTheValueAtThe7thIndexIsNot7_From1To15(){
        Assertions.assertNotEquals("7", fizzBuzzGenerator.FizzBuzz(1, 15).get(7));
    }

    @Test
    public void testingIfTheValueAtThe67thIndexIs68_From1To90(){
        Assertions.assertEquals("68", fizzBuzzGenerator.FizzBuzz(1, 90).get(67));
    }

    @Test
    public void testingIfTheValueAtThe82ndIndexIsNot80_From1To90(){
        Assertions.assertNotEquals("80", fizzBuzzGenerator.FizzBuzz(1, 90).get(82));
    }

    @Test
    public void testingIfTheValueAtThe12thIndexIs32_From20To40(){
        Assertions.assertEquals("32", fizzBuzzGenerator.FizzBuzz(20, 40).get(12));
    }


    @Test
    public void testingIfTheValueAtThe15thIndexIsNot16_From20To40(){
        Assertions.assertNotEquals("16", fizzBuzzGenerator.FizzBuzz(20, 40).get(15));
    }

    @Test
    public void testingIfTheValueAtThe8thIndexIs158_From150To180(){
        Assertions.assertEquals("158", fizzBuzzGenerator.FizzBuzz(150, 180).get(8));
    }


    @Test
    public void testingIfTheValueAtThe19thIndexIsNot170_From150To180(){
        Assertions.assertNotEquals("170", fizzBuzzGenerator.FizzBuzz(150, 180).get(19));
    }

}
