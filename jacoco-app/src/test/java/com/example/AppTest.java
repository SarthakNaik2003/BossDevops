package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    private App app;

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * Set up the environment before each test case.
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        app = new App(); // Initialize App object
    }

    /**
     * Tear down the environment after each test case.
     */
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        app = null;
    }

    /**
     * Test the add method.
     */
    public void testAdd() {
        int result = app.add(2, 3);
        assertEquals(5, result); // Check if 2 + 3 = 5
    }

    /**
     * Test the isEven method.
     */
    public void testIsEven() {
        assertTrue(app.isEven(4)); // Assert that 4 is even
        assertFalse(app.isEven(5)); // Assert that 5 is not even
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }
}
