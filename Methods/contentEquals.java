public class contentEquals {
    public static void main(String[] args) {
        String str = "Java";
        StringBuilder sb = new StringBuilder("Java");

        boolean result = str.contentEquals(sb);

        System.out.println(result);
    }
}