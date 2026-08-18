public class Reverseastring {
    public static void main(String[] args) {
        String str = "laptop";
        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println(reversed);
    }
}