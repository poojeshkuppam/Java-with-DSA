import java.util.Scanner;

public class Areaofparallelogram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base;
        double height;
        double area;

        System.out.print("Enter the base: ");
        base = sc.nextDouble();

        System.out.print("Enter the height: ");
        height = sc.nextDouble();

        area = base * height;

        System.out.println("Area of Parallelogram = " + area);

        sc.close();
    }
}