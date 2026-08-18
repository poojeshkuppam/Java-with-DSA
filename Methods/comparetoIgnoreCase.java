public class comparetoIgnoreCase {
    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = "java";

        int result = s1.compareToIgnoreCase(s2);

        System.out.println(result);
    }
}