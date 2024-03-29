import java.util.ArrayList;
import java.util.UUID;
import java.util.Scanner;






public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new HistoryBook("388c-e681-9152", "title", "author", 4, 14));
        books.add(new StoryBook("ed90-be30-5cdb", "title", "author", 0, 14));
        books.add(new TextBook("d95e-0c4a-9523", "title", "author", 2,14));

        ArrayList<Student> students = new ArrayList<>();

        Admin admin = new Admin(students, books);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== Library System =====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            int option = Integer.parseInt(scanner.nextLine().trim());
            if (option == 1) {
                System.out.print("Enter your NIM (input 99 untuk kembali): ");
                String nim = scanner.nextLine().trim();
                Student student = students.stream().filter(s -> s.getNim().equals(nim)).findFirst().orElse(null);
                if (student != null) {
                    while (true) {
                        System.out.println("==== Student Menu ====");
                        System.out.println("1. Buku terpinjam");
                        System.out.println("2. Pinjam buku");
                        System.out.println("3. Logout");
                        System.out.print("Choose option (1-3): ");
                        int studentOption = Integer.parseInt(scanner.nextLine().trim());
                        if (studentOption == 1) {
                            student.showBorrowedBooks();
                        } else if (studentOption == 2) {
                            student.displayBooks(books);
                        } else if (studentOption == 3) {
                            student.logout();
                            break;
                        } else {
                            System.out.println("Invalid option. Please choose between 1-3.");
                        }
                    }
                } else if (nim.equals("99")) {
                    continue;
                } else {
                    System.out.println("NIM tidak ditemukan.");
                }
            } else if (option == 2) {
                admin.isAdmin();
            } else if (option == 3) {
                System.out.println("Thank you. Exiting program.");
                break;
            } else {
                System.out.println("Invalid option. Please choose between 1-3.");
            }
        }
    }
}



