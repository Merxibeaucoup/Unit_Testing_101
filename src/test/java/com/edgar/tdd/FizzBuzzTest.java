package com.edgar.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FizzBuzzTest {
    
    /*
     * if number is divisible by 3, print Fizz
     * if number is divisible by 5, print Buzz
     * if number is divisible by 3 and 5, print FizzBuzz
     * if number is NOT divisible by 3 or 5, then print the number
     */

    private FizzBuzz fizzBuzz;

   @BeforeEach
   void setUpBeforeEach(){
      fizzBuzz = new FizzBuzz();
   }



    @DisplayName("Divisble by 3")
    @Test
    @Order(1)
     void testForDivisibleByThree(){

      String expected = "Fizz";
      assertEquals(expected, fizzBuzz.compute(3), "Should return Fizz");
     
     }
    @DisplayName("Divisble by 5")
    @Test
    @Order(2)
     void testForDivisibleByFive(){

      String expected = "Buzz";
      assertEquals(expected, fizzBuzz.compute(10), "Should return Buzz");
     
     }
    @DisplayName("Divisble by 3 and 5")
    @Test
    @Order(3)
     void testForDivisibleByThreeAndFive(){

      String expected = "FizzBuzz";
      assertEquals(expected, fizzBuzz.compute(15), "Should return FizzBuzz");
     
     }

    @DisplayName("Not Divisble by 3 or 5")
    @Test
    @Order(4)
     void testForNotDivisibleByThreeOrFive(){

      String expected = "1";
      assertEquals(expected, fizzBuzz.compute(1), "Should return 1");
     
     }


}
