public class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(String nama) {
        super(nama);
    }

    @Override
    public void inputNilai() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sisi kubus: ");
        sisi = scanner.nextDouble();
    }

    @Override
    public double luasPermukaan() {
        return 6 * sisi * sisi;
    }

    @Override
    public double volume() {
        return sisi * sisi * sisi;
    }
}
