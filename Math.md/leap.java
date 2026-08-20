import java.util.Scanner;

public class leap {
    public static void main(String[] args) {

        Scanner surya = new Scanner(System.in);

        System.out.println("Enter the year:");
        int year = surya.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("This is a leap year: " + year);
        } else {
            System.out.println("This is not a leap year: " + year);
        }

        surya.close();
    }
}