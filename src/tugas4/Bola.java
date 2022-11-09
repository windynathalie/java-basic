package tugas4;

import tugas4.abstractclass.BangunRuang;

public class Bola extends Lingkaran implements BangunRuang {
    public Bola() {

    }

    public Bola(int r) {
        super(r);
    }

    @Override
    public void bentuk() {
        System.out.println("*****   *****  *         *    ");
        System.out.println("*    *  *   *  *        * *   ");
        System.out.println("*****   *   *  *       *****  ");
        System.out.println("*    *  *   *  *      *     * ");
        System.out.println("*****   *****  ***** *       *");
    }

    @Override
    public void karakteristik() {
        System.out.println("\nKarakteristik Bangun Ruang Bola");
        System.out.println(
                "1. Memiliki hanya 1 bidang melengkung saja");
        System.out.println(
                "2. Memiliki jari-jari yang sama dari pusat bola ke setiap titik permukaan bola");
        System.out.println("3. Tidak memiliki sudut dan rusuk");
        System.out.println("4. Memiliki diameter yang selalu sama pada setiap titiknya");
        System.out.println("5. Memiliki kesimetrisan yang sempurna.\n");
    }

    @Override
    public int luasPermukaan() {
        return super.luas() * 4;
    }

    @Override
    public int volume() {
        return super.luas() * this.getR() * 4 / 3;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Luas Permukaan: " + this.luasPermukaan() + " cm^2");
        System.out.println("Volume: " + this.volume() + " cm^3");
    }
}
