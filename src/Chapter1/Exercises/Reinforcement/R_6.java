/*
Write a short Java method that takes an integer n and returns the sum of all the
odd positive integers less than or equal to n.
*/

package Chapter1.Exercises.Reinforcement;

import java.util.Scanner;

public class R_6 {
    public static int sumofOddToN(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i+=2) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(sumofOddToN(n));

        sc.close();
    }

}
