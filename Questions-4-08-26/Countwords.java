public class Countwords {
    public static void main(String[] args) {
        String str = "  Java   is   fun  ";

        String[] words = str.trim().split("\\s+");

        System.out.println("Word Count = " + words.length);
    }
}