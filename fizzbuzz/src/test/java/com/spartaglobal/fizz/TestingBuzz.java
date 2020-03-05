package com.spartaglobal.fizz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestingBuzz {
    FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();
    @Test
    public void testingIfTheValueAtThe9thIndexIsBuzz_From1To15(){
        Assertions.assertEquals("Buzz", fizzBuzzGenerator.FizzBuzz(1, 15).get(9));
    }

    @Test
    public void testingIfTheValueAtThe8thIndexIsNotBuzz_From1To15(){
        Assertions.assertNotEquals("Buzz", fizzBuzzGenerator.FizzBuzz(1, 15).get(8));
    }

    @Test
    public void testingIfTheValueAtThe69thIndexIsBuzz_From1To90(){
        Assertions.assertEquals("Buzz", fizzBuzzGenerator.FizzBuzz(1, 90).get(69));
    }


    @Test
    public void testingIfTheValueAtThe83rdIndexIsNotBuzz_From1To90(){
        Assertions.assertNotEquals("Buzz", fizzBuzzGenerator.FizzBuzz(1, 90).get(83));
    }


    @Test
    public void testingIfTheValueAtThe0IndexIsBuzz_From20To40(){
        Assertions.assertEquals("Buzz", fizzBuzzGenerator.FizzBuzz(20, 40).get(0));
    }


    @Test
    public void testingIfTheValueAtThe7thIndexIsNotBuzz_From20To40(){
        Assertions.assertNotEquals("Buzz", fizzBuzzGenerator.FizzBuzz(20, 40).get(7));
    }


    @Test
    public void testingIfTheValueAtThe5thIndexIsBuzz_From150To180(){
        Assertions.assertEquals("Buzz", fizzBuzzGenerator.FizzBuzz(150, 180).get(5));
    }


    @Test
    public void testingIfTheValueAtThe9thIndexIsNotBuzz_From150To180(){
        Assertions.assertNotEquals("Buzz", fizzBuzzGenerator.FizzBuzz(150, 180).get(9));
    }



}
