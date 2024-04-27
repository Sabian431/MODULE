import java.util.Scanner; // Import for user input (if needed in Main.java)
public class Main {
    public static void main(String[] args) {
        BangunRuang[] bangunRuangs = new BangunRuang[3];

        bangunRuangs[0] = new Tabung("Tabung");
        bangunRuangs[1] = new Kubus("Kubus");
        bangunRuangs[2] = new Balok("Balok");

        for (BangunRuang bangunRuang : bangunRuangs) {
            bangunRuang.inputNilai();

            System.out.println("Nama bangun ruang: " + bangunRuang.getNama());
            System.out.println("Luas permukaan: " + bangunRuang.luasPermukaan());
            System.out.println("Volume: " + bangunRuang.volume());
            System.out.println();
        }
    }
}