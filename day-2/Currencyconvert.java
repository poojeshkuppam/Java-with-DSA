import java.util.Scanner;

public class Currencyconvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in Rupees: ");
        double rupees = sc.nextDouble();

        // Assume 1 USD = 86 Rupees
        double exchangeRate = 86.0;

        double dollars = rupees / exchangeRate;

        System.out.println("Amount in USD: $" + dollars);

        sc.close();
    }
}