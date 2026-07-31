import java.util.Scanner;

public class Areaofrectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double length;
        double width;
        double area;

        System.out.print("Enter the length: ");
        length = sc.nextDouble();

        System.out.print("Enter the width: ");
        width = sc.nextDouble();

        area = length * width;

        System.out.println("Area of Rectangle = " + area);

        sc.close();
    }
}