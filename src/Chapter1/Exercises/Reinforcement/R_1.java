/*
Write a short Java method, inputAllBaseTypes, that inputs a different value of
each base type from the standard input device and prints it back to the standard
output device
*/
package Chapter1.Exercises.Reinforcement;

import java.util.Scanner;

public class R_1 {
    public static void inputAllBaseTypes(byte by, short s, int i, long l, float f, double d, char c, boolean b) {
        System.out.format("\u001B[33mByte = %d\n\u001B[0m", by);
        System.out.format("Short =  %d\n", s);
        System.out.format("Int = %d\n", i);
        System.out.format("Long = %dL\n", l);  // L is optional
        System.out.format("Float = %f\n", f);
        System.out.format("Double = %.2f\n", d);  // %f or %.Xf for precision
        System.out.format("Char = %c\n", c);
        System.out.format("Boolean = %b\n", b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[33mEnter a single value for the primitives -- space separated in the order below\u001B[0m");
        System.out.println("Byte Short Int Long Float Double Char Boolean");

        byte by = sc.nextByte();
        short s = sc.nextShort();
        int i = sc.nextInt();
        long l = sc.nextLong();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        char c = sc.next().charAt(0);
        boolean b = sc.nextBoolean();

        System.out.println(); // extra space

        // Method call
        inputAllBaseTypes(by, s, i, l, f, d, c, b);

        sc.close();
    }
}
