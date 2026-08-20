public class Missingnumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int expectedSum = n * (n + 1) / 2;
        int missing = expectedSum - sum;

        System.out.println("Missing number is: " + missing);
    }
}