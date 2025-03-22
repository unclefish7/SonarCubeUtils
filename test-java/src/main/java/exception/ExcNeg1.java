public class ExcNeg1 {
    public static void main(String[] args) {
        try {
            int y = -3 + 3;
            int x = 1 / y;
            logger.println(x);
        } catch (ArithmeticException e) {
            logger.println("Handled: " + e.getMessage());
        }
    }
}
