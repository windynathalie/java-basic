package tugas3;

public class Persegi {
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

    public int hitungLuas() {
        return (this.sisi * this.sisi);
    }

    public int hitungKeliling() {
        return (4 * this.sisi);
    }

    public void getPersegi() {
        System.out.println("Hasil Kalkulasi");
        System.out.println("==========================================");
        System.out.println("Sisi: " + this.getSisi() + " cm");
        System.out.println("Luas: " + this.hitungLuas() + " cm^2");
        System.out.println("Keliling: " + this.hitungKeliling() + " cm");
    }
}
