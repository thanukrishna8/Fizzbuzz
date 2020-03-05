package com.spartaglobal.fizz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestingFizzBuzz {
    FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();

    @Test
    public void testingIfTheValueAtThe14thIndexIsFizzBuzz_From1To15(){
        Assertions.assertEquals("FizzBuzz", fizzBuzzGenerator.FizzBuzz(1, 15).get(14));
    }

    @Test
    public void testingIfTheValueAtThe7thIndexIsNotFizzBuzz_From1To15(){
        Assertions.assertNotEquals("FizzBuzz", fizzBuzzGenerator.FizzBuzz(1, 15).get(7));
    }

    @Test
    public void testingIfTheValueAtThe74thIndexIsFizzBuzz_From1To90(){
        Assertions.assertEquals("FizzBuzz", fizzBuzzGenerator.FizzBuzz(1, 90).get(74));
    }

    @Test
    public void testingIfTheValueAtThe67thIndexIsNotFizzBuzz_From1To90(){
        Assertions.assertNotEquals("FizzBuzz", fizzBuzzGenerator.FizzBuzz(1, 90).get(67));
    }

    @Test
    public void testingIfTheValueAtThe10thIndexIsFizzBuzz_From20To40(){
        Assertions.assertEquals("FizzBuzz", fizzBuzzGenerator.FizzBuzz(20, 40).get(10));
    }

    @Test
    public void testingIfTheValueAtThe14thIndexIsNotFizzBuzz_From20To40(){
        Assertions.assertNotEquals("FizzBuzz", fizzBuzzGenerator.FizzBuzz(20, 40).get(14));
    }

    @Test
    public void testingIfTheValueAtThe15thIndexIsFizzBuzz_From150To180(){
        Assertions.assertEquals("FizzBuzz", fizzBuzzGenerator.FizzBuzz(150, 180).get(15));
    }


    @Test
    public void testingIfTheValueAtThe18thIndexIsNotFizzBuzz_From150To180(){
        Assertions.assertNotEquals("FizzBuzz", fizzBuzzGenerator.FizzBuzz(150, 180).get(18));
    }

}
