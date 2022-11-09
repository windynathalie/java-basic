package tugas4;

import tugas4.abstractclass.BangunRuang;

public class Prisma extends Segitiga implements BangunRuang {
    private int tinggiPrisma;

    public Prisma() {
    }

    // constructor with parameter
    public Prisma(int alas, int tinggi, int tinggiPrisma) {
        super(alas, tinggi);
        this.tinggiPrisma = tinggiPrisma;
    }

    public int getTinggiPrisma() {
        return tinggiPrisma;
    }

    public void setTinggiPrisma(int tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public void bentuk() {
        System.out.println("*****  *****   *****  *****  *   *      *    ");
        System.out.println("*   *  *    *    *    *      ** **     * *   ");
        System.out.println("*****  *****     *    *****  * * *    *****  ");
        System.out.println("*      * *       *        *  *   *   *     * ");
        System.out.println("*      *  *    *****  *****  *   *  *       *");
    }

    @Override
    public void karakteristik() {
        System.out.println("\nKarakteristik Bangun Ruang Prisma");
        System.out.println(
                "1. Memiliki alas, tutup, dan selimut.");
        System.out.println(
                "2. Selimut prisma merupakan bidang datar, bisa kotak ataupun persegi panjang.");
        System.out.println("3. Memiliki sudut sebanyak 2 kali segi alasnya.");
        System.out.println("4. Memiliki rusuk 3 kali segi alasnya.");
        System.out.println("5. Memiliki ujung-ujung yang identik satu sama lain\n");
    }

    @Override
    public int luasPermukaan() {
        return (2 * super.luas()) + (super.keliling() * this.tinggiPrisma);
    }

    @Override
    public int volume() {
        return super.luas() * this.tinggiPrisma;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Luas Permukaan: " + this.luasPermukaan() + " cm^2");
        System.out.println("Volume: " + this.volume() + " cm^3");
    }
}