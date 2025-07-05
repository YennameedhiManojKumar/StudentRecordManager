import java.sql.*;
import java.util.Scanner;

public class StudentDAO {
    Connection conn = DBConnection.getConnection();
    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        try {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter email: ");
            String email = sc.nextLine();
            System.out.print("Enter course: ");
            String course = sc.nextLine();

            String query = "INSERT INTO students (name, email, course) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, course);

            int rows = ps.executeUpdate();
            System.out.println(rows + " student(s) added successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewStudents() {
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM students");

            System.out.println("\n--- Student Records ---");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("email") + " | " +
                                rs.getString("course"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStudent() {
        try {
            System.out.print("Enter student ID to update: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter new email: ");
            String email = sc.nextLine();

            String query = "UPDATE students SET email = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, email);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();
            System.out.println(rows + " student(s) updated.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent() {
        try {
            System.out.print("Enter student ID to delete: ");
            int id = sc.nextInt();

            String query = "DELETE FROM students WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            System.out.println(rows + " student(s) deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
