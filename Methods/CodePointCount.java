public class CodePointCount {
    public static void main(String[] args) {
        String str = "Java";

        int count = str.codePointCount(0, 4);

        System.out.println(count);
    }
}