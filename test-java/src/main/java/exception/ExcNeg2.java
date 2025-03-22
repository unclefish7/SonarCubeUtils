import java.util.logging.*;
public class ExcNeg2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("log");
        try {
            throw new CustomException("fail");
        } catch (Exception e) {
            logger.severe("Error: " + e.getMessage());
        }
    }
}
