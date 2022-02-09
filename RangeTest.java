package org.jfree.data.test;

import static org.junit.Assert.*; import org.jfree.data.Range; import org.junit.*;

public class RangeTest {
    private Range exampleRange, exampleRangePositive, exampleRangeNegative, exampleRangeZero,exampleLargeRange;
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }


    @Before
    public void setUp() throws Exception { 
    	exampleRange = new Range(-10, 10);
    	exampleRangePositive = new Range(1,100);
    	exampleRangeNegative = new Range(-100,-1);
    	exampleRangeZero = new Range(0,0);
    	exampleLargeRange = new Range(-1000000000,1000000000);
    }

    //getCentralValue Method Testing
    
    @Test
    // This tests for the central value of a range spanning from negative to positive values
    public void centralValueMixedRange() {
        assertEquals("The central value of -10 and 10 should be 0",
        0, exampleRange.getCentralValue(), .000000001d);
    }
    @Test
    // This tests for the central value of a range restricted to positive values
    public void centralValuePositiveRange() {
        assertEquals("The central value of 1 and 100 should be 50.5",
        50.5, exampleRangePositive.getCentralValue(), .000000001d);
    }
    
    @Test
    // This tests for the central value of a zero width range from 0 to 0 
    public void centralValueZeroWidthRange() {
    	assertEquals("The central value of 0 and 0 should be 0",
        0, exampleRangeZero.getCentralValue(), .000000001d);
    }
    @Test
    // This tests for the central value of a range restricted to negative numbers
    public void centralValueNegativeRange() {
        assertEquals("The central value of -100 and -1 should be -50.5",
        -50.5, exampleRangeNegative.getCentralValue(), .000000001d);
    }
    @Test
    // This tests for the central value of a range restricted to negative numbers
    public void centralValueLargeRange() {
        assertEquals("The central value of -1000000000 and 1000000000 should be 0",
        0, exampleLargeRange.getCentralValue(), .000000001d);
    }
    
    // Contains method Testing
    
    @Test
    // This tests a range with an input variable that is within the range
    public void containsValueInRange() {
    	assertTrue("The value 0 is in the range -10 to 10", exampleRange.contains(0));
    }
    // this tests a range with an input variable that is less than the range
    @Test 
    public void containsValueLessThanRange() {
    	assertFalse("The value -11 is not in the range -10 to 10", exampleRange.contains(-11));
    }
    // this tests a range with an input variable that is greater than the range
    @Test
    public void containsValueGreaterThanRange() {
    	assertFalse("The value 11 is not in the range -10 to 10", exampleRange.contains(11));
    }
    @Test
    // this tests a range where the input value is the lower boundary
    public void containsValueIsLowerBound() {
    	assertTrue("The value -10 is in the range -10 to 10", exampleRange.contains(-10));
    }
    @Test
    // this tests a range where the input value is the upper boundary
    public void containsValueisUpperBound() {
    	assertTrue("The value 10 is in the range -10 to 10", exampleRange.contains(10));
    }
    @Test
    // This tests a zero width range to see if the value used for both boundaries is contained
    public void containsValueisUpperAndLowerBound() {
    	assertTrue("The value 0 is in the range 0 to 0", exampleRangeZero.contains(0));
    }
    
    //getLength method testing
    
    @Test
    // This tests a range that spans from negative to positive
    public void getLengthMixedRange() {
        assertEquals("The length of -10 and 10 should be 20",
        20, exampleRange.getLength(), .000000001d);
    }
    @Test
    // This tests a range that is constrained to negative values
    public void getLengthNegativeRange() {
        assertEquals("The length of -100 and -1 should be 99",
        99, exampleRangeNegative.getLength(), .000000001d);
    }
    @Test
    // This tests a range that is constrained to positive values
    public void getLengthPositiveRange() {
        assertEquals("The length of 1 and 100 should be 100",
        99, exampleRangePositive.getLength(), .000000001d);
    }
    @Test
    // This tests a zero width range from 0 to 0
    public void getLengthZeroRange() {
        assertEquals("The length of 0 and 0 should be 0",
        0, exampleRangeZero.getLength(), .000000001d);
    }
    @Test
    // This tests a zero width range from 0 to 0
    public void getLengthLargeRange() {
        assertEquals("The length of 0 and 0 should be 0",
        2000000000, exampleLargeRange.getLength(), .000000001d);
    }
    
    
    

    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}