import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

class User {
    public void displayBooks(ArrayList<Book> bookList) {
        System.out.println("=======================================================================");
        System.out.println("|| No.|| Id buku || Nama Buku || Author || Category || Stock ||");
        System.out.println("=======================================================================");
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            System.out.println("|| " + (i + 1) + " || " + book.getBookId() + " || " + book.getTitle() + " || " + book.getAuthor() + " || " + book.getCategory() + " || " + book.getStock() + " ||");
        }
    }

    public String generateId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
}

class Student extends User {
    private String name;
    private String nim;
    private String faculty;
    private String program;
    private ArrayList<Book> borrowedBooks;

    public Student(String name, String nim, String faculty, String program) {
        this.name = name;
        this.nim = nim;
        this.faculty = faculty;
        this.program = program;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getNim() {
        return nim;
    }

    public void displayInfo() {
        System.out.println("Nama: " + name);
        System.out.println("NIM: " + nim);
        System.out.println("Fakultas: " + faculty);
        System.out.println("Program Studi: " + program);
    }

    public void showBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("Belum ada buku yang dipinjam");
        } else {
            System.out.println("Buku yang dipinjam:");
            System.out.println("=======================================================================");
            System.out.println("|| No.|| Id buku || Nama Buku || Author || Category || Duration ||");
            System.out.println("=======================================================================");
            for (int i = 0; i < borrowedBooks.size(); i++) {
                Book book = borrowedBooks.get(i);
                System.out.println("|| " + (i + 1) + " || " + book.getBookId() + " || " + book.getTitle() + " || " + book.getAuthor() + " || " + book.getCategory() + " || " + book.getDuration() + " ||");
            }
            System.out.println("=======================================================================");
        }
    }

    public void logout() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("Kembali ke menu awal...");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Apakah kamu yakin untuk meminjam semua buku tersebut? (Y/T)");
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.equals("Y")) {
                System.out.println("Peminjaman buku berhasil dilakukan");
            } else {
                System.out.println("Kembali ke menu awal...");
            }
        }
    }

    @Override
    public void displayBooks(ArrayList<Book> bookList) {
        super.displayBooks(bookList);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input Id buku yang ingin dipinjam (input 99 untuk kembali): ");
            String bookId = scanner.nextLine().trim();
            if (bookId.equals("99")) {
                System.out.println("Kembali ke menu awal...");
                break;
            } else {
                Book book = bookList.stream().filter(b -> b.getBookId().equals(bookId) && b.getStock() > 0).findFirst().orElse(null);
                if (book != null) {
                    System.out.println("Berapa lama buku akan dipinjam? (maksimal 14 hari)");
                    int days = Integer.parseInt(scanner.nextLine().trim());
                    if (days > 14) {
                        System.out.println("Maksimal peminjaman adalah 14 hari");
                        continue;
                    }
                    borrowedBooks.add(book);
                    book.setStock(book.getStock() - 1);
                    System.out.println("Peminjaman berhasil");
                } else {
                    System.out.println("Buku tidak tersedia atau ID buku tidak valid");
                }
            }
        }
    }
}
class Admin extends User {
    private ArrayList<Student> studentList;
    private ArrayList<Book> bookList;

    public Admin(ArrayList<Student> studentList, ArrayList<Book> bookList) {
        this.studentList = studentList;
        this.bookList = bookList;
    }

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter student NIM: ");
        String nim = scanner.nextLine().trim();
        System.out.print("Enter student faculty: ");
        String faculty = scanner.nextLine().trim();
        System.out.print("Enter student program: ");
        String program = scanner.nextLine().trim();

        if (nim.length() != 15) {
            System.out.println("Invalid NIM length. NIM must be 15 characters long.");
        } else {
            Student student = new Student(name, nim, faculty, program);
            studentList.add(student);
            System.out.println("Student successfully registered.");
        }
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select book category:");
        System.out.println("1. Story Book");
        System.out.println("2. History Book");
        System.out.println("3. Text Book");
        System.out.print("Choose category (1-3): ");
        int categoryChoice = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("Enter book title: ");
        String title = scanner.nextLine().trim();
        System.out.print("Enter author: ");
        String author = scanner.nextLine().trim();
        System.out.print("Enter the stock: ");
        int stock = Integer.parseInt(scanner.nextLine().trim());

        String bookId = generateId();
        Book newBook;
        int duration = 0;
        switch (categoryChoice) {
            case 1:
                System.out.print("Enter duration for Story Book: ");
                duration = Integer.parseInt(scanner.nextLine().trim());
                newBook = new StoryBook(bookId, title, author, stock, duration);
                break;
            case 2:
                System.out.print("Enter duration for History Book: ");
                duration = Integer.parseInt(scanner.nextLine().trim());
                newBook = new HistoryBook(bookId, title, author, stock, duration);
                break;
            case 3:
                System.out.print("Enter duration for Text Book: ");
                duration = Integer.parseInt(scanner.nextLine().trim());
                newBook = new TextBook(bookId, title, author, stock, duration);
                break;
            default:
                System.out.println("Invalid category choice. Book not added.");
                return;
        }

        bookList.add(newBook);
        System.out.println("Book successfully added to the library.");
    }


    public void displayRegisteredStudents() {
        System.out.println("List of Registered Students:");
        for (Student student : studentList) {
            student.displayInfo();
        }
    }

    @Override
    public void displayBooks(ArrayList<Book> bookList) {
        super.displayBooks(bookList);
    }

    public void isAdmin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username (admin): ");
        String username = scanner.nextLine().trim();
        System.out.print("Enter your password (admin): ");
        String password = scanner.nextLine().trim();

        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Logged in as admin.");
            while (true) {
                System.out.println("===== Admin Menu =====");
                System.out.println("1. Add Student");
                System.out.println("2. Add Book");
                System.out.println("3. Display Registered Students");
                System.out.println("4. Display Available Books");
                System.out.println("5. Logout");
                System.out.print("Choose option (1-5): ");
                int choice = Integer.parseInt(scanner.nextLine().trim());

                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        addBook();
                        break;
                    case 3:
                        displayRegisteredStudents();
                        break;
                    case 4:
                        displayBooks(bookList);
                        break;
                    case 5:
                        System.out.println("Logging out from admin account.");
                        return;
                    default:
                        System.out.println("Invalid option. Please choose between 1-5.");
                }
            }
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}