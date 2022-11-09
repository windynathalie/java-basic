package tugas3;

public class Prisma extends Segitiga {
    private double tinggiPrisma;

    // constructor with parameter
    public Prisma(double alas, double tinggi, double tinggiPrisma) {
        super(alas, tinggi);
        this.tinggiPrisma = tinggiPrisma;
    }

    public double getTinggiPrisma() {
        return tinggiPrisma;
    }

    public void setTinggiPrisma(double tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume() {
        return super.hitungLuas() * this.tinggiPrisma;
    }

    @Override
    public double hitungKeliling() {
        return super.hitungKeliling();
    }

    @Override
    public double hitungLuas() {
        return (2 * super.hitungLuas()) + (super.hitungKeliling() * this.tinggiPrisma);
    }

    public void getPrisma() {
        super.getSegitiga();
        System.out.println("Volume: " + this.hitungVolume() + " cm^3");
    }
}