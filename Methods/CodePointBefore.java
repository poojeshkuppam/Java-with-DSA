public class CodePointBefore {
    public static void main(String[] args) {
        String str = "Java";

        int value = str.codePointBefore(2);

        System.out.println(value);
    }
}