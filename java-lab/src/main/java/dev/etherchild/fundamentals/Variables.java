package dev.etherchild.fundamentals;

public class Variables {
    
    public static void run() {
        System.out.println("=== Primitives and Variables ===");
        // Declare vars
        String name = "etherchild";
        byte age = 27;
        short height = 175;
        boolean isJavaFun = true;
        char codingSKills = 'A';
        // print vars
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is Java Fun?: " + isJavaFun);
        System.out.println("Coding Skills: " + codingSKills);
        // looping vars
        byte count = 126;
        count++;
        System.out.println("Byte Count: " + count);
        count++;
        System.out.println("Byte Count: " + count);
    }
}
