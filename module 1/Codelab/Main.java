import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.println("Masukkan jenis kelamin (P/L): ");
        String jenisKelamin = scanner.nextLine();

        System.out.println("Masukkan tanggal lahir (yyyy-mm-dd): ");
        String tanggalLahir = scanner.nextLine();

        // Menghitung umur
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.parse(tanggalLahir);
        Period period = Period.between(birthDate, today);

        // Menampilkan output
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + getJenisKelaminLengkap(jenisKelamin));
        System.out.println("Umur: " + period.getYears() + " tahun " + period.getMonths() + " bulan "  + period.getDays() + " hari ");
    }

    private static String getJenisKelaminLengkap(String jenisKelamin) {
        if (jenisKelamin.equalsIgnoreCase("P")) {
            return "Perempuan";
        } else if (jenisKelamin.equalsIgnoreCase("L")) {
            return "Laki-laki";
        } else {
            return "Jenis kelamin tidak valid";
        }
    }
}
