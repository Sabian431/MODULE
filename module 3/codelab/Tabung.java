public class Tabung extends BangunRuang {
    private double jariJari;
    private double tinggi;

    public Tabung(String nama) {
        super(nama);
    }

    @Override
    public void inputNilai() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung: ");
        jariJari = scanner.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        tinggi = scanner.nextDouble();
    }

    @Override
    public double luasPermukaan() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }

    @Override
    public double volume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }
}