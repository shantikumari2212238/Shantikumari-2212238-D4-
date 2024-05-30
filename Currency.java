// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Currency {

    public static void coinChange(int amount) {
        int[] denominations = {1000, 500, 100, 50, 20, 10, 5, 2, 1};  // Denominations of Pakistani currency
        int[] counts = new int[denominations.length];  // Array to store counts of each denomination
        int originalAmount = amount;  // Store the original amount

        // Loop through each denomination
        for (int i = 0; i < denominations.length; i++) {
            // Calculate the number of coins of the current denomination needed
            counts[i] = amount / denominations[i];
            // Update the amount after using the current denomination
            amount %= denominations[i];
        }

        // Display each denomination currency required
        System.out.println("Denominations for Rs. " + originalAmount + ":");
        for (int i = 0; i < denominations.length; i++) {
            if (counts[i] > 0) {
                System.out.println(counts[i] + " x Rs. " + denominations[i]);
            }
        }
    }

    public static void main(String[] args) {
        int amount = 1988;
        coinChange(amount);
}}
