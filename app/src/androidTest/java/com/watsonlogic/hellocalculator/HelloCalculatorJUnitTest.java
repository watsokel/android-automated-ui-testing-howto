package com.watsonlogic.hellocalculator;

import android.test.ActivityInstrumentationTestCase2;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * JUnit Instrumentation test (invokes emulator)
 */
public class HelloCalculatorJUnitTest extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity ma;

    /**
     * Required default constructor.
     */
    public HelloCalculatorJUnitTest() {
        //super("com.watsonlogic.hellocalculator", MainActivity.class); DEPRECATED
        super(MainActivity.class);
    }

    public HelloCalculatorJUnitTest(Class<MainActivity> activityClass) {
        super(activityClass);
    }

    public HelloCalculatorJUnitTest(Class<MainActivity> activityClass, MainActivity ma) {
        super(activityClass);
        this.ma = ma;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        ma = getActivity();
    }

    @Test
    public void testAddIntegers() {
        List<Integer> arr = Arrays.asList(1, 2, 3);
        assertEquals(6, ma.addIntegers(arr));
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }


}
