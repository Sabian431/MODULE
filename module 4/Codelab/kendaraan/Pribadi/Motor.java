package kendaraan.pribadi;

import kendaraan.Kendaraan;

/**
 * Kelas Motor yang mewakili kendaraan jenis motor.
 */
public class Motor extends Kendaraan {
    /**
     * Konstruktor untuk membuat objek Motor dengan spesifikasi tertentu.
     *
     * @param name  Nama motor.
     * @param model Model motor.
     * @param warna Warna motor.
     * @param tahun Tahun produksi motor.
     */
    public Motor(String name, String model, String warna, int tahun) {
        super(); // Memanggil konstruktor kelas induk Kendaraan
        this.name = name;
        this.model = model;
        this.warna = warna;
        this.tahun = tahun;
    }

    /**
     * Konstruktor default untuk Motor.
     */
    public Motor() {
        super(); // Memanggil konstruktor kelas induk Kendaraan
    }

    @Override
    public void Start() {
        System.out.println("Motor " + this.getName() + " dinyalakan");
    }

    @Override
    public void Stop() {
        System.out.println("Motor " + this.getName() + " dimatikan");
    }

    @Override
    public void Brake() {
        System.out.println("Motor berhenti");
    }
}
