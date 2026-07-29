import java.util.*;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter operator: ");
        char op = sc.next().charAt(0);

        if(op == '+')
            System.out.println(a + b);
        else if(op == '-')
            System.out.println(a - b);
        else if(op == '*')
            System.out.println(a * b);
        else if(op == '/')
            System.out.println(a / b);
        else
            System.out.println("Invalid operator");

        sc.close();
    }
}