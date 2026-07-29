import java.util.Scanner;

public class Greetingmessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take name as input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Print greeting message
        System.out.println("Happy Birthday!");

        sc.close();
    }
}