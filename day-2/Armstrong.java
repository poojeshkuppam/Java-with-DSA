import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            int num = i, sum = 0, temp = i;

            while (temp > 0) {
                int rem = temp % 10;
                sum += rem * rem * rem;
                temp /= 10;
            }

            if (sum == num)
                System.out.print(num + " ");
        }
        sc.close();
    }
}