package main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPalindromeAndSumMoreThan25Test {

    CheckPalindromeAndSumMoreThan25 checkPalindromeAndSumMoreThan25;
    @Before
    public void setUp() throws Exception {
        checkPalindromeAndSumMoreThan25 = new CheckPalindromeAndSumMoreThan25();
        System.out.println("Before***");
    }

    @After
    public void tearDown() throws Exception {
        checkPalindromeAndSumMoreThan25=null;
    }

    @Test
    public void checkPalindromeAndSumOfEvenNumbers() {
        //Arrange
        //Act
        boolean result=checkPalindromeAndSumMoreThan25.checkPalindromeAndSumOfEvenNumbers(12);
        //Assert
        assertTrue(result);
    }
}