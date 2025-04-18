package com.vignesh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitManipulationTest {

    // Test for isSetBit(int N, int i)
    @Test
    void testIsSetBit() {
        // Typical cases
        assertTrue(BitManipulation.isSetBit(5, 0)); // 101, 0th bit is 1
        assertFalse(BitManipulation.isSetBit(5, 1)); // 101, 1st bit is 0
        assertTrue(BitManipulation.isSetBit(8, 3)); // 1000, 3rd bit is 1
        assertFalse(BitManipulation.isSetBit(0, 5)); // 0, no bits set

        // Edge case: check MSB for 32-bit integer
        assertTrue(BitManipulation.isSetBit(Integer.MIN_VALUE, 31)); // MSB of 32-bit int

        // Out-of-range bit index
        assertFalse(BitManipulation.isSetBit(8, 32)); // Beyond the 31-bit range
        assertFalse(BitManipulation.isSetBit(8, -1)); // Negative index
    }

    // Test for countSetBits(int N)
    @Test
    void testCountSetBits() {
        // Typical cases
        assertEquals(0, BitManipulation.countSetBits(0)); // No bits set
        assertEquals(1, BitManipulation.countSetBits(8)); // 1000, 1 bit set
        assertEquals(3, BitManipulation.countSetBits(13)); // 1101, 3 bits set
        assertEquals(31, BitManipulation.countSetBits(Integer.MAX_VALUE)); // All bits set except the sign bit

        // Edge case: negative number (all bits set in two's complement representation)
        assertEquals(32, BitManipulation.countSetBits(-1)); // All bits set (2^32 - 1 in two's complement)
    }

    // Test for isPowerOf2(int N)
    @Test
    void testIsPowerOf2() {
        // Typical cases
        assertTrue(BitManipulation.isPowerOf2(1)); // 2^0
        assertTrue(BitManipulation.isPowerOf2(2)); // 2^1
        assertTrue(BitManipulation.isPowerOf2(16)); // 2^4
        assertFalse(BitManipulation.isPowerOf2(10)); // Not a power of 2
        assertFalse(BitManipulation.isPowerOf2(0)); // 0 is not a power of 2
        assertFalse(BitManipulation.isPowerOf2(-8)); // Negative numbers are not powers of 2
    }

    // Test for powerOf2(int N)
    @Test
    void testPowerOf2() {
        // Typical cases
        assertEquals(1, BitManipulation.powerOf2(0)); // 2^0 = 1
        assertEquals(2, BitManipulation.powerOf2(1)); // 2^1 = 2
        assertEquals(1024, BitManipulation.powerOf2(10)); // 2^10 = 1024

        // Edge case: Power of 2 for large N
        assertEquals(-9223372036854775808L, BitManipulation.powerOf2(63)); // 2^63, overflow in 32-bit
    }

}
