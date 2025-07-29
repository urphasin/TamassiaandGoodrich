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

        System.out.println(isMultiple(n, m));
    }
}
