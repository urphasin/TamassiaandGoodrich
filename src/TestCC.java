import Chapter1.CreditCard;

import java.util.*;

public class TestCC {
    public static void main(String[] args) {
        List<CreditCard> wallet = new ArrayList<>();

        wallet.add(new CreditCard("Alice", "Chase", "1234 5678", 5000));
        wallet.add(new CreditCard("Bob", "Wells Fargo", "9876 5432", 3000));
        wallet.add(new CreditCard("Charlie", "Bank of America", "1111 2222", 4000, 300));

        for (int val = 1; val <= 16; val++) {
            wallet.get(0).charge(3 * val);
            wallet.get(1).charge(2 * val);
            wallet.get(2).charge(val);
        }

        for (CreditCard card : wallet) {
            card.printSummary();
            while (card.getBalance() > 200.0) {
                card.makePayment(200.0);
                System.out.println("New balance = $" + card.getBalance());
            }
            System.out.println();
            System.out.println();
        }
    }
}
