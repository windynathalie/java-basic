package tugas3;

public class Segitiga {
    private double alas;
    private double tinggi;

    // empty constructor
    public Segitiga() {

    }

    // constructor with parameter
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getSisiMiring() {
        return Math.sqrt((getAlas() * getAlas()) + (getTinggi() * getTinggi()));
    }

    public double hitungLuas() {
        return (0.5 * this.alas * this.tinggi);
    }

    public double hitungKeliling() {
        return (getAlas() + getTinggi() + getSisiMiring());
    }

    public void getSegitiga() {

        System.out.println("Hasil Kalkulasi");
        System.out.println("==========================================");
        System.out.println("Alas: " + this.getAlas() + " cm");
        System.out.println("Tinggi: " + this.getTinggi() + " cm");
        System.out.println("Sisi Miring: " + this.getSisiMiring() + " cm");
        System.out.println("Luas: " + this.hitungLuas() + " cm^2");
        System.out.println("Keliling: " + this.hitungKeliling() + " cm");
    }
}