import java.sql.*;
import java.util.Scanner;

public class AuthDAO {
    Connection conn;
    Scanner sc;

    public AuthDAO() {
        conn = DBConnection.getConnection();
        sc = new Scanner(System.in);
    }

    public boolean login() {
        try {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                System.out.println("✅ Login successful!");
                return true;
            } else {
                System.out.println("❌ Invalid credentials.");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
