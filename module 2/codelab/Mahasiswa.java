public class Mahasiswa {
    public String nama;
    public String nim;
    public String jurusan;
    public static String universitas = "Universitas Muhammadiyah Malang";

    // Constructor
    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Static method untuk menampilkan nama universitas
    public static String tampilUniversitas() {
        return universitas;
    }

    // Method untuk menampilkan data mahasiswa
    public String tampilDataMahasiswa() {
        return "Nama: " + nama + ", NIM: " + nim + ", Jurusan: " + jurusan;
    }
}
