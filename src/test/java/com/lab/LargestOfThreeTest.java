package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestOfThreeTest {

    @Test
    public void testLargest() {
        LargestOfThree obj = new LargestOfThree();
        assertEquals(25, obj.findLargest(10, 25, 15));
    }

    @Test
    public void testNegativeNumbers() {
        LargestOfThree obj = new LargestOfThree();
        assertEquals(-2, obj.findLargest(-5, -2, -8));
    }
}