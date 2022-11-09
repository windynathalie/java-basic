package tugas4;

import tugas4.abstractclass.BangunDatar;

public class Segitiga implements BangunDatar {
    private int alas;
    private int tinggi;

    // empty constructor
    public Segitiga() {

    }

    // constructor with parameter
    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getSisiMiring() {
        return (int) Math.sqrt((getAlas() * getAlas()) + (getTinggi() * getTinggi()));
    }

    @Override
    public void bentuk() {
        for (int i = 1; i <= 5; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    @Override
    public void karakteristik() {
        System.out.println("\nKarakteristik Bangun Segitiga\n");
        System.out.println("A. Segitiga Siku-Siku:");
        System.out.println(
                "1. Memiliki satu sisi miring.");
        System.out.println(
                "2. Tidak memiliki sumbu simetri lipat.");
        System.out.println("3. Memiliki dua sisi yang saling tegak lurus.");
        System.out.println("4. Tidak memiliki sumbu simetri putar.");
        System.out.println("5. Salah satu sudutnya, yaitu sudut siku-siku sebesar 90 derajat.");
        System.out.println("6. Menggunakan rumus phytagoras dalam mencari panjang sisi miringnya.\n");

        System.out.println("B. Segitiga Sama Sisi:");
        System.out.println(
                "1. Memiliki tiga sudut yang sama besarnya, yakni 60 derajat.");
        System.out.println(
                "2. Memiliki tiga sisi yang sama panjang");
        System.out.println("3. Memiliki tiga sumbu simetri lipat.");
        System.out.println("4. Memiliki tiga sumbu simetri putar.\n");

        System.out.println("C. Segitiga Sama Kaki:");
        System.out.println(
                "1. Memiliki satu sumbu simetri lipat.");
        System.out.println(
                "2. Memiliki dua sisi yang berhadapan sama panjang.");
        System.out.println("3. Memiliki satu sumbu simetri putar.\n");

        System.out.println("D. Segitiga Sembarang:");
        System.out.println(
                "1. Memiliki tiga sisi tidak sama panjang.");
        System.out.println(
                "2. Memiliki tiga sudut yang besarannya berbeda.");
        System.out.println("3. Tidak memiliki sumbu simetri lipat.");
        System.out.println("4. Memiliki satu sumbu simetri putar.\n");
    }

    @Override
    public int luas() {
        return (int) (0.5 * this.alas * this.tinggi);
    }

    @Override
    public int keliling() {
        return (int) (getAlas() + getTinggi() + getSisiMiring());
    }

    public void print() {
        System.out.println("Hasil Kalkulasi");
        System.out.println("==========================================");
        System.out.println("Alas: " + this.getAlas() + " cm");
        System.out.println("Tinggi: " + this.getTinggi() + " cm");
        System.out.println("Sisi Miring: " + this.getSisiMiring() + " cm");
        System.out.println("Luas: " + this.luas() + " cm^2");
        System.out.println("Keliling: " + this.keliling() + " cm");
    }
}