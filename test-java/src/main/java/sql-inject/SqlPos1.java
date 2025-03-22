import java.sql.*;
public class SqlPos1 {
    public static void main(String[] args) throws Exception {
        String userInput = "admin' --";
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite::memory:");
            Statement stmt = conn.createStatement()) {
            String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
            stmt.executeQuery(query);
        }
    }
}
