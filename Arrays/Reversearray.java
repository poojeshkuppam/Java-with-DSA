public class Reversearray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;

        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\nArray after rotation by " + k + " positions:");
        for (int i = 0; i < arr.length; i++) {
            int index = (i + k) % arr.length;
            System.out.print(arr[index] + " ");
        }
    }
}