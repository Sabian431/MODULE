package kendaraan.khusus;

import kendaraan.Kendaraan;
import kendaraan.util.Flyable;

public class Pesawat extends Kendaraan implements Flyable {
    public Pesawat(String name, String model, String warna, int tahun) {
        super(); // Ini opsional karena Java secara otomatis memanggil konstruktor default super kelas.
        this.name = name;
        this.model = model;
        this.warna = warna;
        this.tahun = tahun;
    }

    public Pesawat() {
        super(); // Ini opsional untuk kejelasan.
    }

    @Override
    public void Start() {
        System.out.println("Mennyalakan pesawat " + this.getName());
    }

    @Override
    public void Stop() {
        System.out.println("Mematikan mesin pesawat " + this.getName());
    }

    @Override
    public void Brake() {
        System.out.println("Pesawat " + this.getName() + " berhenti");
    }

    @Override
    public void fly() {
        System.out.println("Pesawat " + this.getName() + " lepas landas");
    }
}
