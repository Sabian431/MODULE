package kendaraan.khusus;

import kendaraan.Kendaraan;
import kendaraan.util.ShootAble;

public class Tank extends Kendaraan implements ShootAble {
    public Tank() {
        super();
    }

    public Tank(String name, String model, String warna, int tahun) {
        super(name, model, warna, tahun);
    }

    @Override
    public void Start() {
        System.out.println("Menyalakan " + this.getName() + " tank");
    }

    @Override
    public void Stop() {
        System.out.println("Mematikan tank " + this.getName());
    }

    @Override
    public void Brake() {
        System.out.println("Tank berhenti");
    }

    @Override
    public void shoot(String target) {
        System.out.println("Tank menembak " + target);
    }
}
