package dev.etherchild.algorithms;

public class FISQRT {
    public static void run() {
        System.out.println("=== Fast Inverse Square Root ===");
        int number = 16; // Example number
        float x2 = number * 0.5f; // Half of the number (for the initial guess)
        float y = number; // Initial guess for the inverse square root

        int i = Float.floatToIntBits(y); // Convert float to int bits
        i = 0x5f3759df - (i >> 1); // Initial guess using a magic number
        y = Float.intBitsToFloat(i); // Convert back to float

        y = y * (1.5f - (x2 * y * y)); // First iteration of Newton's method
        y = y * (1.5f - (x2 * y * y)); // Second iteration of Newton's method
        System.out.println("Fast Inverse Square Root of " + number + ": " + y);
        // For comparison, calculate the actual inverse square root using Math.sqrt
        double actualInverseSqrt = 1.0 / Math.sqrt(number);
        System.out.println("Actual Inverse Square Root of " + number + ": " + actualInverseSqrt);
    }
}
