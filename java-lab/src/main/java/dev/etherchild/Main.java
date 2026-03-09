package dev.etherchild;

import dev.etherchild.fundamentals.*;
import dev.etherchild.algorithms.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Java Lab has initialized successfully.");
        // Run fundamentals
        Variables.run();
        Casting.run();
        BitShift.run();
        OperatorPrecedence.run();

        // Run algorithms
        FISQRT.run();
    }
}
