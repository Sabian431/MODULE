public class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(String nama) {
        super(nama);
    }

    @Override
    public void inputNilai() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang balok: ");
        panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar balok: ");
        lebar = scanner.nextDouble();

        System.out.print("Masukkan tinggi balok: ");
        tinggi = scanner.nextDouble();
    }

    @Override
    public double luasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    @Override
    public double volume() {
        return panjang * lebar * tinggi;
    }
}
