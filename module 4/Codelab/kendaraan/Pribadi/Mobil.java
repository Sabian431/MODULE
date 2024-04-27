package kendaraan.pribadi;

import kendaraan.Kendaraan;

public class Mobil extends Kendaraan {
    public Mobil(String name, String model, String warna, int tahun) {
        super(); // Memanggil konstruktor kelas induk (opsional jika hanya memanggil konstruktor default)
        this.name = name;
        this.model = model;
        this.warna = warna;
        this.tahun = tahun;
    }

    public Mobil() {
        super(); // Memanggil konstruktor kelas induk (opsional jika hanya memanggil konstruktor default)
    }

    @Override
    public void Start() {
        System.out.println("Mobil " + this.getName() + " dinyalakan");
    }

    @Override
    public void Stop() {
        System.out.println("Mobil " + this.getName() + " dimatikan");
    }

    @Override
    public void Brake() {
        System.out.println("Mobil berhenti");
    }
}
