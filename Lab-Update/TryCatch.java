public class TryCatch {
    int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        TryCatch obj = new TryCatch();

        try {
            System.out.println(obj.division(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
