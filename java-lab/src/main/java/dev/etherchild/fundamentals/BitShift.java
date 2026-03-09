package dev.etherchild.fundamentals;

public class BitShift {
    public static void run() {
        System.out.println("=== Bit Shifting and Binary Representation ===");
        int number = 8; // Binary: 0000 1000
        System.out.println("Original number: " + number + " (Binary: " + Integer.toBinaryString(number) + ")");
        // Left shift
        number <<= 1; // Shift left by 1 (multiply by 2)
        System.out.println("After left shift by 1: " + number + " (Binary: " + Integer.toBinaryString(number) + ")");
        // Right shift
        number >>= 1; // Shift right by 1 (divide by 2)
        System.out.println("After right shift by 1: " + number + " (Binary: " + Integer.toBinaryString(number) + ")");
        // Unsigned right shift
        int XORnumber = ~number; // Binary: 1111 1000 (two's complement)
        System.out.println("XOR number: " + XORnumber + " (Binary: " + Integer.toBinaryString(XORnumber) + ")");
        number >>>= 1; // Shift right by 1 (unsigned)
        System.out.println("After unsigned right shift by 1: " + number + " (Binary: " + Integer.toBinaryString(number) + ")");
    }
}
