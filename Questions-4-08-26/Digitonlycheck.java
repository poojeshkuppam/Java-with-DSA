public class Digitonlycheck {
    public static void main(String[] args) {
        String str = "54321";

        if (str.matches("[0-9]+")) {
            System.out.println("Digits Only");
        } else {
            System.out.println("Not Digits Only");
        }
    }
}