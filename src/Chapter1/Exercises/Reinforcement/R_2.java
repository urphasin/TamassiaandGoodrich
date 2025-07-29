/*
Suppose that we create an array A of GameEntry objects, which has an integer
scores field, and we clone A and store the result in an array B.
If we then immediately set A[4].score equal to 550, what is the score value of the GameEntry
object referenced by B[4]?
*/

package Chapter1.Exercises.Reinforcement;

public class R_2 {
    public static class GameEntry {
        public int score = 0;
        public GameEntry(int a) {
            score = a;
        }

        // Utility function to print score
        public void printScore() {
            System.out.format("Your score = %d\n", score);
        }
    }

    public static void main(String[] args) {
        GameEntry[] A = new GameEntry[5];
        A[0] = new GameEntry(0);
        A[1] = new GameEntry(1);
        A[2] = new GameEntry(2);   // Array A of GameEntry objects created
        A[3] = new GameEntry(3);
        A[4] = new GameEntry(4);

        GameEntry[] B = A.clone();   // Cloned A and put in B

        A[4].score = 550; // Set A[4] to 550

        B[4].printScore(); // Check B[4] score and compare.

        B[3].score = 300;

        A[3].printScore();

    }
}
