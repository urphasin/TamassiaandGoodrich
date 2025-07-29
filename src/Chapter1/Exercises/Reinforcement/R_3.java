/*
Write a short Java method, isMultiple, that takes two long values, n and m, and
returns true if and only if n is a multiple of m, that is, n = mi for some integer i
*/

package Chapter1.Exercises.Reinforcement;

import java.util.Scanner;

public class R_3 {
    public static boolean isMultiple(long n, long m) {
        if (n % m == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc. nextLong();
        sc.close();

        System.out.println(isMultiple(n, m));
    }
}
