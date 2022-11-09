package tugas4;

import tugas4.abstractclass.BangunDatar;

public class Lingkaran implements BangunDatar {
    private int r;

    // empty constructor
    public Lingkaran() {

    }

    // constructor with parameter
    public Lingkaran(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public void bentuk() {
        int rad = 5;
        int diameter = 2 * 5;
        int xCoord, yCoord, point;

        for (int row = 0; row <= diameter; row++) {
            for (int col = 0; col <= diameter; col++) {
                // Define both X-Coordinate and Y-Coordinate
                xCoord = rad - row;
                yCoord = rad - col;

                point = xCoord * xCoord + yCoord * yCoord;
                // Check whether point(xCoord, yCoord) is inside of circle or not
                if (point <= rad * rad + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            // Print a new line
            System.out.println();
        }
    }

    @Override
    public void karakteristik() {
        System.out.println("\nKarakteristik Bangun Lingkaran");
        System.out.println(
                "1. Memiliki jarak pada tepi garis ke titik pusat yang biasa disebut dengan jari-jari atau dilambangkan r");
        System.out.println(
                "2. Memiliki simetri lipat dan putar yang jumlahnya tidak terhingga.");
        System.out.println("3. Memiliki jumlah derajat lingkaran sebesar 360 derajat.");
        System.out.println("4. Memiliki satu titik pusat.");
        System.out.println("5. Memiliki diameter yang membagi lingkaran menjadi dua sisi yang seimbang.");
        System.out.println("6. Memiliki diameter yang konstan.");
        System.out.println("7. Memiliki jari-jari yang menghubungkan ke titik pusat dengan titik busur lingkaran. \n");
    }

    @Override
    public int luas() {
        return (int) (Math.PI * this.r * this.r);
    }

    @Override
    public int keliling() {
        return (int) (2 * Math.PI * this.r);
    }

    @Override
    public void print() {
        System.out.println("Hasil Kalkulasi");
        System.out.println("==========================================");
        System.out.println("Jari-jari: " + this.getR() + " cm");
        System.out.println("Luas: " + this.luas() + " cm^2");
        System.out.println("Keliling: " + this.keliling() + " cm");
    }
}
