package main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTypeTest {

    CharacterType app;
    @Before
    public void setUp() throws Exception {
        app = new CharacterType();
        System.out.println("@before***");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("@after***");
        app = null;
    }

    @Test
    public void checkCharType() throws Exception {
        //Arrange
        int expectedValue=2;
        //Act
        int actualValue = app.checkCharType('T');
        //AssertSystem.out.println("@before***");
        assertEquals(expectedValue,actualValue);
    }
}