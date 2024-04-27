

public abstract class BangunRuang {
    private String nama;

    public BangunRuang(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public abstract void inputNilai(); // Abstract method declaration

    public abstract double luasPermukaan(); // Abstract method declaration

    public abstract double volume(); // Abstract method declaration
}