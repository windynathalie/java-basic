package tugas4;

import tugas4.abstractclass.BangunDatar;

public class Persegi implements BangunDatar {
    private int sisi;

    // empty constructor
    public Persegi() {

    }

    // constructor with parameter
    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public void bentuk() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    @Override
    public void karakteristik() {
        System.out.println("\nKarakteristik Bangun Persegi");
        System.out.println("1. Memiliki sisi-sisi yang sama panjang.");
        System.out.println(
                "2. Memiliki dua diagonal yang sama panjang (keduanya saling berpotongan dan membentuk tegak lurus serta membaginya menjadi dua bagian sama panjang).");
        System.out.println("3. Memiliki empat sudut siku-siku yang sama besar, yakni 90 derajat.");
        System.out.println("4. Memiliki empat sumbu simetri lipat.");
        System.out.println("5. Memiliki empat titik sudut.");
        System.out.println("6. Memiliki empat sumbu simetri putar. \n");
    }

    @Override
    public int luas() {
        return (this.sisi * this.sisi);
    }

    @Override
    public int keliling() {
        return (4 * this.sisi);
    }

    @Override
    public void print() {
        System.out.println("Hasil Kalkulasi");
        System.out.println("==========================================");
        System.out.println("Sisi: " + this.getSisi() + " cm");
        System.out.println("Luas: " + this.luas() + " cm^2");
        System.out.println("Keliling: " + this.keliling() + " cm");
    }
}
