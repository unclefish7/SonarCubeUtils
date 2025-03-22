import java.sql.*;
public class ResPos3 {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:sqlite::memory:");
        conn.createStatement().executeQuery("SELECT 1");
    }
}
