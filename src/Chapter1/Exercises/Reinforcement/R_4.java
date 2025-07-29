/*
Write a short Java method, isEven, that takes an int i and returns true if and only
if i is even. Your method cannot use the multiplication, modulus, or division
operators, however.
*/

package Chapter1.Exercises.Reinforcement;

import java.util.Scanner;

public class R_4 {
    public static boolean isEven(int i) {
//        int start = 0;
//        while (start <= i) {
//            if (start == i) {
//                return true;
//            }
//            start += 2;
//        }
//        return false;
        return (i & 1) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        long start = System.currentTimeMillis();
        System.out.println(isEven(i));
        long end = System.currentTimeMillis();

        System.out.println("Time taken = " + (end - start) + "ms");

        sc.close();
    }
}
