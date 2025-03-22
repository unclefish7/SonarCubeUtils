import java.sql.*;
public class SqlNeg1 {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:sqlite::memory:");
        try (PreparedStatement ps = conn.prepareStatement("SELECT id, username, email FROM users WHERE username = ?")) {
            ps.setString(1, "admin");
            ps.executeQuery();
        }
    }
}
