public class ExcNeg3 {
    public static void main(String[] args) {
        try {
            String s = null;
            int len = s.length();
            logger.println(len);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
