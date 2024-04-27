import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline yang tersisa setelah membaca angka

            switch (pilihan) {
                case 1:
                    tambahDataMahasiswa(scanner);
                    break;
                case 2:
                    tampilkanDataMahasiswa();
                    break;
                case 3:
                    System.out.println("Adios");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static void tambahDataMahasiswa(Scanner scanner) {
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();

        String nim;
        while (true) {
            System.out.print("Masukkan NIM mahasiswa: ");
            nim = scanner.nextLine();
            if (nim.length() != 15) {
                System.out.println("Panjang nim harus tidak kurang dan tidak lebih dari 15 angka");
            } else {
                break; // Keluar dari loop jika NIM sudah benar
            }
        }

        System.out.print("Masukkan jurusan mahasiswa: ");
        String jurusan = scanner.nextLine();

        daftarMahasiswa.add(new Mahasiswa(nama, nim, jurusan));
        System.out.println("Data mahasiswa berhasil ditambahkan.");
    }

    public static void tampilkanDataMahasiswa() {
        System.out.println("Data Mahasiswa:");
        System.out.println(Mahasiswa.tampilUniversitas());
        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.println(mhs.tampilDataMahasiswa());
        }
    }
}
