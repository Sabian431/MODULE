import java.util.HashMap;
import java.util.Scanner;

public class LibraryLoginSystem {

    private static HashMap<String, String> adminCredentials = new HashMap<>();

    public static void main(String[] args) {
        adminCredentials.put("admin", "admin123"); // Username dan password admin

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Sistem Login Library");
            System.out.println("1. Login Mahasiswa");
            System.out.println("2. Login Admin");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1/2/3): ");

            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    loginMahasiswa(scanner);
                    break;
                case "2":
                    loginAdmin(scanner);
                    break;
                case "3":
                    System.out.println("Terima Kasih.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void loginMahasiswa(Scanner scanner) {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        if (nim.length() == 15) {
            System.out.println("Login mahasiswa berhasil!");
            // Tempat untuk kode lebih lanjut, misalnya menampilkan menu mahasiswa
        } else {
            System.out.println("NIM harus berjumlah 15 karakter.");
        }
    }

    private static void loginAdmin(Scanner scanner) {
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        if (adminCredentials.containsKey(username) && adminCredentials.get(username).equals(password)) {
            System.out.println("Login admin berhasil!");
            // Tempat untuk kode lebih lanjut, misalnya menampilkan menu admin
        } else {
            System.out.println("Username atau password salah.");
        }
    }
}
