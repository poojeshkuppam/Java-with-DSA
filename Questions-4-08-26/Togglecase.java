public class Togglecase {
    public static void main(String[] args) {
        String str = "Poojesh";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch; // Space or special character
            }
        }

        System.out.println("Result = " + result);
    }
}