public class Removewhitespace {
    public static void main(String[] args) {
        String str = "  Hello   World  ";

        String[] words = str.trim().split("\\s+");
        String result = "";

        for (String word : words) {
            result += word;
        }

        System.out.println("Result = " + result);
    }
}