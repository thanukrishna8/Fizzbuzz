package com.spartaglobal.fizz;


public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();
        //System.out.println(fizzBuzzGenerator.divisibleBy(4, 2));
        //System.out.println(fizzBuzzGenerator.divisibleBy(3, 2));
        System.out.println(fizzBuzzGenerator.FizzBuzz(1, 15).toString());
        System.out.println(fizzBuzzGenerator.FizzBuzz(1,90).toString());
        System.out.println(fizzBuzzGenerator.FizzBuzz(20,40).toString());
        System.out.println(fizzBuzzGenerator.FizzBuzz(150,180).toString());

    }
}