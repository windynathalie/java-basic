package tugas3;

public class Segitiga {
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

    public int hitungLuas() {
        return (int) (0.5 * this.alas * this.tinggi);
    }

    public int hitungKeliling() {
        return (int) (getAlas() + getTinggi() + getSisiMiring());
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