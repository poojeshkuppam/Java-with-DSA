public class Butterflypattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= 2 * n - 1; i++) {
            int s = (i <= n) ? i : 2 * n - i;

            for (int j = 1; j <= s; j++) System.out.print("*");
            for (int j = 1; j <= 2 * (n - s); j++) System.out.print(" ");
            for (int j = 1; j <= s; j++) System.out.print("*");

            System.out.println();
        }
    }
}