package com.main;

import java.util.InputMismatchException;
import java.util.Scanner;
import kendaraan.Kendaraan;
import kendaraan.khusus.Pesawat;
import kendaraan.khusus.Tank;
import kendaraan.pribadi.Motor;
import kendaraan.pribadi.Mobil;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kendaraan[] kendaraan = new Kendaraan[]{new Motor(), new Mobil(), new Tank(), new Pesawat()};

        for (int i = 0; i < kendaraan.length; i++) {
            System.out.printf("Masukkan nama kendaraan ke-%d: ", i + 1);
            kendaraan[i].setName(input.next());
            System.out.printf("Masukkan model kendaraan ke-%d: ", i + 1);
            kendaraan[i].setModel(input.next());
            System.out.printf("Masukkan warna kendaraan ke-%d: ", i + 1);
            kendaraan[i].setWarna(input.next());
            System.out.printf("Masukkan tahun kendaraan ke-%d: ", i + 1);
            while (true) {
                try {
                    kendaraan[i].setTahun(input.nextInt());
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Silakan masukkan tahun yang valid (angka).");
                    input.next(); // membersihkan buffer scanner
                }
            }
        }

        for (Kendaraan k : kendaraan) {
            k.Start();
            k.Brake();
            k.Stop();
            k.getInfo();
        }

        input.close();
    }
}
