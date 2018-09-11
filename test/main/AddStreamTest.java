package main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddStreamTest {

    AddStream addStreamInst
    @Before
    public void setUp() throws Exception {
        addStreamInst = new AddStream();
    }

    @After
    public void tearDown() throws Exception {
        addStreamInst = null;
    }

    @Test
    public void addStream() {
        int expectedValue = ;
        int actualValue = addStreamInst.addStream("24 22 6 7");
        assertEquals(expectedValue,actualValue);
    }
}