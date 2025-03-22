import java.sql.*;
public class SqlPos2 {
    public static void main(String[] args) throws Exception {
        String userInput = "admin";
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite::memory:");
             Statement stmt = conn.createStatement()) {
            String query = String.format("SELECT * FROM users WHERE username = '%s'", userInput);
            stmt.executeQuery(query);
        }
    }
}
