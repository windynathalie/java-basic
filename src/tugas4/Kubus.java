package tugas4;

import tugas4.abstractclass.BangunRuang;

public class Kubus extends Persegi implements BangunRuang {
    public Kubus() {

    }

    public Kubus(int sisi) {
        super(sisi);
    }

    public int hitungVolume() {
        return super.luas() * this.getSisi();
    }

    @Override
    public void bentuk() {
        System.out.println("*  *  *   *  *****   *   *  *****");
        System.out.println("* *   *   *  *    *  *   *  *    ");
        System.out.println("**    *   *  *****   *   *  *****");
        System.out.println("* *   *   *  *    *  *   *      *");
        System.out.println("*  *  *****  *****   *****  *****");
    }

    @Override
    public void karakteristik() {
        System.out.println("\nKarakteristik Bangun Ruang Kubus");
        System.out.println(
                "1. Memiliki delapan buah titik sudut.");
        System.out.println(
                "2. Memiliki 12 rusuk yang sama panjang.");
        System.out.println("3. Memiliki enam bidang diagonal yang berbentuk persegi panjang.");
        System.out.println("4. Terdiri dari 12 diagonal sisi sama panjang.");
        System.out.println("5. Terdiri dari empat diagonal ruang dengan ukuran sama panjang.");
        System.out.println("6. Mempunyai enam bidang sisi berbentuk persegi dengan ukuran panjang dan luas yang sama.");
        System.out.println("7. Seluruh sudutnya merupakan sudut siku-siku.\n");
    }

    @Override
    public int luasPermukaan() {
        return super.luas() * 6;
    }

    @Override
    public int volume() {
        return super.luas() * this.getSisi();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Luas Permukaan: " + this.luasPermukaan() + " cm^2");
        System.out.println("Volume: " + this.volume() + " cm^3");
    }
}
