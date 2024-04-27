package kendaraan;

public abstract class Kendaraan {
    protected String name;
    protected String model;
    protected String warna;
    protected int tahun;

    // Konstruktor default
    public Kendaraan() {
    }

    // Konstruktor dengan parameter
    public Kendaraan(String name, String model, String warna, int tahun) {
        this.name = name;
        this.model = model;
        this.warna = warna;
        this.tahun = tahun;
    }

    public abstract void Start();
    public abstract void Stop();
    public abstract void Brake();

    public void getInfo() {
        System.out.println("Kendaraan: " + this.name);
        System.out.println("Model: " + this.model);
        System.out.println("Warna: " + this.warna);
        System.out.println("Tahun: " + this.tahun);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        this.name = name;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model tidak boleh kosong");
        }
        this.model = model;
    }

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        if (warna == null || warna.trim().isEmpty()) {
            throw new IllegalArgumentException("Warna tidak boleh kosong");
        }
        this.warna = warna;
    }

    public int getTahun() {
        return this.tahun;
    }

    public void setTahun(int tahun) {
        if (tahun <= 0) {
            throw new IllegalArgumentException("Tahun harus lebih besar dari 0");
        }
        this.tahun = tahun;
    }
}
