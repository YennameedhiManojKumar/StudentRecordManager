import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Student Record Manager =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Email");
            System.out.println("4. Delete Student");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> dao.addStudent();
                case 2 -> dao.viewStudents();
                case 3 -> dao.updateStudent();
                case 4 -> dao.deleteStudent();
                case 0 -> System.out.println("Exiting program.");
                default -> System.out.println("Invalid choice, please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
