class ExceptionPropagation {
    static void levelThree() {
        throw new ArithmeticException("Failure started in levelThree");
    }

    static void levelTwo() {
        levelThree(); 
    }

    public static void main(String[] args) {
        try {
            levelTwo();
        } catch (ArithmeticException e) {
            System.out.println("Handled in main: " + e.getMessage());
        }
    }
}