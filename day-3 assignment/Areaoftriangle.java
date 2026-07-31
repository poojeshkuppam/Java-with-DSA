import java.util.Scanner;

public class Areaoftriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base;
        double height;
        double area;

        System.out.print("Enter base: ");
        base = sc.nextDouble();

        System.out.print("Enter height: ");
        height = sc.nextDouble();

        area = 0.5 * base * height;

        System.out.println("Area = " + area);

        sc.close();
    }
}