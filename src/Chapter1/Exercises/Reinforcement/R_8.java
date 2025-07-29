package Chapter1.Exercises.Reinforcement;

/*
Write a short Java method that counts the number of vowels in a given character
string.
 */

import java.util.*;

public class R_8 {
    public static int countVowels(String s) {
        Set<Character> vowelSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if (vowelSet.contains(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(countVowels(s));

        sc.close();
    }
}
