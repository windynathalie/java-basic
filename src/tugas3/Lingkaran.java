package tugas3;

public class Lingkaran {
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

    public int hitungLuas() {
        return (int) (Math.PI * this.r * this.r);
    }

    public int hitungKeliling() {
        return (int) (2 * Math.PI * this.r);
    }

    public void getLingkaran() {
        System.out.println("Hasil Kalkulasi");
        System.out.println("==========================================");
        System.out.println("Jari-jari: " + this.getR() + " cm");
        System.out.println("Luas: " + this.hitungLuas() + " cm^2");
        System.out.println("Keliling: " + this.hitungKeliling() + " cm");
    }
}
