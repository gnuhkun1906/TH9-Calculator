package test;

import calculator.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("Test Add 0 and 0")
 void testAdd0and0(){
     int first=0;
     int second=0;
     int expected=0;
     int result= Calculator.add(first,second);
     assertEquals(expected,result);
 }
 @Test
 @DisplayName("Test Subtraction 0 and 1")
 void testSub0and1(){
        int first=0;
        int second=1;
        int expected=-1;
        int result=Calculator.sub(first,second);
        assertEquals(expected,result);
 }
}
