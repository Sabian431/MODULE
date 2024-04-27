import java.util.Scanner;

public class Main {
    private static Admin admin = new Admin("admin", "admin"); // Inisialisasi admin dengan kredensial default

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Library System ===");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Implementasi login student (placeholder)
                    System.out.println("Student login...");
                    break;
                case 2:
                    System.out.print("Enter your username (admin): ");
                    String username = scanner.nextLine();
                    System.out.print("Enter your password (admin): ");
                    String password = scanner.nextLine();
                    if (admin.authenticate(username, password)) {
                        // Implementasi menu admin
                        System.out.println("Admin Menu");
                        // Implementasi detail lebih lanjut di sini...
                    } else {
                        System.out.println("Invalid credentials for admin.");
                    }
                    break;
                case 3:
                    System.out.println("Thank you. Exiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        }
    }
}
