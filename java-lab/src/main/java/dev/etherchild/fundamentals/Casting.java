package dev.etherchild.fundamentals;

public class Casting {
    public static void run() {
        System.out.println("=== Casting and Type Conversion ===");
        // Implicit casting
        byte a = 10;
        System.out.println("Original byte value: " + a);
        System.out.println("Type of a: " + ((Object)a).getClass());
        int b = a; // byte to int (widening)
        System.out.println("Type of b after casting a to int: " + ((Object)b).getClass());
        System.out.println("Implicit Casting (byte to int) then + 255: " + (b + 255));
        // Explicit casting
        int bigNumber = 30000000;
        System.out.println("Original int Type: " + ((Object)bigNumber).getClass() + ", value: " + bigNumber);
        long modBigNumber = (long) Math.pow(bigNumber, 2) % (1L << 32); // Modulo operation for 32-bit integer
        System.out.println("Type of modBigNumber after modulo operation: " + ((Object)modBigNumber).getClass() + ", value: " + modBigNumber);
        short smallerNumber = (short) bigNumber; // int to short (narrowing)
        System.out.println("Type of smallerNumber after casting bigNumber to short: " + ((Object)smallerNumber).getClass() + ", value: " + smallerNumber);
        byte lilNumber = (byte) smallerNumber; // short to byte (narrowing)
        System.out.println("Type of lilNumber after casting smallerNumber to byte: " + ((Object)lilNumber).getClass() + ", value: " + lilNumber);
    }
}
