public class MinMaxelements {

    static int min, max;

    static void findMinMax(int[] arr, int index) {

        if (index == arr.length)
            return;

        if (arr[index] < min)
            min = arr[index];

        if (arr[index] > max)
            max = arr[index];

        findMinMax(arr, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 3, -5, -4, 8, 6};

        min = arr[0];
        max = arr[0];

        findMinMax(arr, 0);

        System.out.println("[" + min + ", " + max + "]");
    }
}