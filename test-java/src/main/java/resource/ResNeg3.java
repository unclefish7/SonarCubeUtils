import java.sql.*;
public class ResNeg3 {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:sqlite::memory:");
        conn.close();
    }
}
