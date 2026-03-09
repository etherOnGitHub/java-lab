package dev.etherchild.fundamentals;

public class OperatorPrecedence {
    public static void run() {
        // Chart:
        //      *  /  %
        //      +  -
        //      << >>
        //      <  <=  >  >=
        //      ==  !=
        //      &
        //      ^
        //      |
        System.out.println("=== Operator Precedence and Associativity ===");
        // Example 1 of operator precedence
        int x = 10;
        int y = 12;

        int result = x + y << 2;
        System.out.println("Result of x + y << 2: " + result);
        // Explanation:
        // 1. The addition operator (+) has higher precedence than the bitwise left shift operator (<<).
        // 2. So, x + y is evaluated first, resulting in 22.
        // 3. Then, the result (22) is left-shifted by 2 bits, which is equivalent to multiplying by 4.
        // 4. Therefore, the final result is 88.

        // Example 2 of operator precedence
        int a = 5;
        int b = 3;

        boolean answer = (a & b) == 0; 
        // had to force brackets here to get the parser to not cry otherwise its
        // a & (b == 0) which is an error since b is an int and 0 is an int and the result of b == 0 is a boolean
        // which cannot be used with the bitwise AND operator (&)
        System.out.println("Result of a & b == 0: " + answer);
        // Explanation:
        // 1. The bitwise AND operator (&) has higher precedence than the equality operator (==).
        // 2. So, a & b is evaluated first, resulting in 1 (since 5 in binary is 101 and 3 in binary is 011).
        // 3. Then, the result (1) is compared to 0 using the equality operator (==).
        // 4. Since 1 is not equal to 0, the final result is false.

        // Example 3 of operator precedence
        int i = 42;
        int j = 5;

        int finalResult = i % j * 2 | j;
        System.out.println("Result of i % j * 2 | j: " + finalResult);
        // Explanation:
        // 1. The modulus operator (%) has higher precedence than the multiplication operator (*).
        // 2. So, i % j is evaluated first, resulting in 2 (since 42 divided by 5 has a remainder of 2).
        // 3. Then, the result (2) is multiplied by 2, resulting in 4.
        // 4. Finally, the result (4) is bitwise OR-ed with j (5), resulting in 5.
    }
}
