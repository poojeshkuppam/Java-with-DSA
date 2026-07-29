import java.util.Scanner;

public class FindSimpleintrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter Principal (P): ");
        double p = sc.nextDouble();

        System.out.print("Enter Time (T): ");
        double t = sc.nextDouble();

        System.out.print("Enter Rate (R): ");
        double r = sc.nextDouble();

        // Calculate Simple Interest
        double si = (p * t * r) / 100;

        // Display the result
        System.out.println("Simple Interest = " + si);

        sc.close();
    }
}