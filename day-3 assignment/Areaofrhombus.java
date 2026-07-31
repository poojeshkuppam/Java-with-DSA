import java.util.Scanner;

public class Areaofrhombus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double d1;
        double d2;
        double area;

        System.out.print("Enter the first diagonal: ");
        d1 = sc.nextDouble();

        System.out.print("Enter the second diagonal: ");
        d2 = sc.nextDouble();

        area = (d1 * d2) / 2;

        System.out.println("Area of Rhombus = " + area);

        sc.close();
    }
}